package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ExpensesPage;
import pages.HomeScreen;
import pages.TransactionsPage;

import java.io.IOException;

public class TestExpenses extends BaseClass {

	HomeScreen homeScreen;
	ExpensesPage addExpensePage;
	TransactionsPage transactionsPage;

	@Test(priority = 1)
	// add new expense
	public void addExpense() throws IOException {
		setup();
		homeScreen = new HomeScreen(driver);
		addExpensePage = new ExpensesPage(driver);

		transactionsPage = new TransactionsPage(driver);
		String BalanceAmount = homeScreen.balanceAmount.getText();
		homeScreen.clickAddExpense();
		addExpensePage.clickFiveBtn();
		addExpensePage.clickChooseCategoryBtn();
		addExpensePage.clickExpenseCategory();
		Assert.assertEquals(BalanceAmount, "Balance -$5.00");
	}

	@Test(priority = 2, dependsOnMethods = { "addExpense" })
	// edit an added expense
	public void editExpense() {
		homeScreen = new HomeScreen(driver);
		addExpensePage = new ExpensesPage(driver);
		transactionsPage = new TransactionsPage(driver);
		homeScreen.waitForBalanceVisibility();
		homeScreen.clickBalanceAmount();
		transactionsPage.clickTransaction();
		transactionsPage.clickExistingAmount();
		addExpensePage.clearField();
		addExpensePage.clickNineBtn();
		addExpensePage.clickBackBtn();
		homeScreen.waitForBalanceVisibility();
		Assert.assertEquals(homeScreen.balanceAmount.getText(), "Balance -$9.00");
	}

	@Test(priority = 3, dependsOnMethods = { "addExpense", "editExpense" })
	// delete the added expense
	public void deleteExpense() {
		homeScreen = new HomeScreen(driver);
		addExpensePage = new ExpensesPage(driver);
		transactionsPage = new TransactionsPage(driver);
		transactionsPage.clickTransaction();
		transactionsPage.clickExistingAmount();
		addExpensePage.clickDeleteBtn();
		homeScreen.waitForBalanceVisibility();
		homeScreen.clickBalanceAmount();
		homeScreen.waitForBalanceVisibility();
		Assert.assertEquals(homeScreen.balanceAmount.getText(), "Balance $0.00");
		teardown();
	}

}
