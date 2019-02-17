package com.taybee.automation.webuitests.bddtests;

import java.util.List;

import org.openqa.selenium.By;

import cucumber.api.java.en.When;

public class CucumberTables extends BDDWebUITestBase {

	@When("^I enter invalid data on the page$")
	public void enterData(List<List<String>> data) {

		// Enter data
		fluentWaitTypeToElement(By.name("firstname"), data.get(1).get(1));
		fluentWaitTypeToElement(By.name("lastname"), data.get(2).get(1));
		fluentWaitTypeToElement(By.name("reg_email__"), data.get(3).get(1));
		fluentWaitTypeToElement(By.name("reg_email_confirmation__"), data.get(4).get(1));
		fluentWaitTypeToElement(By.name("reg_passwd__"), data.get(5).get(1));
		fluentWaitSelectFromDropdownByValue(By.name("birthday_day"), "9");
		fluentWaitSelectFromDropdownByValue(By.name("birthday_month"), "5");
		fluentWaitSelectFromDropdownByValue(By.name("birthday_year"), "1991");
		fluentWaitClickElement(By.className("_58mt"));
		fluentWaitClickElement(By.xpath("//input[@name='sex' and @value='2']"));

		// Click submit button: fluentWaitClickElement(By.name("websubmit"));
	}

}
