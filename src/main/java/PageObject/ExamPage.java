package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ExamPage {
	
	    public WebDriver driver;
		
		public ExamPage(WebDriver driver) 
		{
			
		  PageFactory.initElements(driver, this);
		}
		
		//Let's begin button
		@FindBy(xpath="//input[@id='UserName']")
		public WebElement enterToken;
		
		//login button
		@FindBy(xpath="//button[@class='btn btn-primary']")
		public WebElement loginbutton;
		
		//audio sign
		@FindBy(xpath="//div[@id='dvChkAudioImageId']//img")
		public WebElement audiocheck1;
		
		//next button
		@FindBy(xpath="//input[@id='btnNextId']")
		public WebElement nextbutton;
		
		//start button
		@FindBy(xpath="//input[@class='btn btn-primary']")
		public WebElement startbutton;
		
		//close button
	    @FindBy(xpath="//a[contains(text(),'Close')]")
		public WebElement closebutton;
	    
	    //audio question check
	    @FindBy(xpath="//*[@id='dvAudioImgPlayId']/img")
		public List<WebElement> audiocondion;
	    
	    //video question check
	    @FindBy(xpath="//*[@id='dvQuesContainer']/div[1]/div/div[1]/div")
		public List<WebElement> videocondion;
		
	    //next button question check
	    @FindBy(css="#dvQuestionOutter > div:nth-child(6) > div > input")
		public WebElement nextbuttoncondion;

}
