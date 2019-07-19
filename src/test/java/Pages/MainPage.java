package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Library.Base;

public class MainPage extends Base{
	
	public void gotowebsite() {
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Went to website");
	}
	public void CheckIfNewPageLoaded(String ExpectingURL) throws InterruptedException {
		Thread.sleep(5000);
		String AtcualURL = driver.getCurrentUrl();
		assertEquals(AtcualURL, ExpectingURL);
		System.out.println("New page loaded");
	}
	public void CheckForVisibility(By by) throws InterruptedException {
		Thread.sleep(2000);
		boolean ActuallyDisplayed = driver.findElement(by).isDisplayed();
		assertEquals(ActuallyDisplayed, true);
	}
	public void ClickWomensbutton() {
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
		System.out.println("Clicked womens bttn");
	}
	public void ClickTshirtButton() {
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
		System.out.println("clicked shirt button");
	}
	public void EnterTextIntoTextBox(By by, String WhatDoWantToType) {
		driver.findElement(by).sendKeys(WhatDoWantToType);
		System.out.println("Typed: " + WhatDoWantToType + " into box");
	}
	public void ClickSomthing(By by) {
		driver.findElement(by).click();
	}
	public void SelectFromDropDownByValue(By by, String value) {
		Select DropDownBox = new Select(driver.findElement(by));
		DropDownBox.selectByValue(value);
	}
	
	public void ClickSearchIcon() {
		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).sendKeys(Keys.ENTER);
	}
	public void ClickContactUsButton() {
		driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
		System.out.println("Clicked contactus button");
	}
	public void Click25OffBannerButton() {
		driver.findElement(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[1]/a/img")).click();
		System.out.println("Clicked 25% off");
	}
	public void ClickBestsellersButton() {
		driver.findElement(By.xpath("//*[@id=\"home-page-tabs\"]/li[2]/a")).click();
		System.out.println("Clicked best sellers button");
	}
	public void AddingItemToCart(String ItemXPath, String AddBttnXPath) throws InterruptedException {
		Actions Act = new Actions(driver);
		WebElement PrintedDress = driver.findElement(By.xpath(ItemXPath));
		Act.moveToElement(PrintedDress).build().perform();
		driver.findElement(By.xpath(AddBttnXPath)).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		System.out.println("Item added");
	}
	public void ClickMyOrdersButton() {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[1]/a")).click();
		System.out.println("clicked my orders button");
		}
	public void SignUpForNewsletter() {
		String time = myLib.getCurrentTime();
		EnterTextIntoTextBox(By.xpath("//*[@id=\"newsletter-input\"]"), "StrawberryZ"+time+"@yahoo.com");
		ClickSomthing(By.xpath("//*[@id=\"newsletter_block_left\"]/div/form/div/button"));
		WebElement Header = driver.findElement(By.xpath("//*[@id=\"columns\"]/p"));
		String ActualHeader = Header.getText();
		assertEquals(ActualHeader, "Newsletter : You have successfully subscribed to this newsletter.");
	}
public void SelectSpecialButton() {
ClickSomthing(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[1]/a"));
}
public void ClickOnTheYoutubeIcon() throws InterruptedException {
	ClickSomthing(By.xpath("//*[@id=\"social_block\"]/ul/li[3]/a"));
	Thread.sleep(5000);
	myLib.changeToNewTab(0, 1);
	Thread.sleep(5000);
	
}

	}
	
	
	
	
	
	


