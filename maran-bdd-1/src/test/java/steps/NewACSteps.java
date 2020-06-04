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
import page.NewACPage;
import page.SideNavigationPage;
import util.BrowserFactory;


public class NewACSteps {
	WebDriver driver;
	LoginPage loginPage;
	DashBoardPage dashboardPage;
	NewACPage newACPage;
	SideNavigationPage sideNavigationPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
		sideNavigationPage = PageFactory.initElements(driver, SideNavigationPage.class);
		newACPage = PageFactory.initElements(driver, NewACPage.class);
		
		
	}
	
	@Given("^a user already logged in as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void a_user_already_logged_in_as_and(String userName, String Password) throws Exception  {
		Thread.sleep(3000);
		String expected_title = "Login - iBilling";
		String actual_title = loginPage.getPageTitle();
		Assert.assertEquals(actual_title, expected_title, "Wrong Page!!");
		loginPage.enterUserName(userName);
		loginPage.enterPassword(Password);
		loginPage.clickSubmitButton();
		dashboardPage.chkDashBoardTabVisible();	
		TestBase.screenShot(driver, "C:\\Users\\14693\\Desktop\\QAAutomationTraining2020\\Selenium\\ScreenShot\\DashboardPage");
			
	}

	@When("^user navigate to Bank Cash -> New Account Page$")
	public void user_navigate_to_Bank_Cash_New_Account_Page()  {
		
		sideNavigationPage.goToNewACPage();

	}

	@Then("^New Accounts Page should display$")
	public void new_Accounts_Page_should_display() throws Exception  {
		
		newACPage.waitForNewACPage();
		TestBase.screenShot(driver, "C:\\Users\\14693\\Desktop\\QAAutomationTraining2020\\Selenium\\ScreenShot\\NewACPage");
		
	}

	@When("^user submits \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_submits_and(String title, String description, String balance) throws Exception  {

		newACPage.fillInTheNewAccountForm(title, description, balance);
		TestBase.screenShot(driver, "C:\\Users\\14693\\Desktop\\QAAutomationTraining2020\\Selenium\\ScreenShot\\AC_Created");
	}

	@Then("^Account created successfully message should display$")
	public void account_created_successfully_message_should_display() throws Exception  {
		sideNavigationPage.goToListAccountPage();
		newACPage.checkNewACDisplayed();
		TestBase.screenShot(driver, "C:\\Users\\14693\\Desktop\\QAAutomationTraining2020\\Selenium\\ScreenShot\\AC_Verified");
		}

	@After
	public void afterRun() {
		BrowserFactory.tearDown();
	}

}
