package Tests;

import org.testng.annotations.Test;

import Library.Base;
import Pages.HomePage;

public class TestHP extends Base{
HomePage myHP=new HomePage();

@Test (enabled=true,priority=0)
public void ClickingWBttn() throws InterruptedException {
	myHP.gotowebsite();
	myHP.Clickwomensbutton();
}
@Test(enabled=false,priority=1)
public void Selecting1stOptionUnderDresses() {
	myHP.gotowebsite();
	myHP.HoverOverDressButtonAndClickFirstOption();
}

@Test(enabled=false,priority=2)
public void ClcikingtShirtbttn() {
	myHP.gotowebsite();
	myHP.ClickTshirtButton();
}
@Test (enabled=true,priority=3)
public void ClickSearchBoxWithoutTypingAnything() {
	myHP.gotowebsite();
	myHP.ClickSearchButton();	
}
@Test (enabled=true,priority=4)
public void ActuallySearchingForBlouse() {
	myHP.gotowebsite();
	myHP.EnterTextIntoTextBox("BLOUSE");
}
@Test (enabled=true,priority=4)
public void ActuallySearchingForTShirts() {
	myHP.gotowebsite();
	myHP.EnterTextIntoTextBox("Tshirt");
}
@Test (enabled=true,priority=5)
public void ClickingContactUS() {
	myHP.gotowebsite();
	myHP.ClickContactUsButton();	
}

@Test (enabled=true,priority=6)
public void ClickingOnABanner() {
	myHP.gotowebsite();
	myHP.ClickBannerButton();
}

@Test (enabled=true,priority=7)
public void ClickingBestSellers() {
	myHP.gotowebsite();
	myHP.ClickBestsellersButton();
}

@Test (enabled=true,priority=8)
public void AddingToCart1st4items() throws InterruptedException {
	myHP.gotowebsite();
	myHP.AddingToCart1st4Items();
}
@Test (enabled=true,priority=9)
public void ClickingMyOrders() {
	myHP.gotowebsite();
	myHP.ClickMyOrdersButton();
}
@Test (enabled=true,priority=10)
public void ClcikingNewProducts() {
	myHP.gotowebsite();
	myHP.ClickNewProductsButton();
}
@Test (enabled=true,priority=12)
public void ClickMensBanner() {
	myHP.gotowebsite();
	myHP.ClickMensCoatBanner();
}
@Test (enabled=true,priority=13)
public void ClcikingWBttn() {
	myHP.gotowebsite();
	myHP.ClickWomensBanner();
}
@Test (enabled=true,priority=14)
public void AddingSingleItemToCartThenPressingPlusBtn() throws InterruptedException {
	myHP.gotowebsite();
	myHP.AddSingleItem();
	myHP.AddQuantityToCart();
}
@Test (enabled=true,priority=15)
public void AddingSingleItemToCartThenPressingProcedbtn() throws InterruptedException {
	myHP.gotowebsite();
	myHP.AddSingleItem();
	myHP.ProceedButtonClick();
}
@Test (enabled=false,priority=16)
public void test17() {
	myHP.gotowebsite();
	
}
@Test (enabled=false,priority=17)
public void test18() {
	myHP.gotowebsite();
	
} 
@Test (enabled=false,priority=18)
public void test19() {
	myHP.gotowebsite();
	
}
@Test (enabled=false,priority=19)
public void test20() {
	myHP.gotowebsite();
	
}
@Test (enabled=false,priority=20)
public void test21() {
	myHP.gotowebsite();
	
}

}





