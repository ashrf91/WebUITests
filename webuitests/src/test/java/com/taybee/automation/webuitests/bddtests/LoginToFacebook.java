package com.taybee.automation.webuitests.bddtests;

import org.openqa.selenium.By;

import com.taybee.automation.report.Report;
import com.taybee.automation.report.Status;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginToFacebook extends BDDWebUITestBase {

	@Given("^User navigate to Facebook$")
	public void goToFacebook() {
		navigateTo("https://www.facebook.com/");
	}

	@When("^User logs in using Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
		fluentWaitTypeToElement(By.id("email"), arg1);
		fluentWaitTypeToElement(By.id("pass"), arg2);
		fluentWaitClickElement(By.xpath("//input[@value='Log In']"));
	}

	@Then("^Login should be unsuccessful$")
	public void validateRelogin() throws Exception {
		if (getCurrentURL().equalsIgnoreCase("https://www.tacebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110")) {
			Report.report("Page url is as expected.", Status.PASS);
		} else {
			System.out.println("Test Failed");
			Report.report("Page url isn't as expected.", Status.FAIL);
		}
	}

}
