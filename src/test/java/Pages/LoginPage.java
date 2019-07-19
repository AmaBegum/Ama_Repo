package Pages;

import org.openqa.selenium.By;

import Library.Base;
import ObjectMap.ObjectMap;

public class LoginPage extends Base {
	
	public void GoToWebsite() {
		String workingDir = System.getProperty("user.dir");
		objmap = new ObjectMap(workingDir + "\\objectpropertiesfile\\objectmap.properties");
		driver.get("https://demo.applitools.com");
	}
	
	public void SignIn(String UserName, String PassWord) throws Exception {
		driver.findElement(objmap.getLocator("UserName")).sendKeys(UserName);
		driver.findElement(objmap.getLocator("PassWord")).sendKeys(PassWord);
		driver.findElement(objmap.getLocator("SignInButton")).click();
	}
	
	

}
