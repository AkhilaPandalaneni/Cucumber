package gldt;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;



//import bips_OtherMethods.XL_Data_GLDT;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Home_Page {

	private static final XSSFCell String = null;
	static WebDriver driver = GLDT_Login.driver;
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	static SoftAssert softAssert = new SoftAssert();
	private static java.lang.String attachment_count;
	


	
	
	

	@Given("User click on Initiate Tab")	
public static void click_on_InitiateProcess_TAB() throws Exception {
	try {
	WebElement FrameSRC = driver.findElement(By.xpath("//iframe[@src='about:blank']"));
	driver.switchTo().frame(FrameSRC);
	driver.findElement(By.xpath("(//*[@class='layout-group-item-title'])[2]")).click();
	
	WebElement gldtModule=driver.findElement(By.xpath("//div[6]//span/button[contains(text(),'GLDT - Global Launch Date Tracker')]"));
	boolean gldtPresence=gldtModule.isDisplayed();
	softAssert.assertTrue(gldtPresence);
	System.out.println("GLDT module Assert check"+gldtPresence);
	softAssert.assertAll();
	
	}
	
	catch(Exception e) {
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		
	}
	
	catch(AssertionError e) {
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		//XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
	}
	
	
}

public static void click_on_InitiateProcess_TAB_IndependentCase(int SRN, int ERN) throws Exception {
	driver=GLDT_Login.driver;
	wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	try {
	WebElement FrameSRC = driver.findElement(By.xpath("//iframe[@src='about:blank']"));
	driver.switchTo().frame(FrameSRC);
	driver.findElement(By.xpath("(//*[@class='layout-group-item-title'])[2]")).click();
	
	WebElement gldtModule=driver.findElement(By.xpath("//div[6]//span/button[contains(text(),'GLDT - Global Launch Date Tracker')]"));
	boolean gldtPresence=gldtModule.isDisplayed();
	softAssert.assertTrue(gldtPresence);
	System.out.println("GLDT module Assert check"+gldtPresence);
	softAssert.assertAll();
	XL_Data_GLDT.write_Pass_Result(SRN);
	}
	
	catch(Exception e) {
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);
	}
	
	catch(AssertionError e) {
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);
	}
	
	
}


public static void click_on_Analysis_Insights_TAB(int SRN, int ERN) throws Exception {
	try{
	WebElement FrameSRC = driver.findElement(By.xpath("//iframe[@src='about:blank']"));
	driver.switchTo().frame(FrameSRC);
	driver.findElement(By.xpath("(//*[@class='layout-group-item-title'])[3]")).click();
	WebElement gldt = driver.findElement(By.xpath("//button[@name='BIPTQuickAccessCol2_pyDisplayHarness.pxUserDashboard.pySlots(1).pyWidgets(1).pyWidget_52']"));
	Assert.assertTrue(gldt.isDisplayed());
	XL_Data_GLDT.write_Pass_Result(SRN);
}

catch(Exception e) {
	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
}
	
}
public void click_on_Recent_Activities_TAB() throws Exception {
	
	WebElement FrameSRC = driver.findElement(By.xpath("//iframe[@src='about:blank']"));
	driver.switchTo().frame(FrameSRC);
	driver.findElement(By.xpath("(//*[@class='layout-group-item-title'])[4]")).click();
}
public void click_on_Setup_TAB() throws Exception {
	
	WebElement FrameSRC = driver.findElement(By.xpath("//iframe[@src='about:blank']"));
	driver.switchTo().frame(FrameSRC);
	driver.findElement(By.xpath("(//*[@class='layout-group-item-title'])[5]")).click();
}
	
public static void ClickOnSaveandNotify(int SRN,int ERN) throws Exception {
	try {
	driver.switchTo().defaultContent();
    driver.switchTo().frame("PegaGadget1Ifr");
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='SetProductLaunchDates_pyWorkPage_95']")));
	//Thread.sleep(5000);
	saveButton.click();
	XL_Data_GLDT.write_Pass_Result(SRN);
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
	
}
	

	


public void click_on_Home_TAB() throws Exception {
	
	WebElement FrameSRC = driver.findElement(By.xpath("//iframe[@src='about:blank']"));
	driver.switchTo().frame(FrameSRC);
	driver.findElement(By.xpath("(//*[@class='layout-group-item-title'])[1]")).click();
}
	
public static void click_on_CaseId(int SRN,int ERN) throws Exception {
	try {
//		Thread.sleep(7000);
//		driver.switchTo().frame(0);
		Thread.sleep(3000);
		XL_Data_GLDT.GLDT_getCaseID(170) ;
		
		Thread.sleep(6000);
		// WebDriverWait frameWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement psfFrameElement = driver.findElement(By.xpath("//iframe[@name='PegaGadget0Ifr']"));
		driver.switchTo().frame(psfFrameElement);

		WebDriverWait CaseidWait = new WebDriverWait(driver, Duration.ofSeconds(90));

		List<WebElement> gldtIDs = driver.findElements(By.xpath("//div[contains(text(),'GLDT-')]"));
		CaseidWait.until(ExpectedConditions.visibilityOfAllElements(gldtIDs));

		int j = gldtIDs.size();
		for (int i = 1; i <= j; i++) {
			String actualgldt = driver.findElement(By.xpath("(//div[contains(text(),'GLDT-')])[" + i + "]")).getText();

			if (actualgldt.equalsIgnoreCase(XL_Data_GLDT.testData)) {
				WebElement openCaseID = driver.findElement(By.xpath("(//div[contains(text(),'GLDT-')])"));
				openCaseID.click();

				break;
			}
		}
		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		
		 String actualPage = driver.findElement(By. xpath("(//span[@class='workarea_header_titles'])[1]")).getText();
		 System.out.println("Actual page is:"+ actualPage);
		 String expectedPage ="Regulatory Launch Dates (China)";
		  Assert.assertEquals(actualPage,expectedPage);
		  System.out.println("Page is verified");
		  XL_Data_GLDT.write_Pass_Result(SRN);
		 
	} catch (AssertionError ae) {
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
		
		
//		//XL_Data_GLDT.GLDT_getData(424) ;
//		//driver.findElement(By.xpath("//div[contains(text(),'" + XL_Data_GLDT.CaseID + "')]")).click();
//	    wait =new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement CaseId= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'" + XL_Data_GLDT.CaseID + "')]")));
//		CaseId.click();
//		
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(1);
//		Thread.sleep(3000);
//		XL_Data_GLDT.write_Pass_Result(SRN);
//
//	}
	catch(Exception e) {

		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

	}
}
	
public static void click_on_RALDCaseId(int SRN,int ERN) throws Exception {
	try {
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	XL_Data_GLDT.RALD_getData(215);
	
	driver.findElement(By.xpath("//div[contains(text(),'" + XL_Data_GLDT.CaseID + "')]")).click();
	
//	WebElement gldtId = driver.findElement(By.xpath("//span[@class='workarea_header_id']"));
//	String gldtIdText = gldtId.getText();
//	Assert.assertEquals(gldtIdText,
//			driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]")).getText());
//	System.out.println("GLDT id has been verified");
	
//	WebElement ValidateRopuPage = driver.findElement(By.xpath("span[contains(text(),'Enter/ Update Country specific launch dates')]"));
//	softAssert.assertTrue(ValidateRopuPage.isDisplayed());
//	softAssert.assertAll();
	driver.switchTo().defaultContent(); 
	driver.switchTo().frame(1);
	XL_Data_GLDT.write_Pass_Result(SRN);
}
catch(Exception e) {

	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);

}
}
	
public static void InitiateRopuProcessButtonVisibility_Disabled(int SRN,int ERN) throws Exception {
try {
    WebElement InitiateRopuProcessButton = driver.findElement(By.xpath("//bbutton[@name='SetProductLaunchDates_pyWorkPage_94']"));
   // softAssert.assertFalse(InitiateRopuProcessButton.isEnabled());
    softAssert.assertFalse(InitiateRopuProcessButton.isEnabled());
    softAssert.assertAll();
	XL_Data_GLDT.write_Pass_Result(SRN);
}
catch(Exception e) {
     
	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	
}
	
}
public static void InitiateRopuProcessButtonVisibility_Enabled(int SRN,int ERN) throws Exception {
try {
    WebElement InitiateRopuProcessButton = driver.findElement(By.xpath("//button[@name='SetProductLaunchDates_pyWorkPage_94']"));
    softAssert.assertTrue(InitiateRopuProcessButton.isEnabled());
	XL_Data_GLDT.write_Pass_Result(SRN);
}
catch(Exception e) {

	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
}
}
	
public static void RASaveAndNotifyButtonVisibility(int SRN,int ERN) throws Exception {
	try {
	WebElement saveButton = driver.findElement(By.xpath("//button[@name='SetProductLaunchDates_pyWorkPage_95']"));
	softAssert.assertTrue(saveButton.isDisplayed());
	softAssert.assertAll();
	XL_Data_GLDT.write_Pass_Result(SRN);
	}
	catch(Exception e) {
      
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}

public static void RACompleteButtonVisibility_Disabled(int SRN,int ERN) throws Exception {
    try {
	WebElement CompleteButton = driver.findElement(By.xpath("//button[@name='SetProductLaunchDates_pyWorkPage_96']"));
	softAssert.assertFalse(CompleteButton.isEnabled());
	softAssert.assertAll();
	//System.out.println(CompleteButton.isEnabled());
	XL_Data_GLDT.write_Pass_Result(SRN);
}
catch(Exception e) {

	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
}
	
}
public static void RACompleteButtonVisibility_Enabled(int SRN,int ERN) throws Exception {
    try {
	WebElement CompleteButton = driver.findElement(By.xpath("//button[@name='SetProductLaunchDates_pyWorkPage_96']"));
	Assert.assertTrue(CompleteButton.isEnabled());
	XL_Data_GLDT.write_Pass_Result(SRN);
}
catch(Exception e) {

	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
}
	
}

public static void ROSaveAndNotifyButtonVisibility(int SRN,int ERN) throws Exception {
	try {
	WebElement saveButton = driver.findElement(By.xpath("//button[@name='SetROPULaunchDates_pyWorkPage_94']"));
	softAssert.assertTrue(saveButton.isDisplayed());
	softAssert.assertAll();
	XL_Data_GLDT.write_Pass_Result(SRN);
	}
	catch(Exception e) {

		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}
public static void ROCompleteButtonVisibility_Disabled(int SRN,int ERN) throws Exception {
    try {
	WebElement CompleteButton = driver.findElement(By.xpath("//button[@name='SetROPULaunchDates_pyWorkPage_95']"));
	softAssert.assertFalse(CompleteButton.isEnabled());
	softAssert.assertAll();
	XL_Data_GLDT.write_Pass_Result(SRN);
    }
    catch(Exception e) {
    	//  Block of code to handle errors
    	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
    	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
    }
}
	
public static void ROCompleteButtonVisibility_Enabled(int SRN,int ERN) throws Exception {
    try {
	WebElement CompleteButton = driver.findElement(By.xpath("//button[@name='SetROPULaunchDates_pyWorkPage_95']"));
	Assert.assertTrue(CompleteButton.isEnabled());
	XL_Data_GLDT.write_Pass_Result(SRN);
    }
    catch(Exception e) {
    	//  Block of code to handle errors
    	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
    	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
    }
}
public static void click_on_logOff(int SRN,int ERN) throws Exception{
	try{
		
		Thread.sleep(3500);
	
	WebElement profileImg =driver.findElement(By.xpath("//button[contains(@class,'icons avatar name-')]"));
	profileImg.click();
	
	WebElement logOff =driver.findElement(By.xpath("//span[text()='Log off']"));
	logOff.click();
	Thread.sleep(1000);
	
	XL_Data_GLDT.write_Pass_Result(SRN);
	}   catch(Exception e) {
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();		
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod );
		XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		

}

}

public static void click_on_logOff_IndependentCase(int SRN,int ERN) throws Exception{
	driver=GLDT_Login.driver;
	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	try{Thread.sleep(3500);
	
	WebElement profileImg =driver.findElement(By.xpath("//button[contains(@class,'icons avatar name-')]"));
	profileImg.click();
	
	WebElement logOff =driver.findElement(By.xpath("//span[text()='Log off']"));
	logOff.click();
	Thread.sleep(1000);
	
	XL_Data_GLDT.write_Pass_Result(SRN);
	}   catch(Exception e) {
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();		
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod );
		XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);
		

}

}

	
public static void click_on_CheckMark_RALD(int SRN,int ERN) throws Exception {
	try {
	wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"e0446e74\"]")));
	Check_Mark2.click();
	//Thread.sleep(3000);
	WebElement ApplyChangesPopup=driver.findElement(By.xpath("//span[contains(text(),'Apply Changes')]"));
	softAssert.assertTrue(ApplyChangesPopup.isDisplayed());

	WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
	WebElement ContinueButton=driver.findElement(By.xpath("//button[@title='Continue']"));
	softAssert.assertTrue(CancelButton.isDisplayed());
	
	softAssert.assertTrue(ContinueButton.isDisplayed());
	//softAssert.assertAll();
	CancelButton.click();
	XL_Data_GLDT.write_Pass_Result(SRN);
	XL_Data_GLDT.write_Pass_Result(SRN+1);
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}

public static void click_on_CheckMark_ROLD(int SRN,int ERN) throws Exception {
	try {
		Thread.sleep(5000);
	//wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark2 = driver.findElement(By.xpath("//input[@id='74b7d1ed']"));
	Check_Mark2.click();
	//Thread.sleep(3000);
	WebElement ApplyChangesPopup=driver.findElement(By.xpath("//span[contains(text(),'Apply Changes')]"));
	Assert.assertTrue(ApplyChangesPopup.isDisplayed());
	WebElement ContinueButton=driver.findElement(By.xpath("//button[@title='Continue']"));
	Assert.assertTrue(ContinueButton.isDisplayed());
	 WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
	 Assert.assertTrue(CancelButton.isDisplayed());
	 CancelButton.click();
	
//	WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
//	WebElement ContinueButton=driver.findElement(By.xpath("//button[@title='Continue']"));
//	System.out.println(CancelButton.isDisplayed());
//	System.out.println(ContinueButton.isDisplayed());
	    XL_Data_GLDT.write_Pass_Result(SRN);
	    XL_Data_GLDT.write_Pass_Result(SRN+1);
	    }
	    catch(Exception e) {
	    	//  Block of code to handle errors
	    	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
	    	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
	    	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	    }
}

public static void click_on_SubmissionCheckMark_Cancel(int SRN,int ERN) throws Exception {
try {
	//	driver.switchTo().defaultContent();
//    driver.switchTo().frame("PegaGadget1Ifr");
	 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement Check_Mark1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='7dd07b86']")));
	Check_Mark1.click();
	//Thread.sleep(3000);
	WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
	CancelButton.click();
	WebElement SubmissionDate_Best1=driver.findElement(By.xpath("//img[@class='inactvIcon']"));
	softAssert.assertTrue(SubmissionDate_Best1.isEnabled());
	softAssert.assertAll();
//	Check_Mark1.click();
//	WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
//	ContinueButton.click();
	XL_Data_GLDT.write_Pass_Result(SRN);
	XL_Data_GLDT.write_Pass_Result(SRN+1);
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}

}
public static void click_on_SubmissionCheckMark_Continue(int SRN,int ERN) throws Exception {
	try {
	Thread.sleep(3000);
//	driver.switchTo().defaultContent();
//  driver.switchTo().frame("PegaGadget1Ifr");
	wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement Check_Mark1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='7dd07b86']")));
	Check_Mark1.click();

	WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton.click();
	Thread.sleep(2000);
	WebElement SubmissionDate_Best=driver.findElement(By.xpath("//input[@id='79a8ae4c']"));
	Assert.assertFalse(SubmissionDate_Best.isEnabled());
	
	Thread.sleep(2000);
	WebElement Check_Mark2 = driver.findElement(By.xpath("(//input[@id='7dd07b86'])[2]"));
	Check_Mark2.click();
	Thread.sleep(2000);
	WebElement SubmissionDate_Best1=driver.findElement(By.xpath("//input[@id='79a8ae4c']"));
	Assert.assertTrue(SubmissionDate_Best1.isEnabled());
	//softAssert.assertAll();
	for(int i=SRN;i<=192;i++) {
	   XL_Data_GLDT.write_Pass_Result(SRN);
	   SRN++;
	
	}
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
	
	

}



public static void click_on_ApprovalCheckMark(int SRN,int ERN) throws Exception {
	try {
	wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='$PpyWorkPage$pTimelines$l4$pSubmissionDateNA']")));
	Check_Mark1.click();
	//Thread.sleep(3000);
	WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
	CancelButton.click();
	Check_Mark1.click();
	WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton.click();
	XL_Data_GLDT.write_Pass_Result(SRN);
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}

}

public static void click_on_ApprovalCheckMark_Cancel(int SRN,int ERN) throws Exception {
	try {
	Thread.sleep(3000);
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='e0446e74']")));
	Check_Mark1.click();
	Thread.sleep(3000);
	WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
	CancelButton.click();
	XL_Data_GLDT.write_Pass_Result(SRN);
	XL_Data_GLDT.write_Pass_Result(SRN+1);
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}

public static void click_on_ApprovalCheckMark_Continue(int SRN,int ERN) throws Exception {
	try {
	Thread.sleep(3200);
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='e0446e74']")));
	Check_Mark1.click();
    WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton.click();
	Thread.sleep(2000);
	WebElement ApprovalDate_Best=driver.findElement(By.xpath("//input[@id='b56200e4']"));
	Assert.assertFalse(ApprovalDate_Best.isEnabled());
	
	Thread.sleep(2000);
	WebElement Check_Mark2 = driver.findElement(By.xpath("(//input[@id='e0446e74'])[2]"));
	Check_Mark2.click();
	Thread.sleep(2000);
	WebElement ApprovalDate_Best1=driver.findElement(By.xpath("//input[@id='b56200e4']"));
	Assert.assertTrue(ApprovalDate_Best1.isEnabled());
	
	for(int i=SRN;i<=200;i++) {
	XL_Data_GLDT.write_Pass_Result(SRN);
	SRN++;
	}
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}

}
public static void click_on_ePAFSubmissionDate_CheckMark_Cancel(int SRN,int ERN) throws Exception {
	try {
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
//	WebElement ApplyChangesPopupMessage=driver.findElement(By.xpath("//span[contains(text(),'Please be aware that when you disable a column, data will be lost.\r\n"
//			+ "Are you sure you want to continue?')]"));
//	System.out.println(ApplyChangesPopupMessage.isDisplayed());
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='74b7d1ed']")));
	Check_Mark1.click();
	WebElement ApplyChangesPopup=driver.findElement(By.xpath("//span[contains(text(),'Apply Changes')]"));
	softAssert.assertTrue(ApplyChangesPopup.isDisplayed());
    WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
    CancelButton.click();
    XL_Data_GLDT.write_Pass_Result(SRN);
    XL_Data_GLDT.write_Pass_Result(SRN+1);
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}

}
public static void click_on_ePAFSubmissionDate_CheckMark_Continue(int SRN,int ERN) throws Exception {
	try {
	Thread.sleep(2000);
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='74b7d1ed']")));
	Check_Mark1.click();
    WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton.click();
	Thread.sleep(2000);
	WebElement ePAFSubmissionDate_Best=driver.findElement(By.xpath("//input[@id='d21e5ede']"));
	Assert.assertFalse(ePAFSubmissionDate_Best.isEnabled());
	
	Thread.sleep(2000);
	WebElement Check_Mark2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='74b7d1ed'])[2]")));
	Check_Mark2.click();
	Thread.sleep(2000);
	WebElement ePAFSubmissionDate_Best1=driver.findElement(By.xpath("//input[@id='d21e5ede']"));
	Assert.assertTrue(ePAFSubmissionDate_Best1.isEnabled());

	for(int i=SRN;i<=233;i++) {
	XL_Data_GLDT.write_Pass_Result(SRN);
	SRN++;
	}
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}

public static void click_on_PR_DossierSubmissionDate_CheckMark_Cancel(int SRN,int ERN) throws Exception {
	try {
	Thread.sleep(3000);
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='e7ac2b61']")));
	Check_Mark1.click();
    WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
    CancelButton.click();
    XL_Data_GLDT.write_Pass_Result(SRN);
    XL_Data_GLDT.write_Pass_Result(SRN+1);
    }
    catch(Exception e) {
    	//  Block of code to handle errors
    	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
    	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
    }

}

public static void click_on_PR_DossierSubmissionDate_CheckMark_Continue(int SRN,int ERN) throws Exception {
	try {
	Thread.sleep(2000);
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='e7ac2b61']")));
	Check_Mark1.click();
    WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton.click();
	Thread.sleep(2000);
	WebElement PR_DossierSubmissionDate_Best=driver.findElement(By.xpath("//input[@id='515edcb6']"));
	Assert.assertFalse(PR_DossierSubmissionDate_Best.isEnabled());
	Thread.sleep(2000);
	WebElement Check_Mark2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='e7ac2b61'])[2]")));
	Check_Mark2.click();
	Thread.sleep(2000);
	WebElement PR_DossierSubmissionDate_Best1=driver.findElement(By.xpath("//input[@id='515edcb6']"));
	Assert.assertTrue(PR_DossierSubmissionDate_Best1.isEnabled());
	
	for(int i=SRN;i<=241;i++) {
		XL_Data_GLDT.write_Pass_Result(SRN);
		SRN++;
		}
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}

}

public static void click_on_CutOffDateForIPR_CheckMark_Cancel(int SRN,int ERN) throws Exception {
	try {
	Thread.sleep(3000);
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='b52b7737']")));
	Check_Mark1.click();
    WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
    CancelButton.click();
    XL_Data_GLDT.write_Pass_Result(SRN);
    XL_Data_GLDT.write_Pass_Result(SRN);
    }
    catch(Exception e) {
    	//  Block of code to handle errors
    	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
    	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
    }

}

public static void click_on_CutOffDateForIPR_CheckMark_Continue(int SRN,int ERN) throws Exception {
	try {
	Thread.sleep(2000);
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement Check_Mark = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='b52b7737']")));
	Check_Mark.click();
	
    WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton.click();
	Thread.sleep(2000);
	WebElement CutOffDateForIPR_Best=driver.findElement(By.xpath("//input[@id='e10075d3']"));
	Assert.assertFalse(CutOffDateForIPR_Best.isEnabled());
	Thread.sleep(2000);
	
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='b52b7737'])[2]")));
	Check_Mark1.click();
	Thread.sleep(2000);
	WebElement CutOffDateForIPR_Best1=driver.findElement(By.xpath("//input[@id='e10075d3']"));
	Assert.assertTrue(CutOffDateForIPR_Best1.isEnabled());
	
	for(int i=SRN;i<=249;i++) {
		XL_Data_GLDT.write_Pass_Result(SRN);
		SRN++;
		}
	
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}

}

public static void click_on_OfficialPricePublicationForUnreimbursedLaunch_CheckMark_Cancel(int SRN,int ERN) throws Exception {
	try {
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='17c420e1']")));
	Check_Mark1.click();
    WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
    CancelButton.click();
    XL_Data_GLDT.write_Pass_Result(SRN);
    XL_Data_GLDT.write_Pass_Result(SRN);
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}

public static void click_on_OfficialPricePublicationForUnreimbursedLaunch_CheckMark_Continue(int SRN,int ERN) throws Exception {
	try{
		Thread.sleep(2000);
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='17c420e1']")));
	Check_Mark.click();
    WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton.click();
	Thread.sleep(2000);
	WebElement OfficialPricePublicationForUnreimbursedLaunch_Best=driver.findElement(By.xpath("//input[@id='fcc564b7']"));
	Assert.assertFalse(OfficialPricePublicationForUnreimbursedLaunch_Best.isEnabled());
	
	Thread.sleep(2000);
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='17c420e1'])[2]")));
	Check_Mark1.click();
	Thread.sleep(2000);
	WebElement OfficialPricePublicationForUnreimbursedLaunch_Best1=driver.findElement(By.xpath("//input[@id='fcc564b7']"));
	Assert.assertTrue(OfficialPricePublicationForUnreimbursedLaunch_Best1.isEnabled());
	
	for(int i=SRN;i<=257;i++) {
		XL_Data_GLDT.write_Pass_Result(SRN);
		SRN++;
		}
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}

public static void click_on_OfficialPricePublicationForReimbursedLaunchDate_CheckMark_Cancel(int SRN,int ERN) throws Exception {
	try {
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='3cdc2b72']")));
	Check_Mark1.click();
    WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
    CancelButton.click();
    XL_Data_GLDT.write_Pass_Result(SRN);
    XL_Data_GLDT.write_Pass_Result(SRN);
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}


public static void click_on_OfficialPricePublicationForReimbursedLaunchDate_CheckMark__Continue(int SRN,int ERN) throws Exception {
	try {
		Thread.sleep(2000);
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
		WebElement Check_Mark = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='3cdc2b72']")));
		Check_Mark.click();
	    WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
		ContinueButton.click();
		Thread.sleep(2000);
	WebElement OfficialPricePublicationForReimbursedLaunch_Best=driver.findElement(By.xpath("//input[@id='e6ffe753']"));
	Assert.assertFalse(OfficialPricePublicationForReimbursedLaunch_Best.isEnabled());
	Thread.sleep(2000);
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='3cdc2b72'])[2]")));
	Check_Mark1.click();
	Thread.sleep(2000);
	WebElement OfficialPricePublicationForReimbursedLaunch_Best1=driver.findElement(By.xpath("//input[@id='e6ffe753']"));
	Assert.assertTrue(OfficialPricePublicationForReimbursedLaunch_Best1.isEnabled());

	for(int i=SRN;i<=265;i++) {
		XL_Data_GLDT.write_Pass_Result(SRN);
		SRN++;
		}
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}

public static void click_on_UnreimbursedLaunchDate_CheckMark_Cancel(int SRN,int ERN) throws Exception {
	try {
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='14bd8026']")));
	Check_Mark1.click();
    WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
    CancelButton.click();
    XL_Data_GLDT.write_Pass_Result(SRN);
    XL_Data_GLDT.write_Pass_Result(SRN+1);
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}

}


public static void click_on_UnreimbursedLaunchDate_CheckMark__Continue(int SRN,int ERN) throws Exception {
	try {
		Thread.sleep(2000);
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='14bd8026']")));
	Check_Mark.click();
    WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton.click();
	Thread.sleep(2000);
	WebElement UnreimbursedLaunchDate_Best=driver.findElement(By.xpath("//input[@id='59a1b039']"));
	Assert.assertFalse(UnreimbursedLaunchDate_Best.isEnabled());
	Thread.sleep(2000);
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='14bd8026'])[2]")));
	Check_Mark1.click();
	Thread.sleep(2000);
	WebElement UnreimbursedLaunchDate_Best1=driver.findElement(By.xpath("//input[@id='59a1b039']"));
	Assert.assertTrue(UnreimbursedLaunchDate_Best1.isEnabled());
	
	for(int i=SRN;i<=273;i++) {
		XL_Data_GLDT.write_Pass_Result(SRN);
		SRN++;
		}
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}

public static void click_on_ReimbursedLaunchDate_CheckMark_Cancel(int SRN,int ERN) throws Exception {
	try {
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='c4823044']")));
	Check_Mark1.click();
    WebElement CancelButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_5']"));
    CancelButton.click();
    XL_Data_GLDT.write_Pass_Result(SRN);
    XL_Data_GLDT.write_Pass_Result(SRN+1);
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}


public static void click_on_ReimbursedLaunchDate_CheckMark__Continue(int SRN,int ERN) throws Exception {
	try {
		Thread.sleep(3000);
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='c4823044']")));
	Check_Mark.click();
    WebElement ContinueButton=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton.click();
	Thread.sleep(2000);
	WebElement ReimbursedLaunchDate_Best=driver.findElement(By.xpath("//input[@id='ec1c27c4']"));
	Assert.assertFalse(ReimbursedLaunchDate_Best.isEnabled());
	
	Thread.sleep(2000);
	WebElement Check_Mark1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='c4823044'])[2]")));
	Check_Mark1.click();
	Thread.sleep(2000);
	WebElement ReimbursedLaunchDate_Best1=driver.findElement(By.xpath("//input[@id='ec1c27c4']"));
    Assert.assertTrue(ReimbursedLaunchDate_Best1.isEnabled());
	
	for(int i=SRN;i<=281;i++) {
		XL_Data_GLDT.write_Pass_Result(SRN);
		SRN++;
		}
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
}




	
public static void fill_RaldForm(int SRN,int ERN) throws Exception {
    try {
    
	WebElement Best=driver.findElement(By.xpath("//img[@class='inactvIcon']"));
	Best.click();
	//Best.clear();
	Thread.sleep(3000);
	
	WebElement TodayDate=driver.findElement(By.linkText("Today"));
	TodayDate.click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("(//div[@class='flex  content  layout-content-inline_grid_triple content-inline_grid_triple padding-0'])[2]")).click();
	WebElement Base=driver.findElement(By.xpath("(//img[@class='inactvIcon'])[3]"));
	Base.click();
	//Base.clear();
	Thread.sleep(3000);
	WebElement TodayDate1=driver.findElement(By.linkText("Today"));
	TodayDate1.click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("(//div[@class='flex  content  layout-content-inline_grid_triple content-inline_grid_triple padding-0'])[3]")).click();
	WebElement Acheived=driver.findElement(By.xpath("(//img[@class='inactvIcon'])[5]"));
	Acheived.click();
	//Acheived.clear();
	Thread.sleep(3000);
	WebElement TodayDate2=driver.findElement(By.linkText("Today"));
	TodayDate2.click();
	
    Thread.sleep(3000);
	// SelectCheckMark2//Approval Date//
	WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement Check_Mark2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"e0446e74\"]")));
	Check_Mark2.click();
	//popupScreeen//
	WebDriverWait wait2a = new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement Check_Mark2a = wait2a.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Continue']"))); 
	Check_Mark2a.click();
	for(int i=SRN;i<=210;i++) {
	XL_Data_GLDT.write_Pass_Result(SRN);
	SRN++;
	}
    }
	catch(Exception e) {

		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

	}
	
} 

public static void fill_RoldForm(int SRN,int ERN) throws Exception {
    try {
	WebElement Best=driver.findElement(By.xpath("//img[@class='inactvIcon']"));
	Best.click();
	Thread.sleep(3000);
	WebElement TodayDate=driver.findElement(By.xpath("//td[@class='calcell today selected']"));
	TodayDate.click();
	Thread.sleep(3000);
	
	WebElement Base=driver.findElement(By.xpath("(//img[@class='inactvIcon'])[8]"));
	Base.click();
	Thread.sleep(3000);
	WebElement TodayDate1=driver.findElement(By.xpath("//td[@class='calcell today selected']"));
	TodayDate1.click();
	Thread.sleep(3000);
	
	WebElement Acheived=driver.findElement(By.xpath("(//img[@class='inactvIcon'])[15]"));
	Acheived.click();
	Thread.sleep(3000);
	WebElement TodayDate2=driver.findElement(By.xpath("//td[@class='calcell today selected']"));
	TodayDate2.click();
	
	wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement NotApplicable1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='e7ac2b61']")));
	NotApplicable1.click();
	WebElement ContinueButton1=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton1.click();
	//Thread.sleep(3000);
	
	wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement NotApplicable2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='b52b7737']")));
	NotApplicable2.click();
	WebElement ContinueButton2=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton2.click();
	
//	WebElement NotApplicable2=driver.findElement(By.xpath("//input[@id='b52b7737']"));
//	NotApplicable2.click();
//	WebElement ContinueButton2=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
//	ContinueButton2.click();
//	Thread.sleep(3000);
	
	wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement NotApplicable3= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='17c420e1']")));
	NotApplicable3.click();
	WebElement ContinueButton3=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton3.click();
	
//	WebElement NotApplicable3=driver.findElement(By.xpath("//input[@id='17c420e1']"));
//	NotApplicable3.click();
//	WebElement ContinueButton3=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
//	ContinueButton3.click();
//	Thread.sleep(3000);
	
	wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement NotApplicable4= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='3cdc2b72']")));
	NotApplicable4.click();
	WebElement ContinueButton4=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton4.click();
	
//	WebElement NotApplicable4=driver.findElement(By.xpath("//input[@id='3cdc2b72']"));
//	NotApplicable4.click();
//	WebElement ContinueButton4=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
//	ContinueButton4.click();
//	Thread.sleep(3000);
	
	wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement NotApplicable5= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='14bd8026']")));
	NotApplicable5.click();
	WebElement ContinueButton5=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton5.click();
	
//	WebElement NotApplicable5=driver.findElement(By.xpath("//input[@id='14bd8026']"));
//	NotApplicable5.click();
//	WebElement ContinueButton5=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
//	ContinueButton5.click();
//	Thread.sleep(3000);
	
//	WebElement NotApplicable6=driver.findElement(By.xpath("//input[@id='c4823044']"));
//	NotApplicable6.click();
//	WebElement ContinueButton6=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
//	ContinueButton6.click();
//	Thread.sleep(3000);
	
	
	
	
	
	
	wait =new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement NotApplicable6= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='c4823044']")));
	NotApplicable6.click();
	WebElement ContinueButton6=driver.findElement(By.xpath("//button[@name='ConfirmGLDTNotApplicableChanges_pyWorkPage.Timelines(4)_8']"));
	ContinueButton6.click();
	XL_Data_GLDT.write_Pass_Result(SRN);
    }
    catch(Exception e) {
    	//  Block of code to handle errors
    	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
    	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
    }
} 

public static void fill_RoldForm1(int SRN,int ERN) throws Exception {
	
	try{
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	WebElement frameEle1=driver.findElement(By.id("PegaGadget1Ifr"));
	driver.switchTo().frame(frameEle1);
	
	WebElement ePAFSubDate_Best=driver.findElement(By.id("d21e5ede"));
	ePAFSubDate_Best.sendKeys("08/12/2023");
	Thread.sleep(1000);
	
	WebElement ePAFSubDate_Base=driver.findElement(By.id("ae7f7b05"));
	ePAFSubDate_Base.sendKeys("09/12/2023");
	Thread.sleep(1000);
	
			
	WebElement ePAFSubDate_Achieved=driver.findElement(By.xpath("(//img[@class='inactvIcon'])[15]"));
	ePAFSubDate_Achieved.click();
	Thread.sleep(1000);
	
	
	WebElement todaysDate15=driver.findElement(By.id("todayLink"));
	todaysDate15.click();
	Thread.sleep(2000);
	
	WebElement NACheckBox2_ROLD=driver.findElement(By.id("e7ac2b61"));
	NACheckBox2_ROLD.click();
	Thread.sleep(1000);
	
	
	WebElement applyChanges_NACheckBox2=driver.findElement(By.xpath("//button[@class='Strong pzhc pzbutton'][text()='Continue']"));
	applyChanges_NACheckBox2.click();
	Thread.sleep(1000);
	
	
	WebElement NACheckBox3_ROLD=driver.findElement(By.id("b52b7737"));
	NACheckBox3_ROLD.click();
	Thread.sleep(1000);
	
	WebElement applyChanges_NACheckBox3=driver.findElement(By.xpath("//button[@class='Strong pzhc pzbutton'][text()='Continue']"));
	applyChanges_NACheckBox3.click();
	Thread.sleep(1000);
	
	
	WebElement NACheckBox4_ROLD=driver.findElement(By.id("17c420e1"));
	NACheckBox4_ROLD.click();
	Thread.sleep(1000);
	
	WebElement applyChanges_NACheckBox4=driver.findElement(By.xpath("//button[@class='Strong pzhc pzbutton'][text()='Continue']"));
	applyChanges_NACheckBox4.click();
	Thread.sleep(1000);
	
	WebElement NACheckBox5_ROLD=driver.findElement(By.id("3cdc2b72"));
	NACheckBox5_ROLD.click();
	Thread.sleep(1000);
	
	WebElement applyChanges_NACheckBox5=driver.findElement(By.xpath("//button[@class='Strong pzhc pzbutton'][text()='Continue']"));
	applyChanges_NACheckBox5.click();
	Thread.sleep(1000);
	
	WebElement NACheckBox6_ROLD=driver.findElement(By.id("14bd8026"));
	NACheckBox6_ROLD.click();
	Thread.sleep(1000);
	
	WebElement applyChanges_NACheckBox6=driver.findElement(By.xpath("//button[@class='Strong pzhc pzbutton'][text()='Continue']"));
	applyChanges_NACheckBox6.click();
	Thread.sleep(1000);
	
	WebElement NACheckBox7_ROLD=driver.findElement(By.id("c4823044"));
	NACheckBox7_ROLD.click();
	Thread.sleep(1000);
	
	WebElement applyChanges_NACheckBox7=driver.findElement(By.xpath("//button[@class='Strong pzhc pzbutton'][text()='Continue']"));
	applyChanges_NACheckBox7.click();
	Thread.sleep(1000);
	for(int i=SRN;i<=40;i++)
	XL_Data_GLDT.write_Pass_Result(SRN);
	}
	catch(Exception e) {
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
	
	
//	WebElement completeBtn= driver.findElement(By.xpath("//button[@name='SetROPULaunchDates_pyWorkPage_95']"));
//	completeBtn.click();
//	Thread.sleep(1000);
//	
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
//	WebElement CloseBtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Click here to close the case. Any entered information will be saved']")));
//	CloseBtn.click();		
//	Thread.sleep(3000);
}

public static void Complete_RoldForm(int SRN,int ERN) throws Exception {
	try {
	
	WebElement CompleteButton=driver.findElement(By.xpath("//button[@name='SetROPULaunchDates_pyWorkPage_95']"));
	CompleteButton.click();
	XL_Data_GLDT.write_Pass_Result(SRN);
	}
	catch(Exception e) {

		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);

	}
	
	
}
public static void click_on_GLDT_Module(int SRN,int ERN) throws Exception {
	try {
	WebElement gldt = driver.findElement(By.xpath("//button[@name='BIPTQuickAccessCol2_pyDisplayHarness.pxUserDashboard.pySlots(1).pyWidgets(1).pyWidget_52']"));
	gldt.click();//GLDT - Global Launch Date Tracker
	XL_Data_GLDT.write_Pass_Result(SRN);
	}
	catch(Exception e) {
		//  Block of code to handle errors
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
	}
}

public static void ResetFiltersButtonVisibility(int SRN,int ERN) throws Exception {
    try {
    driver.switchTo().defaultContent();
 	driver.switchTo().frame("PegaGadget1Ifr");
    Thread.sleep(3000);
    WebElement ResetFiltersButton = driver.findElement(By.xpath("//button[contains(text(),'Reset filters')]"));
    softAssert.assertTrue(ResetFiltersButton.isDisplayed());
	softAssert.assertAll();
	XL_Data_GLDT.write_Pass_Result(SRN);
    }
    catch(Exception e) {
    	//  Block of code to handle errors
    	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
    	XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
    }
}

public static void Click_on_ResetFiltersButton(int SRN,int ERN) throws Exception {
    try {
    WebElement ResetFiltersButton = driver.findElement(By.xpath("//button[@name='ViewTimelineButton_pyDisplayHarness_2']"));
    ResetFiltersButton.click();
    XL_Data_GLDT.write_Pass_Result(SRN);
    }
    catch(Exception e) {
    	//  Block of code to handle errors
    	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
    	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
    }	
}

public static void ViewTimelinesVisibility(int SRN,int ERN) throws Exception {
    try {
    WebElement ViewTimelinesButton = driver.findElement(By.xpath("//button[@name='ViewTimelineButton_pyDisplayHarness_1']"));
	Assert.assertFalse(ViewTimelinesButton.isEnabled());
	XL_Data_GLDT.write_Pass_Result(SRN);
    }
    catch(Exception e) {
    	//  Block of code to handle errors
    	String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
    	Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
    	XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
    }

	
}
}

	

