package com.taybee.automation.webuitests.bddtests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@Functional"},
		features = "src/test/resources/features", 
		glue = "com.taybee.automation.webuitests.bddtests",
		monochrome = true,
		plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })
public class runTest {

}
