package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	


	@CucumberOptions(
			features = {"./src/test/java/featuresFile/"},
			glue = {"stepDefinitions"},
			dryRun = false,
			monochrome =true
			)

public class Cucumber extends AbstractTestNGCucumberTests {


	  

}
