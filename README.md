# Monefy
This is the application under test. 
Monefy can help a user in tracking daily purchases, bills, and everything else you spend money on has never been so quick and enjoyable with this money manager.
Monefy is more than a money tracker, it's also one of the best savings apps to help you with money management. Keep track of your personal expenses and compare them to your monthly income with the budget planner.

# Framework Used
## Page Object Model and Page Factory using Appium.
Page Object Model, also known as POM, is a design pattern in Selenium that creates an object repository for storing all web elements.In Page Object Model, consider each web page of an application as a class file. Each class file will contain only corresponding web page elements. Using these elements, we can perform operations on the application under test.
* It is useful in reducing code duplication and improves test case maintenance.
* Helps with reusing code
* It eases readability and reliability of scripts: 

### Tools used.
* Appium Server
* Appium inspector

### Dependencies used in the framework
* Maven
* TestNG
* Selenium dependencies
* Appium client libraries
 
### Programming language used
* Java

### To test Project locally, 
* Clone repository at https://github.com/AllanTumu/Allan-Tumuhimbise.git
* Navigate to the pom.xml file and click build in your IDE to download the required dependencies.
* Navigate to src/test/java/config, update the config file with the details of your device i.e Device name, Android Version and Device Id.
* Run your Appium server
* Navigate to the testng.xml and run the tests locally.
* To check report, a test-output folder is created, open it and open index.html 

### Test ideas and Prioritization of test cases.
* Since the core business features are tracking income and expenses, these are the first areas to consider for out testing.
* Additionally, I have tested the filtering of information by date. Why? This is because in many cases, users would want to know their expenses or income on a certain date, so it would be important to automate this feature so as it can easily be tested.
* Lastly , I have automated the Account section. This is because a user would want to manage their finances from the account section since the Account is the home of the budgets and the user can view multiple expenses and incomes at a time.

### Test Case 1 - TestFilterDate
* Validate users can filter by date.
* Open the Monefy Application
* On the Home screen, tap open navigation in the left right corner
* Tap choose Date
* On the calendar screen, click the pencil icon to edit.
* Fill in the date (5/09/25)
* Click ok
* On the Home screen, verify that the date is equal to the set date.

### Test Case 2 - TestExpenses
* Validate Users can add expense
* Open Monefy Application
* On the Home screen, Tap the Add expense button
* Tap amount eg $5
* Tap choose category and select category.
* On the Home screen, verify that the balance is equal to the amount added.
#### Validate user can edit expense
- Open the Monefy Application
- On the home screen, click in the balance 
- On the transactions page, click an existing amount
- Clear field
- Input new Amount
- Navigate back to the Home screen and verify if the amount is now set to a new amount.
#### Validate users can delete expenses.
* Open the Monefy Application
* On the home screen, click in the balance 
* On the transactions page, click an existing amount.
* Click the delete button in the extreme top right corner.
* Validate that expense was deleted by checking the outstanding balance.

### Test Case 3 - TestIncome
* Validate Users can add income
* Open Monefy Application
* On the Home screen, Tap the Add income button
* Tap amount eg $5
* Tap choose category and select deposit category.
* On the Home screen, verify that the balance is equal to the amount added.

### Validate user can edit income
* Open the Monefy Application
* On the home screen, click in the balance 
* On the transactions page, click an existing amount
* Clear field
* Input new Amount
* Navigate back to the Home screen and verify if the amount is now set to a new amount.

### Validate users can delete income.
* Open the Monefy Application
* On the home screen, click in the balance 
* On the transactions page, click an existing amount.
* Click the delete button in the extreme top right corner.
* Validate that expense was deleted by checking the outstanding balance.
### The possibilities of automation the proposed scenarios on different levels. Summary of pros and cons.
#### 1. Manual Tests 
Manual testing is the process of manually testing software for defects. 
According to the Monefy application, all the test scenarios can be tested manually, this was performed during the 1st phase of test charters. Manual testing is the process of manually testing software for defects. 
#### Pros 
* It is easy to find defects and Tester can provide suggestions to the development team. 
* Manual testing gives testers the freedom to use their expertise to emulate the user experience.
#### Cons
* It requires a lot of time to perform Manual tests.
* There are high chances of making errors.
#### 2. Automations tests
Automated tests are ideal for regression testing and detecting code-based defects. Therefore, they should ideally run after every new release of a product or at regular intervals throughout its development stages. Most automated test frameworks are also helpful in checking an application's basic features and functions without trying to emulate the user experience.
#### Pros
* Test executions takes a short time
* It eases the task in cases of repeated tests
* There are less chances of Human error.
* Increases test coverage.
#### Cons
* Automated tests are Flaky (Sometimes they pass and other times they fail)
* Slow executions.
* Maintenance of the Automation tests is costly.

#### Unit testing:
It can not be applied from the app itself or APK. Unit testing is responsible for testing a single unit or component of a software(like functions).

#### Pros:
* Provides better and clean code.
* It helps to let a code be easy to refactor.

#### Cons:
* It can not check the UI and can not mimic a user behavior with the app., so we can not depend only on it to check the app behavior.
