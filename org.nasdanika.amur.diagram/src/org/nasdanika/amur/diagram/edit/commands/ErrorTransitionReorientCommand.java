package org.nasdanika.amur.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.nasdanika.amur.diagram.edit.policies.AmurBaseItemSemanticEditPolicy;

import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.ErrorTransition;

/**
 * @generated
 */
public class ErrorTransitionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ErrorTransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ErrorTransition) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof AbstractConnectionSource && newEnd instanceof AbstractConnectionSource)) {
			return false;
		}
		AbstractConnectionTarget target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Composite)) {
			return false;
		}
		Composite container = (Composite) getLink().eContainer();
		return AmurBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistErrorTransition_4003(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof AbstractConnectionTarget && newEnd instanceof AbstractConnectionTarget)) {
			return false;
		}
		AbstractConnectionSource source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Composite)) {
			return false;
		}
		Composite container = (Composite) getLink().eContainer();
		return AmurBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistErrorTransition_4003(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ErrorTransition getLink() {
		return (ErrorTransition) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected AbstractConnectionSource getOldSource() {
		return (AbstractConnectionSource) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractConnectionSource getNewSource() {
		return (AbstractConnectionSource) newEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractConnectionTarget getOldTarget() {
		return (AbstractConnectionTarget) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractConnectionTarget getNewTarget() {
		return (AbstractConnectionTarget) newEnd;
	}
}
