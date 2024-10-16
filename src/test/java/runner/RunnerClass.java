package runner;


import org.junit.runner.RunWith;

//import io.cucumber.testng.CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//Feature/login.feature"},
		glue="stepDefination",
		dryRun = false,
		monochrome = true
	//	tags = "@Sanity",//scenarios under @sanity tag will be executed
		//plugin = {"pretty","html:target/cucumber-reports/reports_html.html"}
		)












public class RunnerClass {

}
