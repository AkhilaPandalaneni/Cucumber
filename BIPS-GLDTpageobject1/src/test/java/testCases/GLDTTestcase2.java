package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.GLDTPage;
import pages.HomePage;
import pages.Jira_ticketPage;
import pages.LoginPage;
import pages.RALDPage;

public class GLDTTestcase2 extends BaseClass {

	LoginPage loginpage;
	HomePage homepage;
	GLDTPage gldtpage;
	RALDPage raldpage;
	static int first_Row;
	static int last_Row;
	Jira_ticketPage jira_ticket = new Jira_ticketPage();

	String testCaseName = "gldt_HP_02";
	public static String GLDT_Case_Id;

	public void setup1() throws Exception {
		initiate_Chromedriver_Open_URL();

	}

	@Test(priority = 1)
	public void RegulatoryAffairs_Login(String username, String password) throws Exception {

		loginpage = new LoginPage();
		loginpage.bips_APP_Login(username, password);
		System.out.println("Test Step Passed " + new Throwable().getStackTrace()[0].getMethodName() + " Sucessfully ");
	}

	@Test(priority = 2)
	public void openRALDcase() throws Exception {
		homepage = new HomePage();
		Thread.sleep(5000);
		homepage.Open_Existing_RALDCase();

	}

	@Test(priority = 3)
	public void captureRALD_id() throws Exception {
		raldpage = new RALDPage();

		raldpage.capture_RALDCase_id();
	}

	@Test(priority = 4)
	public void Clickdetails(String BestDate,String Basedate) throws Exception {

		raldpage = new RALDPage();
		raldpage.clickOnBestDate(BestDate);
		raldpage.clickOnBaseDate(Basedate);
		raldpage.clickOnAcheivedDate();	
	}

	@Test(priority = 5)
	public void checkApprovalDate() throws Exception {

		raldpage = new RALDPage();

		raldpage.approvalDate();
	}

	@Test(priority = 6)
	public void initiateropuprocess() throws Exception {

		raldpage = new RALDPage();

		raldpage.ROPUProcess();
	}

	@Test(priority = 7)
	public void Click_on_ok() throws Exception {

		raldpage = new RALDPage();

		raldpage.clickOnOk();
	}

	@Test(priority = 8)
	public void Click_on_complete() throws Exception {

		raldpage = new RALDPage();

		raldpage.clickOnCompleteasRA();
	}

	@Test(priority = 9)
	public void Click_on_close() throws Exception {

		raldpage = new RALDPage();

		raldpage.clickOnCloseAsRA();
	}

	@AfterTest
	public void logout() throws Exception {
		homepage = new HomePage();
		homepage.logout();
		Thread.sleep(2000);
		driver.quit();
	}
	
	public void InitiateRopuProcessButtonVisibility_Disabled() throws Exception {
		raldpage = new RALDPage();
		raldpage.InitiateRopuProcessButtonVisibility();
		
	}
	
	public void SaveAndNotifyVisibility_Disabled() throws Exception {
		raldpage = new RALDPage();
		raldpage.SaveAndNotifyVisibility();
		
	}
	
	public void CompleteButtonVisibility_Disabled() throws Exception {
		raldpage = new RALDPage();
		raldpage.CompleteButtonVisibility();
		
	}
	
	
	
	
	

	

}
