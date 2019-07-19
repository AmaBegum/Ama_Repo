package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.Base;
import Library.ExcelReadWrite;
import pages.FlightAcctPage;
import pages.HomePage;
import pages.RegisterPage;

public class Tests extends Base {

	@DataProvider(name = "RegistrationInfo")
	public Object[][] testData() {
		ExcelReadWrite dataReader = new ExcelReadWrite();
		return dataReader.getExcelData("src/test/resources/NewTours excel sheet TC.xls", "Sheet2");
	}

	HomePage MYHP = new HomePage();
	RegisterPage MYRP = new RegisterPage();
	FlightAcctPage MYFP = new FlightAcctPage();

	@Test(enabled = true, dataProvider = "RegistrationInfo")
	public void ClickingRegisterbuttonThenFillOutAllInfoAndClickSubmit(String FirstName, String LastName,
			String PhoneNumber, String Email, String Address, String City, String State, String PostalCode,
			String UserName, String PassWord, String VPassWord) {
		MYHP.gotowebsite();
		MYHP.ClickRegisterButton();
		MYRP.EnterFirstName(FirstName);
		MYRP.EnterLastName(LastName);
		MYRP.EnterPhoneNumber(PhoneNumber);
		MYRP.EnterEmailAdd(Email);
		MYRP.EnterStAddress(Address);
		MYRP.EnterCity(City);
		MYRP.EnterState(State);
		MYRP.EnterPostalCode(PostalCode);
		MYRP.EnterUsername(UserName);
		MYRP.EnterPassWord(PassWord);
		MYRP.EnterConfirmPassWord(VPassWord);
		MYRP.ClickSubmitBttn();
	}

	@Test(enabled = true)
	public void GettingSpecialPrices() {
		MYHP.gotowebsite();
		MYHP.GetSpecialPrices();
	}

	@Test(enabled = true)
	public void GettingDate() {
		MYHP.gotowebsite();
		MYHP.GetDate();
	}

	@Test(enabled = true, dataProvider = "RegistrationInfo")
	public void RegisteringThenLoginOnHP(String FirstName, String LastName, String PhoneNumber, String Email,
			String Address, String City, String State, String PostalCode, String UserName, String PassWord,
			String VPassWord) {
		MYHP.gotowebsite();
		MYHP.ClickRegisterButton();
		MYRP.EnterFirstName(FirstName);
		MYRP.EnterLastName(LastName);
		MYRP.EnterPhoneNumber(PhoneNumber);
		MYRP.EnterEmailAdd(Email);
		MYRP.EnterStAddress(Address);
		MYRP.EnterCity(City);
		MYRP.EnterState(State);
		MYRP.EnterPostalCode(PostalCode);
		MYRP.EnterUsername(UserName);
		MYRP.EnterPassWord(PassWord);
		MYRP.EnterConfirmPassWord(VPassWord);
		MYRP.ClickSubmitBttn();
		MYRP.ClickingHomeBttn();
		MYHP.EnterUserName(UserName);
		MYHP.EnterPassword(PassWord);
		MYHP.ClickingSignInBttn();
	}

	@Test(enabled = true)
	public void ClickingFlightBttn() {
		MYHP.gotowebsite();
		MYHP.ClickFlightsBttn();
	}

	@Test(enabled = true)
	public void RegisterThenClickFlightsBttnThenSelectOneWaytrip() {
		MYHP.gotowebsite();
		MYHP.ClickRegisterButton();
		MYRP.EnterFirstName("Steve");
		MYRP.ClickSubmitBttn();
		MYHP.ClickFlightsBttn();
		MYFP.SelectTripType("OneWay");
	}

	@Test(enabled = true)
	public void RegisteringThenSelectingPassengerCt() {
		MYHP.gotowebsite();
		MYHP.ClickRegisterButton();
		MYRP.EnterFirstName("Avery");
		MYRP.ClickSubmitBttn();
		MYHP.ClickFlightsBttn();
		MYFP.SelectPassengerCount("3");
	}

	@Test(enabled = true)
	public void RegisterThenFillAllInfoOnFlightsPg() {
		MYHP.gotowebsite();
		MYHP.ClickRegisterButton();
		MYRP.EnterFirstName("Steve");
		MYRP.ClickSubmitBttn();
		MYHP.ClickFlightsBttn();
		MYFP.SelectTripType("OneWay");
		MYFP.SelectPassengerCount("3");
		MYFP.SelectDepartingFrom();
		MYFP.SelectMonthAndDateDepartingDate("2", "3");
		MYFP.SelectArrival();
		MYFP.SelectMonthAndDateReturn("2", "6");
		MYFP.SelectServiceClass("First");
		System.out.println("a");
		MYFP.SelectAirlinePreference("b");
		MYFP.ClickContinueBttn();
	}

	@Test(enabled = true)
	public void ClickCruiseBttnTheVerifyIfpageloaded() {
		MYHP.gotowebsite();
		MYHP.ClickCruisesBttn();
	}

	@Test(enabled = true)
	public void ClickRegisterBttnTheFillOutUserInfoThenClickSignup() {
		MYHP.gotowebsite();
		MYHP.ClickRegisterButton();
		MYRP.EnterUsername("Ama");
		MYRP.EnterPassWord("Password");
		MYRP.EnterConfirmPassWord("Password");
		MYRP.ClickSubmitBttn();
	}

	@Test(enabled = true)
	public void ClickRegisterBttnTheFillOutcontactInfoThenClickSignup() {
		MYHP.gotowebsite();
		MYHP.ClickRegisterButton();
		MYRP.EnterFirstName("Steve");
		MYRP.EnterLastName("Avery");
		MYRP.EnterEmailAdd("Savery01@yahoo.com");
		MYRP.EnterPhoneNumber("4046758996");
		MYRP.ClickSubmitBttn();
	}

	@Test(enabled = true)
	public void ClickRegisterBttnTheFillOutcontactInfoThenClickSignupThenClickSignOFF() {
		MYHP.gotowebsite();
		MYHP.ClickRegisterButton();
		MYRP.EnterFirstName("Steve");
		MYRP.EnterLastName("Avery");
		MYRP.EnterEmailAdd("Savery01@yahoo.com");
		MYRP.EnterPhoneNumber("4046758996");
		MYRP.ClickSubmitBttn();
		MYRP.ClickingSignOffbttn();
	}

	@Test(enabled = true)
	public void EnteringUserNamePassWordWithRandonNamesThenClickSignipn() {
		String time = myLib.getCurrentTime();
		MYHP.gotowebsite();
		MYHP.EnterUserName("Mary" + time);
		MYHP.EnterPassword("PassWord" + time);
		MYHP.ClickingSignInBttn();
	}
	@Test(enabled = true)
	public void ClickregisterThenEnterMailingInfoThenClickSignUp() {
		MYHP.gotowebsite();
		MYHP.ClickRegisterButton();
		MYRP.EnterStAddress("401 oak st");
		MYRP.EnterCity("SpringField");
		MYRP.EnterState("Va");
		MYRP.EnterPostalCode("22027");
		MYRP.ClickSubmitBttn();
	}
	@Test(enabled = true)
	public void ClickDestinatioNBttnThenNavigateBack() {
		MYHP.gotowebsite();
		MYHP.ClickDestinationBttn();
		MYHP.DynamicNavigate("BaCk");
	}
	@Test(enabled = true)
	public void ClickHotelsBttn() {
		MYHP.gotowebsite();
		MYHP.ClickHotelsBttn();
	}
	@Test(enabled = true)
	public void CheckingAllLinksOnHomePage() {
		MYHP.gotowebsite();
		MYHP.PrintAllLinks();
	}
	@Test(enabled = true)
	public void PrintRegisterPgLinks() {
		MYHP.gotowebsite();
		MYHP.ClickRegisterButton();
		MYHP.PrintAllLinks();
		}
	@Test(enabled = true)
	public void PrintCruisePgLinks() {
		MYHP.gotowebsite();
		MYHP.ClickCruisesBttn();
		MYHP.PrintAllLinks();
	}
	@Test(enabled = true)
	public void ClickingLinkOne() {
		MYHP.gotowebsite();
		MYHP.clickingLinkOne();
	}
	@Test(enabled = true)
	public void ClickingLinkTwo() {
		MYHP.gotowebsite();
		MYHP.ClickingLinkTwo();
	}
	@Test(enabled = true)
public void ClickingLinkThree() {
		MYHP.gotowebsite();
		MYHP.PrintTourTipsText();
	}
}