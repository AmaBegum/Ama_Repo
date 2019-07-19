package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Library.Base;
import Pages.ContactUsPage;
import Pages.MainPage;
import Pages.MyOrdersPage;
import Pages.PersonalInfoPage;
import Pages.SpecialsPage;

public class AllTests extends Base {

	MainPage MyMP = new MainPage();
	MyOrdersPage MyOP = new MyOrdersPage();
	PersonalInfoPage Mypip = new PersonalInfoPage();
	ContactUsPage MyCP = new ContactUsPage();
	SpecialsPage MySP = new SpecialsPage();

	@Test(enabled =true, priority = 0)
	public void ClickingWomensBttn() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.ClickWomensbutton();
		MyMP.CheckIfNewPageLoaded("http://automationpractice.com/index.php?id_category=3&controller=category");
	}

	@Test(enabled =true, priority = 1)
	public void ClickingTshirtButton() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.ClickTshirtButton();
		MyMP.CheckIfNewPageLoaded("http://automationpractice.com/index.php?id_category=5&controller=category");
	}

	@Test(enabled =true, priority = 2)
	public void FillSearchBoxWithTshirt() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"search_query_top\"]"), "tshirts");
		MyMP.ClickSearchIcon();
		MyMP.CheckIfNewPageLoaded(
				"http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=tshirts&submit_search=");
	}

	@Test(enabled =true, priority = 3)
	public void FillsearchBoxwithBlouse() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"search_query_top\"]"), "blouse");
		MyMP.ClickSearchIcon();
		MyMP.CheckIfNewPageLoaded(
				"http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=blouse&submit_search=");
	}

	@Test(enabled =true, priority = 4)
	public void ClickingContactUsButton() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.ClickContactUsButton();
		MyMP.CheckIfNewPageLoaded("http://automationpractice.com/index.php?controller=contact");
	}

	@Test(enabled =true, priority = 5)
	public void Clicking25OffBanner() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.Click25OffBannerButton();
		MyMP.CheckIfNewPageLoaded("https://www.prestashop.com/en");
	}

	@Test(enabled =true, priority = 6)
	public void ClickingBestSellersButton() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.ClickBestsellersButton();
		MyMP.CheckForVisibility(By.xpath("//*[@id=\"blockbestsellers\"]/li[1]/div/div[2]/h5/a"));
	}

	@Test(enabled =true, priority = 7)
	public void AddingFadedShortSleeveToCart() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.AddingItemToCart("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img",
				"//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span");
	}

	@Test(enabled =true, priority = 8)
	public void AddingPrintedDressToCart() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.AddingItemToCart("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/h5/a",
				"//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]/span");
	}

	@Test(enabled =true, priority = 9)
	public void AddingTwoItemsToTheCartThenSearchingForJeans() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.AddingItemToCart("//*[@id=\"homefeatured\"]/li[4]/div/div[2]/h5/a",
				"//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[1]/span");
		MyMP.AddingItemToCart("//*[@id=\"homefeatured\"]/li[7]/div",
				"//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[1]/span");
		MyMP.EnterTextIntoTextBox(By.xpath("//*[@id=\"search_query_top\"]"), "jeans");
		MyMP.ClickSearchIcon();
		MyMP.CheckIfNewPageLoaded(
				"http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=jeans&submit_search=");
	}

	@Test(enabled =true, priority = 10)
	public void CreatingAcctInMyOrdersPage() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.ClickMyOrdersButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MyOP.EnteringEmail("Emailadd@gmail.com");
		MyOP.ClickingCreateAcctBttn();
		MyMP.CheckIfNewPageLoaded(
				"http://automationpractice.com/index.php?controller=authentication&back=history#account-creation");
	}

	@Test(enabled =true, priority = 11)
	public void CreatingAcctInMyOrdersPageThenEnterPersonalInfo1() {
		MyMP.gotowebsite();
		MyMP.ClickMyOrdersButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MyOP.EnteringEmail("Emailadd@gmail.com");
		MyOP.ClickingCreateAcctBttn();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"uniform-id_gender2\"]"));
		Mypip.EnterFirstName();
		Mypip.EnterLastName();
		Mypip.ClickTitleName();
		Mypip.EnterEmailAdd();
		Mypip.ClickRegisterBttn();
	}

	@Test(enabled =true, priority = 12)
	public void CreatingAcctInMyOrdersPageThenEnterPersonalInfo2() {
		MyMP.gotowebsite();
		MyMP.ClickMyOrdersButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MyOP.EnteringEmail("Emailadd@gmail.com");
		MyOP.ClickingCreateAcctBttn();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"uniform-id_gender2\"]"));
		Mypip.EnterLastName();
		Mypip.ClickTitleName();
		Mypip.EnterEmailAdd();
		Mypip.ClickRegisterBttn();
	}

	@Test(enabled =true, priority = 13)
	public void CreatingAcctInMyOrdersPageThenEnterPersonalInfo3() {
		MyMP.gotowebsite();
		MyMP.ClickMyOrdersButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MyOP.EnteringEmail("Emailadd@gmail.com");
		MyOP.ClickingCreateAcctBttn();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"uniform-id_gender2\"]"));
		Mypip.ClickRegisterBttn();
	}

	@Test(enabled =true, priority = 14)
	public void CreatingAcctInMyOrdersPageThenEnterPersonalInfo3ThenEnterTitleNameAndPressReg() {
		MyMP.gotowebsite();
		MyMP.ClickMyOrdersButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MyOP.EnteringEmail("Emailadd@gmail.com");
		MyOP.ClickingCreateAcctBttn();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"uniform-id_gender2\"]"));
		Mypip.ClickTitleName();
		Mypip.ClickRegisterBttn();
	}

	@Test(enabled =true, priority = 15)
	public void CreatingAcctInMyOrdersPageThenEnterPersonalInfo3ThenEnterFirstNameLstNameEmaillAddressPasswordandDOBThenPressReg() {
		MyMP.gotowebsite();
		MyMP.ClickMyOrdersButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MyOP.EnteringEmail("Emailadd@gmail.com");
		MyOP.ClickingCreateAcctBttn();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"uniform-id_gender2\"]"));
		Mypip.ClickTitleName();
		Mypip.EnterFirstName();
		Mypip.EnterLastName();
		Mypip.EnterEmailAdd();
		Mypip.EnterPassword();
		Mypip.SelectDOBDay();
		Mypip.SelectDOBMonth();
		Mypip.SelectDOBYear();
		Mypip.ClickRegisterBttn();
	}

	@Test(enabled =true, priority = 16)
	public void CreatingAccountInMyOrdersPageThenEnteringPersonalInfoThenFillingInAddressThenPressReg() {
		MyMP.gotowebsite();
		MyMP.ClickMyOrdersButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MyOP.EnteringEmail("Emailadd@gmail.com");
		MyOP.ClickingCreateAcctBttn();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"uniform-id_gender2\"]"));
		Mypip.ClickTitleName();
		Mypip.EnterFirstName();
		Mypip.EnterLastName();
		Mypip.EnterEmailAdd();
		Mypip.EnterPassword();
		Mypip.ClickRegisterBttn();
		Mypip.SelectDOBDay();
		Mypip.SelectDOBMonth();
		Mypip.SelectDOBYear();
		Mypip.EnterFirstNameUnderAddressInfo();
		Mypip.EnterLastNameUnderAddressInfo();
		Mypip.EnterAddressUnderAddressInfo();
		Mypip.EnterCityUnderAddressInfo();
		Mypip.EnterStateUnderAddressInfo();
		Mypip.EnterCountryUnderAddressInfo();
		Mypip.EnterMobileNumberUnderAddressInfo();
		Mypip.ClickRegisterButtonUnderAddressInfoPage();
	}

	@Test(enabled =true, priority = 17)
	public void CreatingAccountInMyOrdersPageThenEnteringAddressAndPressingRegister() {
		MyMP.gotowebsite();
		MyMP.ClickMyOrdersButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MyOP.EnteringEmail("Emailadd@gmail.com");
		MyOP.ClickingCreateAcctBttn();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"uniform-id_gender2\"]"));
		Mypip.EnterFirstNameUnderAddressInfo();
		Mypip.EnterLastNameUnderAddressInfo();
		Mypip.EnterAddressUnderAddressInfo();
		Mypip.EnterCityUnderAddressInfo();
		Mypip.EnterStateUnderAddressInfo();
		Mypip.EnterCountryUnderAddressInfo();
		Mypip.EnterMobileNumberUnderAddressInfo();
		Mypip.ClickRegisterButtonUnderAddressInfoPage();
	}

	@Test(enabled =true, priority = 18)
	public void EnterSubjectHeaderAndClickSendButton() {
		MyMP.gotowebsite();
		MyMP.ClickContactUsButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MyCP.SelectSubjectHeader();
		MyCP.ClickSendButton();
	}

	@Test(enabled =true, priority = 19)
	public void EnterSubjectHeaderEmailAddressOrderReferenceAndClickSendButton() {
		MyMP.gotowebsite();
		MyMP.ClickContactUsButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MyCP.SelectSubjectHeader();
		MyCP.EnterEmailAddress();
		MyCP.EnterOrderReference();
		MyCP.ClickSendButton();
	}

	@Test(enabled =true, priority = 20)
	public void EnterSubjectHeaderEmailAddressOrderReferenceEnterMessageInToBoxAndClickSendButton() {
		MyMP.gotowebsite();
		MyMP.ClickContactUsButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MyCP.SelectSubjectHeader();
		MyCP.EnterEmailAddress();
		MyCP.EnterOrderReference();
		MyCP.EnterMessageInToBox();
		MyCP.ClickSendButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/p"));
	}

	@Test(enabled =true, priority = 21)
	public void SignUpForNewsletter() {
		MyMP.gotowebsite();
		MyMP.SignUpForNewsletter();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"columns\"]/p"));
	}

	@Test(enabled =true, priority = 22)
	public void ClickSpecialsButtonAndSelectFromDropDownPriceHighestToLowest() {
		MyMP.gotowebsite();
		MyMP.SelectSpecialButton();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		MySP.SelectingSortBy();
	}

	@Test(enabled =true, priority = 23)
	public void ClickYoutubeLink() throws InterruptedException {
		MyMP.gotowebsite();
		MyMP.ClickOnTheYoutubeIcon();
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"channel-title\"]"));
	}

	@Test(enabled =true, priority = 24)
	public void gotothewebsiteclickcontactusthengobackandgototheyoutubelinkthengobackhomeandclickcontactusagian()
			throws InterruptedException {
		MyMP.gotowebsite();
		System.out.println("Step 1");
		MyMP.ClickContactUsButton();
		System.out.println("2");
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		System.out.println("3");
		driver.navigate().back();
		System.out.println("4");
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[1]/a/img"));
		System.out.println("5");
		MyMP.ClickOnTheYoutubeIcon();
		System.out.println("6");
		myLib.changeToNewTab(1, 0);
		System.out.println("7");
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[1]/a/img"));
		System.out.println("8");
		MyMP.ClickContactUsButton();
		System.out.println("9");
	}

	@Test(enabled = true, priority = 25)
	public void Gotothewebsiteclickcontactusthengoback() {
		MyMP.gotowebsite();
		System.out.println("Step 1");
		MyMP.ClickContactUsButton();
		System.out.println("2");
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"center_column\"]/h1"));
		System.out.println("3");
		driver.navigate().back();
		System.out.println("4");
		MyOP.WaitForPageLoad(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[1]/a/img"));
	}
}