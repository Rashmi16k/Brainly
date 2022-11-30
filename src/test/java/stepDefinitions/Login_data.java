package stepDefinitions;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class Login_data   {
	    WebDriver driver = null;
		@BeforeTest
		public void beforerun()
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	  
			  driver = new ChromeDriver();
			  
			driver.manage().window().maximize();
		}
		
		
		
		
		      @Test(dataProvider="logindata")
		      public void login1(String username , String Pwd) throws InterruptedException
		      {
		    	  driver.get("https://brainly.in/");
		  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		  		

		  		// login text
		  		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		  		WebDriverWait wait=new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Log in with Google']")));
		            
		  		// username textfield
		  		driver.findElement(By.name("username")).sendKeys(username);

		  		// passwordTextfield
		  		driver.findElement(By.name("password")).sendKeys(Pwd);

		  		// login buttton
		  		driver.findElement(By.xpath("//button[@data-testid='form_login_submit']")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("parents"))).click();
		           
		        driver.findElement(By.xpath("//a[text()='For parents']")).click();
		        driver.findElement(By.xpath("(//span[text()='Log In'])[1]")).click();
		        
		        
		       
		      }
		      
		      @DataProvider(name="logindata")
		      public Object[][] getTestData() throws IOException {
		  		Object [][]testdata= Login_Excel.getMultipleData("login");
		  		return testdata;
		      }
		    	  

	}


