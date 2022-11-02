package BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass2 {
	public static WebDriver driver = null;

	public static void userInput(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static WebDriver browserLaunch(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace1\\IPTProject\\DriverNew\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("gecko")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("Invalid Browser");
		}
		driver.manage().window().maximize();

		return driver;

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void selectDropDown(WebElement element, String options, String value) {
		Select s = new Select(element);
		if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		} else if (options.equalsIgnoreCase("text")) {
			int n = Integer.parseInt(value);
			s.selectByIndex(n);
		} else {
			System.out.println("Invalid select");
		}

	}

	public static void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\FaceBook\\ScreenshotFb\\facebookbase.png");
		FileUtils.copyFile(source, destination);
	}
	public static void NavigateTo(String url) {
		
		driver.navigate().to(url);
}
public static void NavigateBFR(String Navigate) {


	 if (Navigate.equalsIgnoreCase("back")) {
		driver.navigate().back();
	}
	else if (Navigate.equalsIgnoreCase("forward")) {
		driver.navigate().forward();
		
	}
else if (Navigate.equalsIgnoreCase("refresh")) {
	driver.navigate().refresh();
}}

}
