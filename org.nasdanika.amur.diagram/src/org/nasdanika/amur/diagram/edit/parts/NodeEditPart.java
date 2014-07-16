package org.nasdanika.amur.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IPrimaryEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.nasdanika.amur.diagram.edit.policies.NodeCanonicalEditPolicy;
import org.nasdanika.amur.diagram.edit.policies.NodeItemSemanticEditPolicy;
import org.nasdanika.amur.diagram.part.AmurDiagramEditorPlugin;
import org.nasdanika.amur.diagram.part.AmurVisualIDRegistry;

import org.nasdanika.amur.Component;

/**
 * @generated
 */
public class NodeEditPart extends DiagramEditPart implements IPrimaryEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Amur"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public NodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new NodeCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						AmurVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
