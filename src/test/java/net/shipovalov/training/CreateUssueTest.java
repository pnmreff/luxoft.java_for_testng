package net.shipovalov.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateUssueTest {
    WebDriver webDriver;
    
    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }
    
    @Test
    public void CreateUssuesTest() {
        webDriver.get("http://shipovalov.net/login_page.php");
        webDriver.findElement(By.cssSelector("div")).click();
        webDriver.findElement(By.name("username")).click();
        webDriver.findElement(By.name("username")).clear();
        webDriver.findElement(By.name("username")).sendKeys("student");
        webDriver.findElement(By.name("password")).click();
        webDriver.findElement(By.name("password")).clear();
        webDriver.findElement(By.name("password")).sendKeys("luxoft");
        webDriver.findElement(By.cssSelector("input.button")).click();
        if (!webDriver.findElement(By.xpath("//td[@class='login-info-right']/form/select//option[49]")).isSelected()) {
            webDriver.findElement(By.xpath("//td[@class='login-info-right']/form/select//option[49]")).click();
        }
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
        webDriver.findElement(By.id("platform")).sendKeys("Firefox");
        webDriver.findElement(By.id("os")).click();
        webDriver.findElement(By.id("os")).clear();
        webDriver.findElement(By.id("os")).sendKeys("Windows7");
        webDriver.findElement(By.id("os_build")).click();
        webDriver.findElement(By.id("os_build")).sendKeys("\\9");
        if (!webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[8]/td[2]/select//option[3]")).isSelected()) {
            webDriver.findElement(By.xpath("//div[3]/form/table/tbody/tr[8]/td[2]/select//option[3]")).click();
        }
        webDriver.findElement(By.name("summary")).click();
        webDriver.findElement(By.name("summary")).clear();
        webDriver.findElement(By.name("summary")).sendKeys("test");
        webDriver.findElement(By.name("description")).click();
        webDriver.findElement(By.name("description")).clear();
        webDriver.findElement(By.name("description")).sendKeys("test description");
        webDriver.findElement(By.name("steps_to_reproduce")).click();
        webDriver.findElement(By.name("steps_to_reproduce")).sendKeys("\\9");
        webDriver.findElement(By.name("steps_to_reproduce")).click();
        webDriver.findElement(By.name("steps_to_reproduce")).clear();
        webDriver.findElement(By.name("steps_to_reproduce")).sendKeys("repeat this step");
        webDriver.findElement(By.name("additional_info")).click();
        webDriver.findElement(By.name("additional_info")).clear();
        webDriver.findElement(By.name("additional_info")).sendKeys("none");
        webDriver.findElement(By.cssSelector("input.button")).click();
        webDriver.findElement(By.linkText("Logout")).click();
        webDriver.findElement(By.name("username")).click();
        webDriver.findElement(By.name("username")).sendKeys("\\9");
    }
    
    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }
}
