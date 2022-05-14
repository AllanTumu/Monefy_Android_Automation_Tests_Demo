package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TransactionsPage extends BasePage {
	
	public TransactionsPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id="transaction_group_header")
    MobileElement transactionName;

    public void clickTransaction()
    {
        clickBtn(transactionName);
    }

    @AndroidFindBy(id="textViewTransactionAmount")
    MobileElement transactionAmountText;

    public void clickExistingAmount()
    {
        clickBtn(transactionAmountText);
    }
    @AndroidFindBy (id="textViewCategoryName")
	public MobileElement transactionCategory;

}
