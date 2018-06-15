package net.shipovalov.training.model;

public class ProjectData {
    private  String projectName;
    private  String projectDescription;
    private  String projectElementId;

    public ProjectData withName(String projectName){
        this.projectName = projectName;
        return this;
    }


    public ProjectData withDescription(String description){
        this.projectDescription = description;
        return this;
    }

    public ProjectData withElementId(String ElementId){
        this.projectElementId = ElementId;
        return this;
    }


    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }


    public String getProjectElementId() {
        return projectElementId;
    }

}
