package gldt;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.testng.reporters.jq.Main;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class GLDT_Login {
	static String userId;
	static String password;

	 static WebDriver driver=null;
	 static loginPage login;
	

	public static String xlfilepath = "C:\\Users\\KC0162\\eclipse-workspace\\BIPS\\Data\\GLDT_TestCases.xlsx";
	
	
	//public static String xlfilepath = "C:\\Users\\DC0121\\eclipse-workspace-new\\BIPS\\Data\\GLDT_TestCases.xlsx";
	static String projectPath = System.getProperty("user.dir"); // Used for current project dire(Used for browser )
	
	@Given("User is logged in as TamaManager")
	public static void Kanchan_TAMAManager_Login() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KC0162\\eclipse-workspace\\BIPS-Cucumber\\src\\test\\resources\\Drivers\\chromedriver.exe");
	     driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	    
	     XL_Data_GLDT.read_URL_Data(1);
	     driver.manage().window().maximize();
		 driver.get(XL_Data_GLDT.testData);
	    login = new loginPage(driver);
        XL_Data_GLDT.get_user_credential(39);
		//bips_APP_Login();
        
        login.bips_APP_Login(XL_Data_GLDT.userId, XL_Data_GLDT.password);
        //driver.findElement(By.name("UserIdentifier")).sendKeys(XL_Data_GLDT.userId);
		//driver.findElement(By.name("Password")).sendKeys(XL_Data_GLDT.password);
		System.out.println("Test Step Passed "+new Throwable().getStackTrace()[0].getMethodName()+" Sucessfully ");
	}


	@Given("User is in login page")
	public static void initiate_Chromedriver_Open_URL() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KC0162\\eclipse-workspace\\BIPS-Cucumber\\src\\test\\resources\\Drivers\\chromedriver.exe");
	     driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	    
	     XL_Data_GLDT.read_URL_Data(1);
	     driver.manage().window().maximize();
		 driver.get(XL_Data_GLDT.testData);
	}
	




//
//	@And("User clicks on login")
//	public static void bips_APP_Login() throws Exception {
//		try {
////			driver.findElement(By.name("UserIdentifier")).sendKeys(XL_Data_GLDT.userId);
////			driver.findElement(By.name("Password")).sendKeys(XL_Data_GLDT.password);
//			
//			driver.findElement(By.id("sub")).click();
//		} catch (Exception e) {
//			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
//			Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod);
//
//		}
//	}



	
	@Then("Login is succesfull")
	public void login_is_succesfull() {
	    System.out.println("Successfull");
	}



	public static void Kanchan_ROPU_Login() throws Exception {
		try {
		//initiate_Chromedriver_Open_URL();
		XL_Data_GLDT.get_user_credential(45);
		//bips_APP_Login();		
		System.out.println("Test Step Passed "+new Throwable().getStackTrace()[0].getMethodName()+" Sucessfully ");
		}
		catch(Exception e) {
			//			String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			//			Jira_Ticket.Create_JiraTicket(currentMethod );

		}
	}


	public static void quitBrowser() {
		driver.quit();

	}
	
	public static void jira_Login() throws Exception {
		try{
			GLDT_Login.read_User_Credential_From_XL(1);
		GLDT_Login.jira_APP_Login();
		System.out.println("Test Step Passed "+new Throwable().getStackTrace()[0].getMethodName()+" Sucessfully ");
		}
		catch(Exception e) {
			//String currentMethod = new Throwable().getStackTrace()[0].getMethodName();
			//Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod );		
			}
	}
	
	public static void jira_APP_Login() throws Exception {
		try {
			XL_Data_GLDT.read_URL_Data(2);
	        Thread.sleep(5000);
			driver.get(XL_Data_GLDT.testData);
			//String baseUrl = "https://id.atlassian.com/login?continue=https%3A%2F%2F1abc12345.atlassian.net%2Flogin%3FredirectCount%3D1%26dest-url%3D%252Fjira%252Fsoftware%252Fc%252Fprojects%252FP1%252Fissues%26application%3Djira&application=jira";
			driver.manage().window().maximize(); 

			new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='username']")));
			driver.findElement(By.xpath("//*[@id='username']")).sendKeys(userId);
			driver.findElement(By.xpath("//*[@id=\'login-submit\']/span/span")).click();
			new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.name("password")));
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.id("login-submit")).click();	
			System.out.println("Test Step Passed "+new Throwable().getStackTrace()[0].getMethodName()+" Sucessfully ");
			
		}
		catch(Exception e) {
			//String currentMethod = new Throwable().getStackTrace()[0].getMethodName();		
			//Jira_Ticket.Create_JiraTicket_without_Quit(currentMethod );
		}
	}

	public static void read_User_Credential_From_XL(int Row_Number) throws Exception {
		try {
			FileInputStream fStream = new FileInputStream(new String(GLDT_Login.xlfilepath));
			// Enter the path to your excel here
			// Create workbook instance referencing the file created above
			XSSFWorkbook workbook = new XSSFWorkbook(fStream);
			// Get your first or desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet Based on index([0,1,...]
			// XSSFSheet sheet = workbook.getSheet("Master_Test_Data"); //Based on sheet
			XSSFRow row1 = sheet.getRow(Row_Number);
			XSSFCell cell1 = row1.getCell(2);
			// XSSFRow row2 = sheet.getRow(Row_Number);
			XSSFCell cell2 = row1.getCell(3);
			userId = cell1.toString();
			password = cell2.toString();
			fStream.close();
			workbook.close();
			System.out.println(
					"Test Step Passed " + new Throwable().getStackTrace()[0].getMethodName() + " Sucessfully ");

		} catch (Exception e) {
			// Block of code to handle errors
		}
	}
	
	@Then("Click on Logout")
	public static void click_on_logOff() throws Exception {

		Thread.sleep(3500);
		
		login.click_on_logOff();

//		WebElement profileImg = driver.findElement(By.xpath("//button[contains(@class,'icons avatar name-s ')]"));
//		profileImg.click();
//
//		WebElement logOff = driver.findElement(By.xpath("//span[text()='Log off']"));
//		logOff.click();
//		Thread.sleep(1000);

	}

	

		
		}









