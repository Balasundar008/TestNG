package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	public WebDriver driver;
	
	@FindBy(xpath ="//a[text()='Create New Account']")
	private WebElement CreateBtn;

	
	@FindBy(name="birthday_day")
	private WebElement date;
	
	@FindBy(name="birthday_month")
	private WebElement month;
	
	@FindBy(name="birthday_year")
	private WebElement year;
	
	@FindBy(xpath ="//button[text()='Sign Up']")
	private WebElement signup;
	
	

	
	public SignUpPage (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}	
	
	public WebElement getCreateBtn() {
		return CreateBtn;
	}
		
		public WebElement getDate() {
			return date;
		}
		public WebElement getMonth() {
			return month;
		}
		public WebElement getYear() {
			return year;
		}

		
		public WebElement getSignup() {
			return signup;
		}
		

}
