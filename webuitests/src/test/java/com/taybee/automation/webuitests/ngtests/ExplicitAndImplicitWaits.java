package com.taybee.automation.webuitests.ngtests;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class ExplicitAndImplicitWaits extends NGWebUITestBase {
	
	@Test
	public void implicitWait() {
//		Syntax:
//
//			driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void explicitWait() {
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
//	    wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));
	}
	
	@Test
	public void fluentWait() {
//		Syntax:
//
//			Wait wait = new FluentWait(WebDriver reference)
//			.withTimeout(timeout, SECONDS)
//			.pollingEvery(timeout, SECONDS)
//			.ignoring(Exception.class);
		
//		driver.get("http://demo.guru99.com/test/guru99home/" );
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
//				.withTimeout(30, TimeUnit.SECONDS) 			
//				.pollingEvery(5, TimeUnit.SECONDS) 			
//				.ignoring(NoSuchElementException.class);
//		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
//		
//			public WebElement apply(WebDriver driver ) {
//				return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
//			}
//		});
//		//click on the Selenium link
//		clickseleniumlink.click();
	}
}
