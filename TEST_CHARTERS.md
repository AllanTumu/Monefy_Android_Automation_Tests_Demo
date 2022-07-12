# Testing the Monefy Android Mobile Application.

# Exploratory testing charters

**Test 1**

| Testers Name | Allan Tumuhimbise |
| ------ | ------ |
| Title | Test the UI the Monefy Android Application |
| Test charter | End to End Ui tests of the application. |
| Objective | To conduct user interface tests on Monefy Android Mobile application to ensure that the user interface is all ok and meets a certain level of acceptance |
| Application | Monefy |
| Test Environment | Production |
| Source | Google Play store |
| Test Device | Tecno Camon 15 premier |
| Test Device OS | Android 10 |
| Start date | Tuesday 10 May 2022 |
| End date | Tuesday 10 May 2022 |
| Duration | 60 mins |
| Test Ideas |  ▪ Test by exploring the UI of the Monefy |
| Defects/Bugs |  ▪ The legal pages (Privacy policy and Terms and conditions) are still visible and clickable even when a user scrolls them out of the focus area. |

**Test 2**

| Testers Name | Allan Tumuhimbise |
| ------ | ------ |
| Title | Test adding a new expense in the application |
| Test charter | Add expense tests |
| Objective | To conduct a test to verify if a user can add new expenses to their account. |
| Application | Monefy |
| Test Environment | Production |
| Source | Google Play store |
| Test Device | Tecno Camon 15 premier |
| Test Device OS | Android 10 |
| Start date | Wednesday 11 May 2022 |
| End date | Wednesday 11 May 2022 |
| Duration | 60 mins |
| Test Ideas |  ▪ Test flow by pressing the category icons on screen <br> ▪   ️Test flow by pressing the - icon on screen |
| Defects/Bugs | ▪ Users can not add numbers after adding decimal places when they have UGX (Ugandan Shillings) as their currency. |

**Test 3**

| Testers Name | Allan Tumuhimbise |
| ------ | ------ |
| Title | Test filtering using a duration. |
| Test charter | Filtering by a specific time. |
| Objective | To conduct a test to verify if a user can filter by a specific time.|
| Application | Monefy |
| Test Environment | Production |
| Source | Google Play store |
| Test Device | Tecno Camon 15 premier |
| Test Device OS | Android 10 |
| Start date | Wednesday 11 May 2022 |
| End date | Wednesday 11 May 2022 |
| Duration | 60 mins |
| Test Ideas |  ▪ Test flow by filtering using day, week, month, year, all, interval or choose date <br> ▪   Test by filtering accounts e.g All accounts, cash, payment card.|
| Defects/Bugs | ▪ User can add decimal places in the year e.g 23.89764 <br> ▪ Keyboard is switched from integer keyboard  to Character keyboard and it is not dismissed after clicking save in the process of filtering by interval.|

# **Bug Reports**

| BUG REPORT  001 	|  	|  	|  	|  	|
|---	|---	|---	|---	|---	|
| Submitted By:  	| Allan Tumuhimbise 	|  	| Date:  	| Tuesday 10 May 2022 	|
| Summary:  	|  	|  	| File Attachments:  	|  	|  	|
| Privacy policy and Terms and conditions are still visible and clickable even when a user scrolls them out of the focus area. 	|  	|  	| # 	|  	|  	|
| Description:  	|  	|  	| Additional Information:  	|  	|  	|
|  When a user is on the welcome screen and they scroll, the privacy policy and terms and condition links are scrolled out of focus but they are still visible and clickable 	|  	|  	|  	|  	|  	|
| Actual Result: 	|  	|  	| Privacy  policy and Terms and conditions are still visible and clickable even when they are out of focus. 	|  	|  	|
| Expected Result: 	|  	|  	| Privacy  policy and Terms and conditions should not be visible and clickable even when they are scrolled down and out of focus. 	|  	|  	|
| Steps to Reproduce:  	|  	|  	|  	|  	|  	|
| Download Monefy application from play store<br>Input subscription information<br>After the onboarding tips, the login screen should appear with the legal links (privacy policy and terms and conditions.<br>Scroll up to put the privacy policy and terms and conditions out of focus.<br>Click on one of the links while out of focus 	|  	|  	|  	|  	|  	|
| Reproducible 	|  	| 10/10 	| Reproducible all the times 	|  	|  	|
| Environment:  	|  	| PRODUCTION 	|  	|  	|  	|
| Severity:  	|  	| Minor 	|  	|  	|  	|
| Priority: 	|  	| Minor 	|  	|  	|  	|
| Device Configurations: 	|  	| Tecno Camon 15 premier 	| Android 10, wifi internet connection 	|  	|  	|

| BUG REPORT  002 	|  	|  	|  	|  	|  
|:---	|:---	|:---	|:---	|:---	|
| Submitted By:  	| Allan Tumuhimbise 	|  	| Date:  	| Wednesday 11 May 2022 	|
| Summary:  	|  	|  	| File Attachments:  	|  	|  	|
| Users are not able to add decimal digits after the decimal place when they have Ugandan shillings as their selected currency. 	|  	|  	|  	|  	|  	|
| Description:  	|  	|  	| Additional Information:  	|  	|  	|
|  When a user is under the add new expense screen and they have Ugandan shillings as their selected currency. When they input a certain amount and add a decimal place, they can not add a figure after the decimal place. 	|  	|  	|  	|  	|  	|
| Actual Result: 	|  	|  	| Users can’t add figures in the add new expense amount field after inserting a decimal place. 	|  	|  	|
| Expected Result: 	|  	|  	| Users should be able to add figures in the add new expense amount field after inserting a decimal place. 	|  	|  	|
| Steps to Reproduce:  	|  	|  	|  	|  	|  	|
| - Open monefy application<br>- Change currency by tapping the 3 dots in the right corner, select currencies and look for ugandan shillings.<br>- Tap the - sign on the screen<br>- In the keyboard tap any digit followed by a point (.)<br>- Tap another digit to make it 900.5<br>- Users can not add any digit after adding a decimal place. 	|  	|  	|  	|  	|  	|
| Reproducible 	|  	| 5/10 	| Reproducible most of the times 	|  	|  	|
| Environment:  	|  	| PRODUCTION 	|  	|  	|  	|
| Severity:  	|  	| High 	|  	|  	|  	|
| Priority: 	|  	| Medium 	|  	|  	|  	|
| Device Configurations: 	|  	| Tecno Camon 15 premier 	| Android 10, wifi internet connection 	|  	|  	|

| BUG REPORT  003 	|  	|  	|  	|  	|  
|---	|---	|---	|---	|---	|
| Submitted By:  	| Allan Tumuhimbise 	|  	| Date:  	| Wednesday 11 May 2022 	|
| Summary:  	|  	|  	| File Attachments:  	|  	|  	|
| User can add decimal places in the year e.g 23.89764 	|  	|  	| # 	|  	|  	|
| Description:  	|  	|  	| Additional Information:  	|  	|  	|
| When a user selects an interval or chooses a date, they can a year with decimal places for example 23.89764 	|  	|  	|  	|  	|  	|
| Actual Result: 	|  	|  	| User can add decimal places in the year e.g 23.89764 	|  	|  	|
| Expected Result: 	|  	|  	| User shouldn’t be able to add decimal places in the year e.g 23.89764 	|  	|  	|
| Steps to Reproduce:  	|  	|  	|  	|  	|  	|
| - Open monefy application<br>- Tap the filter icon in the top right corner<br>- Select choose date<br>- On the calendar screen, tap pencil icon to edit date<br>- Input date with a year that has decimal places forexaple 5/11/23.897644444484<br>- Year won’t be validated, so year with decimal places is allowed. 	|  	|  	|  	|  	|  	|
| Reproducible 	|  	| 10/10 	| Reproducible all of the times 	|  	|  	|
| Environment:  	|  	| PRODUCTION 	|  	|  	|  	|
| Severity:  	|  	| High 	|  	|  	|  	|
| Priority: 	|  	| Major 	|  	|  	|  	|
| Device Configurations: 	|  	| Tecno Camon 15 premier 	| Android 10, wifi internet connection 	|  	|  	|

### (b) Findings from your charters. Did everything work as expected? What bugs were discovered?

All the testing sessions were successful and on time. Three test sessions were performed in a duration of 6o mins per test session.

Everything did not work as expected where by some of the tests failed as compared to what I would expect as a quality assurance engineer. Some of these tests were mostly functional and others were UI/UX. I experienced one crash which I was not able to reproduce again but I think if I had a staging application and access to logs or firebase logs, I would know what exactly caused the crash and I would report it with the steps to reproduce.

For the bugs found, I have created bug reports with some screenshots and all the required information to reproduce the bugs. Check the upper section with bug reports for more details about the bugs.

### (c ) Prioritization of those charters - which area of the app or testing would you explore first and why?

**UI/UX tests. Why?**
I started with UI/UX tests, before shifting to functionality of the application, we have to ensure that the user interface is appealing. Why? This is because the user interface is what the user interacts with to use the application. It communicates a lot to the customer about the quality of the product and also helps to build an impression in the customer's mind. As a QA engineer, I have to make sure that everything regarding the UI is intact and solid, buttons in the right shape, text field in right position and size and all the other tests involving the user interface.

**Functional tests.**

After the UI/UX test, I shifted to functional tests to ensure that the different parts of the applications were functional and they are able to achieve the desired purpose that they were built to achieve. This is the point I started looking into tests about adding new expenses or adding new income, filtering, adding categories and many other functional tests.

**Integration tests**

Lastly after ensuring that the Ui and the different parts of the application are working as expected, I switched to the testing of the integration between the front end and back end.

#### (d) How much time you have planned for each charter?

I planned 60 mins (1 hour) for each charter. I decided to use a short time in a span of 60 mins per test charter so as to do adhoc testing per feature where by I am not specifically looking for something but instead I am just exploring the application, feeling it end to end (per feature) and reporting any issues I come across.

#### (e) What kind of risks do you need to mitigate for this type of application?

**Functionality risks** - These are risks that arise when a certain feature was not developed in a way that meets the required specs, through this, some of the parts of the applications do not achieve the exact purpose as to why the feature was built. 
To mitigate such risks, developers should also do a bit of testing to the features they have built before resolving these features to be tested by QA. This will in turn help the reduction of missing cases in development but also it will help reduce the time taken in testing a feature through the reduced QA-Developer back and forth interactions.

**User experience risks** - These kinds of risks arise when the product doesn’t meet a required standard of acceptance in terms of UI/UX. For Example on the Subscription screen there is text that is in the shape of the button with ONLY RIGHT NOW. From experience, I think there is a high number of users that click that word thinking it is a button only to realize that it does nothing so they proceed to the subscription screen. It is ok and works as per functional user requirements but it creates a bad user experience.

**Computational errors** - This is quite common with applications that involve finances or calculations. Under this, the developer might have made a wrong computation which in turn affects the user while using the application.
This being a human error, the best way to mitigate this risk is performing comprehensive tests on a feature to ensure that such computational errors are eliminated and the parts of the application that need computations are working as expected.
