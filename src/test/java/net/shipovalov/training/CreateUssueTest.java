package net.shipovalov.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateUssueTest {
    WebDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void CreateUssuesTest() {
        wd.get("http://shipovalov.net/login_page.php");
        wd.findElement(By.cssSelector("div")).click();
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys("student");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("luxoft");
        wd.findElement(By.cssSelector("input.button")).click();
        if (!wd.findElement(By.xpath("//td[@class='login-info-right']/form/select//option[49]")).isSelected()) {
            wd.findElement(By.xpath("//td[@class='login-info-right']/form/select//option[49]")).click();
        }
        wd.findElement(By.linkText("Report Issue")).click();
        if (!wd.findElement(By.xpath("//div[3]/form/table/tbody/tr[2]/td[2]/select//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/form/table/tbody/tr[2]/td[2]/select//option[2]")).click();
        }
        if (!wd.findElement(By.xpath("//div[3]/form/table/tbody/tr[3]/td[2]/select//option[1]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/form/table/tbody/tr[3]/td[2]/select//option[1]")).click();
        }
        if (!wd.findElement(By.xpath("//div[3]/form/table/tbody/tr[4]/td[2]/select//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/form/table/tbody/tr[4]/td[2]/select//option[2]")).click();
        }
        if (!wd.findElement(By.xpath("//div[3]/form/table/tbody/tr[5]/td[2]/select//option[1]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/form/table/tbody/tr[5]/td[2]/select//option[1]")).click();
        }
        wd.findElement(By.id("platform")).click();
        wd.findElement(By.id("platform")).clear();
        wd.findElement(By.id("platform")).sendKeys("Firefox");
        wd.findElement(By.id("os")).click();
        wd.findElement(By.id("os")).clear();
        wd.findElement(By.id("os")).sendKeys("Windows7");
        wd.findElement(By.id("os_build")).click();
        wd.findElement(By.id("os_build")).sendKeys("\\9");
        if (!wd.findElement(By.xpath("//div[3]/form/table/tbody/tr[8]/td[2]/select//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/form/table/tbody/tr[8]/td[2]/select//option[3]")).click();
        }
        wd.findElement(By.name("summary")).click();
        wd.findElement(By.name("summary")).clear();
        wd.findElement(By.name("summary")).sendKeys("test");
        wd.findElement(By.name("description")).click();
        wd.findElement(By.name("description")).clear();
        wd.findElement(By.name("description")).sendKeys("test description");
        wd.findElement(By.name("steps_to_reproduce")).click();
        wd.findElement(By.name("steps_to_reproduce")).sendKeys("\\9");
        wd.findElement(By.name("steps_to_reproduce")).click();
        wd.findElement(By.name("steps_to_reproduce")).clear();
        wd.findElement(By.name("steps_to_reproduce")).sendKeys("repeat this step");
        wd.findElement(By.name("additional_info")).click();
        wd.findElement(By.name("additional_info")).clear();
        wd.findElement(By.name("additional_info")).sendKeys("none");
        wd.findElement(By.cssSelector("input.button")).click();
        wd.findElement(By.linkText("Logout")).click();
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).sendKeys("\\9");
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
