package org.eclipse.emfcloud.coffee.workflow.glsp.server;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emfcloud.coffee.CoffeePackage;
import org.eclipse.emfcloud.coffee.Node;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.model.WorkflowModelServerAccess;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.model.WorkflowModelState;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.util.ModelTypes;
import org.eclipse.emfcloud.coffee.workflow.glsp.server.wfgraph.impl.TaskNodeImpl;
import org.eclipse.emfcloud.modelserver.emf.common.EMFFacetConstraints;
import org.eclipse.glsp.graph.GCompartment;
import org.eclipse.glsp.graph.GLabel;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.server.features.directediting.LabelEditValidator;
import org.eclipse.glsp.server.features.directediting.ValidationStatus;
import org.eclipse.glsp.server.model.GModelState;

public class WorkflowLabelEditValidator implements LabelEditValidator {

	@Override
	public ValidationStatus validate(final GModelState modelState, final String label, final GModelElement element) {
		WorkflowModelServerAccess modelAccess = WorkflowModelState.getModelAccess(modelState);
		GModelElement parent = getRoot(element);
		Node node = modelAccess.getNodeById(parent.getId());

		String featureId = getFeatureId(element.getType());

		if (featureId != null) {
			EMFFacetConstraints constraints = modelAccess.getConstraintList(EcoreUtil.getURI(node.eClass()).toString(), featureId);
			if(constraints != null) {
				return checkConstraints(constraints, label, node);
			}
		}
		return ValidationStatus.ok();
	}
	
	private String getFeatureId(String type) {
		if (type.equals(ModelTypes.LABEL_HEADING)) {
			return "name";
		}
		return null;
	}
	
	private ValidationStatus checkConstraints(EMFFacetConstraints constraints, String text, Node node) {
		if(constraints.getMinLength() != null) {
			if(text.length()<constraints.getMinLength()){
				return ValidationStatus.error("Name must be at least "+ constraints.getMinLength()+" character(s) long");
			}
		}
		if(constraints.getMaxLength() != -1) {
			if(text.length()>constraints.getMaxLength()){
				return ValidationStatus.error("Name must not be longer than "+ constraints.getMaxLength()+" character(s)");
			}
		}
		List<String> patterns = constraints.getPattern();
		if(!(patterns.isEmpty())) {
			for(String pattern: patterns) {
				if(!Pattern.matches(pattern, text)){
					if(node instanceof TaskNodeImpl) return ValidationStatus.error("Must consist only of letters, numbers, -, / and spaces");
					else return ValidationStatus.error("Must fit the following expression: "+ pattern);
				}
			}
		}
		return ValidationStatus.ok();
	}

	private GModelElement getRoot(GModelElement element) {
		if (element instanceof GLabel || element instanceof GCompartment) {
			return getRoot(element.getParent());
		}
		return element;
	}

}