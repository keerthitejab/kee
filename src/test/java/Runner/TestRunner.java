package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/login.feature"},
		glue = {"StepDefinitions"},
		plugin = {"pretty","html:target/HtmlReports/loginreport.html"},
		monochrome = true,
		dryRun = false
		)

public class TestRunner {

}
