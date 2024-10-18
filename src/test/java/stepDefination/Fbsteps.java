package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObject.FbsignUp;

public class Fbsteps {
   public WebDriver driver;
	public FbsignUp fbsign;
	

@Given("user launch a chrome browser")
public void user_launch_a_chrome_browser() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    fbsign = new FbsignUp(driver);
}


@When("user open an URL {string}")
public void user_open_an_url(String fburl) {
   driver.get(fburl);
}


@When("click on sign up for facebook link")
public void click_on_sign_up_for_facebook_link() {
	fbsign.ClickOnSignUpForFacebook();
}


@Then("page tittle should be {string}")
public void page_tittle_should_be(String tittle) {
 String actual= driver.getTitle();
 String expect="Sign up for Facebook";
 Assert.assertEquals("tittle not matching ", expect, actual);
}


@Then("user should enter a required data")
public void user_should_enter_a_required_data() {
	fbsign.requiredData();
}


@Then("click on SignUp button")
public void click_on_sign_up_button() {
	fbsign.clickOnSignUp();
}


////////////////////////////////////////////////////
//Login with valid credentials
@When("user enter a uasername {string}")
public void user_enter_a_uasername(String user) {
	fbsign.enteruserName(user);
}

@When("user enter a password {string}")
public void user_enter_a_password(String pas1) {
	fbsign.EnterValidPass(pas1);
}

@When("click on login")
public void click_on_login() {
	fbsign.ClickOnLoginButton();
}

	
@Then("fb page tittle should be {string}")
public void fb_page_tittle_should_be(String string) {
  String fbactual=  driver.getTitle();
  String fbexpect="Facebook";
  System.out.println("page tittle of facebook : "+fbactual);
  if(fbactual.equals(fbexpect)) {
	  System.out.println("tittle match");
  }
  else {
	  System.out.println("tittle mismatch");
  }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
