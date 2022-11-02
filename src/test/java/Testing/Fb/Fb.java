package Testing.Fb;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.BaseClass2;
import POM.SingleTonDesignPattern;
import property.ConfigurationHelper;

public class Fb extends BaseClass2{
	public static WebDriver driver;
	static SingleTonDesignPattern sdp= new SingleTonDesignPattern(driver);

	@BeforeClass
	private void launchPage() throws IOException {
		String browser = ConfigurationHelper.getInstance().getBrowser();
			
		driver= browserLaunch(browser);
		String url = ConfigurationHelper.getInstance().getUrl();
		launchUrl(url);
		NavigateBFR("back");
		screenshot();
	}
	@Test(priority = 0)

	private void login() throws IOException, InterruptedException {

		String userName = ConfigurationHelper.getInstance().getUserName();
		userInput(sdp.getLoginPage().getUsername(), userName);
		
		String password = ConfigurationHelper.getInstance().getPassword();
		userInput(sdp.getLoginPage().getPassword(), password);
		
		clickOnElement(sdp.getLoginPage().getLoginBtn());
		sleep();
	}
	@Test(priority = 1)
	private void signUp() throws IOException {
		String getdate = ConfigurationHelper.getInstance().getdate();
		userInput(sdp.getSignUpPage().getDate(), getdate);
		
		String getmonth = ConfigurationHelper.getInstance().getmonth();
		userInput(sdp.getSignUpPage().getMonth(), getmonth);
		
		String getyear = ConfigurationHelper.getInstance().getyear();
		userInput(sdp.getSignUpPage().getYear(), getyear);
		
		clickOnElement(sdp.getSignUpPage().getSignup());
		screenshot();

	}
	@AfterTest
	private void Close() {
		close();
	}
}
