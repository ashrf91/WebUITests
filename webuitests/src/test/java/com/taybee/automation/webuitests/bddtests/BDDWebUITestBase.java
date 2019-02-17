package com.taybee.automation.webuitests.bddtests;

import testbase.WebUITestBase;

public class BDDWebUITestBase extends WebUITestBase {

	public static boolean isInit = false;

	public BDDWebUITestBase() {
		if (!isInit) {
			WebUITestBase.webUITestInit();
			isInit = true;
		}
	}

}
