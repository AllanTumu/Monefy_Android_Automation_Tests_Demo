package pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends BasePage{

    public HomeScreen(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(id="income_button") MobileElement addIncomeBtn;
    public void clickAddIncome()
    {
        clickBtn(addIncomeBtn);
    }

    @AndroidFindBy(id="expense_button") MobileElement addExpenseBtn;
    public void clickAddExpense()
    {
        clickBtn(addExpenseBtn);
    }

    @AndroidFindBy(id="balance_amount")
	public MobileElement balanceAmount;

    public void clickBalanceAmount()
    {
        clickBtn(balanceAmount);
    }
    public void waitForBalanceVisibility()
    {
        waitElementVisibility(balanceAmount);
    }

    @AndroidFindBy(id="overflow") MobileElement settingsControl;
    public void clickSettings()
    {
        clickBtn(settingsControl);
    }

    @AndroidFindBy(id="accounts_panel") MobileElement accountsPanel;
    public void clickAccountsPanel()
    {
        clickBtn(accountsPanel);
    }

    @AndroidFindBy(id="imageButtonAddCategory") MobileElement addAccountBtn;
    public void clickAddAccount()
    {
        clickBtn(addAccountBtn);
    }

}