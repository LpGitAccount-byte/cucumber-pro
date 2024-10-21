package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommObject {

	WebDriver gdriver;
	
	public CommObject(WebDriver ldriver) {
		gdriver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//svg[@fill=\"currentColor\"]") WebElement form;
	
	@FindBy(xpath="//svg[@xmlns=\"http://www.w3.org/2000/svg\"]") WebElement downarrow;
	
	@FindBy(xpath="//span[@text()=\"Practice Form\"]") WebElement Ptext;
	
	@FindBy(id="firstName") WebElement fname;
	
	@FindBy(id="lastName") WebElement lname;
	
	@FindBy(id="userEmail") WebElement email;
	
	@FindBy(id="gender-radio-1") WebElement male;
	
	@FindBy(id="userNumber") WebElement Unumber;
	
	@FindBy(xpath="") WebElement user;
	
	@FindBy(xpath="") WebElement user;
	
	@FindBy(xpath="") WebElement user;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
