package tests;

import org.testng.annotations.Test;

public class TestCases extends BaseClass {

	@Test
	public void Launch()
	{
		//  driver.findElementByAccessibilityId("Apps").click();
          driver.findElementByAccessibilityId("IRCTC Rail Connect").click();
         
          driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button").click();
        
      	System.out.println("launcced");
	}
	
	@Test
	public void Login()
	
	{
		  driver.findElementById("cris.org.in.prs.ima:id/tv_action_right1").click();
     
          driver.findElementById("cris.org.in.prs.ima:id/et_username").sendKeys("harsha473");
          driver.findElementById("cris.org.in.prs.ima:id/et_password").sendKeys("Pawan9harsha");
          driver.findElementById("cris.org.in.prs.ima:id/cb_check_otp_booking").click();

      	System.out.println("login");
	}
}
