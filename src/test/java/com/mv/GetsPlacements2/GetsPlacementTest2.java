package com.mv.GetsPlacements2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.mv.GetsPlacements2.Helper;
import com.mv.GetsPlacements2.TestData1;
import com.mv.GetsPlacements2.Utilities1;

import PageObject.ExamPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetsPlacementTest2 extends TestBase {
	protected static int counter = 0;
	protected static String[] tokens= {"7f9016b2","99f73caa","1001049e","693fb74c","93ae7718","52b36b22","bc48878e","6370f4a1","7c29aa89"};
	WebDriver driver;



	@Test(invocationCount=9, threadPoolSize = 9)
	public void TestMethod() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
					
		driver.manage().window().maximize();
				// wait for atleast 10 sec to find the element
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	    driver.get("http://mashvirtual.info/getsplacementtest/");
	    
	    Thread.sleep(4000);
			
	    ExamPage d=new ExamPage(driver);
	    
		d.enterToken.sendKeys(tokens[counter]);
		System.out.println("tokens is:  :"+tokens[counter]);
		counter++;
		
		d.loginbutton.click();
		
		//audio sign
		d.audiocheck1.click();
		Thread.sleep(6000);
		WebElement nextbutton =(WebElement)new WebDriverWait(driver,15).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='btnNextId']")));
        nextbutton.click();
		//d.nextbutton.click();
		
		// start
		d.startbutton.click();
		
		//condition check
		Utilities1 u = new Utilities1();
		u.checkCondition(driver);
		
		d.closebutton.click();
		driver.close();
		
		}	

		 
			
		

	

	
		
}
