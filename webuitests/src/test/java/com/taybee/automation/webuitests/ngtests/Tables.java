package com.taybee.automation.webuitests.ngtests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tables extends NGWebUITestBase {

	@Test(priority=1)
	public void fetchNumberOfRowsAndColumns() {
		getWebDriver().navigate().to("http://demo.guru99.com/test/web-table-element.php");
		// Number of Columns
		List<WebElement> col = getWebDriver().findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No of cols are : " + col.size());
		// No.of rows
		List<WebElement> rows = getWebDriver().findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No of rows are : " + rows.size());
	}

	@Test(priority = 0)
	public void fetchCellValue() {
		getWebDriver().get("http://demo.guru99.com/test/web-table-element.php");
		getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement baseTable = getWebDriver().findElement(By.tagName("table"));

		// To find third row of table
		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		String rowtext = tableRow.getText();
		System.out.println("Third row of table : " + rowtext);

		// to get 3rd row's 2nd column data
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		String valueIneed = cellIneed.getText();
		System.out.println("Cell value is : " + valueIneed);
	}

}
