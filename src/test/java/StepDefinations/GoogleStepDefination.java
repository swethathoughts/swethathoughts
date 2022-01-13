package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;


public class GoogleStepDefination {
	
	  WebDriver driver=null;
	
	
	@Given("^browser is open$")
	public void browser_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver","/Users/Ven/Downloads/chromedriver_win32/chromedriver.exe");
	     driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("^user is on google search page$")
	public void user_is_on_google_search_page()  {
		System.out.println("I am at browser page");
		driver.navigate().to("https://google.com");
	}

	@When("^user enters the text in search box$")
	public void user_enters_the_text_in_search_box() throws Throwable {
		System.out.println("Enters the text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		Thread.sleep(2000);
       }

	@And("^user hits enter$")
	public void user_hits_enter() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
}

	@Then("^user is navigated to search results$")
	public void user_is_navigated_to_search_results() throws Throwable {
		driver.getPageSource().contains("Online courses");
		System.out.println("I navigated to the page");
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}
}
