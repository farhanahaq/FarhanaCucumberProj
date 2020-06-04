package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps {


	WebDriver driver;

	String username = "";
	String password = "";
	
	LoginPage loginPage;
	DashBoardPage dashboardPage;
	Hooks hooks;
	
	
	
	//@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
//		Hooks hooks = PageFactory.initElements(driver, Hooks.class);
//		hooks.beforeRun();		
		
}

	@Given("^a valid user$")
	public void a_valid_user() {
		username = "demo@techfios.com";
		password = "abc123";
		  
	}

	@When("^user goes to Techfios Site$")
	public void user_goes_to_Techfios_Site()  {
				
	    
	}

	@Then("^Login Page should be displayed$")
	public void login_Page_should_be_displayed()  {
//		Hooks hooks = PageFactory.initElements(driver, Hooks.class);
//		hooks.beforeRun();
		String expected_title = "Login - iBilling";
		String actual_title = loginPage.getPageTitle();
		Assert.assertEquals(actual_title, expected_title, "Wrong Page!!");

	}

	@When("^user logs in with valid credentials$")
	public void user_logs_in_with_valid_credentials()  {
		//loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.clickSubmitButton();
		
	    
	}
	
	@When("^user logs in with valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logs_in_with_valid_and(String username, String password) {
		//loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.clickSubmitButton();
	    
	}

	@Then("^Dashboard page should display$")
	public void dashboard_page_should_display() throws Exception  {
		//dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashboardPage.chkDashBoardTabVisible();
		TestBase.screenShot(driver, "C:\\Users\\14693\\Desktop\\QAAutomationTraining2020\\Selenium\\ScreenShot\\Src");
	}	
	
	//@After
	public void afterRun() {
		BrowserFactory.tearDown();
	}


}//end of class
