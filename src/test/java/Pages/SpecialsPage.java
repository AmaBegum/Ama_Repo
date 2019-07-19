package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Library.Base;

public class SpecialsPage extends Base{
MainPage MyMP= new MainPage();

public void SelectingSortBy() {
	//MyMP.SelectFromDropDownByValue(By.xpath("//*[@id=\"selectProductSort\"]"), "price:desc");
	Select dropdown= new Select(driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]")));
	dropdown.selectByValue("price:desc");
	
}



}
