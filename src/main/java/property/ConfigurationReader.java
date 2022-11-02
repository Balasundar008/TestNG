 package property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public Properties p;
	public ConfigurationReader() throws IOException {
		File f= new File("C:\\Users\\Admin\\eclipse-workspace1\\TestNGPro\\src\\main\\java\\property\\FaceBook.properties");
		FileInputStream fis= new FileInputStream(f);
		
//		Properties p= new Properties();
		p= new Properties();
		
		p.load(fis);
		
	}
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;

	}
	public String getUserName() {
		String username = p.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getfName() {
		String fName = p.getProperty("fname");
		return fName;
	}
	public String getsName() {
		String sName = p.getProperty("sname");
		return sName;
	}
	public String getmble() {
		String mble = p.getProperty("mble");
		return mble;
	}
	public String getnewpass() {
		String newpass = p.getProperty("newpass");
		return newpass;
	}
	public String getdate() {
		String date = p.getProperty("date");
		return date;
	}
	public String getmonth() {
		String month = p.getProperty("month");
		return month;
	}
	public String getyear() {
		String year = p.getProperty("year");
		return year;
	}
	public String getgender() {
		String gender = p.getProperty("gender");
		return gender;
	}


}
