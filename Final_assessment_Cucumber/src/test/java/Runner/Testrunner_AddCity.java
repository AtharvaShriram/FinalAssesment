package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = ".\\Features\\AddCity.feature",
		glue = "Add_City_step_def",
		dryRun=false,
		monochrome = true
)


public class Testrunner_AddCity
{

}
