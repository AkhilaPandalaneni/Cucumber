package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import baseclass.BaseClass;
import pages.AnalysisAndInsights;
import pages.GLDTPage;
import pages.HomePage;
import pages.Jira_ticketPage;
import pages.LoginPage;


public class GLDTTestcae1 extends BaseClass {

	LoginPage loginpage;
	HomePage homepage;
	GLDTPage gldtpage;
	AnalysisAndInsights analysisAndinsights;
	
	public void setup1() throws Exception {
		initiate_Chromedriver_Open_URL();

	}

	//@Test(priority = 1)
	public void TAMAManager_login(String username, String password) throws Exception {

		loginpage = new LoginPage();
		loginpage.bips_APP_Login(username,password);
		System.out.println("Test Step Passed " + new Throwable().getStackTrace()[0].getMethodName() + " Sucessfully ");
	}
	
	//@Test(priority = 2)
	public void click_on_InitiateProcess_TAB() throws Exception {
		homepage = new HomePage();
		homepage.clickonInitiateProcess();			
	}

	//@Test(priority = 3)
	public void click_on_GLDT_Module() throws Exception {
		homepage = new HomePage();
		homepage.clickGLdtModule();						
	}
	//@Test(priority = 4)
	public void captureGLDT_id() throws Exception {
		
			gldtpage = new GLDTPage();
			gldtpage.capture_GLDTCase_id1();					
			
			}
	
	//@Test(priority = 5)
	public void EnterProduct(String product) throws Exception {
		gldtpage = new GLDTPage();
		Thread.sleep(5000);
		gldtpage.selectionOfProduct(product);		
		
	}
	
	//@Test(priority = 6)
	public void EnterTempProduct(String tempproduct) throws Exception {
		gldtpage = new GLDTPage();
		Thread.sleep(5000);
		gldtpage.selectionOftempProduct1(tempproduct);		
		
	}
	
	//@Test(priority = 7)
	public void givedetails(String reason,String region,String ropu,String country) throws Exception {
		gldtpage = new GLDTPage();
		Thread.sleep(7000);
		gldtpage.selectionOfReason(reason);
	    gldtpage.selectionofRegion(region);
	    gldtpage.selectionofRopu(ropu);
	    gldtpage.selectionofCountry(country);		
		
	}	
	
	//@Test(priority = 8)
	public void InitiateRAProcessbutton() throws Exception {
		gldtpage = new GLDTPage();
		gldtpage.clickOnInitiateprocessbutton();
	    
	}

	//@Test(priority = 9)
	public void Continuebutton() throws Exception {
		gldtpage = new GLDTPage();
		gldtpage.ClickonContinue();
		
	}
	
	//@Test(priority = 6)
	public void AnalysisandInsights_tab() throws Exception {
		homepage = new HomePage();
		homepage.AnalysisandInsights();
		
	}
	
	//@Test(priority = 10)
	public void Global_Launch_Date_Tracker() throws Exception {
		analysisAndinsights = new AnalysisAndInsights();
		analysisAndinsights.GlobalLaunchDateTracker();
			
	}
	
	//@Test(priority = 11)
	public void Resetfiltersbutton_Visibility() throws Exception {
		analysisAndinsights = new AnalysisAndInsights();
		analysisAndinsights.ResetfiltersbuttonVisibility();
		
	}
	
	//@Test(priority = 6)
	public void openExistingGLDT_WithoutLogOff() throws Exception {
		homepage = new HomePage();
		homepage.openExistingGLDTWithoutLogOff();
		
	}
	
	//@Test(priority = 6)
	public void tempProdCheck_AssignmentsSection() throws Exception {
		homepage = new HomePage();
		homepage.tempProdCheckAssignmentsSection();
		
	}

	
	
	
	//@Test(priority = 7)
	public void Click_on_close() throws Exception {
		gldtpage = new GLDTPage();
		gldtpage.Click_on_close();
		
	}
	

	//@AfterTest
	public void logout() throws Exception {
		homepage = new HomePage();
		homepage.logout();
		Thread.sleep(2000);
		driver.quit();
	}

}
