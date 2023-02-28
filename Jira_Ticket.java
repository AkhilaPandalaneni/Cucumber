package gldt;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bips_OtherMethods.ScreenCapture;
import gldt.GLDT_Login;

public class Jira_Ticket {

	public static String Jira_Id;
	static WebDriver driver = GLDT_Login.driver;
	static WebDriverWait wait ;

	public static void Create_JiraTicket_without_Quit(String currentMethod) throws Exception {
		driver=GLDT_Login.driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		ScreenCapture.main(null);
		Thread.sleep(2000);
		GLDT_Login.jira_Login();	
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'createGlobalItem\']/span")));
		String ParentWindow = driver.getWindowHandle(); //switching from parent to pop up window
		driver.findElement(By.xpath("//*[@id=\'createGlobalItem\']/span")).click();
		for (String Child_Window : driver.getWindowHandles()) { 
			driver.switchTo().window(Child_Window);
			 wait = new WebDriverWait(driver, Duration.ofSeconds(30));// Wait 30 seconds
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Create issue')]")));
			driver.findElement(By.xpath("//input[@id='summary-field']")).sendKeys(Keys.TAB);
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("v");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			Thread.sleep(5000); //stop the thread for 5 second
			WebElement summary = driver.findElement(By.xpath("//input[@id='summary-field']"));
			summary.click();
			summary.sendKeys(currentMethod);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'View issue')]")));
			driver.findElement(By.xpath("//span[contains(text(),'View issue')]")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"jira-issue-header\"]/div/div/div/nav/ol/div[2]/li/a/span")));
			WebElement Jira_Text = driver.findElement(By.xpath("//*[@id=\"jira-issue-header\"]/div/div/div/nav/ol/div[2]/li/a/span"));
			Jira_Id = Jira_Text.getText();
			System.out.println(Jira_Id);
			Thread.sleep(3500);
			XL_Data_GLDT.read_URL_Data(1);
			driver.manage().window().maximize();
			driver.get(XL_Data_GLDT.testData);
			driver.switchTo().defaultContent();
		    driver.switchTo().frame("PegaGadget1Ifr");
		    Thread.sleep(2000);
	  		WebElement close = driver.findElement(By.xpath("//button[contains(text(),'Close')]"));
	  		if(close.isDisplayed()) 
	  		close.click();
	  		Thread.sleep(3500);
	  		WebElement profileImg =driver.findElement(By.xpath("//button[contains(@class,'icons avatar name-')]"));
	  		profileImg.click();
	  		WebElement logOff =driver.findElement(By.xpath("//span[text()='Log off']"));
	  		logOff.click();
	  		

			//Thread.sleep(2000);
			//String baseUrl = "https://biphrm-biplah-stg1.pegacloud.io/prweb/app/default/c5mb0Z99oLKgPL-hk4L4rty7OLzbbezr*/!STANDARD";
		    driver.manage().window().maximize();
			driver.get(XL_Data_GLDT.testData);
		}		
//		driver.manage().deleteAllCookies();
//		try {
//			
//			Thread.sleep(15000); // wait 15 seconds to clear cookies.
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}	
		//driver.quit();
	}
	
	public static void Create_JiraTicket_with_Quit(String currentMethod) throws Exception {
		ScreenCapture.main(null);
		Thread.sleep(2000);
		GLDT_Login.jira_Login();	
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'createGlobalItem\']/span")));
		String ParentWindow = driver.getWindowHandle(); //switching from parent to pop up window
		driver.findElement(By.xpath("//*[@id=\'createGlobalItem\']/span")).click();
		for (String Child_Window : driver.getWindowHandles()) { 
			driver.switchTo().window(Child_Window);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));// Wait 30 seconds
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Create issue')]")));
			driver.findElement(By.xpath("//input[@id='summary-field']")).sendKeys(Keys.TAB);
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("v");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			Thread.sleep(5000); //stop the thread for 5 second
			WebElement summary = driver.findElement(By.xpath("//input[@id='summary-field']"));
			summary.click();
			summary.sendKeys(currentMethod);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'View issue')]")));
			driver.findElement(By.xpath("//span[contains(text(),'View issue')]")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"jira-issue-header\"]/div/div/div/nav/ol/div[2]/li/a/span")));
			WebElement Jira_Text = driver.findElement(By.xpath("//*[@id=\"jira-issue-header\"]/div/div/div/nav/ol/div[2]/li/a/span"));
			Jira_Id = Jira_Text.getText();
			System.out.println(Jira_Id);
		}		
		driver.manage().deleteAllCookies();
		try {

			Thread.sleep(15000); // wait 15 seconds to clear cookies.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		driver.quit();
	}
}