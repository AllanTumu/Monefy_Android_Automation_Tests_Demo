package tests;

import org.testng.annotations.Test;

import pages.AddIncomePage;
import pages.HomeScreen;
import pages.TransactionsPage;

import org.testng.Assert;
import java.io.IOException;

public class TestIncome extends BaseClass {
	
	HomeScreen homeScreen;
	AddIncomePage addIncomePage;
    TransactionsPage transactionsPage;

    @Test(priority = 1)
    //add new income
    public void addIncome() throws IOException {
        setup();
        homeScreen = new HomeScreen(driver);
        addIncomePage = new AddIncomePage(driver);
        transactionsPage = new TransactionsPage(driver);
        homeScreen.clickAddIncome();
        addIncomePage.clickFiveBtn();
        addIncomePage.clickChooseCategoryBtn();
        addIncomePage.clickDepositsCategory();
        Assert.assertEquals(homeScreen.balanceAmount.getText(), "Balance $5.00");
    }
    @Test(priority = 2, dependsOnMethods = {"addIncome"})
    //edit the added income
     public void editIncome() {
        homeScreen.waitForBalanceVisibility();
        homeScreen.clickBalanceAmount();
        transactionsPage.clickTransaction();
        transactionsPage.clickExistingAmount();
        addIncomePage.clearField();
        addIncomePage.clickNineBtn();
        addIncomePage.clickBackBtn();
        homeScreen.waitForBalanceVisibility();
        Assert.assertEquals(homeScreen.balanceAmount.getText(), "Balance $9.00");
    }
    @Test(priority = 3, dependsOnMethods = {"addIncome", "editIncome"})
    //delete the added income
    public void deleteIncome() {
        transactionsPage.clickTransaction();
        transactionsPage.clickExistingAmount();
        addIncomePage.clickDeleteBtn();
        homeScreen.clickBalanceAmount();
        homeScreen.waitForBalanceVisibility();
        Assert.assertEquals(homeScreen.balanceAmount.getText(),"Balance $0.00");
        teardown();
    }
	
}
