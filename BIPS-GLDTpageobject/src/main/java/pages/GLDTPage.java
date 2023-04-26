package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import actiondriver.Action;
import baseclass.BaseClass;

public class GLDTPage extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//iframe[@id='PegaGadget1Ifr']")
	WebElement frame1;

	@FindBy(xpath = "//span[@class='workarea_header_id']")
	WebElement headerid;

	@FindBy(xpath = "//span[contains(text(),'(GLDT-')]")
	WebElement Expected;

	@FindBy(xpath = "//input[@name='$PpyWorkPage$pProductName'][@id='414e17ce']")
	WebElement selectproduct;

	@FindBy(xpath = "//input[@id='158b841d']")
	WebElement reason;

	@FindBy(xpath = "//*[@class=' layout-body']//div[1][@id='CT']//button")
	List<WebElement> Region;

	@FindBy(xpath = "//div[2]/table//*[@class=' layout-body']//div[1]/span/button")
	List<WebElement> ROPU;

	@FindBy(xpath = "//*[@node_name='CountryCardSelectable']")
	List<WebElement> Country;

	@FindBy(xpath = "//button[@title='Initiate RA Process']")
	WebElement Initiateprocessbutton;

	@FindBy(xpath = "//label[contains(text(),'Please confirm if the correct list of countries ha')]")
	WebElement selectedCountryList_popUp;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement Continuebutton;

	@FindBy(xpath = "//input[@id='e2457cfb']")
	WebElement productUndefinedCheckBox;

	@FindBy(xpath = "//input[@class='anypicker-input']")
	WebElement tempProdName_Dropdown;

	@FindBy(id = "anypicker-input")
	WebElement tempProdSearchTextBox;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	WebElement close;

	@FindBy(xpath = "//span[@class='anypicker-token-content']")
	WebElement tempProdValue;

	public GLDTPage() {
		PageFactory.initElements(driver, this);
	}

	public static String GLDT_Case_Id;
	public static String tempproduct;

	public void capture_GLDTCase_id1() throws Exception {

		try {
			action.switchToDefaultFrame(driver);
			Thread.sleep(5000);
			driver.switchTo().frame(1);
			GLDT_Case_Id = headerid.getText();
			System.out.println("Actualgldtid:" + GLDT_Case_Id);
			String ExpectedgldId = Expected.getText();
			System.out.println("expectedGldtId:" + ExpectedgldId);
			Assert.assertEquals(GLDT_Case_Id, ExpectedgldId);
			System.out.println("GLDT id is Captured");
			GLDT_Case_Id = GLDT_Case_Id.substring(GLDT_Case_Id.lastIndexOf("G")); // Removal of text from left side
			StringBuffer sb = new StringBuffer(GLDT_Case_Id);
			sb.deleteCharAt(sb.length() - 1); // Removal of text from right side
			GLDT_Case_Id = sb.toString();
			System.out.println("Test Step Passed_Capture_GLDTCase_id " + GLDT_Case_Id);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void selectionOfProduct(String product) throws Exception {
		try {
//			driver.switchTo().defaultContent();
//			Thread.sleep(5000);
//			action.switchToFrame(driver, frame1);
			action.type(selectproduct, product);
			Thread.sleep(7000);
			action.type1(selectproduct);
			String selectproductValue = selectproduct.getAttribute("value");
			System.out.println(selectproductValue);
			Assert.assertEquals(selectproductValue, product);
			System.out.println("The selected product has been verified");

		} catch (Exception | AssertionError e) {
			System.out.println("Assertion error:" + e);
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void selectionOftempProduct1(String tempproduct) throws Exception {
		try {
			Thread.sleep(5000);
			action.click(driver, productUndefinedCheckBox);
			Thread.sleep(3000);
			action.click(driver, tempProdName_Dropdown);
			Thread.sleep(3000);
			action.type(tempProdSearchTextBox, tempproduct);
			action.type1(tempProdSearchTextBox);
			Thread.sleep(5000);
			System.out.println("The matched results are displayed based on search criteria");
//	        String tempProdValueText=tempProdValue.getText();
//	        Assert.assertEquals(tempProdValueText,tempproduct );
//	        System.out.println("The selected Temp Product has been verified"+  ""+ tempProdValueText);

		} catch (Exception | AssertionError e) {
			System.out.println("Assertion error:" + e);
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void selectionOfReason(String Reason1) throws Exception {
		try {
			action.explicitWait1(driver, reason);
			Thread.sleep(2000);
			action.type(reason, Reason1);
			String reasonEnteredCheck = reason.getAttribute("value");
			Assert.assertEquals(reasonEnteredCheck, Reason1);
			System.out.println("The entered reason has been verified Using Assert");
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
		}

	}

	public void selectionofRegion(String Region1) throws Exception {
		try {
			Thread.sleep(5000);
			int j = Region.size();
			for (int i = 1; i < j; i++) {
				String Actual_Region_Name = driver
						.findElement(By.xpath("(//*[@class=' layout-body']//div[1][@id='CT']//button)[" + i + "]"))
						.getText();
				if (Actual_Region_Name.equalsIgnoreCase(Region1)) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//*[@class=' layout-body']//div[1][@id='CT']//button)[" + i + "]"))
							.click();
					break;
				}
			}
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
		}
	}

	public void selectionofRopu(String Ropu1) throws Exception {
		try {

			Thread.sleep(5000);
			int j = ROPU.size();
			for (int i = 1; i <= j; i++) {
				String Actual_ROPU_Name = driver
						.findElement(
								By.xpath("(//div[2]/table//*[@class=' layout-body']//div[1]/span/button)[" + i + "]"))
						.getText();
				if (Actual_ROPU_Name.equalsIgnoreCase(Ropu1)) {
					Thread.sleep(3000);
					driver.findElement(
							By.xpath("(//div[2]/table//*[@class=' layout-body']//div[1]/span/button)[" + i + "]"))
							.click();
					break;
				}
			}
			// XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			// XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	public void selectionofCountry(String Country1) throws Exception {
		try {

			Thread.sleep(4000);
			int j = Country.size();
			int i;
			for (i = 1; i <= j; i++) {
				String Actual_Country_Name = driver
						.findElement(
								By.xpath("(//*[@node_name='CountryCardSelectable']//*[@class='heading_3'])[" + i + "]"))
						.getText();

				if (Actual_Country_Name.equalsIgnoreCase(Country1)) {
					Thread.sleep(5000);
					WebElement CountryEle = driver.findElement(
							By.xpath("(//*[@node_name='CountryCardSelectable']//*[@class='icons']/img)[" + i + "]"));

					CountryEle.click();

					break;
				}
			}
			// XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			// XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	}

	public void clickOnInitiateprocessbutton() throws Exception {
		try {
			action.click(driver, Initiateprocessbutton);
			Thread.sleep(1000);
			boolean countryListPopUp_Check = selectedCountryList_popUp.isDisplayed();
			System.out.println("Country List pop up has been checked" + " " + countryListPopUp_Check);
			Assert.assertTrue(countryListPopUp_Check);
			// XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (AssertionError ae) {
			System.out.println("Assertion error:" + ae);
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			// XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			// XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}

	}

	public void ClickonContinue() throws Exception {
		try {
			action.isDisplayed(driver, selectedCountryList_popUp);

			String continueBtnText = Continuebutton.getText();
			Assert.assertEquals(continueBtnText, "Continue");
			action.click(driver, Continuebutton);
			System.out.println("Continue button checked");
			// XL_Data_GLDT.write_Pass_Result(SRN);
		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);
			// XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);

		}
	}

	public void Click_on_close() throws Exception {
		try {

			driver.switchTo().defaultContent();
			driver.switchTo().frame("PegaGadget1Ifr");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			WebElement close = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Close')]")));
			close.click();
//			driver.switchTo().defaultContent();
//			action.switchToFrame(driver, frame1);
//		    action.explicitWait(driver, close);
//		    close.click();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}
}