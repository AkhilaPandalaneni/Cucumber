package gldt;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class InitiateProcess_Page {
	
	
	static WebDriver driver = GLDT_Login.driver;
	public static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));


	
	
	public static void click_on_GLDT_Module(int SRN,int ERN) throws Exception {
		try {
		WebElement gldt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[6]//span/button[contains(text(),'GLDT - Global Launch Date Tracker')]/img")));
		gldt.click();//GLDT - Global Launch Date Tracker
		  XL_Data_GLDT.write_Pass_Result(SRN);
	}
		catch(Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result(SRN, ERN, currentMethod);
		}
	
	   
	
	
	
}
	
	public static void click_on_GLDT_Module_IndependentCase(int SRN,int ERN) throws Exception {
		driver=GLDT_Login.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
		WebElement gldt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[6]//span/button[contains(text(),'GLDT - Global Launch Date Tracker')]/img")));
		gldt.click();//GLDT - Global Launch Date Tracker
		  XL_Data_GLDT.write_Pass_Result(SRN);
	}
		catch(Exception e) {
			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
			XL_Data_GLDT.write_Fail_Result_IndependentCase(SRN, ERN, currentMethod);
		}
	
	   
	
	
	
}
	
	
}