package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Ebaysearch;

public class EbaysearchSteps {
	public WebDriver driver;
	public Ebaysearch search;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   search= new Ebaysearch(driver);
	}

	@When("user open an url {string}")
	public void user_open_an_url(String uarl1) {
	   driver.get(uarl1); 
	}

	@When("click on search textbox")
	public void click_on_search_textbox() {
	    search.clickonsearchTab();
	}

	@When("enter a searchable product {string}")
	public void enter_a_searchable_product(String prod) {
	    search.enterProduct(prod);
	}

	@When("click on search")
	public void click_on_search() {
	    search.ClickOnSearch();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
