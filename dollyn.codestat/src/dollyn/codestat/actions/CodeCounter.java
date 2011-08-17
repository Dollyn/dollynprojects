package dollyn.codestat.actions;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageDeclaration;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;

public class CodeCounter {
	
	private IJavaProject jProject;
	private static final Logger logger = Logger.getLogger("dollyn.codestat.actions.codecounters");

	static{
		logger.setLevel(Level.ALL);
		try {
			FileHandler handler = new FileHandler("c:\\code.log");
			handler.setFormatter(new SimpleFormatter());
			logger.addHandler(handler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public CodeCounter(IJavaProject jProject) {
		this.jProject = jProject;
	}
	
	public void countProject() {
		try {
			for (IPackageFragmentRoot pfr : jProject.getPackageFragmentRoots()) {
				CountPackageFragmentRoot(pfr);
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}
		
	public static void CountJavaProject(IJavaProject jProject) {
		int lines = 0;
		try {
			for (IPackageFragmentRoot pfr : jProject.getPackageFragmentRoots()) {
				lines += CountPackageFragmentRoot(pfr);
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		logger.info("Project: " + jProject.getElementName() + " has " + lines + " lines ");
	}

	public static int CountPackageFragmentRoot(IPackageFragmentRoot pfr) {
		int lines = 0;
		try {
			if (pfr.getKind() == IPackageFragmentRoot.K_SOURCE) {
				for (IJavaElement e : pfr.getChildren()) {
					if (e.getElementType() == IJavaElement.PACKAGE_FRAGMENT) {
						IPackageFragment pf = (IPackageFragment) e;
						lines += CountPackageFragment(pf);
					}
				}
				logger.info("PFR: " + pfr.getElementName() + " has " + lines + " lines.");
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return lines;
	}
	
	public static int CountPackageFragment(IPackageFragment pf) {
		int lines = 0;
		try {
			for (ICompilationUnit cu : pf.getCompilationUnits()) {
				String content = cu.getBuffer().getContents();
				if(content.trim().startsWith("/**")) {
					//TODO 如果开头以及有了注释，则应该去掉原来的。
					//int idx = content.
				}
				
				content = "/**\r\n * JavaDoc\r\n */\r\n" + content;
				cu.getBuffer().setContents(content);
				cu.getBuffer().save(null, true);
				lines += CountCompoilationUnit(cu);
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		logger.info("PF: " + pf.getElementName() + " has " + lines + " lines.");
		return lines;
	}
	
	public static int CountCompoilationUnit(ICompilationUnit cu) {		
		try {
			IDocument doc = new Document(cu.getSource());
			//logger.info("CU：" + cu.getElementName() + " has " + doc.getNumberOfLines() + " lines.");

			for (IType type : /*cu.getAllTypes()*/cu.getTypes()) {
				ISourceRange range = type.getSourceRange();
				int typeLines = doc.getNumberOfLines(range.getOffset(), range.getLength());
				int startLine = doc.getLineOfOffset(range.getOffset());
				int endLine = doc.getLineOfOffset(range.getOffset() + range.getLength());
			//	logger.info("Type: " + type.getElementName() + " has " + typeLines + " lines. [" + startLine + "-" + endLine + "]");
				for(IMethod method : type.getMethods()) {
			//		logger.info("Method: " + method.getElementName());
				}
				for(IJavaElement e: type.getChildren()) {
			//		logger.info("Child: " + e.getElementName());
				}
				for(IType t : type.getTypes()) {
			//		logger.info("Child Type: " + t.getElementName());
				}
			}
			
			for (IPackageDeclaration pd : cu.getPackageDeclarations()) {
			//	logger.info("PackageDelararation: " + pd.getElementName());
			}

			return doc.getNumberOfLines();
		} catch (JavaModelException e) {
			e.printStackTrace();
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
