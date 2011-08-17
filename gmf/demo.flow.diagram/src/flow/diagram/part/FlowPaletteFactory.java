package flow.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import flow.diagram.providers.FlowElementTypes;

/**
 * @generated
 */
public class FlowPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createLinks2Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.add(createCheckNode1CreationTool());
		paletteContainer.add(createBeginNode2CreationTool());
		paletteContainer.add(createEndNode3CreationTool());
		paletteContainer.add(createExcuteNode4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Links2Group_title);
		paletteContainer.setId("createLinks2Group"); //$NON-NLS-1$
		paletteContainer.add(createNormalNodeNext1CreationTool());
		paletteContainer.add(createCheckNodeIfFlow2CreationTool());
		paletteContainer.add(createCheckNodeElseFlow3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCheckNode1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(FlowElementTypes.CheckNode_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CheckNode1CreationTool_title,
				Messages.CheckNode1CreationTool_desc, types);
		entry.setId("createCheckNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FlowElementTypes
				.getImageDescriptor(FlowElementTypes.CheckNode_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBeginNode2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(FlowElementTypes.BeginNode_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BeginNode2CreationTool_title,
				Messages.BeginNode2CreationTool_desc, types);
		entry.setId("createBeginNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FlowElementTypes
				.getImageDescriptor(FlowElementTypes.BeginNode_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndNode3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(FlowElementTypes.EndNode_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EndNode3CreationTool_title,
				Messages.EndNode3CreationTool_desc, types);
		entry.setId("createEndNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FlowElementTypes
				.getImageDescriptor(FlowElementTypes.EndNode_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExcuteNode4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(FlowElementTypes.ExcuteNode_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExcuteNode4CreationTool_title,
				Messages.ExcuteNode4CreationTool_desc, types);
		entry.setId("createExcuteNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FlowElementTypes
				.getImageDescriptor(FlowElementTypes.ExcuteNode_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNormalNodeNext1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(FlowElementTypes.NormalNodeNext_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.NormalNodeNext1CreationTool_title,
				Messages.NormalNodeNext1CreationTool_desc, types);
		entry.setId("createNormalNodeNext1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FlowElementTypes
				.getImageDescriptor(FlowElementTypes.NormalNodeNext_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCheckNodeIfFlow2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(FlowElementTypes.CheckNodeIfFlow_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CheckNodeIfFlow2CreationTool_title,
				Messages.CheckNodeIfFlow2CreationTool_desc, types);
		entry.setId("createCheckNodeIfFlow2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FlowElementTypes
				.getImageDescriptor(FlowElementTypes.CheckNodeIfFlow_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCheckNodeElseFlow3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(FlowElementTypes.CheckNodeElseFlow_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.CheckNodeElseFlow3CreationTool_title,
				Messages.CheckNodeElseFlow3CreationTool_desc, types);
		entry.setId("createCheckNodeElseFlow3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FlowElementTypes
				.getImageDescriptor(FlowElementTypes.CheckNodeElseFlow_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
