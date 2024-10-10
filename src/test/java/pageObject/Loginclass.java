package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginclass {

	WebDriver gdriver;
	
	public void Loginclass(WebDriver ldriver) {
		gdriver=ldriver;
		PageFactory.initElements(ldriver, this);
		}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pass;
	
	@FindBy(xpath="//button[@class=\"button-1 login-button\"]")
	WebElement loginbtn;
	
	@FindBy(linkText="Logout")
	WebElement Logoutbtn;
	
	
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void EnterPassword(String password) {
		pass.sendKeys(password);
	}
	
	public void ClickOnLogin() {
		loginbtn.click();
	}
	
	public void ClickOnLogout() {
		Logoutbtn.click();
	}
	
	
	
}
