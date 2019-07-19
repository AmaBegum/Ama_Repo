package Pages;

import org.openqa.selenium.By;

import Library.Base;

public class ContactUsPage extends Base{
 MainPage MyMp= new MainPage();
 
 public void SelectSubjectHeader() {
	 MyMp.SelectFromDropDownByValue(By.xpath("//*[@id=\"id_contact\"]"), "1");
	 }
	public void EnterEmailAddress() {
		MyMp.EnterTextIntoTextBox(By.xpath("//*[@id=\"email\"]"), "emailadd@gmail.com");
	}
	public void EnterOrderReference() {
		MyMp.EnterTextIntoTextBox(By.xpath("//*[@id=\"id_order\"]"), "Amazon order");
	}
	
	public void EnterMessageInToBox() {
		MyMp.EnterTextIntoTextBox(By.id("message"), "Package delivered");
	}
	public void ClickSendButton() {
		MyMp.ClickSomthing(By.xpath("//*[@id=\"submitMessage\"]/span"));
	}
}
