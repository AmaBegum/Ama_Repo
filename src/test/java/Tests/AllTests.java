package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.Base;
import Library.ExcelReadWrite;
import Pages.HomePage;

public class AllTests extends Base {

	@DataProvider(name = "ParkingCalc")
	public Object[][] testData() {
		ExcelReadWrite dataReader = new ExcelReadWrite();
		return dataReader.getExcelData("src/test/resources/ParkingCalc.xls", "Sheet1");

	}

	HomePage MYHP = new HomePage();

	@Test(enabled = true, dataProvider = "ParkingCalc")
	public void FillAllInfoAndGetTotal(String Lot, String Time, String InTimeAMPM, String InTimeDate, String OutTime,
			String OutTimeAMPM, String OutTimeDate) throws Exception {
	MYHP.GoToWebsite();
	MYHP.SelectLotType(Lot);
	MYHP.EnterInTime(Time);
	MYHP.InAMPM(InTimeAMPM);
	MYHP.InTimeDate(InTimeDate);
	MYHP.OutTime(OutTime);
	MYHP.OutTimeAMPM(OutTimeAMPM);
	MYHP.OutTimeDate(OutTimeDate);
	MYHP.ClickCalculatebttn();
	MYHP.GetTotal();
	}

}
