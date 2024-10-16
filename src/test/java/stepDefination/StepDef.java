package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Loginpage;

public class StepDef {
 public WebDriver driver;
 public Loginpage lgnpage;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lgnpage = new Loginpage(driver);
	}

	
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	}

	
	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String username1, String password1) {
		lgnpage.enterEmail(username1);
		lgnpage.enterPassword(password1);
	}
	

	@When("Click on Login")
	public void click_on_login() {
		lgnpage.clickOnLoginButton();
	}

	
	@Then("Page Title should be {string}")
	public void page_title_should_be(String Expectedtittle) {
	String actualtittle=    driver.getTitle();
	Assert.assertEquals(Expectedtittle, actualtittle);
	}

	
	
	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		lgnpage.clickOnLogOutButton();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
