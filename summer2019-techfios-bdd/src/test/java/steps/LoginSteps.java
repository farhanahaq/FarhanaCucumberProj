package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;


public class LoginSteps {
	
	WebDriver driver;
	String username = "";
	String password = "";
	
	@Given("^a valid user$")
	public void a_valid_user() {
		username = "techfiosdemo@gmail.com";
		password = "abc123";
		
	}

	@When("^user goes to techfios site$")
	public void user_goes_to_techfios_site () {
		
		driver = BrowserFactory.init();
		  
	}

	@Then("^techfios site should display$")
	public void techfios_site_should_display()  {
		String expectedTtile = "Login - TechFios Test Application - Billing";
		//String expectedTtile = "TechFios Test Application - Billing"; //failing it 
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals("Title is wrong", expectedTtile, actualTitle);
		System.out.println(actualTitle);
	   
	}

	@When("^users logs in with valid credentials$")
	public void users_logs_in_with_valid_credentials()  {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSubmitButton();
	}

	@Then("^Dashboard page should be displayed$")
	public void dashboard_page_should_be_displayed()  {
	    DashBoardPage dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);
		dashboardpage.chkDashBoardTabVisible();
	}

	@Then("^username should match$")
	public void username_should_match()  {

	}

	
	
	

}
