package flow.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import flow.diagram.providers.FlowElementTypes;

/**
 * @generated
 */
public class CheckNodeElseFlowItemSemanticEditPolicy extends
		FlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CheckNodeElseFlowItemSemanticEditPolicy() {
		super(FlowElementTypes.CheckNodeElseFlow_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
