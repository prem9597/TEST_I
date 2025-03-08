package CucumberTest1.org.FinalPracticeCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(dryRun = !true,features = "src/test/java/Feature",monochrome = !true,snippets = SnippetType.CAMELCASE,
glue = {"CucumberTest1.org.FinalPracticeCucumber"},plugin = {"pretty","html:test-output/cucumberReport/attampt.html"})
public class RunnerClass extends AbstractTestNGCucumberTests {

}
