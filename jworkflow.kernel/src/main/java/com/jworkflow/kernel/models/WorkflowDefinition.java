package com.jworkflow.kernel.models;


import java.util.ArrayList;
import java.util.List;

public class WorkflowDefinition {
    private String id;
    private int version;
    private String description;
    private int initialStep;
    private List<WorkflowStep> steps;

    WorkflowDefinition() {
        setSteps(new ArrayList<>());
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInitialStep() {
        return initialStep;
    }

    public void setInitialStep(int initialStep) {
        this.initialStep = initialStep;
    }

    public List<WorkflowStep> getSteps() {
        return steps;
    }

    public void setSteps(List<WorkflowStep> steps) {
        this.steps = steps;
    }
}
