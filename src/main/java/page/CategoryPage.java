package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CategoryPage {

	WebDriver driver;

	public CategoryPage(WebDriver driver) {
		this.driver = driver;
	}

	// identify elements
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='categorydata']") WebElement ADD_NEW_CATEGORY;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']") WebElement ADD_NEW_CATEGORY_BUTTON;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'CharlesTestCATEGORY')]") WebElement CHARLES_CATEGORY_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']") WebElement MONTH_DROPDOWN_FIELD;

	// interactive methods

	public void enterNewCategory(String newCategory) {
		ADD_NEW_CATEGORY.sendKeys(newCategory);
	}

	public void clickAddNewCategoryButton() {
		ADD_NEW_CATEGORY_BUTTON.click();
	}
	
	public void categoryIsAddedAndDisplayed() {
		Assert.assertEquals(CHARLES_CATEGORY_FIELD.getText(), "CharlesTestCATEGORY", "Message not displayed");
	}
	
	public void clickMonthsDropDown() {
		MONTH_DROPDOWN_FIELD.click();
	}
	
	public void dropDownHasAllTheMonths() {
		Assert.assertTrue(MONTH_DROPDOWN_FIELD.isDisplayed(), "Months not displayed");
//		Assert.assertEquals(MONTH_DROPDOWN_FIELD.isSelected(), "due_month", "Months not displayed");
	}
	
	public void chooseAParticularDropDown(String months) {
		Select sel = new Select(MONTH_DROPDOWN_FIELD);
		sel.selectByVisibleText(months);
	}

}
