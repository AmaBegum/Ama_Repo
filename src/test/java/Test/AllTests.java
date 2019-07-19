package Test;

import org.testng.annotations.Test;

import com.automation.libraries.Base;

import Pages.HomePage;

public class AllTests extends Base {
	HomePage myHP = new HomePage();

	@Test(enabled = true)
	public void DraggableTest() {
		myHP.GoToWebsite();
		myHP.clickingDraggableButton();
		myHP.switchToDraggableFrame();
		myHP.ActuallyDragging();
	}

	@Test(enabled = true)
	public void DroppableTest() {
		myHP.GoToWebsite();
		myHP.clickingDroppableButton();
		myHP.switchToDroppableFrame();
		myHP.ActuallyDroppable();
	}

	@Test(enabled = true)
	public void ResizeableTest() {
		myHP.GoToWebsite();
		myHP.clickingResizableButton();
		myHP.switchToResizableFrame();
		myHP.ActuallyResized();
	}

	@Test(enabled = true)
	public void SelectableTest() {
		myHP.GoToWebsite();
		myHP.clickingSelectableButton();
		myHP.switchToSelectableFrame();
		myHP.ActuallySelectable();
	}

	@Test(enabled = true)
	public void SortableTest() {
		myHP.GoToWebsite();
		myHP.clickingSortableButton();
		myHP.switchToSortableFrame();
		myHP.ActuallySortable();
	}

	@Test(enabled = true)
	public void AccodianTest() {
		myHP.GoToWebsite();
		myHP.clickingAccordionButton();
		myHP.switchToAccordian();
		myHP.ActuallyAccordian();
	}

	@Test(enabled = true)
	public void AutocompleteTest() {
		myHP.GoToWebsite();
		myHP.clickingAutocompleteButton();
		myHP.switchToAutocompleteFrame();
		myHP.ActuallyAutocomplete();
	}

	@Test(enabled = true)
	public void ButtonTest() {
		myHP.GoToWebsite();
		myHP.clickingButtonButton();
		myHP.SwitchToButtonFrame();
		myHP.ActuallyClickingButton();
	}
	@Test(enabled=true)
	public void CheckBoxRadioTest() {
		myHP.GoToWebsite();
		myHP.clickingCheckBoxRadio();
		myHP.SwitchToChkBoxRadioFrame();
		myHP.ActualyCheckBoxradio();
	}
	@Test(enabled=true)
	public void ControlGroupTest() {
		myHP.GoToWebsite();
		myHP.clickingControlgroupButton();
		myHP.SwitchingToControlGroup();
		myHP.ActuallyControlGroup();
	}
	

}
