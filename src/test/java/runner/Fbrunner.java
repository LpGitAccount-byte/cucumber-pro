package runner;

import org.junit.runner.RunWith;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//Feature/fl_login.feature"},
		glue="stepDefination/fbsteps",
		dryRun = true,
		monochrome = true,
		plugin= {"pretty","html:target/Testevidence/report1.html"}



)











public class Fbrunner {

}
