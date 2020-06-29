package am.itu.qa.toto.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TotoBasePage {
	
	protected WebDriver driver;

	public TotoBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

	public boolean isElementPresent(String xpath) {
		return driver.findElement(By.xpath(xpath)).isDisplayed();
	}
	
	public void waitForElementPresent(int waitSec, By by) {
		
		WebDriverWait wait = new WebDriverWait(this.driver, waitSec);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}



