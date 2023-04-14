package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Action;
import baseclass.BaseClass;


public class Jira_loginPage extends BaseClass {
	
	
		
	@FindBy(xpath="//*[@id='username']")
	WebElement Usernamejira;
	
	@FindBy(xpath="//*[@id=\"login-submit\"]")
	WebElement Loginbutton;
	
	@FindBy(name="password")
	WebElement password;
	
	public Jira_loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void logintojira(String uname ,String pswd) throws Exception {
		Action action= new Action();
		//XL_Data_GLDT.read_URL_Data(2);
		Thread.sleep(5000);
		driver.get("https://id.atlassian.com/login?continue=https%3A%2F%2F1abc12345.atlassian.net%2Flogin%3FredirectCount%3D1%26dest-url%3D%252Fjira%252Fsoftware%252Fc%252Fprojects%252FP1%252Fissues%26application%3Djira&application=jira");
		driver.manage().window().maximize();
		action.explicitWait1(driver,Usernamejira);
		action.type(Usernamejira, uname);
		action.click(driver, Loginbutton);
		action.explicitWait1(driver,password );
		action.type(password, pswd);
		action.click(driver, Loginbutton);
		System.out.println("Test Step Passed "+new Throwable().getStackTrace()[0].getMethodName()+" Sucessfully ");
		
		
		
	}
	
}
	 