package com.taybee.automation.webuitests.bddtests;

import com.taybee.automation.webuitests.testbase.WebUITestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BDDHooks {
	@Before()
	public void before(Scenario scenario) {

		WebUITestBase.scnario = scenario;

	}

	@After
	public void after(Scenario scenario) {
		if (WebUITestBase.isDriverAlive) {
			final byte[] screenshot = WebUITestBase.getScreenshot();
			scenario.embed(screenshot, "image/png");
		}
	}
}
