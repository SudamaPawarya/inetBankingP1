# inetBankingP1
This is a complete Selenium Hybrid Framework Test
# Screenshots of the project
![Screenshot 2023-01-02 144837](https://user-images.githubusercontent.com/116425949/210213051-33c1ba6e-bb20-4019-b1c7-262b8b0e80b6.png)
![Screenshot 2023-01-02 144951](https://user-images.githubusercontent.com/116425949/210213078-0c048274-dbd6-49ee-af56-205a33dd279c.png)

# Implementation
1. Created Maven project - inetBankingP1
2. Added necessary dependencies and plugins in pom.xml
   * Dependencies
      * selenium-java - 4.7.2
      * testng - 7.6.1
      * poi - 5.2.3
      * poi-ooxml - 5.2.3
      * extentreports - 5.0.9
      * commons-lang3 - 3.12.0
      * commons-io - 2.11.0
      * log4j-api - 2.19.0
      * log4j-core - 2.19.0
      * junit - 4.11
      * lombok - 1.18.24
    * Plugins
      * maven-compiler-plugin - 3.10.0
      * maven-surefire-plugin - 3.0.0-M7

3. Created Four packages
    1. com.inetbanking.pageObjects package for page objects classes
        * LoginPage.java
        * AddCustomerPage.java
    2. com.inetbanking.testCases package for base class and testcases
        * BaseClass.java - added beforeclass annotation, parameters annotation to run testcase on desired browser, added after class annotation with quit(), capturescreen(), randomstring(), randomnum().
        * TC_LoginTest_001.java
        * TC_LoginDDT_002.java
        * TC_AddCustomerTest_003.java
    3. com.inetbanking.testData package for storing excel files for data driven testing
        * LoginData.xlsx
    4. com.inetbanking.utilities for utility files
        * ReadConfig.java - to read common values from config.properties file 
        * Reporting.java - extent report configuration
        * XLUtils.java - to read the data from excel file

4. configured log4j2.properties file for maintaining logs
5. configured spark-config.xml file for extent report template
6. configured testng.xml file to organize and run testcases.

# Execution 
1. Run testCases with Maven pom.xml
2. Run testCases through Maven CLI
3. Run testCases using run.bat
4. Run testCases using Jenkins
    * execute project using free style project (run.bat)
    * execute project using Maven project (pom.xml)

# Maintenance 
1. Creating repository in GitHub
2. Committing the project code in local repository
3. Push the project code to GitHub remote repository from local Git repository
4. Execute project using Maven project (by configuring repository URL in Source Code Management)

