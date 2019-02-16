package com.taybee.automation.webuitests.ngtests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;		

public class FirstSeleniumWebdriverScript extends WebUITestBase {
	@Test				
	public void getTitleTest() {	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        // get the actual value of the title
        actualTitle = driver.getTitle();
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }	
	}	
	
	@Test				
	public void getByIdTest() {	
		String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
	}
	
	@Test
	public void popupTest() {
		driver.get("http://www.popuptest.com/popuptest2.html");
	}
	
	@Test
	public void switchFrameTest() {
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
	}
	
	@Test
	public void switchToPopupTest() {
		 String alertMessage = "";
	     driver.get("http://jsbin.com/usidix/1");
	     driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	     alertMessage = driver.switchTo().alert().getText();
	     driver.switchTo().alert().accept();
	     System.out.println(alertMessage);
	}
}
