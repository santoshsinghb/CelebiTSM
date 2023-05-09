package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static Helper.BaseObjects.E2E;
import Methods.CommonMethods;
import Methods.WebDriverMethod;

public class Login_Screen extends BasePage {

	public Login_Screen(WebDriver driver)
	{
		super(driver);
		
	}
	
	public Login_Screen(WebDriver driver, WebDriverMethod wm) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-login/div/div/div[2]/div[1]/div[2]/img")
	public WebElement LoginScreenpage;
	
	//login email path
    @FindBy(xpath="/html/body/form/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td/div[2]/div[1]/div[2]/input[1]")
    public static WebElement fillemail;
  

//login password path
	@FindBy(xpath="/html/body/form/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td/div[2]/div[1]/div[3]/input[1]")
    public static WebElement fillpassword;

	
//login button path
	@FindBy(xpath="//*[@id='btnLogin']")
	public static WebElement loginbutton;
	
	
	
	public void isLoginScreenDisplayed() throws InterruptedException
	{
		verify= WebDriverMethod.isElementPresent(driver, LoginScreenpage);
		Thread.sleep(1000);
		CommonMethods.Verify(verify, true);
	}
	public void Login(String entity, String usr, String pwd) throws Throwable
	{		
		
		System.out.println("login page.....");

		Thread.sleep(500);
		fillemail.sendKeys(usr);
		fillpassword.sendKeys(pwd);
		Thread.sleep(20000);
		loginbutton.click();
		Thread.sleep(20000);
		try {
			System.out.println("in try block");
		driver.navigate().refresh();
		fillemail.sendKeys(usr);
		fillpassword.sendKeys(pwd);
		//Thread.sleep(1000);
		//E2E.CaptchaTextBox.sendKeys(E2E.CaptchaText);
		Thread.sleep(20000);
		loginbutton.click();
		Thread.sleep(20000);
		}catch(Exception e){
			System.out.println("login succesfully");
		}
		
	}




public static void Login1(String entity, String usr, String pwd) throws Throwable{

Thread.sleep(500);

fillemail.sendKeys(usr);
fillpassword.sendKeys(pwd);
Thread.sleep(1000);
loginbutton.click();
Thread.sleep(20000);
}


}






