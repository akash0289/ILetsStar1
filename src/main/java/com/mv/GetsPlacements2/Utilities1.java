package com.mv.GetsPlacements2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.ExamPage;

public class Utilities1 {

	WebDriver driver;
	
	
	public void checkCondition(WebDriver driver) {

		for (int i = 0; i < 18; i++) {

			WebDriverWait wait;

			try {
				By container = By.id("dvQuesContainer");

				wait = new WebDriverWait(driver, 10);
				// System.out.println("call2");

				wait.until(ExpectedConditions.presenceOfElementLocated(container));
				// System.out.println("call3");
				
				  ExamPage d=new ExamPage(driver);
                   
				  //!driver.findElements(By.xpath("//*[@id='dvAudioImgPlayId']/img")).isEmpty()
				  
				if (!d.audiocondion.isEmpty()) {
					WebDriverWait some_element = new WebDriverWait(driver, 5);
					WebElement audio = some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='dvAudioImgPlayId']/img")));
					audio.click();
					Thread.sleep(2000);
					//!driver.findElements(By.xpath("//*[@id='dvQuesContainer']/div[1]/div/div[1]/div")
					
				} else if (!d.videocondion.isEmpty()) {
					WebDriverWait some_element1 = new WebDriverWait(driver, 5);
					WebElement video = some_element1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='dvQuesContainer']/div[1]/div/div[1]/div")));
					video.click();
					Thread.sleep(2000);
				} 
				
				d.nextbuttoncondion.click();
				
				
				
				}
			catch (Exception ee) {

				System.out.println("exception" + ee);

			}
		}

		}
	
	
	

	
}
