package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Library.Base;

public class MyOrdersPage extends Base {
	
	public void WaitForPageLoad(By by) {
		WebElement Elem = (new WebDriverWait(driver, 10))
		.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public void EnteringEmail(String EmailAddress) {
	driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys(EmailAddress);
	}
	public void ClickingCreateAcctBttn() {
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
	}
	
	
	
	
	
}
