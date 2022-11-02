package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//	WebElement t = driver.findElement(By.tagName("h2"));
//	WebElement username = driver.findElement(By.id("email"));
//	WebElement password = driver.findElement(By.name("pass"));
//	WebElement loginBtn = driver.findElement(By.name("login"));
//	WebElement CreateBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
//	WebElement fName = driver.findElement(By.name("firstname"));
//	WebElement sName = driver.findElement(By.name("lastname"));
//	WebElement mble = driver.findElement(By.name("reg_email__"));
//	WebElement newpass = driver.findElement(By.id("password_step_input"));
//	WebElement date = driver.findElement(By.name("birthday_day"));
//	WebElement month = driver.findElement(By.name("birthday_month"));
//	WebElement year = driver.findElement(By.name("birthday_year"));
//	WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
//	WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
	
	public static WebDriver driver; 
	
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	
	@FindBy(xpath ="//a[text()='Create New Account']" ) 
	private WebElement CreateBtn;
	
	
public LoginPage (WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver, this);
}	

	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getCreateBtn() {
		return CreateBtn;
	}
	
	
		
	
}
