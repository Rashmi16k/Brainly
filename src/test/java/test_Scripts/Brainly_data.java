package test_Scripts;
import java.io.IOException;
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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.Brainly;


public class Brainly_data extends Base_Test   {
	    
		      @Test(dataProvider="logindata")
		      public void login1(String username , String Pwd) throws InterruptedException
		      {
		   
                Brainly Br= new Brainly(driver);
		  		

		  		// login text
                   Br.clickButton();
		  		WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Log in with Google']")));
		            
				
		  		// username textfield
				Br.entervalueInUser(username);

		  		// passwordTextfield
				Br.enterValueInPassword(Pwd);

		  		// login buttton
				Br.clickLoginButton();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("parents"))).click();
		          
				
				
		        //FOR PARENTS
				Br.clickForParents();
				
				
		       //LOGIN FOR PARENTS
				Br.loginForParents();
		        
				
		        //ALL SUBJECTS
				Br.ClickHindiSubjectText1();
				
				Br.ClickMathSubjectText();

				Br.ClickHistorySubjectText1();
				
				Br.ClickEnglishSubjectText();
				
				Br.ClickgeographySubjectText();
				
				Br.ClickBiologySubjectText();
				
				Br.ClickPhysicsSubjectText();
				
				
				//All levels dropdown
				Br.AllLevelDD();
				
				
				
				//UnAnswered dropdown
				Br.unAnsweredDD();
				
				
				//Ask a question
				
				Br.ClickAskYourQuestionText();
				driver.findElement(By.xpath("//textarea[@data-testid='text_editor_textarea']")).sendKeys("(a+b)square");
				
				
				
				//Pick a subject dropdown
				Br.picASubjectDD();
				
				
				//Points Dropdown
				Br.allPointsDD();
				
				
				
				// ask your question 2
				Br.ClickAskYourQuestionText2();
				
				
			
			    //close button
				Br.CloseButton();
				
				
				//quit button
				Br.QuitButton();
				
				
				driver.quit();
				
			}

		        
		      @DataProvider(name="logindata")
		      public Object[][] getTestData() throws IOException {
		  		Object [][]testdata= Login_Excel.getMultipleData("login");
		  		return testdata;
		      }
		    	  

	}


