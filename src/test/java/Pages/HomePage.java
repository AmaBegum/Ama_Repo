package Pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Library.Base;

public class HomePage extends Base {

	public void GoToWebsite() {
		driver.get("https://www.phptravels.net/");
	}

	public void SearchByHotelOrCityName() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='s2id_autogen8']")).sendKeys("london");
	}

	public void CheckInCalender() throws InterruptedException {
		WebElement calenderBox = driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input"));
		calenderBox.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[5]/td[5]")).click();
	}

	public void CheckOutCalender() throws InterruptedException {
		WebElement calenderBox = driver.findElement(By.xpath("//*[@id=\"dpd2\"]/div/input"));
		calenderBox.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[5]/td[6]")).click();
	}

	public void NUMOfAdult() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"travellersInput\"]"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"adultPlusBtn\"]/i")).click();
	}

	public void SearchBttn() {
		driver.findElement(By.xpath("//*[@id=\"hotels\"]/form/div[5]/button")).click();
	}

	public void ClickContactBttn() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"footer\"]/aside/div/div/div/div[1]/div[1]/div/div[1]/ul/li[1]/a"));
		Thread.sleep(5000);
		WebElement NameTextBox = driver
				.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[1]/div[2]/input[1]"));
		NameTextBox.click();
		NameTextBox.sendKeys("Mary");
	}
public void ClickContactBttnOnBottomOfPage() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"footer\"]/aside/div/div/div/div[1]/div[1]/div/div[1]/ul/li[1]/a"));
	Thread.sleep(5000);
	WebElement EmailAddressTextBox = driver
			.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[1]/div[2]/input[1]"));
	EmailAddressTextBox.click();
	EmailAddressTextBox.sendKeys("Harris@email.com");
}
public void ClickSubjectLineAndEnterText() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"footer\"]/aside/div/div/div/div[1]/div[1]/div/div[1]/ul/li[1]/a"));
	Thread.sleep(5000);
	WebElement SubjectTextBox = driver
			.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[1]/div[2]/input[3]"));
	SubjectTextBox.click();
	SubjectTextBox.sendKeys("Booking");
}
public void ClickSubmitBttnOnContactUsPage() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"footer\"]/aside/div/div/div/div[1]/div[1]/div/div[1]/ul/li[1]/a"));
	Thread.sleep(5000);
	WebElement NameTextBox = driver
			.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[1]/div[2]/input[1]"));
	NameTextBox.click();
	NameTextBox.sendKeys("Mary");
	driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[1]/div[2]/div/div/form/div[3]/input")).click();
}
	@Test
	public void TestingHP() throws InterruptedException {
		GoToWebsite();
		SearchByHotelOrCityName();
		CheckInCalender();
		CheckOutCalender();
		NUMOfAdult();
		SearchBttn();
		ClickContactBttn();
		ClickContactBttnOnBottomOfPage();
		ClickSubjectLineAndEnterText();
		ClickSubmitBttnOnContactUsPage();
		
	}
}
