package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignPattern {
	public WebDriver driver;
	public SingleTonDesignPattern(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage getLoginPage() {
		LoginPage lp= new LoginPage(driver);
		return lp;
		
	}
	public  SignUpPage getSignUpPage() {
		SignUpPage sp= new SignUpPage(driver);
		return sp;

	}

}
