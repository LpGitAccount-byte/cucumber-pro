package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebaysearch {

	WebDriver gdriver;
	
	public Ebaysearch(WebDriver ldriver) {
		gdriver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy (id="gh-ac")
	WebElement searchtab;
	
	
	@FindBy(xpath="//input[@value=\"Search\"]")
	WebElement searchButton;
	
	public void clickonsearchTab() {
		searchtab.click();
	}
	
	public void enterProduct(String product) {
		searchtab.clear();
		searchtab.sendKeys(product);
	}
	
	public void ClickOnSearch() {
		searchButton.click();
	}
	
	
	
}
