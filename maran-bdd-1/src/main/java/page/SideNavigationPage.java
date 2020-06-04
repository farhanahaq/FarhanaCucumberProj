package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideNavigationPage extends BasePage{
	WebDriver driver;
	
	public SideNavigationPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement BankNCashButton;	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement NewACButton;
	@FindBy(how = How.XPATH, using = "//a[contains (text(), 'List Accounts')]")
	WebElement ListAccountButton;
	
	
		public void goToNewACPage() {
		waitForElement(BankNCashButton, driver);
		BankNCashButton.click();
		waitForElement(NewACButton, driver);
		NewACButton.click();
		}
		
		public void goToListAccountPage() {
			ListAccountButton.click();
		
	}
	
	
	
}
