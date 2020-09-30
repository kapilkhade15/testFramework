package CucumberTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "D:\\Java Selenium\\CucumberProj\\Features\\google.feature"
				,glue = {"step_def"}
)
public class TestRunner {


	
	

}
