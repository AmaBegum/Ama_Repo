package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.automation.libraries.Base;

public class HomePage extends Base {

	public void GoToWebsite() {
		driver.get("https://jqueryui.com/");
		myLibrary.fluentWait(By.xpath("//*[@id=\"banner-secondary\"]/div/a"));
	}

	public void clickingDraggableButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Draggable')]"));
	}

	public void clickingDroppableButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Droppable')]"));

	}

	public void clickingResizableButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Resizable')]"));
	}

	public void clickingSelectableButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Selectable')]"));
	}

	public void clickingSortableButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Sortable')]"));
	}

	public void clickingAccordionButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Accordion')]"));

	}

	public void clickingAutocompleteButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Autocomplete')]"));
	}

	public void clickingButtonButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Button')]"));
	}

	public void clickingCheckBoxRadio() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Checkboxradio')]"));
	}

	public void clickingControlgroupButton() {
		myLibrary.clickButton(By.xpath("//a[@href='https://jqueryui.com/controlgroup/']"));
	}

	public void clickingDatepickerButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Datepicker')]"));
	}

	public void clickingDialogButton() {
		myLibrary.clickButton(By.xpath("//div[@id='sidebar']//aside[2]//ul[1]//li[7]"));
	}

	public void clickingMenuButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Menu')]"));
	}

	public void clickingProgressbarButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Progressbar')]"));
	}

	public void clickingSelectMenuButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Selectmenu')]"));
	}

	public void clickingSliderButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Slider')]"));
	}

	public void clickingSpinnerButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Spinner')]"));
	}

	public void clickingTabsButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Tabs')]"));
	}

	public void clickingTooltipButton() {
		myLibrary.clickButton(By.xpath("//a[contains(text(),'Tooltip')]"));
	}

	public void switchToDraggableFrame() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	}

	public void ActuallyDragging() {
		WebElement box = driver.findElement(By.xpath("//body/div[1]"));
		Actions drag = new Actions(driver);
		drag.dragAndDropBy(box, 91, 54).build().perform();
	}

	public void switchToDroppableFrame() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	}

	public void ActuallyDroppable() {
		WebElement box = driver.findElement(By.xpath("//body/div[1]"));
		Actions drag = new Actions(driver);
		drag.dragAndDropBy(box, 179, 32).build().perform();

	}

	public void switchToResizableFrame() {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	}

	public void ActuallyResized() {
		WebElement box = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]"));
		Actions drag = new Actions(driver);
		drag.dragAndDropBy(box, 179, 32).build().perform();
	}

	public void switchToSelectableFrame() {
		WebElement IFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(IFrame);
	}

	public void ActuallySelectable() {
		myLibrary.clickButton(By.xpath("/html[1]/body[1]/ol[1]/li[1]"));
		myLibrary.clickButton(By.xpath("/html[1]/body[1]/ol[1]/li[2]"));
		myLibrary.clickButton(By.xpath("/html[1]/body[1]/ol[1]/li[3]"));
		myLibrary.clickButton(By.xpath("/html[1]/body[1]/ol[1]/li[4]"));
		myLibrary.clickButton(By.xpath("/html[1]/body[1]/ol[1]/li[5]"));
		myLibrary.clickButton(By.xpath("/html[1]/body[1]/ol[1]/li[6]"));
		myLibrary.clickButton(By.xpath("/html[1]/body[1]/ol[1]/li[7]"));
	}

	public void switchToSortableFrame() {
		WebElement IFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(IFrame);
	}

	public void ActuallySortable() {
		WebElement row1 = driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[1]"));
		WebElement row3 = driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[3]"));
		Actions drag = new Actions(driver);
		drag.clickAndHold(row1).moveByOffset(2, 166).build().perform();
		drag.clickAndHold(row3).moveByOffset(2, 63).build().perform();
	}

	public void switchToAccordian() {
		driver.switchTo().frame(0);
	}

	public void ActuallyAccordian() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/h3[4]")).click();
	}

	public void switchToAutocompleteFrame() {
		WebElement IFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(IFrame);
	}

	public void ActuallyAutocomplete() {
		WebElement box = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/input[1]"));
		box.clear();
		box.sendKeys("Java");
		driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[1]/div[1]")).click();
	}

	public void SwitchToButtonFrame() {
		WebElement IFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(IFrame);
	}
	public void ActuallyClickingButton() {
		driver.findElement(By.xpath("/html/body/div/button")).click();
		boolean a = driver.findElement(By.xpath("/html/body/div/button")).isEnabled();
		assertEquals(a, true);
		driver.findElement(By.xpath("/html/body/div/input")).click();
		driver.findElement(By.xpath("/html/body/div/a")).click();
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.findElement(By.xpath("/html/body/input")).click();
		driver.findElement(By.xpath("/html/body/a")).click();
	}
	
	public void SwitchToChkBoxRadioFrame() {
		WebElement IFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(IFrame);
	}
	
	public void ActualyCheckBoxradio() {
		driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[2]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[3]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[1]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[2]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[3]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[4]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[1]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[2]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[3]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[4]/span[1]")).click();
	}
	
	public void SwitchingToControlGroup() {
		WebElement IFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(IFrame);
	}
	public void ActuallyControlGroup() {
		driver.findElement(By.xpath("//*[@id=\"car-type-button\"]/span[2]")).click();
		myLibrary.fluentWait(By.xpath("//*[@id=\"ui-id-2\"]")).click();
		WebElement StandardBttn = driver.findElement(By.xpath("/html/body/div[1]/fieldset[1]/div/label[1]"));
		StandardBttn.click();
		WebElement AutomaticBttn = driver.findElement(By.xpath("/html/body/div[1]/fieldset[2]/div/label[2]"));
		AutomaticBttn.click();
	}
}
