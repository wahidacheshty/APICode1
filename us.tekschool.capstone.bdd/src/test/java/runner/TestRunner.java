
package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:feature",
		glue = "step.definition",
		tags = "@desktopTest",
		dryRun = false,
		monochrome = true,
		strict = true,
		plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"},
		publish = true
		
		
		)


public class TestRunner {

}