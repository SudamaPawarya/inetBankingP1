package com.inetbanking.testCases;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig(); //creating a object and the ReadConfig() constructor will be
	//invoked, which we have created in ReadConfig.java Class
	//instead of hardcoding these values we can dynamically read the values from the ReadConfig.java class
	//by just calling the methods we have created in ReadConfig.java class
	//public String baseURL="https://demo.guru99.com/v4/";
	public String baseURL=readconfig.getApplicationURL();   //calling method instead of hardcoding url
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters ("browser") //this will take parameter from xml file
	@BeforeClass
	public void setup(String br) throws InterruptedException//setup method will take the parameter so we created browser variable-br, based on the value of
									//br we pass from xml file, accordingly the browser will be launched
	{
		logger=LogManager.getLogger(BaseClass.class);
		
		if (br.equals("chrome"))
		{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver=new ChromeDriver();
		}
		else if (br.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
		driver=new FirefoxDriver();
		}
		else if (br.equals("ie"))
		{
		System.setProperty("webdriver.edge.driver",readconfig.getIEPath());
		driver=new EdgeDriver();
		}
		//driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		driver.get(baseURL);
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public String randomnum()
	{
		String generatedstring2=RandomStringUtils.randomNumeric(4);
		return(generatedstring2);
	}

}











