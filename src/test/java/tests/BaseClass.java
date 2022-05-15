package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	AppiumDriver<MobileElement> driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeTest
	public void setup() throws IOException {
		
		try {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		Properties prop = new Properties();
        InputStream inputStream = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
        prop.load(inputStream);
        String app = prop.getProperty("app");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("platformName"));
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("platformVersion"));
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,prop.getProperty("deviceName"));
        caps.setCapability(MobileCapabilityType.UDID, prop.getProperty("deviceID"));
        caps.setCapability("app",projectPath+"/src/test/resources/apps/monefy.apk");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        caps.setCapability(MobileCapabilityType.NO_RESET, true);
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        
        driver = new AndroidDriver<MobileElement>(url, caps);
        
		}catch(Exception exp) {
			System.out.print("Failure because of : " +exp.getCause());
			System.out.print("Message : " +exp.getMessage());
			exp.printStackTrace();
		}

	}
	

	@AfterTest
	public void teardown() {
		
		if(null!=driver)
        {
            driver.quit();
        }

	}

}
