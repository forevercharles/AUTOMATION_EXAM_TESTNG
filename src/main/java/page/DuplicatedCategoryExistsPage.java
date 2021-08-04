package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DuplicatedCategoryExistsPage {
	WebDriver driver;
	
	public DuplicatedCategoryExistsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//identify element
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Nevermind')]") WebElement NEVER_MIND_FIELD;
	
	//interactive methods
	public void userShouldBeAbleToSeeDuplicatedCategoryPage() {
		Assert.assertTrue(NEVER_MIND_FIELD.isDisplayed(), "Duplicated category page doesn't show up");
	}

}
