/**
 * 
 */
package com.edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Tapas
 *
 */
public class EDUREKA {
	static WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.out.println("STARTED");
		System.setProperty("webdriver.gecko.driver", "E:\\IT\\DOWNLOADS\\geckodriver\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
	}
	
	@Test(priority=0)
	public void Sign_Up() {
		WebElement SIGN_UP=driver.findElement(By.linkText("Sign Up"));
		SIGN_UP.click();
		WebElement txtEmail=driver.findElement(By.id("sg_popup_email"));
		Actions act1=new Actions(driver);
		act1.moveToElement(txtEmail);
		act1.click();
		act1.sendKeys("tapassatapathy598@gmail.com");
		act1.build().perform();
		//WebElement data=driver.findElement(By.className("number_prefix"));
		//Select drp=new Select(data);
		//drp.deselectByVisibleText("IN");
		WebElement txtMobile=driver.findElement(By.id("sg_popup_phone_no"));
		act1.moveToElement(txtMobile);
		act1.click();
		act1.sendKeys("7032303319");
		act1.build().perform();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("ENDED");
		
	}
}