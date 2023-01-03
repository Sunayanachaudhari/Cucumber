package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/java/FeatureFiles",
	glue="StepDefinations",
	//dryRun=true,
	monochrome=true,
	plugin="pretty",     //folder name
	publish=true,
	tags="@smoke"
	)
public class testRunner {
	
  
}
