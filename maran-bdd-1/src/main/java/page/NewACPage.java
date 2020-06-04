package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class NewACPage extends BasePage{
	WebDriver driver;
	public NewACPage(WebDriver driver) {
		this.driver = driver;
	}
	
	String newTitle;
	
	// Element Library
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add New Account')]")
	WebElement NewAccountsPageTitle;
	@FindBy(how = How.ID, using = "account")
	WebElement AccountTitleField;
	@FindBy(how = How.ID, using = "description")
	WebElement DescriptionField;
	@FindBy(how = How.ID, using = "balance")
	WebElement InitialBalanceField;
	@FindBy(how = How.XPATH, using = "//label[text()='Initial Balance']/../following-sibling::button")
	WebElement SubmitButton;
	
	public void fillInTheNewAccountForm(String accountTitle, String description, String balance) throws InterruptedException {
		Random rnd = new Random();
		newTitle = accountTitle + rnd.nextInt(999);
		
		AccountTitleField.sendKeys(newTitle);
		DescriptionField.sendKeys(description);
		InitialBalanceField.sendKeys(balance);
		Thread.sleep(2000);
		SubmitButton.click();
		Thread.sleep(5000);
	}

	String before_xpath = "//tbody/tr[";
	String after_xpath = "]/td[1]";
	
	public void checkNewACDisplayed() throws InterruptedException {
				
			//for loop that will check if name was entered as expected and 
			for(int i = 2; i <= 10; i++) {
				//Thread.sleep(2000);
				String actualTitle = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
				Thread.sleep(2000);
				//if else is checking if contact added then view it and delete it
				if (actualTitle.contains(newTitle)) {
					System.out.println("Expected name = " + newTitle + " and" + " Entered name = " + actualTitle);
					i=11;
				}
				
			}
		
	
	}
	
	public void waitForNewACPage() {
		waitForElement(NewAccountsPageTitle, driver);	
		Assert.assertEquals(NewAccountsPageTitle.getText(), "Add New Account", "New AC Page NOT found!");
	}

}


