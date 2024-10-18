package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FbsignUp {

	WebDriver gdriver;
	
	public FbsignUp(WebDriver ldriver) {
		gdriver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(linkText="Sign up for Facebook")
	WebElement signUp;
	
	@FindBy(xpath="//input[@name=\"firstname\"]")
	WebElement fname;
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	WebElement lname;
	
	@FindBy(xpath="//select[@name=\"birthday_day\"]")
	WebElement dob;
	
	@FindBy(xpath="//select[@name=\"birthday_month\"]")
	WebElement dom;
	
	@FindBy(xpath="//select[@name=\"birthday_year\"]")
	WebElement doy;
	
	@FindBy(xpath="//inpu[@value=\"2\"]")
	WebElement gender;
	
	@FindBy(xpath="//select{@name=\"reg_email__\"]")
	WebElement rMnumber;
	
	@FindBy(id="password_step_input")
	WebElement pass;
	
	@FindBy(xpath="//button[@name=\"websubmit\"]")
	WebElement clickSignUp;
	
	@FindBy(id="email")
	WebElement userid;
	
	@FindBy(id="pass")
	WebElement passwrd;
	
	@FindBy(id="loginbutton")
	WebElement clickOnLoin;
	
	public void ClickOnSignUpForFacebook() {
		signUp.click();
	}
	
	public void requiredData() {
		fname.sendKeys("selenium");
		lname.sendKeys("cucumber");
		
		Select date= new Select(dob);
		date.selectByIndex(1);
		
		Select month= new Select(dom);
		month.selectByIndex(2);
		
		Select year = new Select(doy);
		year.selectByValue("2007");
	}
	
	public void selectGender() {
		gender.click();
	}
	
	public void EnterMnumber() {
		rMnumber.sendKeys("9172635467");
	}
	
	public void EnterPassword() {
		pass.sendKeys("Sel@12345");
	}
	
	public void clickOnSignUp() {
		clickSignUp.click();
	}
	
	
	////////////////////////////////////////
	//Sign in with valid credentials
	
	public void enteruserName(String user) {
		userid.sendKeys("9028788990");
	}
	
	public void EnterValidPass(String pas1) {
		passwrd.sendKeys("33909696");
	}
	
	public void ClickOnLoginButton() {
		clickOnLoin.click();
	}
	
	
	
	
}
