package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		monochrome= true,
		plugin = {"html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/features", 
		glue = "stepdefs",
		
		tags = {"@sanity"} //to run the single scenario
		//tags = {"@sanity or @regression"} //to run multiple scenario
		
		)

public class TestRunner {

}
