package Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Library.Base;

public class MainPage extends Base {

	public void GoToWebsite() {
		driver.get("https://phptravels.com/demo/");
	}
	public void ClickOnLink() {
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/a")).click();
	}
	public void SwitingFocusToNewTab() {
		   ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
	}


}