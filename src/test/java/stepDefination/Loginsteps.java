package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

	@Given("user at login page")
	public void preRequisite() {
		System.out.println("given statement");
	}
	
	@When("user enter a username")
	public void enteruserName() {
		System.out.println("When steps execution-enter username");
	}
	
	@And("user enter a password")
	public void enterPassword() {
		System.out.println("And enter valid password");
	}
	
	@And("user click on Login button")
	public void cluckonLogin() {
		System.out.println("and -click on login");
	}
	
	@Then("user should Redirect to home page")
	public void redirectToHomepage() {
		System.out.println("Then-Redirect to home page");
	}
	
	
	
	
	
	
	
	
	
	
	
}
