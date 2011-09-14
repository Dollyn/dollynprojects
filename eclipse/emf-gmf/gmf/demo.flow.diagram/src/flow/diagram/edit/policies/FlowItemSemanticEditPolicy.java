package flow.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import flow.diagram.edit.commands.BeginNodeCreateCommand;
import flow.diagram.edit.commands.CheckNodeCreateCommand;
import flow.diagram.edit.commands.EndNodeCreateCommand;
import flow.diagram.edit.commands.ExcuteNodeCreateCommand;
import flow.diagram.providers.FlowElementTypes;

/**
 * @generated
 */
public class FlowItemSemanticEditPolicy extends FlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FlowItemSemanticEditPolicy() {
		super(FlowElementTypes.Flow_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FlowElementTypes.CheckNode_2001 == req.getElementType()) {
			return getGEFWrapper(new CheckNodeCreateCommand(req));
		}
		if (FlowElementTypes.ExcuteNode_2002 == req.getElementType()) {
			return getGEFWrapper(new ExcuteNodeCreateCommand(req));
		}
		if (FlowElementTypes.BeginNode_2003 == req.getElementType()) {
			return getGEFWrapper(new BeginNodeCreateCommand(req));
		}
		if (FlowElementTypes.EndNode_2004 == req.getElementType()) {
			return getGEFWrapper(new EndNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
