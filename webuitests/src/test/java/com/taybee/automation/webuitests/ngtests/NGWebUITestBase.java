package com.taybee.automation.webuitests.ngtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class NGWebUITestBase {
	protected WebDriver driver;
	protected static final long LONGTIMEOUT = 30000L;
	protected static final long SHORTTIMEOUT = 3000L;

	@BeforeClass
	public void beforeTest() {
		// it is used to define Chrome capability
		System.setProperty("webdriver.chrome.driver",
				getClass().getClassLoader().getResource("chromedriver.exe").getPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		// it is used to define IE capability
//		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//		capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
//		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		capabilities.setCapability(CapabilityType.PLATFORM, "ANY");
//		capabilities.setCapability("initialBrowserUrl", "http://taybee.com/");
//		System.setProperty("webdriver.ie.driver",
//				getClass().getClassLoader().getResource("IEDriverServer.exe").getPath());
//		driver = new InternetExplorerDriver(capabilities);
		
	}

	@AfterClass
	public void afterTest() {
		driver.quit();
	}

	protected WebDriver getWebDriver() {
		return this.driver;
	}

	public static void waitInSec(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			System.out.println("Failed to wait: " + seconds + "seconds");
		}
	}

	public void fluentWaitClickElement(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, LONGTIMEOUT / 1000);
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	public WebElement fluentWaitFindElement(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, LONGTIMEOUT / 1000);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public List<WebElement> fluentWaitFindElements(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, LONGTIMEOUT / 1000);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
}
