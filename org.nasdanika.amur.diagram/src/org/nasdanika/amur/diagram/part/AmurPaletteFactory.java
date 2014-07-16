package org.nasdanika.amur.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;

/**
 * @generated
 */
public class AmurPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Nodes1Group_desc);
		paletteContainer.add(createInputPort1CreationTool());
		paletteContainer.add(createNode2CreationTool());
		paletteContainer.add(createConnectionSource3CreationTool());
		paletteContainer.add(createConnectionTarget4CreationTool());
		paletteContainer.add(createOutputPort5CreationTool());
//		paletteContainer.add(createGateway6CreationTool());
		paletteContainer.add(createContainer7CreationTool());
		paletteContainer.add(createErrorHandler8CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Connections2Group_desc);
		paletteContainer.add(createTransition1CreationTool());
		paletteContainer.add(createErrorTransition2CreationTool());
		paletteContainer.add(createCall3CreationTool());
		paletteContainer.add(createReference4CreationTool());
//		paletteContainer.add(createGatewayMergeSource5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputPort1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputPort1CreationTool_title,
				Messages.InputPort1CreationTool_desc,
				Collections.singletonList(AmurElementTypes.InputPort_2007));
		entry.setId("createInputPort1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.InputPort_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(AmurElementTypes.Node_3006);
		types.add(AmurElementTypes.Node_2008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Node2CreationTool_title,
				Messages.Node2CreationTool_desc, types);
		entry.setId("createNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.Node_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionSource3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(AmurElementTypes.ConnectionSource_3001);
		types.add(AmurElementTypes.ConnectionSource_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConnectionSource3CreationTool_title,
				Messages.ConnectionSource3CreationTool_desc, types);
		entry.setId("createConnectionSource3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.ConnectionSource_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionTarget4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(AmurElementTypes.ConnectionTarget_3002);
		types.add(AmurElementTypes.ConnectionTarget_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConnectionTarget4CreationTool_title,
				Messages.ConnectionTarget4CreationTool_desc, types);
		entry.setId("createConnectionTarget4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.ConnectionTarget_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPort5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutputPort5CreationTool_title,
				Messages.OutputPort5CreationTool_desc,
				Collections.singletonList(AmurElementTypes.OutputPort_2006));
		entry.setId("createOutputPort5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.OutputPort_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGateway6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(AmurElementTypes.Gateway_2001);
		types.add(AmurElementTypes.Gateway_3005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Gateway6CreationTool_title,
				Messages.Gateway6CreationTool_desc, types);
		entry.setId("createGateway6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.Gateway_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContainer7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(AmurElementTypes.Container_2002);
		types.add(AmurElementTypes.Container_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Container7CreationTool_title,
				Messages.Container7CreationTool_desc, types);
		entry.setId("createContainer7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.Container_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createErrorHandler8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(AmurElementTypes.ErrorHandler_3004);
		types.add(AmurElementTypes.ErrorHandler_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ErrorHandler8CreationTool_title,
				Messages.ErrorHandler8CreationTool_desc, types);
		entry.setId("createErrorHandler8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.ErrorHandler_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Transition1CreationTool_title,
				Messages.Transition1CreationTool_desc,
				Collections.singletonList(AmurElementTypes.Transition_4001));
		entry.setId("createTransition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createErrorTransition2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ErrorTransition2CreationTool_title,
				Messages.ErrorTransition2CreationTool_desc,
				Collections
						.singletonList(AmurElementTypes.ErrorTransition_4003));
		entry.setId("createErrorTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.ErrorTransition_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCall3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Call3CreationTool_title,
				Messages.Call3CreationTool_desc,
				Collections.singletonList(AmurElementTypes.Call_4002));
		entry.setId("createCall3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.Call_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReference4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Reference4CreationTool_title,
				Messages.Reference4CreationTool_desc,
				Collections.singletonList(AmurElementTypes.Reference_4004));
		entry.setId("createReference4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.Reference_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGatewayMergeSource5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.GatewayMergeSource5CreationTool_title,
				Messages.GatewayMergeSource5CreationTool_desc,
				Collections
						.singletonList(AmurElementTypes.GatewayMergeSource_4005));
		entry.setId("createGatewayMergeSource5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AmurElementTypes
				.getImageDescriptor(AmurElementTypes.GatewayMergeSource_4005));
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
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
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
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
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
