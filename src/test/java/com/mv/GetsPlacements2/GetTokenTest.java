package com.mv.GetsPlacements2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObject.GetTokenPage;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class GetTokenTest {
	
	//protected static int counter = 0;
	//, threadPoolSize = 5
  @Test(invocationCount=10, threadPoolSize = 10)
  public void testRunner() throws InterruptedException {
   int invocationCount=0;
   
		/*
		 * WebDriverManager.chromedriver().version("79.0.3945.36").setup(); WebDriver
		 * driver = new ChromeDriver();
		 */
   WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	// wait for atleast 10 sec to find the element
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   
  
   
   
  
  driver.get("http://mashvirtual.info/getsplacementtest/");
  Thread.sleep(4000);
  GetTokenPage g=new GetTokenPage(driver);
  
        WebElement buynowwindow =(WebElement)new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary']")));
        buynowwindow.click();
  
      
  
        WebElement firstName =(WebElement)new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='name']")));
        firstName.sendKeys("Akash Shrivastava");
        
  
        g.emailId.sendKeys("akash.mv@outlook.com");
  
        g.mobileNumber.sendKeys("1283982938");
  
  
        g.checkbox.click();
  
 
        g.submitbutton.click();
        
        Thread.sleep(4000);
  
  
        driver.switchTo().defaultContent(); // you are now outside both frames
		driver.switchTo().frame("stripe_checkout_app");
     
		Thread.sleep(4000);
 
        g.cardNumber.sendKeys("4242 4242 4242 4242"); 
    
  
         g.dateMonth.sendKeys("09 / 2020");
  
         g.cvc.sendKeys("7655");
  
  
         g.payNowbutton.click();
  
  Thread.sleep(4000);
  driver.close();
  
 
  }
}