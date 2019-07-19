package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Library.Base;

public class RegisterPage extends Base{
	
	public void EnterFirstName(String FirstName) {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"))
		.sendKeys(FirstName);
	}
	public void EnterLastName(String LastName) {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"))
		.sendKeys(LastName);
	}
	public void EnterPhoneNumber(String PhoneNumber) {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"))
		.sendKeys(PhoneNumber);
	}
	public void EnterEmailAdd(String Email) {
		myLib.enterTextField(By.id("userName"), Email);
	}
	public void EnterStAddress(String Address) {
		myLib.enterTextField(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"),
				Address);
	}
	public void EnterCity(String City) {
		myLib.enterTextField(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"),
				City);
	}
	public void EnterState(String State) {
		myLib.enterTextField(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"), 
				State);
	}
	public void EnterPostalCode(String PostalCode) {
		myLib.enterTextField(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input"),
				PostalCode);
	}

	public void EnterUsername(String UserName) {
		myLib.enterTextField(By.xpath("//*[@id=\"email\"]"), UserName);
	}

	public void EnterPassWord(String PassWord) {
		myLib.enterTextField(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"),
				PassWord);
	}
	public void EnterConfirmPassWord(String VPassWord) {
		myLib.enterTextField(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input"),
				VPassWord);
	}
	public void ClickSubmitBttn() {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")).click();
	}
	public void ClickingHomeBttn() {
		myLib.waitUntilVisibleElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[2]"));
		driver.findElement(By.cssSelector("tbody:nth-child(1) tr.mouseOut:nth-child(1) td:nth-child(2) font:nth-child(1) > a:nth-child(1)")).click();
	}
	public void ClickingSignOffbttn() {
		myLib.waitUntilVisibleElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[2]"));
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
