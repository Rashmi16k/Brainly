package pom_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Brainly extends BasePage {

	public Brainly(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	 // FOR LOGIN TEXTFIELD
	  @FindBy(xpath="//span[text()='Log in']")
    WebElement logintext;
	  
	  public void clickButton() {

		  clickAction(logintext);

		}
	  
	  
	  
	  // FOR USERNAME TEXTFIELD
	  @FindBy(name="username")
	  WebElement userTF;
	  public void entervalueInUser(String username)
	  {
		  enter_value(userTF, username);
	  }
	  
	  //FOR PASSWORD TEXTFIELD
	  @FindBy(name="password")
	  WebElement passTF;
	  public void enterValueInPassword(String password)
	  {
		  enter_value(passTF,password);
	  }
	  
	  //FOR LOGIN BUTTON
	  @FindBy(xpath="//button[@data-testid='form_login_submit']")
	  WebElement loginbutton;
	  public void clickLoginButton()
	  {
		  clickAction(loginbutton);
	  }
	  
	  //FOR PARENTS
	  @FindBy(xpath="//a[text()='For parents']")
	  WebElement forparents;
	  public void clickForParents() {
		  clickAction(forparents);
	  }
	  
	  //LOGIN FOR PARENTS
	  @FindBy(xpath="(//span[text()='Log In'])[1]")
	  WebElement loginParents;
	  public void loginForParents(){
		  clickAction(loginParents);
	  }
	  
	//FOR SUBJECTS
	  
	  //hindi
@FindBy(xpath="//div[text()='Hindi']")
		
		WebElement HindiText1;
		
		public void ClickHindiSubjectText1()
		{
			clickAction(HindiText1);
		}
		
		 
		//math
@FindBy(xpath="//div[text()='Math']")
		
		WebElement MathText1;
		
		public void ClickMathSubjectText()
		{
			clickAction(MathText1);
		}
		
		//history
@FindBy(xpath="//div[text()='History']")
		
		WebElement HistoryText;
		
		public void ClickHistorySubjectText1()
		{
			clickAction(HistoryText);
		}
		
		
		//english
@FindBy(xpath="//div[text()='English']")
		
		WebElement EnglishText1;
		
		public void ClickEnglishSubjectText()
		{
			clickAction(EnglishText1);
		}
		
		
		//geography
@FindBy(xpath="//div[text()='Geography']")
		
		WebElement GeographyText1;
		
		public void ClickgeographySubjectText()
		{
			clickAction(GeographyText1);
		}
		
		
		//biology
@FindBy(xpath="//div[text()='Biology']")
		
		WebElement BiologyText1;
		
		public void ClickBiologySubjectText()
		{
			clickAction(BiologyText1);
		}
		
		
		//physics
@FindBy(xpath="//div[text()='Physics']")
		
		WebElement PhysicsText1;
		
		public void ClickPhysicsSubjectText()
		{
			clickAction(PhysicsText1);
		}
		
		
		//ALL LEVELS DROPDOWN
@FindBy(xpath="(//select[@class='sg-select__element'])[1]")
		
		WebElement allLevelDD;
		
		public void AllLevelDD()
		{
			Select select=new Select(allLevelDD);
			
			List<WebElement> options=select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				Select sel1=new Select(allLevelDD);
				sel1.selectByIndex(i);
			}
		}
		
		
		//UNANSWERED DROPDOWN
@FindBy(xpath="(//select[@class='sg-select__element'])[2]")
		
		WebElement unAnsweredDD;
		
		public void unAnsweredDD()
		{
			Select select=new Select(unAnsweredDD);
			
			List<WebElement> options=select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				Select sel2=new Select(unAnsweredDD);
				sel2.selectByIndex(i);
			}
		}
		
		
		
		//ask your question
@FindBy(xpath="//span[text()='Ask your question']")
		
		WebElement AskYourQuestionText1;
		
		public void ClickAskYourQuestionText()
		{
			clickAction(AskYourQuestionText1);
		}
		
		
		//pick a subject dropdown
@FindBy(xpath="(//select[@class='sg-select__element'])[4]")
		
		WebElement subjectsDD;
		
		public void picASubjectDD()
		{
			Select select=new Select(subjectsDD);
			
			List<WebElement> options=select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				Select sel3=new Select(subjectsDD);
				sel3.selectByIndex(i);
			}
		}
		
		
		//points dropdown
@FindBy(xpath="(//select[@class='sg-select__element'])[5]")
		
		WebElement pointsDD;
		
		public void allPointsDD()
		{
			Select select=new Select(pointsDD);
			
			List<WebElement> options=select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				Select sel4=new Select(pointsDD);
				sel4.selectByIndex(i);
			}
		}
		
		
		
		
//		
//		//question
//@FindBy(name="Question")
//		 WebElement question;
//		 public void enterQuestion(String Question)
//		 {
//			 enter_value(question,Question);
//		 }

		
		//ask your question
@FindBy(xpath="(//span[text()='Ask your question'])[2]")
				
		WebElement AskYourQuestionText2;
				
		public void ClickAskYourQuestionText2()
		{
			clickAction(AskYourQuestionText2);
//			Actions action=new Actions(driver);
//			action.sendKeys(Keys.PAGE_UP).build().perform();
			
		}
		
		
		//close button
@FindBy(xpath="//div[@role='dialog']/div[@role='button']")
		
		WebElement CloseOption;
				
		public void CloseButton()
		{
			clickAction(CloseOption);
		}
		
		
		
		//i want to quit button
@FindBy(xpath="//span[text()='Yes, I want to quit']")
		
		WebElement quitPopUpOption;
				
		public void QuitButton()
		{
			clickAction(quitPopUpOption);
		}

		

}
