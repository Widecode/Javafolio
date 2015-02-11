package com.webdriver.dynamicElements;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {
	
	public static WebDriver driver;
	
	@Before
	public void setUp() {
		driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/N.Moskal/Desktop/Javafolio/SeleniumBasic/Stuff/WebTablesPage.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testWebTables() throws InterruptedException {
		
		WebElement htmltable=driver.findElement(By.xpath("//tbody"));
		List<WebElement> rows=htmltable.findElements(By.tagName("tr"));
		 
		for(int rnum=0;rnum<rows.size();rnum++)
		{
		List<WebElement> columns=rows.get(rnum).findElements(By.tagName("td"));
		System.out.println("Number of columns:"+columns.size());
		 
		for(int cnum=0;cnum<columns.size();cnum++)
		{
		System.out.println(columns.get(cnum).getText());
		}
		}
	}
	
	@After
	public void tearDown() {             
		driver.quit();
	}
}
