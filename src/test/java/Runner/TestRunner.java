package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"Features"},
	                 glue = "stepdefinition",
	                 monochrome = true,
	                 plugin = { "json:target/cucumber.json",
	                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	                		 "rerun:Rerun/rerun1.txt" },
	                 		

	                 tags ="@TC_E2E_1")

public class TestRunner {      
		
		

}
	
	
	
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	