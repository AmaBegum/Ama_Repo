package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Library.Base;

public class FlightAcctPage extends Base {

	public void SelectTripType(String TripType) {

		if (TripType == "RoundTrip") {
			driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]"))
					.click();
		} else if (TripType == "OneWay") {
			driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"))
					.click();
		} else {
			System.out.println("SEND STRING ONLY OneWay OR RoundTrip");
		}

	}

	public void SelectPassengerCount(String Value) {
		Select passenger = new Select(driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select")));
		passenger.selectByValue(Value);
	}

	public void SelectDepartingFrom() {
		String Value = "New York";
		Select Departing = new Select(driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select")));
		Departing.selectByValue(Value);
	}

	public void SelectMonthAndDateDepartingDate(String ValueOfMonth, String ValueOfDate) {
		Select Month = new Select(driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]")));
		Month.selectByValue(ValueOfMonth);
		Select On = new Select(driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]")));
		On.selectByValue(ValueOfDate);
	}

	public void SelectArrival() {
		Select Arrival = new Select(driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select")));
		Arrival.selectByValue("Paris");
	}

	public void SelectMonthAndDateReturn(String ValueOfMonth, String ValueOfDate) {
		Select Month = new Select(driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]")));
		Month.selectByValue(ValueOfMonth);
		Select On = new Select(driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]")));
		On.selectByValue(ValueOfDate);
	}

	public void SelectServiceClass(String ServiceClass) {
		if (ServiceClass == "Economy") {
			driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input"))
					.click();
		} else if (ServiceClass == "Business") {
			driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"))
					.click();
		} else if (ServiceClass == "First") {
			driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"))
					.click();
		} else {
			System.out.println("Economy,Business and First ");
		}
	}

	public void SelectAirlinePreference(String Value) {
		String a = "a";
		String e = "No Preference";
		String f = "Blue Skies Airlines";
		String g = "Unified Airlines";
		String h = "Pangea Airlines";
		if (Value == a) {
			Select Airline = new Select(driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select")));
			Airline.selectByVisibleText(e);
		} else if (Value == "b") {
			Select Airline = new Select(driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select")));
			Airline.selectByVisibleText(f);
		} else if (Value == "c") {
			Select Airline = new Select(driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select")));
			Airline.selectByVisibleText(g);
		} else if (Value == "d") {
			Select Airline = new Select(driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select")));
			Airline.selectByVisibleText(h);
		}
	}

	public void ClickContinueBttn() {
		myLib.customWait(3);
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input"))
				.click();
	}
}
