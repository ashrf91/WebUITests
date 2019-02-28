package testbase;

public enum WebDriverType {

	CHROME("webdriver.chrome.driver", "chromedriver.exe"), 
	FIREFOX("webdriver.gecko.driver", "geckodriver.exe"), 
	EDGE("webdriver.edge.driver", "MicrosoftWebDriver.exe");

	private String browserName;
	private String browserPath;

	private WebDriverType(String bn, String bp) {
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
