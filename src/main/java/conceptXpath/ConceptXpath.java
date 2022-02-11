package conceptXpath;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptXpath {
	 WebDriver driver;
	
	@Before
	public  void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\18042\\eclipse-sep2021\\Xpath\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://techfios.com/billing/?ng=admin/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    }
	@Test
	      public void login() {
		//Storing element using web element
		  //Storing element
		 
		By UserName_Field=By.xpath("//*[@id=\"username\"]");
		By PassWord_Field=By.xpath("//*[@id=\"password\"]");
		By signinButton_Field=By.xpath("/html/body/div/div/div/form/div[3]/button");
		
		WebElement USERNAME_ELEMENT= driver.findElement(By.xpath("//input[@id='username']"));	
		WebElement PASSWORD_ELEMENT=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement SIGNIN_BUTTON_ELEMENT=driver.findElement(By.xpath("//button[@name='login']"));		 
	    //WebElement DASHBOARD_HEADER_ELEMENT=driver.findElement(By.xpath("//button[text()='Sign in']"));
	
	USERNAME_ELEMENT.sendKeys("demo@techfios.com");
	PASSWORD_ELEMENT.sendKeys("abc123");
	SIGNIN_BUTTON_ELEMENT.click();
	
	 WebElement DASHBOARD_HEADER_ELEMENT=driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[2]/a"));
		Assert.assertTrue("false!!", DASHBOARD_HEADER_ELEMENT.isDisplayed());
	}
}

