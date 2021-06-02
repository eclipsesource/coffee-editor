package org.eclipse.emfcloud.coffee.workflow.glsp.server.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emfcloud.validation.framework.ValidationResult;
import org.eclipse.emfcloud.validation.framework.ValidationResultChangeListener;
import org.eclipse.glsp.graph.GNode;
import org.eclipse.glsp.server.actions.ActionDispatcher;
import org.eclipse.glsp.server.actions.ActionMessage;
import org.eclipse.glsp.server.features.validation.Marker;
import org.eclipse.glsp.server.features.validation.MarkerKind;
import org.eclipse.glsp.server.features.validation.SetMarkersAction;
import org.eclipse.glsp.server.model.GModelState;

import com.google.inject.Inject;

public class WorkflowValidationResultChangeListener extends ValidationResultChangeListener {

	public GModelState modelState;

	@Inject
	private ActionDispatcher actionDispatcher;

	@Override
	public void changed(List<ValidationResult> newResult) {
		actionDispatcher.dispatch(new ActionMessage(modelState.getClientId(),
				new SetMarkersAction(createMarkers(newResult, modelState))));
	}

	public WorkflowValidationResultChangeListener(GModelState WorkflowModelState, ActionDispatcher actionDispatcher) {
		this.modelState = WorkflowModelState;
		this.actionDispatcher = actionDispatcher;
	}

	public List<Marker> createMarkers(List<ValidationResult> validationResult, GModelState gModelState) {
		List<Marker> markers = new ArrayList<Marker>();
		for (ValidationResult r : validationResult) {
			WorkflowModelServerAccess modelAccess = WorkflowModelState.getModelAccess(gModelState);
			GNode gNode = modelAccess.getGNodeBySemanticId(r.getIdentifier());
			BasicDiagnostic diagnostic = r.getDiagnostic();
			String message = diagnostic.getMessage();
			if (gNode != null) {
				markers.add(new Marker(message, message, gNode.getId(), getMarkerKind(diagnostic.getSeverity())));
			} else {
				markers.add(new Marker(message, message, modelState.getRoot().getId(),
						getMarkerKind(diagnostic.getSeverity())));
			}
		}
		return markers;
	}

	public String getMarkerKind(int severity) {
		switch (severity) {
		case Diagnostic.ERROR:
			return MarkerKind.ERROR;
		case Diagnostic.WARNING:
			return MarkerKind.WARNING;
		default:
			return MarkerKind.INFO;
		}
	}

}
