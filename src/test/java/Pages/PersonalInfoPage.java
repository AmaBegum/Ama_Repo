package Pages;

import org.openqa.selenium.By;

import Library.Base;

public class PersonalInfoPage extends Base{
	MainPage MyMP = new MainPage();
	
	//MyPersonalInfo
	
	public void ClickTitleName() {
		MyMP.ClickSomthing(By.xpath("//*[@id=\"uniform-id_gender2\"]"));
	}
	public void EnterFirstName () {
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"customer_firstname\"]"), "Ama");
		}
	public void EnterLastName() {
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"customer_lastname\"]"), "Begum");
	}
	public void EnterEmailAdd() {
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"email\"]"), "emafa@gmail.com");
	}
	public void EnterPassword() {
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"passwd\"]"), "Example1");
	}
	public void ClickRegisterBttn() {
		MyMP.ClickSomthing(By.xpath("//*[@id=\"submitAccount\"]/span"));
	}
	public void SelectDOBDay() {
		MyMP.SelectFromDropDownByValue(By.xpath("//*[@id=\"days\"]"), "9");
	}
	public void SelectDOBMonth() {
		MyMP.SelectFromDropDownByValue(By.xpath("//*[@id=\"months\"]"), "2");
	}
	public void SelectDOBYear() {
	MyMP.SelectFromDropDownByValue(By.xpath("//*[@id=\"years\"]"), "1996");
	}
	
	//MyPersonalInfo
	
	
	//MyAddressInfo
	public void EnterFirstNameUnderAddressInfo() {
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"firstname\"]"), "Ama");
	}
	public void EnterLastNameUnderAddressInfo() {
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"lastname\"]"), "Begum");
		}
	public void EnterAddressUnderAddressInfo() {
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"address1\"]"), "1432 Hunters wood dr");
	}
	public void EnterCityUnderAddressInfo() {
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"city\"]"), "Savannah");
	}
	public void EnterStateUnderAddressInfo() {
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"id_state\"]"), "5");
	}
	public void EnterCountryUnderAddressInfo() {
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"id_country\"]"), "21");
	}
	public void EnterMobileNumberUnderAddressInfo() {
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"phone_mobile\"]"), "4346548973");
	}
	public void ClickRegisterButtonUnderAddressInfoPage() {
	MyMP.ClickSomthing(By.xpath("//*[@id=\"submitAccount\"]/span"));
	}
}
