package com.taybee.automation.webuitests.bddtests.basic;

import com.taybee.automation.webuitests.bddtests.BDDWebUITestBase;
import cucumber.api.java.en.When;

public class BasicUIOperations extends BDDWebUITestBase {

	@When("^UI Finesh test$")
	public void finesh() {
		webUITestFinesh();
	}

}
