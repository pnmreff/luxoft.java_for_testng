package net.shipovalov.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateUssueTest extends TestBase {
    WebDriver webDriver;

    @Test
    public void CreateUssueTest() throws Exception {
        selectProject("2P", "project_id");
        createIssue("Windows", "7", "Firefox", "test description", "none");
    }

    private void createIssue(String issueOS, String issueOSBuild, String issuePlatform, String issueDescription, String issueAdditionalInfo) {
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
        webDriver.findElement(By.id("platform")).sendKeys(issuePlatform);
        webDriver.findElement(By.id("os")).click();
        webDriver.findElement(By.id("os")).clear();
        webDriver.findElement(By.id("os")).sendKeys(issueOS);
        webDriver.findElement(By.id("os_build")).click();
        webDriver.findElement(By.id("os_build")).sendKeys(issueOSBuild);
        if (!webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[8]/td[2]/select//option[3]")).isSelected()) {
            webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[8]/td[2]/select//option[3]")).click();
        }
        webDriver.findElement(By.name("summary")).click();
        webDriver.findElement(By.name("summary")).clear();
        webDriver.findElement(By.name("summary")).sendKeys("test");
        webDriver.findElement(By.name("description")).click();
        webDriver.findElement(By.name("description")).clear();
        webDriver.findElement(By.name("description")).sendKeys(issueDescription);
        webDriver.findElement(By.name("steps_to_reproduce")).click();
        webDriver.findElement(By.name("steps_to_reproduce")).sendKeys("\\9");
        webDriver.findElement(By.name("steps_to_reproduce")).click();
        webDriver.findElement(By.name("steps_to_reproduce")).clear();
        webDriver.findElement(By.name("steps_to_reproduce")).sendKeys("repeat this step");
        webDriver.findElement(By.name("additional_info")).click();
        webDriver.findElement(By.name("additional_info")).clear();
        webDriver.findElement(By.name("additional_info")).sendKeys(issueAdditionalInfo);
        webDriver.findElement(By.cssSelector("input.button")).click();
    }

    private void selectProject(String projectName, String projectElementId){
        Select select = new Select(webDriver.findElement(By.name(projectElementId)));
        select.selectByVisibleText(projectName);
    }
}
