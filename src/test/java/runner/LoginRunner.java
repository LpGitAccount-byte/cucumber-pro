package runner;
import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



RunWith(cucumber.class)
@CucumberOptions(
		features="BDD-cucumber\\Feature\\login.feature",
		glue="stepDefination",
		
		dryRun=true,
		monochrome=true,
		
		plugin= {"pretty"}
		
		
		)


public class LoginRunner  {

}
