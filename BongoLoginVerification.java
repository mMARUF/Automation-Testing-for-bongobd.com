import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BongoLoginVerification {


    public void login() {
     
        
        System.setProperty("webdriver.chrome.driver", "path of driver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bongobd.com/bn/login?type=login");

        driver.findElement(By.xpath(“//button[text()=’Sign in’]”));
        WebElement login= driver.findElement(By.xpath(“//button[text()=’Sign in’]”));   
        login.click();   
        
        driver.findElement(By.id(“u_0_6q”));
        WebElement password=driver.findElement(By.id(“u_0_6q”));


        username.sendKeys(“1754247006”);
        SendSMS.click();


        
        String actualUrl="https://www.bongobd.com/bn/";
        String expectedUrl= driver.getCurrentUrl();
        
        Assert.assertEquals(expectedUrl,actualUrl);
        
        
    }

}