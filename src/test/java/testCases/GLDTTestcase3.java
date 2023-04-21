package testCases;


import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.GLDTPage;
import pages.HomePage;
import pages.Jira_ticketPage;
import pages.LoginPage;
import pages.ROLDPage;



public class GLDTTestcase3 extends BaseClass{
	
		
	LoginPage loginpage;
	ROLDPage ROLDPage;
	HomePage homepage;
	static int first_Row;
	static int last_Row;
	Jira_ticketPage jira_ticket = new Jira_ticketPage();
	String testCaseName = "gldt_HP_03";
	
	
	
	public void setup1() throws Exception {
		initiate_Chromedriver_Open_URL();
		
	}

	//@Test(priority=1)
	public void Ropu_login(String username, String password) throws Exception {
		loginpage = new LoginPage();
		loginpage.bips_APP_Login(username,password);
		System.out.println("Test Step Passed " + new Throwable().getStackTrace()[0].getMethodName() + " Sucessfully ");
	      
	}
	
	//@Test(priority=2)
	public void Opens_ExistingROLDCase() throws Exception {
		homepage = new HomePage();
		homepage.Open_Existing_ROLDCase();
		
	}

	
	//@Test(priority = 3)
	public void SelectDates(String BestDate,String BaseDate,String AcheivedDate ) throws Exception {
		ROLDPage = new ROLDPage();
		ROLDPage.bestDate_ePAF_Submission_Date(BestDate);
		Thread.sleep(5000);
		ROLDPage.baseDate_ePAF_Submission_Date(BaseDate);
		ROLDPage.AcheivedDate_ePAF_Submission_Date(AcheivedDate);
				
		
	}	

	//@Test(priority=4)
    public void Checkbox_PR_Dossier_Submission_Date_Column() throws Exception {
    	
    	ROLDPage = new ROLDPage();
        ROLDPage.Checkbox_PR_Dossier_Submission_Date_Column();
    	
        }
	
	//@Test(priority=5)
    public void checkbox_Cut_Off_Date_for_IPR_Column() throws Exception {
    	
    	ROLDPage = new ROLDPage();
    	ROLDPage.checkbox_Cut_Off_Date_for_IPR_Column();
    	
        }
    
	//@Test(priority=6)
    public void checkbox_officialPriceUnreimbursed() throws Exception {
 	
 	ROLDPage = new ROLDPage();
 	ROLDPage.checkbox_officialPriceUnreimbursed();
 	
     }
	
	//@Test(priority=7)
    public void checkbox_officialPriceReimbursed() throws Exception {
     	
     	ROLDPage = new ROLDPage();
     	ROLDPage.checkbox_officialPriceReimbursed();
     	
         }
    
	//@Test(priority=8)
    public void checkbox_Unreimbursed() throws Exception {
     	
     	ROLDPage = new ROLDPage();
     	ROLDPage.checkbox_Unreimbursed();
     	
         }
	
	//@Test(priority=9)
    public void checkbox_Reimbursed() throws Exception {
     	
     	ROLDPage = new ROLDPage();
     	ROLDPage.checkbox_Reimbursed();
     	
         }
	//@Test(priority=10)
    public void CompleteButton() throws Exception {
     	
     	ROLDPage = new ROLDPage();
     	ROLDPage.CompleteButton();
     	
         }
	//@Test(priority=11)
     public void CloseButton() throws Exception {
     	
     	ROLDPage = new ROLDPage();
     	ROLDPage.CloseButton();
     	
         }
	//@AfterTest
	public void logout() throws Exception {
		homepage = new HomePage();
		homepage.logout();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
