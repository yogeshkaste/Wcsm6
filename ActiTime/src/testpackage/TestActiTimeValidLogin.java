package testpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.LoginPage;
@Listeners(CustomListner.class)
public class TestActiTimeValidLogin extends BaseTest {
	
	
	@Test
	public void testActiTimeValidlogin() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUsername = flib.readPropertyData(PROP_PATH, "un");
		String validPassword = flib.readPropertyData(PROP_PATH, "pass");
		
		lp.validLogin(validUsername, validPassword);
		
		WebDriverCommonLib wb = new WebDriverCommonLib();
		String actualHomePageTitle = wb.getTheTitleOfTheWebPage();
		Thread.sleep(2000);
		Assert.assertEquals(actualHomePageTitle, "suraj");
		
			
	}

	
	
}
