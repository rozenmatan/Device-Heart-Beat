package tests;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeSuite
	public void setup() throws MalformedURLException {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		   capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		   capabilities.setCapability("deviceName", "Google Pixel 2 XL");
		   capabilities.setCapability("appPackage", "com.android.chrome");
		   capabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
		   capabilities.setCapability(MobileCapabilityType.UDID, "712KPKN1244077");
		   capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		   capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		   driver = new AppiumDriver<MobileElement>(new URL("http://matanrozen.ddns.net:4723/wd/hub"), capabilities);

	}
	@Test
	public void openChrome() {}
	
	@AfterSuite
	public void quit() {
		driver.quit();
	}
}
