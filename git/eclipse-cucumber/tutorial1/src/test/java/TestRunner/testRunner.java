package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		features= {"FeaturesFiles"},
		glue= {"StepDefination"},
		monochrome=true,
		dryRun=false
		
		//tags="not@adminPage"
		)

public class testRunner {
		
}



