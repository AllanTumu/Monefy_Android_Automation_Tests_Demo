package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FilterPage extends BasePage {

	public FilterPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
	}

	@AndroidFindBy(accessibility = "Open navigation")
	AndroidElement openNavigation;

	public void openNavigation() {
		clickBtn(openNavigation);
	}

	@AndroidFindBy(id = "show_datepicker_button")
	AndroidElement chooseDate;

	public void chooseDate() {
		clickBtn(chooseDate);
	}

	@AndroidFindBy(id = "mtrl_picker_header_toggle")
	AndroidElement clickEditDate;

	public void clickeditDateBtn() {
		clickBtn(clickEditDate);
	}

	@AndroidFindBy(className = "android.widget.EditText")
	AndroidElement fillDateField;

	public void fillInDate(String value) {
		fillTxtField(fillDateField, value);
	}

	// After here tap OK (driver.press_keycode(66))

	@AndroidFindBy(id = "confirm_button")
	AndroidElement tapOK;

	public void clickOKButton() {
		clickBtn(tapOK);
	}
	
	@AndroidFindBy(accessibility = "Close navigation")
	AndroidElement tapBACK;

	public void clickBACKBtn() {
		clickBtn(tapBACK);
	}

//	@AndroidFindBy(className = "android.widget.TextView")
//	AndroidElement filteredDate;
	
	
	/** 
	 * Used XPath because element has no ID.
	 * Using XPath locators is not recommended and can lead to fragile tests. 
	 * In an Ideal situation, I would ask the development team to provide unique accessibility locators instead!
	 */
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView[2]")
	public MobileElement getDate;

	public void getFilteredDate() {
		
	}


}
