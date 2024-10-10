package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Loginclass;

public class Loginsteps {

	public WebDriver driver;
	public Loginclass loginpg;
	
	
	@Given("user launch a chrome browser")
	public void user_launch_a_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    loginpg = new Loginclass();
	}

	@When("user open an URL {string}")
	public void user_open_an_url(String url) {
	    driver.get(url);
	}

	@When("user enter a username as {string}")
	public void user_enter_a_username_as(String validmail) {
		loginpg.enterEmail(validmail);
	}

	@When("user enter a password as {string}")
	public void user_enter_a_password_as(String validpass) {
		loginpg.EnterPassword(validpass);
	}

	@When("click on login")
	public void click_on_login() {
		loginpg.ClickOnLogin();
	}

	@Then("page tittle should be {string}")
	public void page_tittle_should_be(String string) {
	 String actual=   driver.getTitle();
	 String Expected="Dashboard / nopCommerce administration";
	}

	@When("user click on logout")
	public void user_click_on_logout() {
		loginpg.ClickOnLogout();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}



	
	
	
	
	
	
	
}
