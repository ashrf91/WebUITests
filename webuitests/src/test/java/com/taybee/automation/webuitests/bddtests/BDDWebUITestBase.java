package com.taybee.automation.webuitests.bddtests;

import com.taybee.automation.webuitests.testbase.WebUITestBase;

public class BDDWebUITestBase extends WebUITestBase {

	public static boolean isInit = false;

	
	public BDDWebUITestBase() {
		if (!isInit) {
			WebUITestBase.webUITestInit();
			isInit = true;
		}
	}

}
