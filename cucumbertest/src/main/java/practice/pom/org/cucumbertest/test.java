package practice.pom.org.cucumbertest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = {
		"src/test/java/features/Addtocart.feature" }, dryRun = !true, glue = "testrunner", monochrome = true, snippets = SnippetType.CAMELCASE)

public class test extends AbstractTestNGCucumberTests {

}
