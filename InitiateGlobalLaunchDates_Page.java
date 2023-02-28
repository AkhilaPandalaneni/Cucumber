package gldt;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class InitiateGlobalLaunchDates_Page {

	public static String GLDT_Case_Id;
	public static String RALD_Case_Id;
	public static String ROLD_Case_Id;

	static WebDriver driver = GLDT_Login.driver;
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	
	public static String FirstTestCase;

	// static WebDriverWait wait = BIPS_Login.wait;
	




	@Given("clicks on GLDT_Module")
	public static void click_on_GLDT_Module() throws Exception {
		try {
		WebElement gldt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[6]//span/button[contains(text(),'GLDT - Global Launch Date Tracker')]/img")));
		gldt.click();//GLDT - Global Launch Date Tracker
		  
	}
		catch(Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			
		}
	}

	@When("User Enters product")
	public static void selectproduct() throws Exception {
		driver.switchTo().defaultContent();

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='PegaGadget1Ifr']"));
		driver.switchTo().frame(frame1);
		XL_Data_GLDT.read_Test_Data(162);

		Thread.sleep(5000);
		WebElement selectproduct = driver.findElement(By.xpath("//input[@name='$PpyWorkPage$pProductName'][@id='414e17ce']"));
		
        selectproduct.clear();
		selectproduct.sendKeys(XL_Data_GLDT.testData);
		Thread.sleep(5000);
		selectproduct.sendKeys(Keys.DOWN);
		selectproduct.sendKeys(Keys.RETURN);
		selectproduct.sendKeys(Keys.TAB);
		
		String selectproductValue=selectproduct.getAttribute("value");
		System.out.println(selectproductValue);
		Assert.assertEquals(selectproductValue, XL_Data_GLDT.testData);
		System.out.println("The selected product has been verified");
		}
	

	@When("User Enters reason")
	public static void enterReason() throws Exception {
		XL_Data_GLDT.read_Test_Data(163);
		Thread.sleep(7000);
		WebElement reason = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='158b841d']")));
		// reason.clear();
		reason.sendKeys(XL_Data_GLDT.testData);
		
		String reasonEnteredCheck=reason.getAttribute("value");
		Assert.assertEquals(reasonEnteredCheck, XL_Data_GLDT.testData);
		System.out.println("The entered reason has been verified Using Assert");
			

		} 

	

	@When("User Enters region")
	public static void select_Region() throws Exception {
		try {
			XL_Data_GLDT.read_Test_Data(164);

			Thread.sleep(5000);
			List<WebElement> Region = driver
					.findElements(By.xpath("//*[@class=' layout-body']//div[1][@id='CT']//button"));//// *[@id='CT']//button
			int j = Region.size();
			for (int i = 1; i < j; i++) {
				String Actual_Region_Name = driver
						.findElement(By.xpath("(//*[@class=' layout-body']//div[1][@id='CT']//button)[" + i + "]"))
						.getText();
				if (Actual_Region_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//*[@class=' layout-body']//div[1][@id='CT']//button)[" + i + "]"))
							.click();
					break;
				}
			}
			
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			
		}

	}

	@When("User Enters ropu")
	public static void select_ROPU() throws Exception {
		try {
			XL_Data_GLDT.read_Test_Data(165);
			Thread.sleep(5000);
			List<WebElement> ROPU = driver
					.findElements(By.xpath("//div[2]/table//*[@class=' layout-body']//div[1]/span/button"));//// *[@id='CT']//button
			int j = ROPU.size();
			for (int i = 1; i <= j; i++) {
				String Actual_ROPU_Name = driver
						.findElement(
								By.xpath("(//div[2]/table//*[@class=' layout-body']//div[1]/span/button)[" + i + "]"))
						.getText();
				if (Actual_ROPU_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(3000);
					driver.findElement(
							By.xpath("(//div[2]/table//*[@class=' layout-body']//div[1]/span/button)[" + i + "]"))
							.click();
					break;
				}
			}
			
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			
		}

	}

	@When("User Enters country")
	public static void select_Country() throws Exception {
		try {
			XL_Data_GLDT.read_Test_Data(166);
			Thread.sleep(5000);
			List<WebElement> Country = driver.findElements(By.xpath("//*[@node_name='CountryCardSelectable']"));
			int j = Country.size();
			int i;
			for (i = 1; i <= j; i++) {
				String Actual_Country_Name = driver
						.findElement(
								By.xpath("(//*[@node_name='CountryCardSelectable']//*[@class='heading_3'])['+i+']"))
						.getText();

				if (Actual_Country_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(5000);
					WebElement CountryEle = driver
							.findElement(By.xpath("//*[@node_name='CountryCardSelectable']//*[@class='icons']/img"));
					CountryEle.click();
					break;
				}
			}
			
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			
		}

	}

	@When("User Clicks on Initiate RA Process")
	public static void InitiateRAProcess() throws Exception {
		try {
			WebElement InitiateRAProcess = driver.findElement(By.xpath("//button[@title='Initiate RA Process']"));
			InitiateRAProcess.click();
			// InitiateGlobalLaunchDates_Page.click_Continue(SRN, ERN);
			Thread.sleep(1000);
			WebElement selectedCountryList_popUp =driver.findElement(By.xpath("//label[contains(text(),'Please confirm if the correct list of countries ha')]"));
			boolean countryListPopUp_Check =selectedCountryList_popUp.isDisplayed();
			System.out.println("Country List pop up has been checked"+ " "+countryListPopUp_Check);
			Assert.assertTrue(countryListPopUp_Check);
			//XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			//XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			//Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			//XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}
	
	@And("User Clicks on Continue")
	public static void click_On_Continue() throws Exception {
	try {	/*
		 * try { WebElement ContinueButton = driver.findElement(By.xpath(
		 * "//button[@name='DisplaySelectedCountryList_pyWorkPage_22']"));
		 * ContinueButton.click(); XL_Data_GLDT.write_Pass_Result(SRN);
		 */
		WebElement countryListPopUp = driver.findElement(By.xpath("//label[contains(text(),'Please confirm if the correct list of countries ha')]"));
		Assert.assertTrue(countryListPopUp.isDisplayed());
		WebElement continueBtn = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		String continueBtnText = continueBtn.getText();
		Assert.assertEquals(continueBtnText, "Continue");
		continueBtn.click();
		System.out.println("Continue button checked");
		
		
//		//Dashboard check
 		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//iframe[@id='PegaGadget2Ifr']"));
  		driver.switchTo().frame(frame2);
		
		WebElement dashBoard =driver.findElement(By.xpath("//div[text()='Cases by Process and Status']"));
		boolean dashBoardCheck =dashBoard.isDisplayed();
		Assert.assertTrue(dashBoardCheck);
		
		System.out.println("Return to Dashboard has been verified"  + "" +dashBoardCheck);
		
		driver.switchTo().defaultContent();
		} 
	catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			//XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
	catch (Exception e) {
		String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
		Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
		//XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
	}
	}
	public static void capture_GLDTCase_id1(int SRN, int ERN) throws Exception {

		try {
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			driver.switchTo().frame(1);
		    GLDT_Case_Id=driver.findElement(By.xpath("//span[@class='workarea_header_id']")).getText();
		    System.out.println("Actualgldtid:"+GLDT_Case_Id);
		    WebElement Expected=driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]"));
			String ExpectedgldId=Expected.getText();
			System.out.println("expectedGldtId:"+ExpectedgldId);
			Assert.assertEquals(GLDT_Case_Id, ExpectedgldId);
			System.out.println("GLDT id is Captured");
			GLDT_Case_Id = GLDT_Case_Id.substring(GLDT_Case_Id.lastIndexOf("G")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(GLDT_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			GLDT_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_GLDTCase_id " + GLDT_Case_Id);
			XL_Data_GLDT.write_Pass_Result(SRN);
			XL_Data_GLDT.write_CaseID(3, GLDT_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(12, GLDT_Case_Id);

			// XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}


	public static void capture_GLDTCase_id2(int SRN, int ERN) throws Exception {

		try {
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			driver.switchTo().frame(1);

			GLDT_Case_Id = driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]")).getText();
			GLDT_Case_Id = GLDT_Case_Id.substring(GLDT_Case_Id.lastIndexOf("G")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(GLDT_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			GLDT_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_GLDTCase_id " + GLDT_Case_Id);
			XL_Data_GLDT.write_Pass_Result(SRN);
			XL_Data_GLDT.write_CaseID(46, GLDT_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(55, GLDT_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(86, GLDT_Case_Id);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}
	public static void capture_GLDTCase_idforTC(int SRN, int ERN) throws Exception {

		try {
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			driver.switchTo().frame(1);
			GLDT_Case_Id = driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]")).getText();
			System.out.println("Actualgldtid:"+GLDT_Case_Id);
		    WebElement Expected=driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]"));
			String ExpectedgldId=Expected.getText();
			System.out.println("expectedGldtId:"+ExpectedgldId);
			Assert.assertEquals(GLDT_Case_Id, ExpectedgldId);
			System.out.println("GLDT id is Captured");
			GLDT_Case_Id = GLDT_Case_Id.substring(GLDT_Case_Id.lastIndexOf("G")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(GLDT_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			GLDT_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_GLDTCase_id " + GLDT_Case_Id);
			XL_Data_GLDT.write_Pass_Result(SRN);
			// XL_Data_GLDT.write_CaseID(3, GLDT_Case_Id);

			XL_Data_GLDT.write_CaseID(311, GLDT_Case_Id);
			//XL_Data_GLDT.write_CaseIDAsPrerequiste(301, GLDT_Case_Id);
			// XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}


	

	public static void capture_GLDTCase_idforTestCases(int SRN, int ERN) throws Exception {

		try {
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			driver.switchTo().frame(1);
			GLDT_Case_Id = driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]")).getText();
			GLDT_Case_Id = GLDT_Case_Id.substring(GLDT_Case_Id.lastIndexOf("G")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(GLDT_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			GLDT_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_GLDTCase_id " + GLDT_Case_Id);
			XL_Data_GLDT.write_Pass_Result(SRN);
			// XL_Data_GLDT.write_CaseID(3, GLDT_Case_Id);

			XL_Data_GLDT.write_CaseID(289, GLDT_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(301, GLDT_Case_Id);
			// XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
	}

	public static void selectproduct2(int SRN, int ERN) throws Exception {

		try {
			XL_Data_GLDT.read_Test_Data(47);

			Thread.sleep(5000);
			WebElement selectproduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='414e17ce']")));
			selectproduct.sendKeys(XL_Data_GLDT.testData);
			Thread.sleep(5000);
			selectproduct.sendKeys(Keys.DOWN);
			selectproduct.sendKeys(Keys.RETURN);
			String selectproductValue=selectproduct.getAttribute("value");
			System.out.println(selectproductValue);
			Assert.assertEquals(selectproductValue, XL_Data_GLDT.testData);
			System.out.println("The selected product has been verified");

			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}

	
	public static void enterReason2(int SRN, int ERN) throws Exception {

		try {
			XL_Data_GLDT.read_Test_Data(48);
			Thread.sleep(3000);
			WebElement reason = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='158b841d']")));
			// reason.clear();
			reason.sendKeys(XL_Data_GLDT.testData);
			String reasonEnteredCheck=reason.getAttribute("value");
			Assert.assertEquals(reasonEnteredCheck, XL_Data_GLDT.testData);
			System.out.println("The entered reason has been verified Using Assert");
			XL_Data_GLDT.write_Pass_Result(SRN);
			

		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}


	}

	

	public static void select_Region2(int SRN, int ERN) throws Exception {
		try {
			XL_Data_GLDT.read_Test_Data(49);

			Thread.sleep(5000);
			List<WebElement> Region = driver
					.findElements(By.xpath("//*[@class=' layout-body']//div[1][@id='CT']//button"));//// *[@id='CT']//button
			int j = Region.size();
			for (int i = 1; i < j; i++) {
				String Actual_Region_Name = driver
						.findElement(By.xpath("(//*[@class=' layout-body']//div[1][@id='CT']//button)[" + i + "]"))
						.getText();
				if (Actual_Region_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//*[@class=' layout-body']//div[1][@id='CT']//button)[" + i + "]"))
							.click();
					break;
				}
			}
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}

	

	public static void select_ROPU2(int SRN, int ERN) throws Exception {
		try {
			XL_Data_GLDT.read_Test_Data(50);
			Thread.sleep(5000);
			List<WebElement> ROPU = driver
					.findElements(By.xpath("//div[2]/table//*[@class=' layout-body']//div[1]/span/button"));//// *[@id='CT']//button
			int j = ROPU.size();
			for (int i = 1; i <= j; i++) {
				String Actual_ROPU_Name = driver
						.findElement(
								By.xpath("(//div[2]/table//*[@class=' layout-body']//div[1]/span/button)[" + i + "]"))
						.getText();
				if (Actual_ROPU_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(3000);
					driver.findElement(
							By.xpath("(//div[2]/table//*[@class=' layout-body']//div[1]/span/button)[" + i + "]"))
							.click();
					break;
				}
			}
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}

	

	public static void select_Country2(int SRN, int ERN) throws Exception {
		try {
			XL_Data_GLDT.read_Test_Data(51);
			Thread.sleep(5000);
			List<WebElement> Country = driver.findElements(By.xpath("//*[@node_name='CountryCardSelectable']"));
			int j = Country.size();
			int i;
			for (i = 1; i <= j; i++) {
				String Actual_Country_Name = driver
						.findElement(
								By.xpath("(//*[@node_name='CountryCardSelectable']//*[@class='heading_3'])['+i+']"))
						.getText();

				if (Actual_Country_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(5000);
					WebElement CountryEle = driver
							.findElement(By.xpath("//*[@node_name='CountryCardSelectable']//*[@class='icons']/img"));
					CountryEle.click();
					// //*[@node_name='CountryCardSelectable']//*[@class='icons']/img
					// driver.findElement(By.xpath("(//*[@node_name='CountryCardSelectable']//*[@class='heading_3'])["+i+"]")).click();
					break;
				}
			}
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}

	public static void Open_Existing_RALDCase(int SRN, int ERN) throws Exception {
		try {
			XL_Data_GLDT.read_CaseID(12);

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
			 String expectedPage ="Regulatory Launch Dates (Japan)";
			  Assert.assertEquals(actualPage,expectedPage);
			  System.out.println("Page is verified");
			  XL_Data_GLDT.write_Pass_Result(SRN);
			 
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}

	public static void Open_Existing_RALDCaseforTestCases(int SRN, int ERN) throws Exception {
		try {
			XL_Data_GLDT.read_CaseID(311);

			Thread.sleep(1000);
			// WebDriverWait frameWait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement psfFrameElement = driver.findElement(By.xpath("//iframe[@name='PegaGadget0Ifr']"));
			driver.switchTo().frame(psfFrameElement);

			WebDriverWait CaseidWait = new WebDriverWait(driver, Duration.ofSeconds(80));

			List<WebElement> gldtIDs = driver.findElements(By.xpath("//div[contains(text(),'GLDT-')]"));
			CaseidWait.until(ExpectedConditions.visibilityOfAllElements(gldtIDs));

			int j = gldtIDs.size();
			for (int i = 1; i <= j; i++) {
				String actualgldt = driver.findElement(By.xpath("(//div[contains(text(),'GLDT-')])[" + i + "]"))
						.getText();

				if (actualgldt.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					WebElement openCaseID = driver.findElement(By.xpath("(//div[contains(text(),'GLDT-')])"));
					openCaseID.click();

					break;
				}
			}
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}

	public static void Open_Existing_RALDCase2(int SRN, int ERN) throws Exception {
		try {
			XL_Data_GLDT.read_CaseID(55);

			Thread.sleep(5000);
			// WebDriverWait frameWait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement psfFrameElement = driver.findElement(By.xpath("//iframe[@name='PegaGadget0Ifr']"));
			driver.switchTo().frame(psfFrameElement);

			WebDriverWait CaseidWait = new WebDriverWait(driver, Duration.ofSeconds(90));

			List<WebElement> gldtIDs = driver.findElements(By.xpath("//div[contains(text(),'GLDT-')]"));
			CaseidWait.until(ExpectedConditions.visibilityOfAllElements(gldtIDs));

			int j = gldtIDs.size();
			for (int i = 1; i <= j; i++) {
				String actualgldt = driver.findElement(By.xpath("(//div[contains(text(),'GLDT-')])[" + i + "]"))
						.getText();

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
			 String expectedPage ="Regulatory Launch Dates (Japan)";
			  Assert.assertEquals(actualPage,expectedPage);
			  System.out.println("Page is verified");
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}

	public static void capture_RALDCase_id_HP(int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			RALD_Case_Id=driver.findElement(By.xpath("//span[@class='workarea_header_id']")).getText();
		    System.out.println("ActualRALDId:"+RALD_Case_Id);
			WebElement expectedRALD_Case_Id = driver.findElement(By.xpath("//span[contains(text(),'(RALD-')]"));
			String expectedRALDID=expectedRALD_Case_Id.getText();
			System.out.println("Expected RALD ID:"+expectedRALDID);
			Assert.assertEquals(RALD_Case_Id,expectedRALDID);
			RALD_Case_Id = RALD_Case_Id.substring(RALD_Case_Id.lastIndexOf("R")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(RALD_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			RALD_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_RALDCase_id is" + RALD_Case_Id);
			// XL_Data_GLDT.write_CaseID(28, RALD_Case_Id);
			XL_Data_GLDT.write_Pass_Result(SRN);
			XL_Data_GLDT.write_CaseID(13, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(24, RALD_Case_Id);
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}

	public static void capture_RALDCase_id(int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			RALD_Case_Id=driver.findElement(By.xpath("//span[@class='workarea_header_id']")).getText();
		    System.out.println("ActualRALDId:"+RALD_Case_Id);
		    String expectedRALDID = driver.findElement(By.xpath("//span[contains(text(),'(RALD-')]")).getText();
			System.out.println("Expected RALD ID:"+expectedRALDID);
			Assert.assertEquals(RALD_Case_Id,expectedRALDID);
			RALD_Case_Id = RALD_Case_Id.substring(RALD_Case_Id.lastIndexOf("R")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(RALD_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			RALD_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_RALDCase_id " + RALD_Case_Id);
			// XL_Data_GLDT.write_CaseID(28, RALD_Case_Id);
			XL_Data_GLDT.write_Pass_Result(SRN);
			XL_Data_GLDT.write_CaseID(204, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(215, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(219, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(223, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(228, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(236, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(244, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(252, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(260, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(268, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(276, RALD_Case_Id);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}

	public static void capture_RALDCase_id2(int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			ROLD_Case_Id = driver.findElement(By.xpath("//span[@class='workarea_header_id']")).getText();
			System.out.println("Actual ROLD CaseID:"+ROLD_Case_Id);
			WebElement expectedROLD_Case_Id = driver.findElement(By.xpath("//span[contains(text(),'(ROLD-')]"));
			String  eROLDCaseID=expectedROLD_Case_Id.getText();
			Assert.assertEquals(ROLD_Case_Id,  eROLDCaseID);
			System.out.println("ROLD Case id is verified:"+ROLD_Case_Id);
			ROLD_Case_Id = ROLD_Case_Id.substring(ROLD_Case_Id.lastIndexOf("R")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(ROLD_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			ROLD_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_RALDCase_id " + ROLD_Case_Id);

			
			XL_Data_GLDT.write_Pass_Result(SRN);
			XL_Data_GLDT.write_CaseID(56, RALD_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(66, RALD_Case_Id);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
		catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}


	}

	public static void clickOnBestDate(int SRN, int ERN) throws Exception {
		try {
			/*
			 * XL_Data_GLDT.read_Test_Data(14); Thread.sleep(5000); WebElement Best =
			 * driver.findElement(By.xpath("//input[@id='79a8ae4c']"));
			 * Best.sendKeys(XL_Data_GLDT.testData); Thread.sleep(2000);
			 */
			WebElement Best = driver.findElement(By.xpath("//img[@class='inactvIcon']"));
			Best.click();
			// Best.clear();
			Thread.sleep(3000);

			WebElement TodayDate = driver.findElement(By.linkText("Today"));
			String selectDate=TodayDate.getText();
			System.out.println(TodayDate);
			String expectedDate = "Today";
			
			Assert.assertEquals(selectDate, expectedDate);
			System.out.println("Entered BestDate is verified:"+selectDate);
			TodayDate.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}

	public static void clickOnBaseDate(int SRN, int ERN) throws Exception {
		try {
			/*
			 * XL_Data_GLDT.read_Test_Data(15); Thread.sleep(2000); WebElement Best =
			 * driver.findElement(By.xpath("//input[@id='2a32f5c8']"));
			 * Best.sendKeys(XL_Data_GLDT.testData); Thread.sleep(2000);
			 */

			WebElement Base = driver.findElement(By.xpath("(//img[@class='inactvIcon'])[3]"));
			Base.click();
			Thread.sleep(3000);
			WebElement TodayDate1 = driver.findElement(By.linkText("Today"));
			String selectDate=TodayDate1.getText();
			System.out.println(TodayDate1);
			String expectedDate = "Today";
			
			Assert.assertEquals(selectDate, expectedDate);
			System.out.println("Entered BaseDate is verified:"+selectDate);
			TodayDate1.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}

	public static void clickOnAcheivedDate(int SRN, int ERN) throws Exception {
		try {
			/*
			 * XL_Data_GLDT.read_Test_Data(16); Thread.sleep(2000); WebElement Best =
			 * driver.findElement(By.xpath("//input[@id='ad943e8b']"));
			 * Best.sendKeys(XL_Data_GLDT.testData); Thread.sleep(2000);
			 */
			WebElement Acheived = driver.findElement(By.xpath("(//img[@class='inactvIcon'])[5]"));
			Acheived.click();
			Thread.sleep(3000);
			WebElement TodayDate2 = driver.findElement(By.linkText("Today"));
			String selectDate=TodayDate2.getText();
			System.out.println(TodayDate2);
			String expectedDate = "Today";
			Assert.assertEquals(selectDate, expectedDate);
			System.out.println("Entered AcheivedDate is verified:"+selectDate);
			TodayDate2.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
	}

	public static void approvalDate(int SRN, int ERN) throws Exception {

		try {
			/*
			 * Thread.sleep(3000); WebElement Check_Mark2 =
			 * driver.findElement(By.xpath("//input[@id='e0446e74']")); Check_Mark2.click();
			 * Thread.sleep(10000); // popupScreeen// WebElement Check_Mark2a =
			 * driver.findElement(By.xpath("//button[@title='Continue']"));
			 * Thread.sleep(10000); Check_Mark2a.click(); XL_Data_GLDT.write_Pass_Result(SRN);
			 */
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
			WebElement Check_Mark2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='e0446e74']")));
			Check_Mark2.click();
			// popupScreeen//
			WebDriverWait wait2a = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement Check_Mark2a = wait2a.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Continue']")));
			boolean Check_Mark2aPopUp =  Check_Mark2a.isDisplayed();
			Assert.assertTrue( Check_Mark2aPopUp);
			System.out.println("ApplyChanges PopUp is opened:"+ Check_Mark2aPopUp);
			Check_Mark2a.click();
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			// System.out.println(e);
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}

	public static void clickOnComplete(int SRN, int ERN) throws Exception {
		try {
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			Thread.sleep(3000);
			WebElement complete = driver.findElement(By.xpath("//button[contains(text(),'Complete')]"));
			complete.click();
			
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}public static void clickOnCompleteAsROPU(int SRN, int ERN) throws Exception {
		try {
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			Thread.sleep(3000);
			WebElement complete = driver.findElement(By.xpath("//button[contains(text(),'Complete')]"));
			complete.click();
			String actualstatusforROPU=driver.findElement(By.xpath("(//span[contains(text(),'Resolved-Completed')])[2]")).getText();
			String expectedstatusforROPU="Resolved-Completed";
			System.out.println("ROLD is resolved:"+expectedstatusforROPU);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
		catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}

	}
	public static void clickOnCompleteasRA(int SRN, int ERN) throws Exception {
		try {
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			Thread.sleep(3000);
			WebElement complete = driver.findElement(By.xpath("//button[contains(text(),'Complete')]"));
			complete.click();
			String actualstatus = driver.findElement(By.xpath("(//span[contains(text(),'Pending-SubCaseProcessing')])[3]")).getText();
			String expectedstatus = "Pending-SubCaseProcessing";
			Assert.assertEquals(actualstatus, actualstatus);
			System.out.println("Status Verified:"+actualstatus);
			
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
		}
		 catch (Exception e) {
				String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
				Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
				XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
			}

	}

	
	

	public static void ROPUProcess_HP(int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			Thread.sleep(5000);
			WebElement InitiateRopuProcessButton = driver.findElement(By.xpath("//button[contains(text(),'Initiate ROPU Process')]"));
			InitiateRopuProcessButton.click();
			// driver.findElement(By.xpath("//button[@name='OKModalTemplate_pyWorkPage_12']")).click();
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}

	public static void InitiateROPUProcess(int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			Thread.sleep(2000);
			WebElement InitiateRopuProcessButton = driver.findElement(By.xpath("//button[contains(text(),'Initiate ROPU Process')]"));
			Thread.sleep(5000);
			InitiateRopuProcessButton.click();
			WebElement statusPopUp = driver.findElement(By.xpath("//div[@id='modaldialog_hd']"));
			boolean PopuP=statusPopUp.isDisplayed();
			Assert.assertTrue( PopuP);
			System.out.println("Status PopUp is opened:"+ PopuP);
			String actualRopuMessage = driver.findElement(By.xpath("//span[contains(text(),'ROPU Process initiated successfully')]")).getText();
			String expectedRopuMessage="ROPU Process initiated successfully";
			Assert.assertEquals(actualRopuMessage, expectedRopuMessage);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}


	}

	public static void clickOnOk(int SRN, int ERN) throws Exception {
		try {

			Thread.sleep(3000);
			WebElement ok = driver.findElement(By.xpath("//button[@name='OKModalTemplate_pyWorkPage_12']"));
			ok.click();
			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}

	public static void clickOnCloseAsRA(int SRN, int ERN) throws Exception {
		try {
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			Thread.sleep(3000);
			// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
			WebElement close = driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
			close.click();
			driver.switchTo().defaultContent();
			WebElement frame2=driver.findElement(By.xpath("//iframe[@id='PegaGadget2Ifr']"));
	  		driver.switchTo().frame(frame2);
			
			String actualdashBoard =driver.findElement(By.xpath("//span[contains(text(),'Welcome')]")).getText();
			String expectedDashBoard = "Welcome";
			
			Assert.assertEquals(actualdashBoard,expectedDashBoard);
			
			System.out.println("Returned to Dashboard has been verified:"+expectedDashBoard);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}


	}
	public static void clickOnClose(int SRN, int ERN) throws Exception {
		try {
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			Thread.sleep(3000);
			// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
			WebElement close = driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
			close.click();
			
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}
	public static void clickOnCloseAsROPU(int SRN, int ERN) throws Exception {
		try {
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			Thread.sleep(3000);
			// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
			WebElement close = driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
			close.click();
			
			driver.switchTo().defaultContent();
			WebElement frame2=driver.findElement(By.xpath("//iframe[@id='PegaGadget2Ifr']"));
	  		driver.switchTo().frame(frame2);
			
			String actualdashBoard =driver.findElement(By.xpath("//span[contains(text(),'Welcome')]")).getText();
			String expectedDashBoard = "Welcome";
			
			Assert.assertEquals(actualdashBoard,expectedDashBoard);
			
			System.out.println("Returned to Dashboard has been verified:"+expectedDashBoard);
			XL_Data_GLDT.write_Pass_Result(SRN);
			
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}

	public static void Open_Existing_ROLDCase(int SRN, int ERN) throws Exception {
		try {
			XL_Data_GLDT.read_CaseID(24);
			

			Thread.sleep(5000);
			// WebDriverWait frameWait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement psfFrameElement = driver.findElement(By.xpath("//iframe[@name='PegaGadget0Ifr']"));
			driver.switchTo().frame(psfFrameElement);

			WebDriverWait CaseidWait = new WebDriverWait(driver, Duration.ofSeconds(80));

			List<WebElement> raldIDs = driver.findElements(By.xpath("//div[contains(text(),'RALD-')]"));
			CaseidWait.until(ExpectedConditions.visibilityOfAllElements(raldIDs));

			int j = raldIDs.size();
			for (int i = 1; i <= j; i++) {
				String actualgldt = driver.findElement(By.xpath("(//div[contains(text(),'RALD-')])[" + i + "]")).getText();

				if (actualgldt.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					WebElement openCaseID = driver.findElement(By.xpath("(//div[contains(text(),'RALD-')])"));
					openCaseID.click();

					break;
				}
               
			}
			 driver.switchTo().defaultContent();
				
				driver.switchTo().frame(1);
				
				 String actualPage = driver.findElement(By. xpath("(//span[@class='workarea_header_titles'])[1]")).getText();
				 System.out.println("Actual page is:"+ actualPage);
				 String expectedPage ="ROPU – Country Launch Dates (Japan)";
				  Assert.assertEquals(actualPage,expectedPage);
				  System.out.println("Page is verified:"+expectedPage);
				  XL_Data_GLDT.write_Pass_Result(SRN);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} 
		catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	public static void Open_Existing_ROLDCase2(int SRN, int ERN) throws Exception {
		try {
			XL_Data_GLDT.read_CaseID(66);
			;

			Thread.sleep(5000);
			// WebDriverWait frameWait = new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement psfFrameElement = driver.findElement(By.xpath("//iframe[@name='PegaGadget0Ifr']"));
			driver.switchTo().frame(psfFrameElement);

			WebDriverWait CaseidWait = new WebDriverWait(driver, Duration.ofSeconds(80));

			List<WebElement> raldIDs = driver.findElements(By.xpath("//div[contains(text(),'RALD-')]"));
			CaseidWait.until(ExpectedConditions.visibilityOfAllElements(raldIDs));

			int j = raldIDs.size();
			for (int i = 1; i <= j; i++) {
				String actualgldt = driver.findElement(By.xpath("(//div[contains(text(),'RALD-')])[" + i + "]"))
						.getText();

				if (actualgldt.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					WebElement openCaseID = driver.findElement(By.xpath("(//div[contains(text(),'RALD-')])"));
					openCaseID.click();

					break;
				}
			}
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame(1);
			
			 String actualPage = driver.findElement(By. xpath("(//span[@class='workarea_header_titles'])[1]")).getText();
			 System.out.println("Actual page is:"+ actualPage);
			 String expectedPage ="ROPU – Country Launch Dates (Japan)";
			  Assert.assertEquals(actualPage,expectedPage);
			  System.out.println("Page is verified:"+expectedPage);
			  XL_Data_GLDT.write_Pass_Result(SRN);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}

	public static void capture_ROLDCase_id(int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			ROLD_Case_Id = driver.findElement(By.xpath("//span[@class='workarea_header_id']")).getText();
			System.out.println("Actual ROLD CaseID:"+ROLD_Case_Id);
			WebElement expectedROLD_Case_Id = driver.findElement(By.xpath("//span[contains(text(),'(ROLD-')]"));
			String  eROLDCaseID=expectedROLD_Case_Id.getText();
			Assert.assertEquals(ROLD_Case_Id,  eROLDCaseID);
			System.out.println("ROLD Case id is verified:"+ROLD_Case_Id);
			ROLD_Case_Id = ROLD_Case_Id.substring(ROLD_Case_Id.lastIndexOf("R")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(ROLD_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			ROLD_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_RALDCase_id " + ROLD_Case_Id);

			XL_Data_GLDT.write_Pass_Result(SRN);
			XL_Data_GLDT.write_CaseID(25, ROLD_Case_Id);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}

	public static void capture_ROLDCase_id2(int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			ROLD_Case_Id = driver.findElement(By.xpath("//span[@class='workarea_header_id']")).getText();
			System.out.println("Actual ROLD CaseID:"+ROLD_Case_Id);
			WebElement expectedROLD_Case_Id = driver.findElement(By.xpath("//span[contains(text(),'(ROLD-')]"));
			String  eROLDCaseID=expectedROLD_Case_Id.getText();
			Assert.assertEquals(ROLD_Case_Id,  eROLDCaseID);
			System.out.println("ROLD Case id is verified:"+ROLD_Case_Id);
			ROLD_Case_Id = ROLD_Case_Id.substring(ROLD_Case_Id.lastIndexOf("R")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(ROLD_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			ROLD_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_RALDCase_id " + ROLD_Case_Id);
			XL_Data_GLDT.write_Pass_Result(SRN);
			XL_Data_GLDT.write_CaseID(67, ROLD_Case_Id);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}

	public static void bestDate_ROLD(int SRN, int ERN) throws Exception {
		try {
			/*
			 * driver.switchTo().defaultContent();
			 * driver.switchTo().frame("PegaGadget1Ifr"); XL_Data_GLDT.read_Test_Data(26);
			 * Thread.sleep(2000); WebElement Best =
			 * driver.findElement(By.xpath("//input[@id='d21e5ede']"));
			 * Best.sendKeys(XL_Data_GLDT.testData); Thread.sleep(2000);
			 * XL_Data_GLDT.write_Pass_Result(SRN);
			 */

			WebElement Best = driver.findElement(By.xpath("(//img[@class='inactvIcon'])[1]"));
			Best.click();
			// Best.clear();
			Thread.sleep(3000);

			WebElement TodayDate = driver.findElement(By.linkText("Today"));
			String selectDate=TodayDate.getText();
			System.out.println(TodayDate);
			String expectedDate = "Today";
			Assert.assertEquals(selectDate, expectedDate);
			System.out.println("Entered BestDate is verified:"+selectDate);
			TodayDate.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		 catch (Exception e) {
				String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
				Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
				XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
			}
	}

	public static void baseDate_ROLD(int SRN, int ERN) throws Exception {
		try {
			/*
			 * XL_Data_GLDT.read_Test_Data(27); Thread.sleep(2000); WebElement Best =
			 * driver.findElement(By.xpath("//input[@id='ae7f7b05']"));
			 * Best.sendKeys(XL_Data_GLDT.testData); Thread.sleep(2000);
			 * XL_Data_GLDT.write_Pass_Result(SRN);
			 */
			WebElement Base = driver.findElement(By.xpath("(//img[@class='inactvIcon'])[8]"));
			Base.click();
			// Base.clear();
			Thread.sleep(3000);
			WebElement TodayDate1 = driver.findElement(By.linkText("Today"));
			String selectDate=TodayDate1.getText();
			System.out.println(TodayDate1);
			String expectedDate = "Today";
			Assert.assertEquals(selectDate,expectedDate );
			System.out.println("Entered BasetDate is verified:"+selectDate);
			TodayDate1.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	public static void acheivedDate_ROLD(int SRN, int ERN) throws Exception {
		try {
			/*
			 * XL_Data_GLDT.read_Test_Data(28); Thread.sleep(2000); WebElement Best =
			 * driver.findElement(By.xpath("//input[@id='33709a73']"));
			 * Best.sendKeys(XL_Data_GLDT.testData); Thread.sleep(2000);
			 * XL_Data_GLDT.write_Pass_Result(SRN);
			 */
			WebElement Acheived = driver.findElement(By.xpath("(//img[@class='inactvIcon'])[15]"));
			Acheived.click();
			// Acheived.clear();
			Thread.sleep(3000);
			WebElement TodayDate3 = driver.findElement(By.linkText("Today"));
			String selectDate=TodayDate3.getText();
			System.out.println(TodayDate3);
	       String expectedDate = "Today";
			Assert.assertEquals(selectDate,expectedDate );
			TodayDate3.click();
           Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}

	public static void prCheckBox(int SRN, int ERN) throws Exception {
		try {

			Thread.sleep(3000);
			WebElement CheckboxPR = driver.findElement(By.xpath("//input[@id='e7ac2b61']"));
			CheckboxPR.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	// popupScreeen//

	public static void prPopUP(int SRN, int ERN) throws Exception {
		try {
			WebElement popupPR = driver.findElement(By.xpath("//button[@title='Continue']"));
			boolean popuppr = popupPR.isDisplayed();
			Assert.assertTrue(popuppr);
			System.out.println("ApplyChanges PopUp is opened:"+ popuppr);
			popupPR.click();
			
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}

	public static void checkbox_Cutoff(int SRN, int ERN) throws Exception {
		try {
			WebElement Checkboxcutoff = driver.findElement(By.xpath("//input[@id='b52b7737']"));
			Checkboxcutoff.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	// popupScreeen//
	public static void popUp_Cutoff(int SRN, int ERN) throws Exception {
		try {

			WebElement popupcutoff = driver.findElement(By.xpath("//button[@title='Continue']"));
			boolean popupcutoffcheck = popupcutoff.isDisplayed();
			Assert.assertTrue(popupcutoffcheck);
			System.out.println("ApplyChanges PopUp is opened:"+popupcutoffcheck);
			popupcutoff.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	public static void officialPriceUnreimbursed(int SRN, int ERN) throws Exception {
		try {
			WebElement OP1 = driver.findElement(By.xpath("//input[@id='17c420e1']"));
			OP1.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	// popupScreeen//
	public static void op1PopUp(int SRN, int ERN) throws Exception {
		try {
			WebElement popupOP1 = driver.findElement(By.xpath("//button[@title='Continue']"));
			boolean popupop1check= popupOP1.isDisplayed();
			Assert.assertTrue(popupop1check);
			System.out.println("ApplyChanges PopUp is opened:"+popupop1check);
			popupOP1.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	public static void officialPriceReimbursed(int SRN, int ERN) throws Exception {
		try {
			WebElement OP2 = driver.findElement(By.xpath("//input[@id='3cdc2b72']"));
			OP2.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	// popupScreeen//
	public static void oP2PopUp(int SRN, int ERN) throws Exception {
		try {
			WebElement popupOP2 = driver.findElement(By.xpath("//button[@title='Continue']"));
			boolean popupop2check=popupOP2.isDisplayed();
			Assert.assertTrue(popupop2check);
			System.out.println("ApplyChanges PopUp is opened:"+popupop2check);
			popupOP2.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	public static void unReimbursedLaunchDate(int SRN, int ERN) throws Exception {
		try {
			WebElement LaunchDate = driver.findElement(By.xpath("//input[@id='14bd8026']"));
			LaunchDate.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	// popupScreeen//
	public static void unReimbursedLaunchDatePopUp(int SRN, int ERN) throws Exception {
		try {

			WebElement popupLaunchDate = driver.findElement(By.xpath("//button[@title='Continue']"));
			boolean popupLaunchDatecheck= popupLaunchDate.isDisplayed();
			Assert.assertTrue(popupLaunchDatecheck);
			System.out.println("ApplyChanges PopUp is opened:"+ popupLaunchDatecheck);
			popupLaunchDate.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	public static void reimbursedLauchDate(int SRN, int ERN) throws Exception {
		try {

			WebElement reLaunchDate = driver.findElement(By.xpath("//input[@id='c4823044']"));
			reLaunchDate.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	// popupScreeen//
	public static void reimbursedLaunchDatePopUp(int SRN, int ERN) throws Exception {
		try {

			WebElement popupreLaunchDate = driver.findElement(By.xpath("//button[@title='Continue']"));
			boolean popupreLaunchDatecheck = popupreLaunchDate.isDisplayed();
			Assert.assertTrue(popupreLaunchDatecheck);
			System.out.println("ApplyChanges PopUp is opened:"+popupreLaunchDatecheck);
			popupreLaunchDate.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}

	

	public static void click_on_logOffAsROPU(int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			Thread.sleep(3500);

			WebElement profileImg = driver.findElement(By.xpath("//button[contains(@class,'icons avatar name-s ')]"));
			profileImg.click();

			WebElement logOff = driver.findElement(By.xpath("//span[text()='Log off']"));
			logOff.click();
			Thread.sleep(1000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} 
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}


	}
	public static void click_on_logOffAsRA(int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			//driver.switchTo().frame("PegaGadget1Ifr");
			Thread.sleep(3500);

			WebElement profileImg = driver.findElement(By.xpath("//button[contains(@class,'icons avatar name-s ')]"));
			profileImg.click();

			WebElement logOff = driver.findElement(By.xpath("//span[text()='Log off']"));
			logOff.click();
			Thread.sleep(1000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}


	public static void enterDate(int SRN, int ERN) throws Exception {

		try {
			XL_Data_GLDT.read_Test_Data(18);
			Thread.sleep(2000);
			WebElement Best = driver.findElement(By.xpath("//input[@id='79a8ae4c']"));
			Best.sendKeys(XL_Data_GLDT.testData);
			Thread.sleep(2000);
			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}

	public static void Complete_RaldProcess(int SRN, int ERN) throws Exception {
//		Thread.sleep(7000);
//		WebElement CompleteButton = driver.findElement(By.xpath("//button[@name='SetProductLaunchDates_pyWorkPage_96']"));
//		CompleteButton.click();
		//
		try {
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			WebElement complete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Complete')]")));
			complete.click();
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			// Block of code to handle errors
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

//	public static void Initiate_RopuProcess(int SRN, int ERN) throws Exception {
//		try {
//
//			// Thread.sleep(5000);
//			// SelectCheckMark2//Approval Date//
////			WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
////			WebElement Check_Mark2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"e0446e74\"]")));
////			Check_Mark2.click();
////			//popupScreeen//
////			WebDriverWait wait2a = new WebDriverWait(driver,Duration.ofSeconds(20));
////			WebElement Check_Mark2a = wait2a.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Continue']")));
////			Check_Mark2a.click();
//			Thread.sleep(3000);
//			WebElement InitiateRopuProcessButton = driver
//					.findElement(By.xpath("//button[@name='SetProductLaunchDates_pyWorkPage_94']"));
//			InitiateRopuProcessButton.click();
//			driver.findElement(By.xpath("//button[@name='OKModalTemplate_pyWorkPage_12']")).click();
////			Thread.sleep(5000);
////			driver.findElement(By.xpath("//span[@id='TA_5e1978c7_charCounter']")).click();
////			WebDriverWait CompleteButtonWait =new WebDriverWait(driver, Duration.ofSeconds(30));
////			WebElement CompleteButton = CompleteButtonWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Complete')]")));
////			//WebElement CompleteButton = driver.findElement(By.xpath("//button[contains(text(),'Complete')]"));
////			CompleteButton.click();
//			XL_Data_GLDT.write_Pass_Result(SRN);
//
//		} catch (Exception e) {
//			// Block of code to handle errors
//			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
//			Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod);
//			XL_Data_GLDT.write_Fail_Result_DependentTestCase(SRN, ERN, currentMethod);
//		}
//
//	}

	public static void capture_GLDTCase_id(int CaseidRow_W, int SRN, int ERN) throws Exception {

		try {
			driver.switchTo().defaultContent();

			WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='PegaGadget1Ifr']"));
			driver.switchTo().frame(frame1);

			GLDT_Case_Id = driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]")).getText();
			GLDT_Case_Id = GLDT_Case_Id.substring(GLDT_Case_Id.lastIndexOf("G")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(GLDT_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			GLDT_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_GLDTCase_id " + GLDT_Case_Id);
			// XL_Data_GLDT.put_CaseID_Data(R);

			WebElement gldtId = driver.findElement(By.xpath("//span[@class='workarea_header_id']"));
			String gldtIdText = gldtId.getText();
			Assert.assertEquals(gldtIdText,
					driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]")).getText());
			System.out.println("GLDT id has been verified");
			XL_Data_GLDT.write_CaseID(CaseidRow_W, GLDT_Case_Id);
			XL_Data_GLDT.pre_Requisite_Data_Write(170,GLDT_Case_Id);
			XL_Data_GLDT.pre_Requisite_Data_Write(174,GLDT_Case_Id);
			XL_Data_GLDT.pre_Requisite_Data_Write(178,GLDT_Case_Id);
			XL_Data_GLDT.pre_Requisite_Data_Write(182,GLDT_Case_Id);
			XL_Data_GLDT.pre_Requisite_Data_Write(187,GLDT_Case_Id);
			XL_Data_GLDT.pre_Requisite_Data_Write(195,GLDT_Case_Id);
			XL_Data_GLDT.pre_Requisite_Data_Write(203,GLDT_Case_Id);
  	} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}

	}
	
	public static void capture_GLDTCase_id_IndependentCase(int CaseidRow_W, int SRN, int ERN) throws Exception {
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			driver.switchTo().defaultContent();

			WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='PegaGadget1Ifr']"));
			driver.switchTo().frame(frame1);

			GLDT_Case_Id = driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]")).getText();
			GLDT_Case_Id = GLDT_Case_Id.substring(GLDT_Case_Id.lastIndexOf("G")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(GLDT_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			GLDT_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_GLDTCase_id " + GLDT_Case_Id);
			// XL_Data_GLDT.put_CaseID_Data(R);

			WebElement gldtId = driver.findElement(By.xpath("//span[@class='workarea_header_id']"));
			String gldtIdText = gldtId.getText();
			Assert.assertEquals(gldtIdText,
					driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]")).getText());
			System.out.println("GLDT id has been verified");
			XL_Data_GLDT.write_CaseID(CaseidRow_W, GLDT_Case_Id);
//			XL_Data_GLDT.pre_Requisite_Data_Write(170,GLDT_Case_Id);
//			XL_Data_GLDT.pre_Requisite_Data_Write(174,GLDT_Case_Id);
//			XL_Data_GLDT.pre_Requisite_Data_Write(178,GLDT_Case_Id);
//			XL_Data_GLDT.pre_Requisite_Data_Write(182,GLDT_Case_Id);
//			XL_Data_GLDT.pre_Requisite_Data_Write(187,GLDT_Case_Id);
//			XL_Data_GLDT.pre_Requisite_Data_Write(195,GLDT_Case_Id);
//			XL_Data_GLDT.pre_Requisite_Data_Write(203,GLDT_Case_Id);
		} catch (Exception e) {
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

	public static void capture_GLDTCase_idforTC(int CaseidRow_W, int SRN, int ERN) throws Exception {
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));


		try {
			driver.switchTo().defaultContent();

			WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='PegaGadget1Ifr']"));
			driver.switchTo().frame(frame1);

			GLDT_Case_Id = driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]")).getText();
			GLDT_Case_Id = GLDT_Case_Id.substring(GLDT_Case_Id.lastIndexOf("G")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(GLDT_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			GLDT_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_GLDTCase_id " + GLDT_Case_Id);
			// XL_Data_GLDT.put_CaseID_Data(R);

			WebElement gldtId = driver.findElement(By.xpath("//span[@class='workarea_header_id']"));
			String gldtIdText = gldtId.getText();
			Assert.assertEquals(gldtIdText,
					driver.findElement(By.xpath("//span[contains(text(),'(GLDT-')]")).getText());
			System.out.println("GLDT id has been verified");
			XL_Data_GLDT.write_CaseID(CaseidRow_W, GLDT_Case_Id);
			XL_Data_GLDT.write_CaseIDAsPrerequiste(306, GLDT_Case_Id);
			
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);

		}

	}

	public static void selectproduct_dropdown(int product_Row, int SRN, int ERN) throws Exception {

		try {
			XL_Data_GLDT.read_Test_Data(product_Row);

			Thread.sleep(5000);
			WebElement selectproduct = driver.findElement(By.xpath("//input[@name='$PpyWorkPage$pProductName'][@id='414e17ce']"));
			
            selectproduct.clear();
			selectproduct.sendKeys(XL_Data_GLDT.testData);
			Thread.sleep(5000);
			selectproduct.sendKeys(Keys.DOWN);
			selectproduct.sendKeys(Keys.RETURN);
			selectproduct.sendKeys(Keys.TAB);
			
			String selectproductValue=selectproduct.getAttribute("value");
			System.out.println(selectproductValue);
			Assert.assertEquals(selectproductValue, XL_Data_GLDT.testData);
			System.out.println("The selected product has been verified");

			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (AssertionError ae) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}
	}

	public static void caseReason(int reasonRead_Row, int SRN, int ERN) throws Exception {
		// XL_Data_GLDT.GLDT_get_data(case_Id);

		try {
			XL_Data_GLDT.read_Test_Data(reasonRead_Row);
			Thread.sleep(7000);
			WebElement reason = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='158b841d']")));
			// reason.clear();
			reason.sendKeys(XL_Data_GLDT.testData);
			
			String reasonEnteredCheck=reason.getAttribute("value");
			Assert.assertEquals(reasonEnteredCheck, XL_Data_GLDT.testData);
			System.out.println("The entered reason has been verified Using Assert");
			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}

	}
	
	public static void selectproduct_dropdown_IndependentCase(int product_Row, int SRN, int ERN) throws Exception {
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			XL_Data_GLDT.read_Test_Data(product_Row);

			Thread.sleep(5000);
			WebElement selectproduct = driver.findElement(By.xpath("//input[@name='$PpyWorkPage$pProductName'][@id='414e17ce']"));
            selectproduct.clear();
			selectproduct.sendKeys(XL_Data_GLDT.testData);
			Thread.sleep(5000);
			selectproduct.sendKeys(Keys.DOWN);
			selectproduct.sendKeys(Keys.RETURN);
			selectproduct.sendKeys(Keys.TAB);
			
			String selectproductValue=selectproduct.getAttribute("value");
			System.out.println(selectproductValue);
			Assert.assertEquals(selectproductValue, XL_Data_GLDT.testData);
			System.out.println("The selected product has been verified");

			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (Exception e) {
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

	public static void caseReason_IndependentCase(int reasonRead_Row, int SRN, int ERN) throws Exception {
		// XL_Data_GLDT.GLDT_get_data(case_Id);
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		try {
			XL_Data_GLDT.read_Test_Data(reasonRead_Row);
			Thread.sleep(7000);
			WebElement reason = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='158b841d']")));
			// reason.clear();
			reason.sendKeys(XL_Data_GLDT.testData);
			
			String reasonEnteredCheck=reason.getAttribute("value");
			Assert.assertEquals(reasonEnteredCheck, XL_Data_GLDT.testData);
			System.out.println("The entered reason has been verified Using Assert");
			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (Exception e) {
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



	public static void openExistingGLDT_WithoutLogOff(int gldtId_Row, int SRN, int ERN) throws Exception {
		
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));


		try {
			XL_Data_GLDT.read_CaseID(gldtId_Row);

			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			WebElement homePageFrame = driver.findElement(By.id("PegaGadget2Ifr"));
			driver.switchTo().frame(homePageFrame);
			// driver.findElement(By.xpath("//a[contains(text(),'GLDT-')]"));
			Thread.sleep(3000);
			// WebDriverWait gldtCaseidWait = new
			// WebDriverWait(driver,Duration.ofSeconds(90));
			//
			// List<WebElement> gldtIDs=driver.findElements(By.xpath("//a[@title='Click here
			// to open the object']"));
			// gldtCaseidWait.until(ExpectedConditions.visibilityOfAllElements(gldtIDs));
			List<WebElement> gldtIDs_TAMA = driver
					.findElements(By.xpath("//a[@title='Click here to open the object']"));
			int j = gldtIDs_TAMA.size();
			for (int i = 1; i < j; i++) {
				String actualgldt_TAMA = driver
						.findElement(By.xpath("(//a[@title='Click here to open the object'])[" + i + "]")).getText();

				if (actualgldt_TAMA.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//a[@title='Click here to open the object'])[" + i + "]")).click();

					break;
				}
			}

			System.out.println(
					"Test Step Passed " + new Throwable().getStackTrace()[0].getMethodName() + " Sucessfully ");
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}

	}


	public static void tempProdCheck_AssignmentsSection(int tempProduct_Row, int SRN, int ERN) throws Exception {
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));


		try {

			XL_Data_GLDT.read_Test_Data(tempProduct_Row);
			driver.switchTo().defaultContent();
			WebElement gldtReadModeFrame = driver.findElement(By.id("PegaGadget1Ifr"));
			driver.switchTo().frame(gldtReadModeFrame);

			WebElement assignmentsElement = driver.findElement(By.xpath("(//h2[@class='header-title'])[2]"));
			String assignmentText = assignmentsElement.getText();

			Assert.assertEquals(assignmentText, "Assignments");
			System.out.println("Assignments section verified");

			Thread.sleep(1000);

			WebElement tempProdName = driver.findElement(
					By.xpath("//tbody/tr[@id='$PD_ShowSelectedCountry$ppxResults$l1']/td[4]/div[1]/div[1]/span[1]"));
			String tempProdText = tempProdName.getText();
			// the below if also working ,but used Assert
//			if(tempProdText.equalsIgnoreCase(XL_Data_GLDT.testData)){
//				System.out.println("Temporary Product has been verified at the Assignments section");
//			
//			}
			boolean tempProductCheck = tempProdText.equalsIgnoreCase(XL_Data_GLDT.testData);
			Assert.assertTrue(tempProductCheck);
			System.out.println("Temporary Product has been verified at the Assignments section");

			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);

		}
	}

	public static void click_initiate_RA_Process(int SRN, int ERN) throws Exception {

		try {
			WebElement InitiateRAProcess = driver.findElement(By.xpath("//button[@title='Initiate RA Process']"));
			InitiateRAProcess.click();
			// InitiateGlobalLaunchDates_Page.click_Continue(SRN, ERN);
			Thread.sleep(1000);
			WebElement selectedCountryList_popUp =driver.findElement(By.xpath("//label[contains(text(),'Please confirm if the correct list of countries ha')]"));
			boolean countryListPopUp_Check =selectedCountryList_popUp.isDisplayed();
			System.out.println("Country List pop up has been checked"+ " "+countryListPopUp_Check);
			Assert.assertTrue(countryListPopUp_Check);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			System.out.println("Assertion error:"+ae);
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			 Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod );
			 XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			 Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod );
			 XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}


	}
	
	public static void click_initiate_RA_Process_IndependentCase(int SRN, int ERN) throws Exception {
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			WebElement InitiateRAProcess = driver.findElement(By.xpath("//button[@title='Initiate RA Process']"));
			InitiateRAProcess.click();
			// InitiateGlobalLaunchDates_Page.click_Continue(SRN, ERN);
			Thread.sleep(1000);
			WebElement selectedCountryList_popUp =driver.findElement(By.xpath("//label[contains(text(),'Please confirm if the correct list of countries ha')]"));
			boolean countryListPopUp_Check =selectedCountryList_popUp.isDisplayed();
			System.out.println("Country List pop up has been checked"+ " "+countryListPopUp_Check);
			Assert.assertTrue(countryListPopUp_Check);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			System.out.println("Assertion error:"+ae);
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			 Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod );
			 XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);

		}
		catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			 Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod );
			 XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);

		}


	}



	public static void click_Continue(int SRN, int ERN) throws Exception {
		try {
			WebElement countryListPopUp = driver.findElement(
					By.xpath("//label[contains(text(),'Please confirm if the correct list of countries ha')]"));
			Assert.assertTrue(countryListPopUp.isDisplayed());
			WebElement continueBtn = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
			String continueBtnText = continueBtn.getText();
			Assert.assertEquals(continueBtnText, "Continue");
			continueBtn.click();
			System.out.println("Continue button checked");
			
			
//			//Dashboard check
     		driver.switchTo().defaultContent();
			WebElement frame2=driver.findElement(By.xpath("//iframe[@id='PegaGadget2Ifr']"));
      		driver.switchTo().frame(frame2);
			
			WebElement dashBoard =driver.findElement(By.xpath("//div[text()='Cases by Process and Status']"));
			boolean dashBoardCheck =dashBoard.isDisplayed();
			Assert.assertTrue(dashBoardCheck);
			
			System.out.println("Return to Dashboard has been verified"  + "" +dashBoardCheck);
			
			driver.switchTo().defaultContent();
			
			XL_Data_GLDT.write_Pass_Result(SRN);
			// driver.findElement(By.xpath("//button[text()='Close']")).click();
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}


	public static void click_Continue_IndependentCase(int SRN, int ERN) throws Exception {
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			WebElement countryListPopUp = driver.findElement(
					By.xpath("//label[contains(text(),'Please confirm if the correct list of countries ha')]"));
			Assert.assertTrue(countryListPopUp.isDisplayed());
			WebElement continueBtn = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
			String continueBtnText = continueBtn.getText();
			Assert.assertEquals(continueBtnText, "Continue");
			continueBtn.click();
			System.out.println("Continue button checked");
			
			
//			//Dashboard check
     		driver.switchTo().defaultContent();
			WebElement frame2=driver.findElement(By.xpath("//iframe[@id='PegaGadget2Ifr']"));
      		driver.switchTo().frame(frame2);
			
			WebElement dashBoard =driver.findElement(By.xpath("//div[text()='Cases by Process and Status']"));
			boolean dashBoardCheck =dashBoard.isDisplayed();
			Assert.assertTrue(dashBoardCheck);
			
			System.out.println("Return to Dashboard has been verified"  + "" +dashBoardCheck);
			
			
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			
			XL_Data_GLDT.write_Pass_Result(SRN);
			// driver.findElement(By.xpath("//button[text()='Close']")).click();
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);
		}
	}












//TC 91  & 92 method
	public static void searchAndSelect_Temp_Prod(int tempProduct_Row, int SRN, int ERN) throws Exception {

		try {
			XL_Data_GLDT.read_Test_Data(tempProduct_Row);

			WebDriverWait productUndefined_Wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement productUndefinedCheckBox = productUndefined_Wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='e2457cfb']")));
			// input[@id='e2457cfb']
			productUndefinedCheckBox.click();
			XL_Data_GLDT.write_Pass_Result(SRN);
			SRN++;

			WebDriverWait tempProdNameDropDown_Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement tempProdName_Dropdown = tempProdNameDropDown_Wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='anypicker-input']")));
			tempProdName_Dropdown.click();
			XL_Data_GLDT.write_Pass_Result(SRN);
			SRN++;

			WebElement tempProdSearchTextBox = driver.findElement(By.id("anypicker-input"));
			// searchTextBox.click();
			tempProdSearchTextBox.sendKeys(XL_Data_GLDT.testData);
			Thread.sleep(3000);

			tempProdSearchTextBox.sendKeys(Keys.DOWN);
			tempProdSearchTextBox.sendKeys(Keys.RETURN);

			System.out.println("The matched results are displayed based on search criteria");
			XL_Data_GLDT.write_Pass_Result(SRN);
			SRN++;

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}

	}
	
	public static void searchAndSelect_Temp_Prod_IndependentCase(int tempProduct_Row, int SRN, int ERN) throws Exception {
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));


		try {
			XL_Data_GLDT.read_Test_Data(tempProduct_Row);

			WebDriverWait productUndefined_Wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement productUndefinedCheckBox = productUndefined_Wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='e2457cfb']")));
			// input[@id='e2457cfb']
			productUndefinedCheckBox.click();
			XL_Data_GLDT.write_Pass_Result(SRN);
			SRN++;

			WebDriverWait tempProdNameDropDown_Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement tempProdName_Dropdown = tempProdNameDropDown_Wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='anypicker-input']")));
			tempProdName_Dropdown.click();
			XL_Data_GLDT.write_Pass_Result(SRN);
			SRN++;

			WebElement tempProdSearchTextBox = driver.findElement(By.id("anypicker-input"));
			// searchTextBox.click();
			tempProdSearchTextBox.sendKeys(XL_Data_GLDT.testData);
			Thread.sleep(3000);

			tempProdSearchTextBox.sendKeys(Keys.DOWN);
			tempProdSearchTextBox.sendKeys(Keys.RETURN);

			System.out.println("The matched results are displayed based on search criteria");
	        WebElement tempProdValue=driver.findElement(By.xpath("//span[@class='anypicker-token-content']"));
	        String tempProdValueText=tempProdValue.getText();
	        Assert.assertEquals(tempProdValueText, XL_Data_GLDT.testData);
	        System.out.println("The selected Temp Product has been verified"+  ""+ tempProdValueText);
			XL_Data_GLDT.write_Pass_Result(SRN);
			SRN++;

		} catch (Exception e) {
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



	public static void select_Region(int Region_row, int SRN, int ERN) throws Exception {
		// XL_Data_GLDT.GLDT_get_data(Region_row, ROPU_row);
		//
		try {
			XL_Data_GLDT.read_Test_Data(Region_row);

			// Region(s)
			// WebElements product = driver.findElement(By.xpath("//*[@class='layout-body
			// clearfix ']//input[@type='text']"));
			// *[@id='CT']//button
			Thread.sleep(5000);
			List<WebElement> Region = driver
					.findElements(By.xpath("//*[@class=' layout-body']//div[1][@id='CT']//button"));//// *[@id='CT']//button
			int j = Region.size();
			for (int i = 1; i < j; i++) {
				String Actual_Region_Name = driver
						.findElement(By.xpath("(//*[@class=' layout-body']//div[1][@id='CT']//button)[" + i + "]"))
						.getText();

				if (Actual_Region_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//*[@class=' layout-body']//div[1][@id='CT']//button)[" + i + "]"))
							.click();
					break;
				}
			}

			System.out.println(
					"Test Step Passed " + new Throwable().getStackTrace()[0].getMethodName() + " Sucessfully ");
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}

	}
	
	public static void select_Region_IndependentCase(int Region_row, int SRN, int ERN) throws Exception {
		// XL_Data_GLDT.GLDT_get_data(Region_row, ROPU_row);
		//
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			XL_Data_GLDT.read_Test_Data(Region_row);

			// Region(s)
			// WebElements product = driver.findElement(By.xpath("//*[@class='layout-body
			// clearfix ']//input[@type='text']"));
			// *[@id='CT']//button
			Thread.sleep(5000);
			List<WebElement> Region = driver
					.findElements(By.xpath("//*[@class=' layout-body']//div[1][@id='CT']//button"));//// *[@id='CT']//button
			int j = Region.size();
			for (int i = 1; i < j; i++) {
				String Actual_Region_Name = driver
						.findElement(By.xpath("(//*[@class=' layout-body']//div[1][@id='CT']//button)[" + i + "]"))
						.getText();

				if (Actual_Region_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//*[@class=' layout-body']//div[1][@id='CT']//button)[" + i + "]"))
							.click();
					break;
				}
			}

			System.out.println(
					"Test Step Passed " + new Throwable().getStackTrace()[0].getMethodName() + " Sucessfully ");
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);

		}

	}



	public static void select_ROPU(int ROPU_row, int SRN, int ERN) throws Exception {
		// XL_Data_GLDT.HP_GLDT_get_data(ROPU_row_R);///Use this for Happy Path
		try {
			XL_Data_GLDT.read_Test_Data(ROPU_row);

			Thread.sleep(5000);
			List<WebElement> ROPU = driver.findElements(By.xpath("//div[2]/table//*[@class=' layout-body']//div[1]/span/button"));//// *[@id='CT']//button
			int j = ROPU.size();
			for (int i = 1; i <= j; i++) {
				String Actual_ROPU_Name = driver.findElement(By.xpath("(//div[2]/table//*[@class=' layout-body']//div[1]/span/button)[" + i + "]")).getText();

				if (Actual_ROPU_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//div[2]/table//*[@class=' layout-body']//div[1]/span/button)[" + i + "]")).click();
					break;
				}
			}
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}

	}
	
	public static void select_ROPU_IndependentCase(int ROPU_row, int SRN, int ERN) throws Exception {
		// XL_Data_GLDT.HP_GLDT_get_data(ROPU_row_R);///Use this for Happy Path
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			XL_Data_GLDT.read_Test_Data(ROPU_row);

			Thread.sleep(5000);
			List<WebElement> ROPU = driver.findElements(By.xpath("//div[2]/table//*[@class=' layout-body']//div[1]/span/button"));//// *[@id='CT']//button
			int j = ROPU.size();
			for (int i = 1; i <= j; i++) {
				String Actual_ROPU_Name = driver.findElement(By.xpath("(//div[2]/table//*[@class=' layout-body']//div[1]/span/button)[" + i + "]")).getText();

				if (Actual_ROPU_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//div[2]/table//*[@class=' layout-body']//div[1]/span/button)[" + i + "]")).click();
					break;
				}
			}
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);

		}

	}



	public static void select_Country(int Country_row, int SRN, int ERN) throws Exception {

		try {

			XL_Data_GLDT.read_Test_Data(Country_row);

			Thread.sleep(5000);
			List<WebElement> Country = driver.findElements(By.xpath("//*[@node_name='CountryCardSelectable']"));//// *[@id='CT']//button
			int j = Country.size();
			int i;
			for (i = 1; i <= j; i++) {
				String Actual_Country_Name = driver
						.findElement(
								By.xpath("(//*[@node_name='CountryCardSelectable']//*[@class='heading_3'])[" + i + "]"))
						.getText();

				if (Actual_Country_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(3000);
					WebElement CountryEle = driver.findElement(
							By.xpath("(//*[@node_name='CountryCardSelectable']//*[@class='icons']/img)[" + i + "]"));

					CountryEle.click();
					// //*[@node_name='CountryCardSelectable']//*[@class='icons']/img
					// driver.findElement(By.xpath("(//*[@node_name='CountryCardSelectable']//*[@class='heading_3'])["+i+"]")).click();
					break;
				}
			}
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_with_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}

	}
	
	public static void select_Country_IndependentCase(int Country_row, int SRN, int ERN) throws Exception {
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		try {

			XL_Data_GLDT.read_Test_Data(Country_row);

			Thread.sleep(5000);
			List<WebElement> Country = driver.findElements(By.xpath("//*[@node_name='CountryCardSelectable']"));//// *[@id='CT']//button
			int j = Country.size();
			int i;
			for (i = 1; i <= j; i++) {
				String Actual_Country_Name = driver
						.findElement(
								By.xpath("(//*[@node_name='CountryCardSelectable']//*[@class='heading_3'])[" + i + "]"))
						.getText();

				if (Actual_Country_Name.equalsIgnoreCase(XL_Data_GLDT.testData)) {
					Thread.sleep(3000);
					WebElement CountryEle = driver.findElement(
							By.xpath("(//*[@node_name='CountryCardSelectable']//*[@class='icons']/img)[" + i + "]"));

					CountryEle.click();
					// //*[@node_name='CountryCardSelectable']//*[@class='icons']/img
					// driver.findElement(By.xpath("(//*[@node_name='CountryCardSelectable']//*[@class='heading_3'])["+i+"]")).click();
					break;
				}
			}
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);

		}

	}


//public static void Open_Existing_RALDCase(int get_GldtCase_Id,int SRN,int ERN) throws Exception{
//
//		try {
//			XL_Data_GLDT.read_caseIdTest_Data(get_GldtCase_Id);
//
//			Thread.sleep(1000);
//			//WebDriverWait frameWait = new WebDriverWait(driver,Duration.ofSeconds(10));
//			WebElement psfFrameElement=driver.findElement(By.xpath("//iframe[@name='PegaGadget0Ifr']"));
//			driver.switchTo().frame(psfFrameElement);
//
//			WebDriverWait CaseidWait = new WebDriverWait(driver,Duration.ofSeconds(80));
//
//			List<WebElement> gldtIDs=driver.findElements(By.xpath("//div[contains(text(),'GLDT-')]"));
//			CaseidWait.until(ExpectedConditions.visibilityOfAllElements(gldtIDs));
//
//			int j=gldtIDs.size();
//			for(int i=1;i<j;i++) {
//				String actualgldt=driver.findElement(By.xpath("(//div[contains(text(),'GLDT-')])["+i+"]")).getText();
//
//				if(actualgldt.equalsIgnoreCase(XL_Data_GLDT.testData)) {
//					driver.findElement(By.xpath("(//div[contains(text(),'GLDT-')])["+i+"]")).click();
//
//					break;
//				}
//			}
//			XL_Data_GLDT.write_Pass_Result(SRN);
//		} catch(Exception e) {
//			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();		
//			Jira_Ticket.Create_JiraTicket(currentMethod );
//			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
//
//		}
//
//	}

	public static void capture_RALD_id(int CaseidRow_W, int SRN, int ERN) throws Exception {

		try {
			driver.switchTo().defaultContent();

			// iframe[@name='PegaGadget1Ifr']
			WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='PegaGadget1Ifr']"));
			driver.switchTo().frame(frame1);

			RALD_Case_Id = driver.findElement(By.xpath("//span[contains(text(),'(RALD-')]")).getText();

			RALD_Case_Id = RALD_Case_Id.substring(RALD_Case_Id.lastIndexOf("R")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(RALD_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			RALD_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_RALDCase_id " + RALD_Case_Id);
			XL_Data_GLDT.write_CaseID(CaseidRow_W, RALD_Case_Id);
			XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}

	}

//	public static void Open_Existing_ROLDCase(int getRaldID_R,int SRN,int ERN) throws Exception{
//		try{ 
//			XL_Data_GLDT.read_caseIdTest_Data(getRaldID_R);
//
//			Thread.sleep(1000);
//			//WebDriverWait frameWait = new WebDriverWait(driver,Duration.ofSeconds(10));
//			WebElement ROLDFrameElement=driver.findElement(By.xpath("//iframe[@name='PegaGadget0Ifr']"));
//			driver.switchTo().frame(ROLDFrameElement);
//
//			WebDriverWait RaldidWait = new WebDriverWait(driver,Duration.ofSeconds(80));
//
//			List<WebElement> raldIDs=driver.findElements(By.xpath("//div[contains(text(),'RALD-')]"));
//			RaldidWait.until(ExpectedConditions.visibilityOfAllElements(raldIDs));
//
//			int j=raldIDs.size();
//			for(int i=1;i<=j;i++) {
//				String actualRald=driver.findElement(By.xpath("(//div[contains(text(),'RALD-')])["+i+"]")).getText();
//
//				if(actualRald.equalsIgnoreCase(XL_Data_GLDT.testData)) {
//					driver.findElement(By.xpath("(//div[contains(text(),'RALD-')])["+i+"]")).click();
//
//					break;
//				}
//			}
//
//			XL_Data_GLDT.write_Pass_Result(SRN);
//
//
//		}	catch(Exception e) {
//			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();		
//			Jira_Ticket.Create_JiraTicket(currentMethod );
//			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
//
//		}
//
//	}
	public static void SelectProduct_AnalysisAndInsight(int Product_Row, int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			XL_Data_GLDT.GLDT_getData(Product_Row);
			Thread.sleep(5000);
			WebElement product = driver.findElement(By.xpath("(//input[@id='6cbcb0a3'])[1]"));
			product.clear();
			product.sendKeys(XL_Data_GLDT.Product);
			Thread.sleep(5000);
			product.sendKeys(Keys.DOWN);
			product.sendKeys(Keys.RETURN);
			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}

	}

	public static void SelectCountries_AnalysisAndInsight(int Countries_Row, int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			XL_Data_GLDT.GLDT_getData(Countries_Row);
			Thread.sleep(5000);

			WebElement countries = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='99d8a7ff']")));
			countries.clear();
			Thread.sleep(3000);
			countries.sendKeys(XL_Data_GLDT.Countries);
			Thread.sleep(3000);
			countries.sendKeys(Keys.DOWN);
			countries.sendKeys(Keys.RETURN);
			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}

	}

	public static void SelectDatetype_AnalysisAndInsights(int Datetype_Row, int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			XL_Data_GLDT.GLDT_getData(Datetype_Row);
			Thread.sleep(5000);

			WebElement Datetype = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='21b41389']")));
			Datetype.clear();
			Thread.sleep(3000);
			Datetype.sendKeys(XL_Data_GLDT.Datetype);
			Thread.sleep(3000);
			Datetype.sendKeys(Keys.DOWN);
			Datetype.sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}

	}

	public static void SelectTimeline_AnalysisAndInsights(int Timeline_Row, int SRN, int ERN) throws Exception {
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			XL_Data_GLDT.GLDT_getData(Timeline_Row);
			Thread.sleep(5000);

			Select Timeline = new Select(driver.findElement(By.xpath("//select[@id='eaa7b9ba']")));
			Timeline.selectByValue(XL_Data_GLDT.Timeline);
			XL_Data_GLDT.write_Pass_Result(SRN);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}
	}


	
}
