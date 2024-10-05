package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
//@RunWith(cucumber.class)

@CucumberOptions(
		
		features = {"bdd-cucumber\\BDD-cucumber\\Feature\\login.feature"},
		
		glue = {"stepDefination"}  , //provide stepdefination package name for stepdef class path
		
		dryRun=true,
		
		monochrome = true,
		
		plugin = {"pretty"}
		
		
		
		
		)


public class LoginRunner  {

}
