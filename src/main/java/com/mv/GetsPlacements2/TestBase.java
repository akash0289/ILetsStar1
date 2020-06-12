package com.mv.GetsPlacements2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver=null;
	
	public static Properties readPropertyfile() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\MV\\eclipse-workspace\\GetsPlacements2\\src\\main\\java\\datafile.properties");
		prop.load(fis);
		
		return prop;
	}
	
	public void invokeBrowser() throws IOException
	{		
		Properties prop=TestBase.readPropertyfile();
		if(prop.getProperty("browser").equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equals("chrome"))
		{
			WebDriverManager.chromedriver().version("79.0.3945.36").setup();
			driver = new ChromeDriver();
		}
		else
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
	}
}
