package testpackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

@Listeners(CustomListner.class)
public class TestActiTimeLogout extends BaseTest{

	@Test
	public void testActiTimeLogout() throws IOException
	{	
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUsername = flib.readPropertyData(PROP_PATH, "un");
		String validPassword = flib.readPropertyData(PROP_PATH, "pass");

		lp.validLogin(validUsername, validPassword);

		HomePage hp = new HomePage(driver);
		hp.logout();


	}


}
