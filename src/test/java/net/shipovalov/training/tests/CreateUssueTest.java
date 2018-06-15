package net.shipovalov.training.tests;

import net.shipovalov.training.model.ProjectData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateUssueTest extends TestBase {
    WebDriver webDriver;

    @Test
    public void CreateUssueTest() throws Exception {
        selectProject(new ProjectData().withName("2P").withElementId("project_id"));
        createIssue(new Issue().
                        withIssueOS("Windows").
                        withIssueOSBuild("7").
                        withIssuePlatform("Firefox").
                        withIssueDescription("test description").
                        withIssueAdditionalInfo("none"));
    }

    private void createIssue(Issue issue) {
        webDriver.findElement(By.linkText("Report Issue")).click();
        if (!webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[2]/td[2]/select//option[2]")).isSelected()) {
            webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[2]/td[2]/select//option[2]")).click();
        }
        if (!webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[3]/td[2]/select//option[1]")).isSelected()) {
            webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[3]/td[2]/select//option[1]")).click();
        }
        if (!webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[4]/td[2]/select//option[2]")).isSelected()) {
            webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[4]/td[2]/select//option[2]")).click();
        }
        if (!webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[5]/td[2]/select//option[1]")).isSelected()) {
            webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[5]/td[2]/select//option[1]")).click();
        }
        webDriver.findElement(By.id("platform")).click();
        webDriver.findElement(By.id("platform")).clear();
        webDriver.findElement(By.id("platform")).sendKeys(issue.getIssuePlatform());
        webDriver.findElement(By.id("os")).click();
        webDriver.findElement(By.id("os")).clear();
        webDriver.findElement(By.id("os")).sendKeys(issue.getIssueOS());
        webDriver.findElement(By.id("os_build")).click();
        webDriver.findElement(By.id("os_build")).sendKeys(issue.getIssueOSBuild());
        if (!webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[8]/td[2]/select//option[3]")).isSelected()) {
            webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[8]/td[2]/select//option[3]")).click();
        }
        webDriver.findElement(By.name("summary")).click();
        webDriver.findElement(By.name("summary")).clear();
        webDriver.findElement(By.name("summary")).sendKeys("test");
        webDriver.findElement(By.name("description")).click();
        webDriver.findElement(By.name("description")).clear();
        webDriver.findElement(By.name("description")).sendKeys(issue.getIssueDescription());
        webDriver.findElement(By.name("steps_to_reproduce")).click();
        webDriver.findElement(By.name("steps_to_reproduce")).sendKeys("\\9");
        webDriver.findElement(By.name("steps_to_reproduce")).click();
        webDriver.findElement(By.name("steps_to_reproduce")).clear();
        webDriver.findElement(By.name("steps_to_reproduce")).sendKeys("repeat this step");
        webDriver.findElement(By.name("additional_info")).click();
        webDriver.findElement(By.name("additional_info")).clear();
        webDriver.findElement(By.name("additional_info")).sendKeys(issue.getIssueAdditionalInfo());
        webDriver.findElement(By.cssSelector("input.button")).click();
    }

    private void selectProject(ProjectData project){
        Select select = new Select(webDriver.findElement(By.name(project.getProjectElementId())));
        select.selectByVisibleText(project.getProjectName());
    }
}
