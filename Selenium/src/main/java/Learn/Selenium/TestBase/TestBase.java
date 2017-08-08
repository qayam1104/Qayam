package Learn.Selenium.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class TestBase {
	
	WebDriver driver;
	public Properties OR = new Properties();

	
	@Test
	public void init() throws IOException {
		loadData();
		//String log4jConfPath = "log4j.properties";
		//PropertyConfigurator.configure(log4jConfPath);
		openURL(OR.getProperty("url"));
		
	}
	
	
	public void loadData() throws IOException {
		File file = new File("C:\\Users\\qayam.uddin\\workspace1\\Selenium\\data\\config.properties");
		FileInputStream f = new FileInputStream(file);
		OR.load(f);

	}


	public void openURL(String URL) {
		
			 {
				
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\qayam.uddin\\workspace1\\Selenium\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				// driver = new EventFiringWebDriver(dr);
				//eventListener = new WebEventListener();
				// driver.register(eventListener);
				// setDriver(driver);
				//
				driver.get(URL);
			}
		
		}
	}



