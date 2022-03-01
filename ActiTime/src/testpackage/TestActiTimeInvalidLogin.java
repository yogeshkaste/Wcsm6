package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomListner;
import generic.Flib;
import pagepackage.LoginPage;
@Listeners(CustomListner.class)
public class TestActiTimeInvalidLogin extends BaseTest {

	
	@Test
	public void testActiTimeInValidlogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");

		for(int i=1;i<rc;i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			
			lp.invalidLogin(invalidUsername, invalidPassword);
		}
		
	}
}
