package tests;

import java.net.URL;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	static AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setup()
	{
try {
		DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setCapability("platformName","Android");
		//cap.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.0" );
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Demo");
		cap.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
		cap.setCapability(MobileCapabilityType.APP,"E:\\Automation\\irctc.apk");
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
	
		  cap.setCapability("appPackage", "410de58 u0 cris.org.in.prs.ima");
          cap.setCapability("appActivity", "cris.org.in.ima.activities.HomeActivity");
	//cap.setCapability("appPackage","com.android.calculator2");
	//cap.setCapability("appActivity","com.android.calculator2.Calculator");
	URL url =new URL("http://127.0.0.1:4723/wd/hub");
	driver=new  AppiumDriver<MobileElement>(url,cap);
	//driver=new AndroidDriver<MobileElement>(url,cap);
	System.out.println("application started");
}
catch(Exception ex)
{

	System.out.println(ex.getMessage());
	System.out.println(ex.getCause());
	System.out.println(ex.getStackTrace());
	ex.printStackTrace();
}
	

	
	}
	//@Test
	//public void sample()
	//{
		//System.out.println("passed");
	//}
	//@AfterTest
	@AfterSuite
	public void teardown()
	{
		driver.quit();
		driver.close();
	}
}
