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

import org.testng.asserts.SoftAssert;

import actiondriver.Action;
import baseclass.BaseClass;

public class AnalysisAndInsights extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//iframe[@id='PegaGadget1Ifr']")
	WebElement frame1;

	@FindBy(xpath = "//button[contains(text(),'Reset filters')]")
	WebElement ResetFiltersButton;

	@FindBy(xpath = "//button[@name='BIPTQuickAccessCol2_pyDisplayHarness.pxUserDashboard.pySlots(1).pyWidgets(1).pyWidget_52']")
	WebElement gldt;

	public AnalysisAndInsights() {
		PageFactory.initElements(driver, this);
	}

	static SoftAssert softAssert = new SoftAssert();

	public void GlobalLaunchDateTracker() throws Exception {
		try {
			gldt.click();// GLDT - Global Launch Date Tracker

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}
	}

	public void ResetfiltersbuttonVisibility() throws Exception {
		try {
			driver.switchTo().defaultContent();
			action.switchToFrame(driver, frame1);
			Thread.sleep(5000);
			softAssert.assertTrue(ResetFiltersButton.isDisplayed());
			softAssert.assertAll();

		} catch (Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_ticketPage jira_ticketPage = new Jira_ticketPage();
			jira_ticketPage.Create_JiraTicket(currentMethod);

		}
	}

}
