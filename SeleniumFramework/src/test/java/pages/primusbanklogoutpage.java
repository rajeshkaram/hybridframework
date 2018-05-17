package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.LogStatus;

import lib.Utility;


public class primusbanklogoutpage extends BaseClass{

	WebDriver driver;

	 public primusbanklogoutpage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	

	
	@FindBy(xpath="//*[@id='Table_02']/tbody/tr/td[3]/a/img") WebElement logout;
	
	
	public void logOutFromApplication()
	{
	
		Utility.waitForWebElement(driver, logout, 20).click();
		//Logger.log(LogStatus.PASS, "logout from application");
	}
	
}


