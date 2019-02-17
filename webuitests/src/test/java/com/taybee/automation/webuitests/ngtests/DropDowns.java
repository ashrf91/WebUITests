package com.taybee.automation.webuitests.ngtests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.taybee.automation.webuitests.ngtests.NGWebUITestBase;

public class DropDowns extends NGWebUITestBase {
  @Test
	public void dropdownSelectAndMultipuleSelectTest() {
	  String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	  getWebDriver().get(baseURL);

		Select drpCountry = new Select(getWebDriver().findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		//Selecting items in a Multiple SELECT elements
		getWebDriver().get("http://jsbin.com/osebed/2");
		Select fruits = new Select(getWebDriver().findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		waitInSec(3);
		fruits.selectByIndex(1);
		waitInSec(3);
  }
}
