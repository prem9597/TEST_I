package CucumberTest1.org.CucumberTEST1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/Feature", dryRun = !true, glue = {"CucumberTest1.org.CucumberTEST1","base"}, snippets = SnippetType.CAMELCASE, monochrome = true, plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
/* tags = "@DO and @nj" ) */
public class RunnerFile extends AbstractTestNGCucumberTests {

}
 