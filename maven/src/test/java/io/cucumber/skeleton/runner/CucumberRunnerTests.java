package io.cucumber.skeleton.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "", 
		features = "src/test/resources/features", 
		glue = "io.cucumber.skeleton.stepdefinitions",
		plugin = {"pretty", "html:target/report/cucumber-reports.html"},
		monochrome = true
)

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
    
}
