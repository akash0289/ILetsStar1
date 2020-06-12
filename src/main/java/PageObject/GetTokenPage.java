package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetTokenPage {
	
	
	 public WebDriver driver;
		
		public GetTokenPage(WebDriver driver) 
		{
			
		  PageFactory.initElements(driver, this);
		}
		
		//Buy Now button
		@FindBy(xpath="//a[@class='btn btn-primary']")
		public WebElement buynowbutton;
		
		@FindBy(xpath="//input[@id='name']")
		public WebElement firstName;
		
		@FindBy(xpath="//input[@id='EmailId']")
		public WebElement emailId;
		
		@FindBy(xpath="//input[@id='MobileNo']")
		public WebElement mobileNumber;
		
		@FindBy(xpath="//div[6]//div[2]//div[1]//label[2]")
		public WebElement checkbox;
		
		@FindBy(xpath="//button[contains(@class,'btn btn-primary')]")
		public WebElement submitbutton;
		
		@FindBy(xpath="//input[@placeholder='Card number']")
		public WebElement cardNumber;
		
		@FindBy(xpath="//input[@placeholder='MM / YY']")
		public WebElement dateMonth;
		
		@FindBy(xpath="//input[@placeholder='CVC']")
		public WebElement cvc;
		
		@FindBy(xpath="//button[@type='submit']")
		public WebElement payNowbutton;

		
		public  void switchWindow()
		{
			driver.switchTo().defaultContent(); // you are now outside both frames
			driver.switchTo().frame("stripe_checkout_app");
			
		}
}
