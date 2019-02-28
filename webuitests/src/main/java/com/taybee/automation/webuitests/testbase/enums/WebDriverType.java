package com.taybee.automation.webuitests.testbase.enums;

public enum WebDriverType {

	CHROME("Chrome","webdriver.chrome.driver", "chromedriver.exe"), 
	FIREFOX("Firefox","webdriver.gecko.driver", "geckodriver.exe"), 
	EDGE("Edge","webdriver.edge.driver", "MicrosoftWebDriver.exe");

	private String browser;
	private String browserName;
	private String browserPath;

	private WebDriverType(String b, String bn, String bp) {
		this.browser = b;
		this.browserName = bn;
		this.browserPath = bp;
	}

	public String getBrowserName() {
		return this.browserName;
	}
	
	public String getBrowserPath() {
		return WebDriverType.class.getClassLoader().getResource(this.browserPath).getPath();
	}
}
