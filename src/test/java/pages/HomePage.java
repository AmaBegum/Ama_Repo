package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Library.Base;

public class HomePage extends Base {

	public void gotowebsite() {
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	}

	public void ClickRegisterButton() {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"))
				.click();
		myLib.waitUntilVisibleElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
	}

	public void GetSpecialPrices() {
		WebElement LineoneText = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[1]/font"));
		String ActualyLineOneText = LineoneText.getText();
		System.out.println(ActualyLineOneText);

		WebElement LineOnePrice = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[2]/div/font/b"));
		String ActualLineOnePrice = LineOnePrice.getText();
		System.out.println(ActualLineOnePrice);

		WebElement LineTwoText = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[2]/td[1]/font"));
		String ActualLineTwoText = LineTwoText.getText();
		System.out.println(ActualLineTwoText);

		WebElement LineTwoPrice = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/div/font/b"));
		String ActualLineTwoPrice = LineTwoPrice.getText();
		System.out.println(ActualLineTwoPrice);

		WebElement LineThreeText = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[3]/td[1]/font"));
		String ActualLine3Text = LineThreeText.getText();
		System.out.println(ActualLine3Text);

		WebElement Line3Price = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/div/font/b"));
		String ActualLine3Price = Line3Price.getText();
		System.out.println(ActualLine3Price);

		WebElement Line4Text = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[4]/td[1]/font"));
		String ActualLine4Text = Line4Text.getText();
		System.out.println(ActualLine4Text);

		WebElement Line4Price = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[4]/td[2]/div/font/b"));
		String ActualLine4Price = Line4Price.getText();
		System.out.println(ActualLine4Price);

		WebElement Line5Text = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[5]/td[1]/font"));
		String ActualLine5Text = Line5Text.getText();
		System.out.println(ActualLine5Text);

		WebElement Line5Price = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/div/font/b"));
		String ActualLine5Price = Line5Price.getText();
		System.out.println(ActualLine5Price);
	}

	public void GetDate() {
		WebElement Aruba = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"));
		String ImageofAruba = Aruba.getText();
		System.out.println(ImageofAruba);
	}

	public void EnterUserName(String UserName) {
		myLib.waitUntilVisibleElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"));
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"))
				.sendKeys(UserName);
	}

	public void EnterPassword(String Password) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
	}

	public void ClickingSignInBttn() {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"))
				.click();
	}

	public void ClickFlightsBttn() {
		myLib.customWait(2.5);
//		 WebElement ele = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
//	 JavascriptExecutor js = (JavascriptExecutor) driver;
//	 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"))
				.click();
	}

	public void ClickCruisesBttn() {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/a"))
				.click();
		myLib.waitUntilVisibleElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
	}

	public void ClickDestinationBttn() {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[6]/td[2]/a"))
				.click();
	}

	public void DynamicNavigate(String Nav) {
		int Nav2 = Nav.toLowerCase().length();

		if (Nav2 == 4) {
			driver.navigate().back();
		} else if (Nav2 == 7) {
			driver.navigate().forward();
		} else if (Nav2 == 9) {
			driver.navigate().refresh();
		} else {
			System.out.println("Case ignoreed BACK,FORWARD,REFRESHED");
		}

	}

	public void ClickHotelsBttn() {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/a"))
				.click();
	}

	public void PrintAllLinks() {
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		for (int i = 0; i < alllinks.size(); i++)
			System.out.println(alllinks.get(i).getText());
	}

	public void clickingLinkOne() {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[12]/td/table/tbody/tr/td/font/a[1]"))
				.click();
		myLib.customWait(2);
		myLib.changeToNewTab(0, 1);
		myLib.customWait(2);
		driver.close();
	}

	public void ClickingLinkTwo() {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[12]/td/table/tbody/tr/td/font/a[2]"))
				.click();
		myLib.customWait(2);
		myLib.changeToNewTab(0, 1);
		myLib.customWait(2);
		driver.close();
	}

	public void PrintTourTipsText() {
		String Text = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]"))
				.getText();
		System.out.println(Text);
	}
}