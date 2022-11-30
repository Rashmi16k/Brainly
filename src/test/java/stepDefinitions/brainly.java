package stepDefinitions;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class brainly {
	

	
	
		WebDriver driver=null;
		
		
		
		@Given("Browser is open")
		public void browser_is_open() {
			System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://brainly.in/");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		}

		@And("web application is displayed")
		public void web_application_is_dispalyed() {
			driver.findElement(By.xpath("//span[text()='Log in']")).click();
			
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Log in with Google']")));
			
		}
		
		
		@When("user enters valid credentials")
		public void user_enters_valid_credentials() {
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rashmiguddappa@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("halaswami@16");
			
		    
		}

		@And("user clicks on Login")
		public void user_clicks_on_login() {
			driver.findElement(By.xpath("//button[@data-testid='form_login_submit']")).click();
		}

		@Then("user should be able to login")
		public void user_should_be_able_to_login() {
			String title=driver.getCurrentUrl();
			if(title.contains("brainly.in"))
			{
				System.out.println("user is logged in");
			}
			else
			{
				System.out.println("user is unable to login");
			}
		}

		@When("user clicks on for parents icon")
		public void user_clicks_on_for_parents_icon() {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("parents"))).click();

			
			driver.findElement(By.xpath("//a[text()='For parents']"));
			driver.findElement(By.xpath("(//span[text()='Log in'])[1]"));
			
		}

		@Then("for parents page should be displayed")
		public void for_parents_page_should_be_displayed() {
			String title=driver.getCurrentUrl();
			if(title.contains("in"))
			{
				System.out.println("For parents page is displayed");
			}
			else
			{
				System.out.println("For parents page is not dispalyed");
			}
		}
		
		//subjects

		@When("user clicks on hindi subject")
		public void user_clicks_on_hindi_subject() {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='Hindi']")))).click();
			
		}

		@Then("user should be able to see hindi subject answers")
		public void user_should_be_able_to_see_hindi_subject_answers() {
			String title=driver.getCurrentUrl();
			if(title.contains("hindi"))
			{
				System.out.println("hindi page is displayed");
			}
			else
			{
				System.out.println("hindi page is not dispalyed");
			}
		}

		@When("user clicks on math subject")
		public void user_clicks_on_math_subject() {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='Math']")))).click();

		}

		@Then("user should be able to see math subject answers")
		public void user_should_be_able_to_see_math_subject_answers() {
			String title=driver.getCurrentUrl();
			if(title.contains("math"))
			{
				System.out.println("math page is displayed");
			}
			else
			{
				System.out.println("math page is not dispalyed");
			}
		}

		@When("user clicks on history subject")
		public void user_clicks_on_history_subject() {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='History']")))).click();
		}

		@Then("user should be able to see history subject answers")
		public void user_should_be_able_to_see_history_subject_answers() {
			String title=driver.getCurrentUrl();
			if(title.contains("history"))
			{
				System.out.println("history page is displayed");
			}
			else
			{
				System.out.println("history page is not dispalyed");
			}
		}

		@When("user clicks on english subject")
		public void user_clicks_on_english_subject() {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='English']")))).click();
			
		}

		@Then("user should be able to see english subject answers")
		public void user_should_be_able_to_see_english_subject_answers() {
			String title=driver.getCurrentUrl();
			if(title.contains("english"))
			{
				System.out.println("english page is displayed");
			}
			else
			{
				System.out.println("english page is not dispalyed");
			}
		}

		@When("user clicks on geography subject")
		public void user_clicks_on_geography_subject() {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='Geography']")))).click();
			
		}

		@Then("user should be able to see geography subject answers")
		public void user_should_be_able_to_see_geography_subject_answers() {
			String title=driver.getCurrentUrl();
			if(title.contains("geography"))
			{
				System.out.println("geography page is displayed");
			}
			else
			{
				System.out.println("geography page is not dispalyed");
			}
		}

		@When("user clicks on biology subject")
		public void user_clicks_on_biology_subject() {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='Biology']")))).click();
		}

		@Then("user should be able to see biology subject answers")
		public void user_should_be_able_to_see_biology_subject_answers() {
			String title=driver.getCurrentUrl();
			if(title.contains("biology"))
			{
				System.out.println("biology page is displayed");
			}
			else
			{
				System.out.println("biology page is not dispalyed");
			}
		}

		@When("user clicks on physics subject")
		public void user_clicks_on_physics_subject() {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='Physics']")))).click();
		}

		@Then("user should be able to see physics subject answers")
		public void user_should_be_able_to_see_physics_subject_answers() {
			String title=driver.getCurrentUrl();
			if(title.contains("physics"))
			{
				System.out.println("physics page is displayed");
			}
			else
			{
				System.out.println("physics page is not dispalyed");
			}
		}

		
		

		@Then("user should be able to select the list of levels")
		public void user_should_be_able_to_select_the_list_of_levels() {
			WebElement allLevels=driver.findElement(By.xpath("(//select[@class='sg-select__element'])[1]"));
			Select select=new Select(allLevels);
			
			List<WebElement> options=select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				WebElement sortBy=driver.findElement(By.xpath("(//select[@class='sg-select__element'])[1]"));
				Select sel=new Select(sortBy);
				sel.selectByIndex(i);
			}
		    
		}

		

		@Then("user should be able to select the list dropdown")
		public void user_should_be_able_to_select_the_list_dropdown() {
			WebElement unAnswered=driver.findElement(By.xpath("(//select[@class='sg-select__element'])[2]"));
			Select select1=new Select(unAnswered);
			
			List<WebElement> options1=select1.getOptions();
			for (int i = 0; i < options1.size(); i++) {
				WebElement sortBy=driver.findElement(By.xpath("(//select[@class='sg-select__element'])[2]"));
				Select sel=new Select(sortBy);
				sel.selectByIndex(i);
			}
		}

		@Then("user clicks on ask a question button")
		public void user_clicks_on_ask_a_question_button() {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Ask your question']")))).click();
			driver.findElement(By.xpath("//textarea[@data-testid='text_editor_textarea']")).sendKeys("(a+b)square");
			
		}


		@Then("user clicks on pick  a subject dropdown")
		public void user_clicks_on_pick_a_subject_dropdown() {
			WebElement pickASubject=driver.findElement(By.xpath("(//select[@class='sg-select__element'])[4]"));
			Select select2=new Select(pickASubject);
			
			List<WebElement> options2=select2.getOptions();
			for (int i = 0; i < options2.size(); i++) {
				WebElement sortBy=driver.findElement(By.xpath("(//select[@class='sg-select__element'])[4]"));
				Select sel=new Select(sortBy);
				sel.selectByIndex(i);
			}
		}

		@Then("user should be able to select the list of points")
		public void user_should_be_able_to_select_the_list_of_points() {
			WebElement points=driver.findElement(By.xpath("(//select[@class='sg-select__element'])[5]"));
			Select select3=new Select(points);
			
			List<WebElement> options3=select3.getOptions();
			for (int i = 0; i < options3.size(); i++) {
				WebElement sortBy=driver.findElement(By.xpath("(//select[@class='sg-select__element'])[5]"));
				Select sel=new Select(sortBy);
				sel.selectByIndex(i);
			}
			
		}

		@When("user clicks on ask your question button")
		public void user_clicks_on_ask_your_question_button() {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//span[text()='Ask your question'])[2]")))).click();
		}

		@Then("user should be able to select suggestion")
		public void user_should_be_able_to_select_suggestion() {
			Actions action=new Actions(driver);
			action.sendKeys(Keys.PAGE_UP).build().perform();
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='dialog']/div[@role='button']")));
		
		}

		@And("user clicks on close button")
		public void user_clicks_on_close_button() {
			 WebElement m=driver.findElement(By.xpath("//div[@role='dialog']/div[@role='button']"));
				Actions action1=new Actions(driver);
				action1.moveToElement(m).click().build().perform();
		}

		@Then("user should be able to click on i want to quit button")
		public void user_should_be_able_to_click_on_i_want_to_quit_button() {
			driver.findElement(By.xpath("//span[text()='Yes, I want to quit']")).click();
		}
		
		@Then("user should be able to quit application")
		public void user_should_be_able_to_quit_application() {
			driver.quit();
		}
		
}


	



