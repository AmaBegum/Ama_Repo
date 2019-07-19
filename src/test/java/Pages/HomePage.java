package Pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Library.Base;
import ObjectMap.ObjectMap;

public class HomePage extends Base {

	public void GoToWebsite() {
		driver.get("http://adam.goucher.ca/parkcalc/");
	}
	public void SelectLotType(String Lot) throws Exception {
		String workingDir = System.getProperty("user.dir");
		objmap = new ObjectMap(workingDir + "\\objectpropertiesfile\\objectmap.properties");
		int lot = Lot.toLowerCase().length();
		Select Econ = new Select(driver.findElement(objmap.getLocator("LotBox")));

		if (lot == 15) {
			Econ.selectByVisibleText("Economy Parking");
		} else if (lot == 18) {
			Econ.selectByVisibleText("Short-Term Parking");
		} else if (lot == 25) {
			Econ.selectByVisibleText("Long-Term Surface Parking");
		} else if (lot == 24) {
			Econ.selectByVisibleText("Long-Term Garage Parking");
		} else if (lot == 13) {
			Econ.selectByVisibleText("Valet Parking");
		}
		else {
			System.out.println("not");
		}
	}

	public void EnterInTime(String Time) throws Exception {
		WebElement textBox = driver.findElement(objmap.getLocator("BoxForInTime"));
		textBox.clear();
		textBox.sendKeys(Time);
	}

	public void InAMPM(String InTimeAMPM) throws Exception {
		if (InTimeAMPM == "AM") {
			driver.findElement(objmap.getLocator("InTimeAM")).click();

		} else if (InTimeAMPM == "PM") {
			driver.findElement(objmap.getLocator("InTimePM")).click();
		}
	}

	public void InTimeDate(String InTimeDate) throws Exception {
		WebElement textBox = driver.findElement(objmap.getLocator("InTimeDate"));
		textBox.clear();
		textBox.sendKeys(InTimeDate);
	}

	public void OutTime(String OutTime) throws Exception {
		WebElement textBox = driver.findElement(objmap.getLocator("OutTime"));
		textBox.clear();
		textBox.sendKeys(OutTime);
	}

	public void OutTimeAMPM(String OutTimeAMPM) throws Exception {
		if (OutTimeAMPM == "AM") {
			driver.findElement(objmap.getLocator("OutTimeAM")).click();
		} else if (OutTimeAMPM == "PM") {
			driver.findElement(objmap.getLocator("OutTimePM")).click();

		}
	}

	public void OutTimeDate(String OutTimeDate) throws Exception {
		WebElement textBox = driver.findElement(objmap.getLocator("OutTimeDate"));
		textBox.clear();
		textBox.sendKeys(OutTimeDate);
	}

	public void ClickCalculatebttn() throws Exception {
		driver.findElement(objmap.getLocator("CalculateButton")).click();

	}

	public void GetTotal() throws Exception {
		WebElement errormsg = driver.findElement(objmap.getLocator("Total"));
		String errormsgtext = errormsg.getText();
		System.out.println(errormsgtext);
	}


	
}
