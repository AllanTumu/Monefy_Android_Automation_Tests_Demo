package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class ExpensesPage extends BasePage {

	public ExpensesPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

	@AndroidFindBy(id = "buttonKeyboardClear")
	AndroidElement eraser;

	public void clearField() {
		clickBtn(eraser);
	}

	@AndroidFindBy(accessibility = "Navigate up")
	AndroidElement backBtn;

	public void clickBackBtn() {
		clickBtn(backBtn);
	}

	@AndroidFindBy(id = "buttonKeyboard5")
	AndroidElement numberFiveEntry;

	public void clickFiveBtn() {
		clickBtn(numberFiveEntry);
	}

	@AndroidFindBy(id = "buttonKeyboard9")
	AndroidElement numberNineEntry;

	public void clickNineBtn() {
		clickBtn(numberNineEntry);
	}

	@AndroidFindBy(id = "keyboard_action_button")
	AndroidElement chooseCategoryBtn;

	public void clickChooseCategoryBtn() {
		clickBtn(chooseCategoryBtn);
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.LinearLayout\n")
	AndroidElement expenseCategoryOption;

	public void clickExpenseCategory() {
		clickBtn(expenseCategoryOption);
	}

	@AndroidFindBy(id = "delete")
	AndroidElement deleteIncome;

	public void clickDeleteBtn() {
		clickBtn(deleteIncome);
	}

}
