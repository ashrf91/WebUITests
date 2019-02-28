package testbase;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.Scenario;

public class WebUITestBase {

	public static Scenario scnario = null;
	public static boolean isDriverAlive = true;
	private static WebDriver driver;
	private static final long LONGTIMEOUT = 30000L;
	private static final long SHORTTIMEOUT = 3000L;

	public static void webUITestInit() {
		// it is used to define Chrome capability
		System.setProperty("webdriver.chrome.driver",
				WebUITestBase.class.getClassLoader().getResource("chromedriver.exe").getPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebUITestBase.isDriverAlive = true;
	}

	public static void webUITestFinesh() {
		driver.quit();
	}

	protected static WebDriver getWebDriver() {
		if (driver == null)
			webUITestInit();
		return driver;
	}

	public static void waitInSec(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			System.out.println("Failed to wait: " + seconds + "seconds");
		}
	}

	public static void fluentWaitClickElement(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, LONGTIMEOUT / 1000);
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		takeScreenShot();
	}

	public static void fluentWaitTypeToElement(By locator, String text) {
		WebDriverWait wait = new WebDriverWait(driver, LONGTIMEOUT / 1000);
		WebElement we = wait.until(ExpectedConditions.elementToBeClickable(locator));
		we.clear();
		we.sendKeys(text);
		takeScreenShot();
	}

	public static void fluentWaitSelectFromDropdownByValue(By locator, String value) {
		WebDriverWait wait = new WebDriverWait(driver, LONGTIMEOUT / 1000);
		Select dropdown = new Select(wait.until(ExpectedConditions.elementToBeClickable(locator)));
		dropdown.selectByValue(value);
		takeScreenShot();
	}

	public static WebElement fluentWaitFindElement(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, LONGTIMEOUT / 1000);
		WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		takeScreenShot();
		return we;

	}

	public static List<WebElement> fluentWaitFindElements(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, LONGTIMEOUT / 1000);
		List<WebElement> weList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		takeScreenShot();
		return weList;
	}

	public static void navigateTo(String URL) {
		driver.navigate().to(URL);
	}

	public static String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public static void takeScreenShot() {
		scnario.embed(getScreenshot(), "image/png");
	}
	
	public static byte[] getScreenshot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

}
