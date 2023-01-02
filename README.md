# inetBankingP1
This is a complete Selenium Hybrid Framework Test
# Implementation
Created Maven project - inetBankingP1

Added necessary dependencies and plugins in pom.xml

<dependencies>
selenium-java - 4.7.2
testng - 7.6.1
poi - 5.2.3
poi-ooxml - 5.2.3
extentreports - 5.0.9
commons-lang3 - 3.12.0
commons-io - 2.11.0
log4j-api - 2.19.0
log4j-core - 2.19.0
junit - 4.11
lombok - 1.18.24

<plugins>
maven-compiler-plugin - 3.10.0
maven-surefire-plugin - 3.0.0-M7

Created 4 packages

com.inetbanking.pageObjects package for page objects classes
LoginPage.java
AddCustomerPage.java

com.inetbanking.testCases package for base class and testcases
BaseClass.java - added beforeclass annotation, parameters annotation to run testcase on desired browser, added after class annotation with quit(), capturescreen(), randomstring(), randomnum().
TC_LoginTest_001.java
TC_LoginDDT_002.java
TC_AddCustomerTest_003.java

com.inetbanking.testData package for storing excel files for data driven testing
LoginData.xlsx

com.inetbanking.utilities for utility files
ReadConfig.java - to read common values from config.properties file 
Reporting.java - extent report configuration
XLUtils.java - to read the data from excel file

configured log4j2.properties file for maintaining logs

# Execution 
Run testCases with Maven pom.xml
Run testCases through Maven CLI
Run testCases using run.bat

Run testCases using Jenkins
1 execute project using free style project (run.bat)
2 execute project using Maven project (pom.xml)

# Maintenance 
Creating repository in GitHub
Committing the project code in local repository
Push the project code to GitHub remote repository from local Git repository

Execute project using Maven project (by configuring repository URL in Source Code Management)


