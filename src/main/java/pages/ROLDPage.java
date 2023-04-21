package pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import actiondriver.Action;
import baseclass.BaseClass;



public class ROLDPage extends BaseClass {


Action action= new Action();

    @FindBy(xpath="//iframe[@id='PegaGadget1Ifr']")
     WebElement frame1;
    
    @FindBy(xpath="//iframe[@id='PegaGadget2Ifr']")
     WebElement frame2;
    
    @FindBy(xpath = "//span[@class='workarea_header_id']")
	WebElement headerid;
    
    @FindBy(xpath = "//span[contains(text(),'(ROLD-')]")
	WebElement expectedROLD_Case_Id;
	
	@FindBy(xpath="//input[@id='d21e5ede']")
	WebElement Best ;
	
	@FindBy(xpath="//input[@id='ae7f7b05']")
	WebElement Base ;
	
	@FindBy(xpath="//input[@id='33709a73']")
	WebElement Acheived ;
	
	@FindBy(xpath="//input[@id='e7ac2b61']")
	WebElement CheckboxPR ;
	
	@FindBy(xpath="//button[@title='Continue']")
	WebElement popupPR ;
	
	@FindBy(xpath="//input[@id='b52b7737']")
	WebElement Checkboxcutoff ;
	
	@FindBy(xpath="//input[@id='17c420e1']")
	WebElement officialPriceUnreimbursed ;
	
	@FindBy(xpath="//input[@id='3cdc2b72']")
	WebElement officialPriceReimbursed ;
	
	@FindBy(xpath="//input[@id='14bd8026']")
	WebElement unReimbursedLaunchDate ;
	
	@FindBy(xpath="//input[@id='c4823044']")
	WebElement reimbursedLauchDate ;
	
	@FindBy(xpath="//button[contains(text(),'Complete')]")
	WebElement CompleteButton ;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	WebElement CloseButton ;
	
	@FindBy(xpath = "//input[@id='515edcb6']")
	WebElement PR_Dossier_column;
	
	@FindBy(xpath = "//input[@id='e10075d3']")
	WebElement cutOffDateforIPRcolumn;	

	
	
	@FindBy(linkText="Today")
	WebElement TodayDate ;

	
	public ROLDPage () {
		PageFactory.initElements(driver, this);
	}
	
	public static String ROLD_Case_Id;
	
	public void capture_ROLDCase_id() throws Exception {
		try {
			action.switchToDefaultFrame(driver);
			action.switchToFrame(driver, frame1);
			ROLD_Case_Id = headerid.getText();
			System.out.println("ActualROLDId:" + ROLD_Case_Id);
			String expectedROLDID = expectedROLD_Case_Id.getText();
			System.out.println("Expected RALD ID:" + expectedROLDID);
			Assert.assertEquals(ROLD_Case_Id, expectedROLDID);
			ROLD_Case_Id = ROLD_Case_Id.substring(ROLD_Case_Id.lastIndexOf("R")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(ROLD_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			ROLD_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_ROLDCase_id is" + ROLD_Case_Id);
			

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			
		}
		
	}
	
	
	
	
	public void bestDate_ePAF_Submission_Date(String BestDate) throws Exception{
		try {
			driver.switchTo().defaultContent();
			action.switchToFrame(driver, frame1);
			Thread.sleep(6000);
			action.type(Best, BestDate);
			
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			

		}
		
	}
	public void baseDate_ePAF_Submission_Date(String BaseDate) throws Exception{
       try {
			Thread.sleep(3000);
			action.type(Base, BaseDate);


		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			
		}
	}
	
    public void AcheivedDate_ePAF_Submission_Date(String AcheivedDate) throws Exception{
    	try {
    	Thread.sleep(7000);
    	action.type(Acheived, AcheivedDate);
		Thread.sleep(3000);
		
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			

		}
	}
    
    public void Checkbox_PR_Dossier_Submission_Date_Column() throws Exception{
    	try {
    	
    		action.click(driver, CheckboxPR);
    		Thread.sleep(5000);		
    		boolean Check_Mark1aPopUp = popupPR.isDisplayed();
    		Assert.assertTrue(Check_Mark1aPopUp);
    		System.out.println("ApplyChanges PopUp is opened:" + Check_Mark1aPopUp);
    		action.click(driver, popupPR);
    		Thread.sleep(3000);
    		} catch (Exception e) {
    			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
    			jira_ticketPage.Create_JiraTicket(currentMethod);
    		}
    		
    	}

    public void checkbox_Cut_Off_Date_for_IPR_Column() throws Exception{
    	try {
    		
    		action.click(driver, Checkboxcutoff);
    		Thread.sleep(5000);
    		
    		boolean Check_Mark2aPopUp = popupPR.isDisplayed();
    		Assert.assertTrue(Check_Mark2aPopUp);
    		System.out.println("ApplyChanges PopUp is opened:" + Check_Mark2aPopUp);
    		action.click(driver, popupPR);
    		Thread.sleep(3000);
    		
    		} catch (Exception e) {
    			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
    			jira_ticketPage.Create_JiraTicket(currentMethod);
    			

    		}
    	
    }

    public void checkbox_officialPriceUnreimbursed() throws Exception{
    	
    	try {
    		
    		action.click(driver, officialPriceUnreimbursed);
    		Thread.sleep(3000);
    		action.explicitWait1(driver, popupPR);
    		boolean Check_Mark3aPopUp = popupPR.isDisplayed();
    		Assert.assertTrue(Check_Mark3aPopUp);
    		System.out.println("ApplyChanges PopUp is opened:" + Check_Mark3aPopUp);
    		action.click(driver, popupPR);
    		
    	
    		} catch (Exception e) {
    			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
    			jira_ticketPage.Create_JiraTicket(currentMethod);
    			

    		}
    	
    }

    public void checkbox_officialPriceReimbursed() throws Exception{
        try {
        	Thread.sleep(3000);
    	
    		action.click(driver, officialPriceReimbursed);
    		Thread.sleep(3000);
    		
    		boolean Check_Mark4aPopUp = popupPR.isDisplayed();
    		Assert.assertTrue(Check_Mark4aPopUp);
    		System.out.println("ApplyChanges PopUp is opened:" + Check_Mark4aPopUp);
    		action.click(driver, popupPR);
    		Thread.sleep(3000);
    		
    	
    		} catch (Exception e) {
    			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
    			jira_ticketPage.Create_JiraTicket(currentMethod);
    			

    		}
    	
    }

    public void checkbox_Unreimbursed() throws Exception{
        try {
        	//action.explicitWait1(driver, unReimbursedLaunchDate);
    		action.click(driver, unReimbursedLaunchDate);
    		Thread.sleep(3000);
    		//action.explicitWait1(driver, popupPR);
    		boolean Check_Mark5aPopUp = popupPR.isDisplayed();
    		Assert.assertTrue(Check_Mark5aPopUp);
    		System.out.println("ApplyChanges PopUp is opened:" + Check_Mark5aPopUp);
    		action.click(driver, popupPR);
    		Thread.sleep(3000);
    		
    	
    		} catch (Exception e) {
    			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
    			jira_ticketPage.Create_JiraTicket(currentMethod);
    			

    		}
    	
    }

    public void checkbox_Reimbursed() throws Exception{
    	
    	try {
    		Thread.sleep(3000);
    		
    		action.click(driver, reimbursedLauchDate);
    		Thread.sleep(3000);
    		
    		boolean Check_Mark5aPopUp = popupPR.isDisplayed();
    		Assert.assertTrue(Check_Mark5aPopUp);
    		System.out.println("ApplyChanges PopUp is opened:" + Check_Mark5aPopUp);
    		action.click(driver, popupPR);
    		Thread.sleep(3000);
    		} catch (Exception e) {
    			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
    			jira_ticketPage.Create_JiraTicket(currentMethod);
    			
    		}
    	
    }


public void CompleteButton() throws Exception{
	try {
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	action.switchToFrame(driver,frame1 );
	Thread.sleep(3000);
	action.click(driver, CompleteButton);
	} catch (Exception e) {
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
		jira_ticketPage.Create_JiraTicket(currentMethod);
		

	}
	
}

public void CloseButton() throws InterruptedException{
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	action.switchToFrame(driver,frame1 );
	Thread.sleep(3000);
	action.click(driver, CloseButton);
	
	
}





		
	

}
