package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Library.Base;

public class HomePage extends Base{ 
	
	
	
	public void HoverOverDressButtonAndClickFirstOption() {
		Actions hover= new Actions(driver);
		WebElement hoveroverbutton = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		hover.moveToElement(hoveroverbutton);
		hover.build().perform();
		System.out.println("hovering over dress button");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement wait1 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")).click();
		System.out.println("clicks the first option");
		WebElement wait2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/div[1]/div")));
		boolean ExpectingToSee = driver.findElement(By.xpath("//*[@id=\\\"center_column\\\"]/div[1]/div")).isDisplayed();
				assertEquals(ExpectingToSee, true);
		System.out.println("website loaded");
	}

	
	
	
	
	
	public void AddingToCart1st4Items() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/h5/a")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		driver.navigate().back();
		System.out.println("added first item");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		driver.navigate().back();
		System.out.println("item two added");
		Thread.sleep(2500);
		Actions Act = new Actions(driver);
		WebElement PrintedDress = driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-tablet-line first-item-of-mobile-line']//a[@title='Printed Dress'][contains(text(),'Printed Dress')]"));
		Act.moveToElement(PrintedDress).build().perform();
		driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-tablet-line first-item-of-mobile-line hovered']//a[@title='Add to cart']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		driver.navigate().back();
		System.out.println("item three added");
	}
	
	

	public void ClickNewProductsButton() {
		driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[2]/a")).click();
		System.out.println("clicked new products");
	}
	public void ClickAboutUsButton() {
		driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[7]/a")).click();
		System.out.println("clicked about btn");
	}
	public void ClickMensCoatBanner() {
		driver.findElement(By.xpath("//*[@id=\"htmlcontent_home\"]/ul/li[2]/a/img")).click();
		System.out.println("clicked mens button");
	}
	public void ClickWomensBanner() {
		driver.findElement(By.xpath("//*[@id=\"htmlcontent_home\"]/ul/li[3]/a/img")).click();
		System.out.println("clicked wmens button");
	}
	public void AddSingleItem() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/h5/a")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		Thread.sleep(2500);
		System.out.println("AddedOneItem");
	}
	public void AddQuantityToCart() throws InterruptedException {
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]")).click();
		System.out.println("Added Quantity to cart");
	}
	public void ProceedButtonClick() {
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		System.out.println("Clicked proceed button");
	}
	public void LoginAtCheckout() {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("email@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
		System.out.println("Logged in at checkout");
	}
	public void ClickTrashButton() {
		driver.findElement(By.xpath("//*[@id=\"1_1_0_0\"]")).click();
		System.out.println("Clicked trash button");
	}
	public void ClickReduceAmountButton() {
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/h5/a")).click();
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[1]/span/i")).click();
		System.out.println("Clicked reduce amount button");
	}
}
