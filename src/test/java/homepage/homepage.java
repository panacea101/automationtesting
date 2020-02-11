package homepage;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;;

public class homepage {
	
	private WebDriver browser;
    private String baseUrl;
    
	@BeforeClass
    public void setUp() throws Exception
    {
		System.setProperty("webdriver.chrome.driver", "/Users/goldcoast/opt/WebDriver/bin/chromedriver");
        browser = new ChromeDriver();
        baseUrl = "https://www.wheelsup.com";
        browser.get(baseUrl);
		WebDriverWait wait = new WebDriverWait(browser, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button.primary")));
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

    }
  @Test
  public void f() {

	  WebDriverWait wait = new WebDriverWait(browser, 40);
      Actions actions = new Actions(browser);
      
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='A Revolution Has Taken Flight']")));
	  String revealText = browser.findElement(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/app-home-hero/div/div[2]/div/div/div/h1")).getText();
      System.out.println(revealText);
      
      JavascriptExecutor jse = (JavascriptExecutor)browser;
      jse.executeScript("window.scrollBy(0,6050)", "");
      System.out.println("Page scroll down");
      
      //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='A Revolution Has Taken Flight']")));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"option_3\"]/li[1]/app-link/div/span")));
      String phoneNumber = browser.findElement(By.xpath("//*[@id=\"option_3\"]/li[1]/app-link/div/span")).getText();
      System.out.println(phoneNumber);
      
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"option_3\"]/li[2]/app-link/a")));
      String email = browser.findElement(By.xpath("/html/body/app-root/div/app-footer/footer/div/div[1]/div/div[3]/div/ul/li[2]/app-link/a")).getText();
      System.out.println( email );
      
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Find Us']")));
      String address = browser.findElement(By.xpath("/html/body/app-root/div/app-footer/footer/div/div[1]/div/div[4]/div/ul/li/span")).getText();
      System.out.println( address );
      
      jse.executeScript("window.scrollBy(6000,0)", "");
      System.out.println("Page scroll up");
      
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-menu/div/div[2]/div/div/div[1]/div/nav/ul/li[1]/app-menu-item/div/a")));
      browser.findElement(By.xpath("/html/body/app-root/div/app-menu/div/div[2]/div/div/div[1]/div/nav/ul/li[1]/app-menu-item/div/a")).click();
      System.out.println( "Membership Options Clicked" );

	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-menu/div/div[2]/div/div/div[1]/div/nav/ul/li[1]/app-menu-item/div/ul/li[2]/a")));
      browser.findElement(By.xpath("/html/body/app-root/div/app-menu/div/div[2]/div/div/div[1]/div/nav/ul/li[1]/app-menu-item/div/ul/li[2]/a")).click();
      System.out.println( "Core Membership Clicked" );
      
      //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"image-component\"]/div[2]/div[1]/h1")));
      //jse.executeScript("window.scrollBy(0,7000)", "");
      actions.moveToElement(browser.findElement(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-ways-to-fly[2]/div/app-module-title/div/h1")));
      actions.perform();
      System.out.println("Page scroll Down to signing up is easy");
      
      actions.moveToElement(browser.findElement(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-ways-to-fly[2]/div/div/div[1]/div[1]/app-panel/div/div[2]/h3")));
      actions.perform();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-ways-to-fly[2]/div/div/div[1]/div[1]/app-panel/div/div[2]/h3")));
      String initiationFee = browser.findElement(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-ways-to-fly[2]/div/div/div[1]/div[1]/app-panel/div/div[2]/p/p")).getText();
      System.out.println( initiationFee );
      
      	  
      //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-soft-footer-module/div/div[3]/div/div[2]/div[1]/div/div/form/app-input-marketo[1]/div/app-input/div")));
      actions.moveToElement(browser.findElement(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-soft-footer-module/div/div[3]/div/div[2]/div[1]/div/div/form/app-input-marketo[1]/div/app-input/div")));
      actions.perform();
      browser.findElement(By.xpath("//*[@id=\"FirstName-clone\"]")).sendKeys("Sam");
      System.out.println( "First Name Sam" );

	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LastName-clone\"]")));
      browser.findElement(By.xpath("//*[@id=\"LastName-clone\"]")).sendKeys("Bridges");
      System.out.println( "Last Name Bridges" );
          
      
      browser.findElement(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-soft-footer-module/div/div[3]/div/div[2]/div[2]/app-button")).click();
      System.out.println( "Continue Clicked" );
      	  
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Email-clone\"]")));
      browser.findElement(By.xpath("//*[@id=\"Email-clone\"]")).sendKeys("pbridge@wheelsup.com");
      System.out.println( "Email Address entered" );
      
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Phone-clone\"]")));
      browser.findElement(By.xpath("//*[@id=\"Email-clone\"]")).sendKeys("19775185169");
      System.out.println( "Phone Number entered" );
      
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Company__c-clone\"]")));
      browser.findElement(By.xpath("//*[@id=\"Company__c-clone\"]")).sendKeys("WheelsUp");
      System.out.println( "Company name entered" );
      
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Address-clone\"]")));
      browser.findElement(By.xpath("//*[@id=\"Address-clone\"]")).sendKeys("220 West 42nd st");
      System.out.println( "Address entered" );
 
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"City-clone\"]")));
      browser.findElement(By.xpath("//*[@id=\"City-clone\"]")).sendKeys("New York");
      System.out.println( "City entered" );

      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"State-clone\"]")));
      browser.findElement(By.xpath("//*[@id=\"State-clone\"]")).sendKeys("New York");
      System.out.println( "State entered" );

      //actions.moveToElement(browser.findElement(By.xpath("//*[@id=\"PostalCode-clone\"]")));
      //actions.perform();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"PostalCode-clone\"]")));
      browser.findElement(By.xpath("//*[@id=\"PostalCode-clone\"]")).sendKeys("10020");
      System.out.println( "Postal Code entered" );

      //actions.moveToElement(browser.findElement(By.xpath("//*[@id=\\\"Country-clone\\\"]")));
      //actions.perform();     
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Country-clone\"]")));
      browser.findElement(By.xpath("//*[@id=\"Country-clone\"]")).sendKeys("United States");
      System.out.println( "Country entered" );
      

      actions.moveToElement(browser.findElement(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-request-info/div/div[1]/div[3]/div/div/form/app-drop-down-marketo[1]/div/app-drop-down/div/div/div[2]")));
      actions.perform(); 
      //jse.executeScript("window.scrollBy(0,500)", "");
      //System.out.println("Page scroll up");
      
      //Close cookie accept
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-gdpr-banner/div/div[1]/mat-icon")));
      browser.findElement(By.xpath("/html/body/app-root/div/app-gdpr-banner/div/div[1]/mat-icon")).click();
      
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"How_Many_Private_Flights_Per_Year__c-clone0\"]/div/div[2]/div[1]")));
      browser.findElement(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-request-info/div/div[1]/div[3]/div/div/form/app-drop-down-marketo[1]/div/app-drop-down/div/div/div[2]")).click();
      
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"How_Many_Private_Flights_Per_Year__c-clone0\"]/div/div[2]/div[2]/ul/li[1]/p")));
      browser.findElement(By.xpath("//*[@id=\"How_Many_Private_Flights_Per_Year__c-clone0\"]/div/div[2]/div[2]/ul/li[1]/p")).click();
      System.out.println( "How many private flights question answered" );
      
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-request-info/div/div[1]/div[3]/div/div/form/app-input-select-box-marketo[1]/div/div[1]/div[1]/app-input-select-box/div/div/div[1]/label")));
      browser.findElement(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-request-info/div/div[1]/div[3]/div/div/form/app-input-select-box-marketo[1]/div/div[1]/div[1]/app-input-select-box/div/div/div[1]/label")).click();
      System.out.println( "Do you need to travel with pets question answered" );

      //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/app-page/div[1]/div/div[2]/app-request-info/div/div[1]/div[3]/div/div/form/app-drop-down-marketo[2]/div/app-drop-down/div/p")));
      actions.moveToElement(browser.findElement(By.xpath("//*[@id=\"How_does_the_Lead_currently_Travel__c-clone\"]/p")));
      actions.perform();
      //jse.executeScript("window.scrollBy(0,250)", "");
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Do_you_own_or_travel_to_a_second_home__c-cloneYes\"]/div/div[2]/div[1]")));
      browser.findElement(By.xpath("//*[@id=\"Do_you_own_or_travel_to_a_second_home__c-cloneYes\"]/div/div[2]/div[1]")).click();
      
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Do_you_own_or_travel_to_a_second_home__c-cloneYes\"]/div/div[2]")));
      browser.findElement(By.xpath("//*[@id=\"Do_you_own_or_travel_to_a_second_home__c-cloneYes\"]/div/div[2]")).click();
      System.out.println( "Second Home question answered" );

      actions.moveToElement(browser.findElement(By.xpath("//*[@id=\"Product_Interest__c-clone\"]/p")));
      actions.perform();
//      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"How_does_the_Lead_currently_Travel__c-clone\"]/div[1]/div[1]/app-input-select-box/div/div/div[1]")));
//      browser.findElement(By.xpath("//*[@id=\\\"How_does_the_Lead_currently_Travel__c-clone\\\"]/div[1]/div[1]/app-input-select-box/div/div/div[1]")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"How_does_the_Lead_currently_Travel__c-clone\"]/div[1]/div[5]/app-input-select-box/div/div/div[1]")));
      browser.findElement(By.xpath("//*[@id=\"How_does_the_Lead_currently_Travel__c-clone\"]/div[1]/div[5]/app-input-select-box/div/div/div[1]")).click();
      System.out.println( "How do you currently fly question answered" ); 
      
      actions.moveToElement(browser.findElement(By.xpath("//*[@id=\"leadSourceWebList-cloneAdvertisement\"]/p")));
      actions.perform();      
      ////*[@id="Product_Interest__c-clone"]/div[1]/div[2]/app-input-select-box/div/div/div[1]
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Product_Interest__c-clone\"]/div[1]/div[2]/app-input-select-box/div/div/div[1]")));
      browser.findElement(By.xpath("//*[@id=\"Product_Interest__c-clone\"]/div[1]/div[2]/app-input-select-box/div/div/div[1]")).click();
      System.out.println( "What Kind Of Membership question answered" );     
      
      actions.moveToElement(browser.findElement(By.xpath("//*[@id=\"submitForm\"]")));
      actions.perform();      
      ////*[@id="Product_Interest__c-clone"]/div[1]/div[2]/app-input-select-box/div/div/div[1]
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"leadSourceWebList-cloneAdvertisement\"]/div/div[2]/div[1]")));
      browser.findElement(By.xpath("//*[@id=\"leadSourceWebList-cloneAdvertisement\"]/div/div[2]/div[1]")).click();
      browser.findElement(By.xpath("//*[@id=\"leadSourceWebList-cloneAdvertisement\"]/div/div[2]/div[2]")).isEnabled();
      browser.findElement(By.xpath("//*[@id=\"leadSourceWebList-cloneAdvertisement\"]/div/div[2]/div[2]/ul/li[4]")).click();      
      System.out.println( "How do you hear about us question answered" );
      
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"WebFormComment__c-clone\"]/div/textarea")));
      browser.findElement(By.xpath("//*[@id=\"WebFormComment__c-clone\"]/div/textarea")).sendKeys("Am I hired?\n How much does it cost to fuel a jet?");
      System.out.println( "Specific questions entered" );
      
      browser.findElement(By.xpath("/html/body/app-root/div/div/app-page/div[1]/app-modal-header/div/div/div/div/div[2]/div")).click();
      System.out.println( "Close form" );    
      
      browser.close(); 
  }
}
