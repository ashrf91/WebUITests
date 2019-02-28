package com.taybee.automation.webuitests.bddtests.basic;

import com.taybee.automation.webuitests.bddtests.BDDWebUITestBase;
import com.taybee.automation.webuitests.testbase.WebUITestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BasicUIOperations extends BDDWebUITestBase {

	@When("^UI Finesh test$")
	public void finesh() {
		webUITestFinesh();
		WebUITestBase.isDriverAlive = false;
	}

	@Given("^UI login$")
	public void login() {
	}

}
