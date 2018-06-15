package net.shipovalov.training.tests;

public class Issue {
    private String issueOS;
    private String issueOSBuild;
    private String issuePlatform;
    private String issueDescription;
    private String issueAdditionalInfo;

    public Issue withIssueOS(String issueOS){
        this.issueOS = issueOS;
        return this;
    }
    public Issue withIssueOSBuild(String issueOSBuild) {
        this.issueOSBuild = issueOSBuild;
        return this;
    }
    public Issue withIssuePlatform(String issuePlatform) {
        this.issuePlatform = issuePlatform;
        return this;
    }
    public Issue withIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
        return this;
    }
    public Issue withIssueAdditionalInfo(String issueAdditionalInfo) {
        this.issueAdditionalInfo = issueAdditionalInfo;
        return this;
    }

    public String getIssueOS() {
        return issueOS;
    }

    public String getIssueOSBuild() {
        return issueOSBuild;
    }

    public String getIssuePlatform() {
        return issuePlatform;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public String getIssueAdditionalInfo() {
        return issueAdditionalInfo;
    }
}
