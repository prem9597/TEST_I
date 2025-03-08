package shriramgi.com.testshriram;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions( features = "src/test/java/Features", glue = {"shriramgi.com.testshriram"}, 
dryRun = !true,snippets = SnippetType.CAMELCASE, monochrome = true)

public class Runnerfile extends AbstractTestNGCucumberTests{

	
}
