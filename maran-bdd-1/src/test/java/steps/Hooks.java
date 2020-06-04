package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.Before;
import cucumber.api.java.After;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import page.DashBoardPage;
import page.LoginPage;
import page.NewACPage;
import page.SideNavigationPage;
import util.BrowserFactory;

public class Hooks {


	WebDriver driver;

	
	LoginPage loginPage;
	DashBoardPage dashboardPage;
	NewACPage newACPage;
	SideNavigationPage sideNavigationPage;
	
	
	//@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
		sideNavigationPage = PageFactory.initElements(driver, SideNavigationPage.class);
		newACPage = PageFactory.initElements(driver, NewACPage.class);}
	
//	@After
//	public void afterRunMethod() {
//		BrowserFactory.tearDown();
//	}

}
