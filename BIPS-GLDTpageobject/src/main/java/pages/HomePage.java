package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import actiondriver.Action;
import baseclass.BaseClass;

public class HomePage extends BaseClass {
	Action action = new Action();
	GLDTPage page = new GLDTPage();

	@FindBy(xpath = "//iframe[@id='PegaGadget1Ifr']")
	WebElement frame1;

	@FindBy(xpath = "//iframe[@id='PegaGadget2Ifr']")
	WebElement frame2;

	@FindBy(xpath = "//iframe[@src='about:blank']")
	WebElement FrameSRC;

	@FindBy(xpath = "(//*[@class='layout-group-item-title'])[2]")
	WebElement InitiateProcesssection;

	@FindBy(xpath = "//div[6]//span/button[contains(text(),'GLDT - Global Launch Date Tracker')]")
	WebElement Gldt;

	@FindBy(xpath = "//div[contains(text(),'GLDT-')]")
	List<WebElement> gldtIDs;

	@FindBy(xpath = "//a[@title='Click here to open the object']")
	List<WebElement> gldtIDs_TAMA;

	@FindBy(xpath = "//div[contains(text(),'RALD-')]")
	List<WebElement> raldIDs;

	@FindBy(name = "CaseManagerPortalHeader_pyDisplayHarness_8")
	WebElement profileImg;

	@FindBy(xpath = "//button[@name='BIPTQuickAccessCol2_pyDisplayHarness.pxUserDashboard.pySlots(1).pyWidgets(1).pyWidget_52']")
	WebElement gldt;

	@FindBy(xpath = "(//*[@class='layout-group-item-title'])[3]")
	WebElement AnalysisAndInsights;

	@FindBy(xpath = "//span[text()='Log off']")
	WebElement logOff;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	static SoftAssert softAssert = new SoftAssert();

	public void clickonInitiateProcess() throws Exception {

		try {

			action.switchToFrame(driver, FrameSRC);
			action.click(driver, InitiateProcesssection);
			boolean gldtPresence = action.isDisplayed(driver, Gldt);
			softAssert.assertTrue(gldtPresence);
			System.out.println("GLDT module Assert check" + gldtPresence);
			softAssert.assertAll();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

		catch (AssertionError e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void clickGLdtModule() throws Exception {

		try {

			action.explicitWait(driver, Gldt);
			action.click(driver, Gldt);

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void AnalysisandInsights() throws Exception {

		try {
			action.switchToFrame(driver, FrameSRC);
			action.click(driver, AnalysisAndInsights);
			// Assert.assertTrue(gldt.isDisplayed());

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void openExistingGLDTWithoutLogOff() throws Exception {

		try {

			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			action.switchToFrame(driver, frame2);
			Thread.sleep(3000);
			int j = gldtIDs_TAMA.size();
			for (int i = 1; i < j; i++) {
				String actualgldt_TAMA = driver
						.findElement(By.xpath("(//a[@title='Click here to open the object'])[" + i + "]")).getText();

				if (actualgldt_TAMA.equalsIgnoreCase(GLDTPage.GLDT_Case_Id)) {
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//a[@title='Click here to open the object'])[" + i + "]")).click();

					break;
				}
			}

			System.out.println(
					"Test Step Passed " + new Throwable().getStackTrace()[0].getMethodName() + " Sucessfully ");

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void tempProdCheckAssignmentsSection() throws Exception {

		try {

			driver.switchTo().defaultContent();
			action.switchToFrame(driver, frame1);
			WebElement assignmentsElement = driver.findElement(By.xpath("(//h2[@class='header-title'])[2]"));
			String assignmentText = assignmentsElement.getText();

			Assert.assertEquals(assignmentText, "Assignments");
			System.out.println("Assignments section verified");

			Thread.sleep(3000);

			WebElement tempProdName = driver.findElement(
					By.xpath("//tbody/tr[@id='$PD_ShowSelectedCountry$ppxResults$l1']/td[4]/div[1]/div[1]/span[1]"));
			String tempProdText = tempProdName.getText();
			if (tempProdText.equalsIgnoreCase(GLDTPage.tempproduct)) {
				System.out.println("Temporary Product has been verified at the Assignments section");

			}
//			boolean tempProductCheck = tempProdText.equalsIgnoreCase(GLDTPage.tempproduct);
//			Assert.assertTrue( tempProductCheck);
//		
//			System.out.println("Temporary Product has been verified at the Assignments section");

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

	public void Open_Existing_RALDCase() throws Exception {
		try {
			action.switchToFrame(driver, FrameSRC);
			action.explicitWait0(driver, gldtIDs);
			int j = gldtIDs.size();
			for (int i = 1; i <= j; i++) {
				String actualgldt = driver.findElement(By.xpath("(//div[contains(text(),'GLDT-')])[" + i + "]"))
						.getText();

				if (actualgldt.equalsIgnoreCase(GLDTPage.GLDT_Case_Id)) {
					WebElement openCaseID = driver.findElement(By.xpath("(//div[contains(text(),'GLDT-')])"));
					openCaseID.click();

					break;
				}
			}

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}
	}

	public void Open_Existing_ROLDCase() throws Exception {
		try {
			action.switchToFrame(driver, FrameSRC);
			action.explicitWait0(driver, raldIDs);
			int j = raldIDs.size();
			for (int i = 1; i <= j; i++) {
				String actualgldt = driver.findElement(By.xpath("(//div[contains(text(),'RALD-')])[" + i + "]"))
						.getText();

				if (actualgldt.equalsIgnoreCase(RALDPage.RALD_Case_Id)) {
					WebElement openCaseID = driver.findElement(By.xpath("(//div[contains(text(),'RALD-')])"));
					openCaseID.click();

					break;
				}
			}

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}
	}

	public void logout() throws Exception {
		try {

			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			action.explicitWait(driver, profileImg);
			action.click(driver, profileImg);
			action.click(driver, logOff);
			String loginPageTitle = driver.getTitle();
			boolean loginPageTitleCheck = loginPageTitle.contains("Login Page");
			Assert.assertTrue(loginPageTitleCheck);
			System.out.println("Page Title Status" + " " + loginPageTitleCheck);
			System.out.println("Log out Verified with Assert");

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}

	}

}
