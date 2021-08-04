package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CategoryPage;
import page.DuplicatedCategoryExistsPage;
import util.BrowserFactory;

public class CategoryTest {
	WebDriver driver;

	@Test
	public void userShouldBeAbleToAddNewCategoryAndDisplay() {
		driver = BrowserFactory.init();

		CategoryPage categorypage = PageFactory.initElements(driver, CategoryPage.class);

		categorypage.enterNewCategory("CharlesTestCATEGORY");
		categorypage.clickAddNewCategoryButton();
		categorypage.categoryIsAddedAndDisplayed();
		
		DuplicatedCategoryExistsPage duplicatedcategorypageexists = PageFactory.initElements(driver, DuplicatedCategoryExistsPage.class);
		duplicatedcategorypageexists.userShouldBeAbleToSeeDuplicatedCategoryPage();
		
		categorypage.clickMonthsDropDown();
		categorypage.dropDownHasAllTheMonths();
		

		BrowserFactory.tearDown();
	}

}
