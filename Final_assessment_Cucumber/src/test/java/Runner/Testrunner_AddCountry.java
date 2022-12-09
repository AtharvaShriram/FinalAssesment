package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = ".\\Features\\AddCountry.feature",
		glue = "Add_Country_step_def",
		dryRun=false,
		monochrome = true
)

public class Testrunner_AddCountry {

}
