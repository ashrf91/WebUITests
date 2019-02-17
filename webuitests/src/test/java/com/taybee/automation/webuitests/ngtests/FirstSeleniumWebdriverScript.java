package com.taybee.automation.webuitests.ngtests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;		

public class FirstSeleniumWebdriverScript extends NGWebUITestBase {
	@Test				
	public void getTitleTest() {	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        // launch Fire fox and direct it to the Base URL
        getWebDriver().get(baseUrl);
        // get the actual value of the title
        actualTitle = getWebDriver().getTitle();
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
        
        getWebDriver().get(baseUrl);
        tagName = getWebDriver().findElement(By.id("email")).getTagName();
        System.out.println(tagName);
	}
	
	@Test
	public void popupTest() {
		getWebDriver().get("http://www.popuptest.com/popuptest2.html");
	}
	
	@Test
	public void switchFrameTest() {
		getWebDriver().get("http://demo.guru99.com/selenium/deprecated.html");
		getWebDriver().switchTo().frame("classFrame");
		getWebDriver().findElement(By.linkText("Deprecated")).click();
	}
	
	@Test
	public void switchToPopupTest() {
		 String alertMessage = "";
		 getWebDriver().get("http://jsbin.com/usidix/1");
		 getWebDriver().findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	     alertMessage = getWebDriver().switchTo().alert().getText();
	     getWebDriver().switchTo().alert().accept();
	     System.out.println(alertMessage);
	}
}
