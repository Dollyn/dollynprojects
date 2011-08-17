package testjpamodel;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jpt.core.JpaFile;
import org.eclipse.jpt.core.JpaProject;
import org.eclipse.jpt.core.JptCorePlugin;
import org.eclipse.jpt.core.ResourceModel;
import org.eclipse.jpt.core.context.java.JavaPersistentAttribute;

public class TestModel {
	
	public static void test(IProject project) {
		System.out.println("*************************** start *******************************");
		JpaProject jpaProj = JptCorePlugin.getJpaProject(project);
		if (jpaProj != null) {
			Iterator<JpaFile> it = jpaProj.jpaFiles();
			while (it.hasNext()) {
				JpaFile jpaFile = it.next();
				ResourceModel model = jpaFile.getResourceModel();
				if (model.getResourceType().equals(ResourceModel.JAVA_RESOURCE_TYPE)) {
					System.out.println("JPA Entity: " + jpaFile);
					IFile file = jpaFile.getFile();
					ICompilationUnit cu = JavaCore.createCompilationUnitFrom(file);
					printCompilationUnitInfo(cu);
//					 Iterator<JpaStructureNode> itNodes = jpaFile.rootStructureNodes();
//					 while (itNodes.hasNext()) {
//						 JpaStructureNode node = itNodes.next();
//						 if (node instanceof JavaPersistentType) {
//							 JavaPersistentType jpt = (JavaPersistentType) node;
//							 ListIterator<JavaPersistentAttribute> itAttr = jpt.attributes();
//							 while (itAttr.hasNext()) {
//								 JavaPersistentAttribute attr = itAttr.next();
//								 printAttribute(attr);
//							 }
//							 
//						 }
//					 }
				}
				System.out.println("------------------------------------");
			}
		}
	}
	
	public static void printAttribute(JavaPersistentAttribute attr) {
//		System.out.println("	Name: " + attr.getName());
//		System.out.println("	Class: " + attr.getClass());
//		System.out.println("	Mapping Class: " + attr.getMapping().getClass());
//		JavaAttributeMapping mapping = attr.getMapping();
//		if (mapping instanceof JavaColumnMapping) {
//			JavaColumnMapping cm = (JavaColumnMapping) mapping;
//			System.out.println("	Column: " + cm.getColumn().getDbColumn());
//		}
//		System.out.println("	ID: " + attr.isIdAttribute());
//		System.out.println("	Range" + attr.getSelectionTextRange());
	}

	public static void printCompilationUnitInfo(ICompilationUnit cu) {
		IType type = cu.getType(cu.getElementName());
		System.out.println(type);
		ASTParser parser = ASTParser.newParser(AST.JLS3);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setSource(cu);
		parser.setResolveBindings(true);
		CompilationUnit root = (CompilationUnit) parser.createAST(null);
		final List<FieldDeclaration> fields = new ArrayList<FieldDeclaration>();
		root.accept(new ASTVisitor() {
			public boolean visit(FieldDeclaration node) {
				fields.add(node);
				return false;
			}
		});
		
		for (FieldDeclaration field : fields) {
			System.out.print("FieldDeclaration: " + field);
			System.out.println();;
			isId(field);
			List fragments = field.fragments();
//			for (Object obj : fragments) {
//				VariableDeclarationFragment fragment = (VariableDeclarationFragment) obj;
//				System.out.println("fragment: " + fragment);
//				if (fragment != null) {
//					IVariableBinding binding = fragment.resolveBinding();
//					if (binding != null) {
//						IAnnotationBinding[] annotations = binding.getAnnotations();
//						System.out.println(annotations);
//					}
//				}
//			}
			System.out.println("	==========");
		}
	}
	
	private static boolean isId(FieldDeclaration field) {
		List modifiers = (List) field.getStructuralProperty(FieldDeclaration.MODIFIERS2_PROPERTY);
		if (modifiers != null) {
			for (Object obj : modifiers) {
				if (obj instanceof MarkerAnnotation) {
					MarkerAnnotation annotation = (MarkerAnnotation) obj;
					String annotationType = annotation.resolveTypeBinding().getQualifiedName();
					if (annotationType.equals("javax.persistence.Id")) {
						System.out.println("ID found: " + annotationType);
					}
				}
			}
		}
		return false;
	}
	
}
