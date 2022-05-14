package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AccountPage extends BasePage {
	public AccountPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

	@AndroidFindBy(id = "editTextCategoryName")
	AndroidElement accountName;

	public void insertAccountName(String name) {
		fillTxtField(accountName, name);
	}

	@AndroidFindBy(id = "initialAmount")
	AndroidElement initialAmount;

	public void insertInitialAmount(String value) {
		fillTxtField(initialAmount, value);
	}

	@AndroidFindBy(id = "save")
	AndroidElement addBtn;

	public void clickAddBtn() {
		clickBtn(addBtn);
	}

	@AndroidFindBy(accessibility = "Navigate up")
	AndroidElement backBtn;

	public void clickBackBtn() {
		clickBtn(backBtn);
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.FrameLayout\n")
	AndroidElement image;

	public void selectAccountImage() {
		clickBtn(image);
	}

	@AndroidFindBy(xpath = "//android.widget.ListView[@content-desc=\"List of accounts\"]/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView[1]\n")
	AndroidElement newAccount;

	@AndroidFindBy(id = "delete")
	AndroidElement deleteIncome;

	public void clickDeleteBtn() {
		clickBtn(deleteIncome);
	}
}
