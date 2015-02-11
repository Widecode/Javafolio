package com.webdriver.waits;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Wait_Demonstration {
 
       public static WebDriver driver;
       
       @Before
       public void setup() throws InterruptedException {

    	   driver = new FirefoxDriver();
    	   
    	   driver.get("https://gmail.com");
    	   driver.manage().window().maximize();
    	   // implicit wait
    	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       }
 
       @Test
       public void test() throws InterruptedException {
 
    	   WebElement username = driver.findElement(By.id("Email"));
    	   username.sendKeys("username");
    	   driver.findElement(By.id("Passwd")).sendKeys("password");
    	   driver.findElement(By.id("signIn")).click();
 
    	   // explicit wait - to wait for the compose button to be click-able
    	   WebDriverWait wait = new WebDriverWait(driver,30);
    	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'��������')]")));
    	   
    	   // click on the compose button as soon as the "compose" button is visible
    	   driver.findElement(By.xpath("//div[contains(text(),'��������')]")).click();
       }
 
       @After
       public void teardown() {
    	   
    	   driver.quit();     
       }
}