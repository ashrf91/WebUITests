package com.taybee.automation.webuitests.ngtests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDowns extends WebUITestBase {
  @Test
	public void dropdownSelectAndMultipuleSelectTest() {
	  String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		//Selecting items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		waitInSec(3);
		fruits.selectByIndex(1);
		waitInSec(3);
  }
}
