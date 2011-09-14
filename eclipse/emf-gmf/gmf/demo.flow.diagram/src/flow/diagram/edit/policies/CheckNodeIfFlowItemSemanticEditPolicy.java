package flow.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import flow.diagram.providers.FlowElementTypes;

/**
 * @generated
 */
public class CheckNodeIfFlowItemSemanticEditPolicy extends
		FlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CheckNodeIfFlowItemSemanticEditPolicy() {
		super(FlowElementTypes.CheckNodeIfFlow_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
