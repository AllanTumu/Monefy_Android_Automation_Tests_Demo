package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FilterPage;
import pages.HomeScreen;

public class TestFilterDate extends BaseClass {
	
	HomeScreen homeScreen;
	FilterPage filterPage;
	
	String date = "5/09/25";
	@Test(priority = 1)
	public void testFilterDate() {
		homeScreen = new HomeScreen(driver);
		filterPage = new FilterPage(driver);
		filterPage.openNavigation();
		filterPage.chooseDate();
		filterPage.clickeditDateBtn();
		filterPage.fillInDate(date);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		filterPage.clickOKButton();
		driver.hideKeyboard();
		String currentDateString = filterPage.getDate.getText();
		Assert.assertEquals(currentDateString, "Friday, 9 May");
	}

}
