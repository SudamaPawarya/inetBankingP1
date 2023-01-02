package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig () //creating ReadConfig constructor
	{
		File src = new File("./Configuration/config.properties");//storing file in src object
		
		try {
			FileInputStream fis = new FileInputStream(src);//convert the file data into reading mode
															//and storing in fis object
			pro = new Properties();	//initiating pro object which we created in line no 9					
			pro.load(fis);					//loading the complete file in read mode
		} catch (Exception e) {
			System.out.println("Exception is " +e.getMessage());
		}
	}
	//creating methods for each variable to read each variable and their values
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getIEPath()
	{
		String iepath=pro.getProperty("iepath");
		return iepath;
	}
	
	public String getFirefoxPath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	

}
