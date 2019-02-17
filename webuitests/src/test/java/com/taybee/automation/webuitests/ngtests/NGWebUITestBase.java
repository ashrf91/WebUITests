package com.taybee.automation.webuitests.ngtests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import testbase.WebUITestBase;

public class NGWebUITestBase extends WebUITestBase {
	@BeforeClass
	public void beforeTest() {
		webUITestInit();
	}

	@AfterClass
	public void afterTest() {
		webUITestFinesh();
	}
}
