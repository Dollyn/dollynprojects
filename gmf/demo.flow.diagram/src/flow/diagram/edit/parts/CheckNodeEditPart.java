package flow.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import flow.diagram.edit.policies.CheckNodeItemSemanticEditPolicy;
import flow.diagram.part.FlowVisualIDRegistry;
import flow.diagram.providers.FlowElementTypes;

/**
 * @generated
 */
public class CheckNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public CheckNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CheckNodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		CheckNodeFigure figure = new CheckNodeFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public CheckNodeFigure getPrimaryShape() {
		return (CheckNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CheckNodeNameEditPart) {
			((CheckNodeNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureCheckNodeNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CheckNodeNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(FlowVisualIDRegistry
				.getType(CheckNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(FlowElementTypes.CheckNodeIfFlow_4002);
		types.add(FlowElementTypes.CheckNodeElseFlow_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof flow.diagram.edit.parts.CheckNodeEditPart) {
			types.add(FlowElementTypes.CheckNodeIfFlow_4002);
		}
		if (targetEditPart instanceof ExcuteNodeEditPart) {
			types.add(FlowElementTypes.CheckNodeIfFlow_4002);
		}
		if (targetEditPart instanceof BeginNodeEditPart) {
			types.add(FlowElementTypes.CheckNodeIfFlow_4002);
		}
		if (targetEditPart instanceof EndNodeEditPart) {
			types.add(FlowElementTypes.CheckNodeIfFlow_4002);
		}
		if (targetEditPart instanceof flow.diagram.edit.parts.CheckNodeEditPart) {
			types.add(FlowElementTypes.CheckNodeElseFlow_4003);
		}
		if (targetEditPart instanceof ExcuteNodeEditPart) {
			types.add(FlowElementTypes.CheckNodeElseFlow_4003);
		}
		if (targetEditPart instanceof BeginNodeEditPart) {
			types.add(FlowElementTypes.CheckNodeElseFlow_4003);
		}
		if (targetEditPart instanceof EndNodeEditPart) {
			types.add(FlowElementTypes.CheckNodeElseFlow_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == FlowElementTypes.CheckNodeIfFlow_4002) {
			types.add(FlowElementTypes.CheckNode_2001);
		}
		if (relationshipType == FlowElementTypes.CheckNodeIfFlow_4002) {
			types.add(FlowElementTypes.ExcuteNode_2002);
		}
		if (relationshipType == FlowElementTypes.CheckNodeIfFlow_4002) {
			types.add(FlowElementTypes.BeginNode_2003);
		}
		if (relationshipType == FlowElementTypes.CheckNodeIfFlow_4002) {
			types.add(FlowElementTypes.EndNode_2004);
		}
		if (relationshipType == FlowElementTypes.CheckNodeElseFlow_4003) {
			types.add(FlowElementTypes.CheckNode_2001);
		}
		if (relationshipType == FlowElementTypes.CheckNodeElseFlow_4003) {
			types.add(FlowElementTypes.ExcuteNode_2002);
		}
		if (relationshipType == FlowElementTypes.CheckNodeElseFlow_4003) {
			types.add(FlowElementTypes.BeginNode_2003);
		}
		if (relationshipType == FlowElementTypes.CheckNodeElseFlow_4003) {
			types.add(FlowElementTypes.EndNode_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(FlowElementTypes.NormalNodeNext_4001);
		types.add(FlowElementTypes.CheckNodeIfFlow_4002);
		types.add(FlowElementTypes.CheckNodeElseFlow_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == FlowElementTypes.NormalNodeNext_4001) {
			types.add(FlowElementTypes.ExcuteNode_2002);
		}
		if (relationshipType == FlowElementTypes.NormalNodeNext_4001) {
			types.add(FlowElementTypes.BeginNode_2003);
		}
		if (relationshipType == FlowElementTypes.NormalNodeNext_4001) {
			types.add(FlowElementTypes.EndNode_2004);
		}
		if (relationshipType == FlowElementTypes.CheckNodeIfFlow_4002) {
			types.add(FlowElementTypes.CheckNode_2001);
		}
		if (relationshipType == FlowElementTypes.CheckNodeElseFlow_4003) {
			types.add(FlowElementTypes.CheckNode_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class CheckNodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCheckNodeNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCheckNodeConditionFigure;

		/**
		 * @generated
		 */
		public CheckNodeFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCheckNodeNameFigure = new WrappingLabel();
			fFigureCheckNodeNameFigure.setText("<...>");

			this.add(fFigureCheckNodeNameFigure);

			fFigureCheckNodeConditionFigure = new WrappingLabel();
			fFigureCheckNodeConditionFigure.setText("<...>");

			this.add(fFigureCheckNodeConditionFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCheckNodeNameFigure() {
			return fFigureCheckNodeNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCheckNodeConditionFigure() {
			return fFigureCheckNodeConditionFigure;
		}

	}

}
