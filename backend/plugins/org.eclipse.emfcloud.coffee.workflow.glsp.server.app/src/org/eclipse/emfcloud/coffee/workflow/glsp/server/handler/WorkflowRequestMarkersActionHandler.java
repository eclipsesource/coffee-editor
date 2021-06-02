package org.eclipse.emfcloud.coffee.workflow.glsp.server.handler;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.eclipse.emfcloud.coffee.workflow.glsp.server.model.WorkflowModelServerAccess;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.model.WorkflowModelState;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.features.validation.RequestMarkersAction;
import org.eclipse.glsp.server.features.validation.RequestMarkersHandler;
import org.eclipse.glsp.server.model.GModelState;

public class WorkflowRequestMarkersActionHandler extends RequestMarkersHandler {

	@Override
	public List<Action> executeAction(final RequestMarkersAction action, final GModelState modelState) {
		WorkflowModelServerAccess access = WorkflowModelState.getModelAccess(modelState);
		try {
			access.validate().join();
		} catch (IOException | InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return listOf();
	}
}
