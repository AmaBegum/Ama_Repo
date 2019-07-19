package Pages;

import org.testng.annotations.Test;

import Library.Base;
import ObjectMap.ObjectMap;

public class HomePage extends Base{

	LoginPage mylp = new LoginPage();
	
	public void GetTotalBalance() throws Exception {
		String workingDir = System.getProperty("user.dir");
		objmap = new ObjectMap(workingDir + "\\objectpropertiesfile\\objectmap.properties");
		 String TotalBalance =driver.findElement(objmap.getLocator("TotalBalance")).getText();
		 System.out.println("Total balance is: " + TotalBalance);
	}
	public int GetTotalBalanceWithReturn() throws Exception {
		String TotalBalance =driver.findElement(objmap.getLocator("TotalBalance")).getText();
		String Formated = TotalBalance.replace("$", "").replace(",", "");
		int result = Integer.parseInt(Formated);
		return result;
	}
	public void GetCreditAvailability() throws Exception {
		String CreditAval =driver.findElement(objmap.getLocator("CreditAval")).getText();
		System.out.println("Credit aval is: " + CreditAval);
	}
	public int GetDueToday() throws Exception {
		String DueToday =driver.findElement(objmap.getLocator("DueTodayBalance")).getText();
		String Formated = DueToday.replace("$", "0");
		//String Formateded = Formated.replace(",", " ");
		Thread.sleep(2000);
		int due = Integer.parseInt(Formated);
		System.out.println("Due today is: " + due);
		return due;
	}

	public void CalculateRemainingBalance() throws Exception {
		int one = GetDueToday();
		int two = GetTotalBalanceWithReturn();
		int total = two - one;
		System.out.println(total);
	}
	

	
	
	

	
	
	@Test
	public void one() throws Exception{
		mylp.GoToWebsite();
		mylp.SignIn("a", "b");
		GetTotalBalanceWithReturn();
		GetDueToday();
		
	}
	
}
