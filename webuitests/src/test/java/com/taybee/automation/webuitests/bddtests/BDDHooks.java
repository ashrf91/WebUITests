package com.taybee.automation.webuitests.bddtests;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import testbase.WebUITestBase;

public class BDDHooks {
	@Before()
	public void embedScreenshotStep(Scenario scenario) {

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
