package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Pages.BasePage;

public class E2EObject extends BasePage  {
	
	
	public E2EObject(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="/html/body/form/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td/div[2]/div[1]/div[1]/select")
	public WebElement LanSelectDropDown;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td/div[2]/div[1]/div[1]/select/option[1]")
	public WebElement EnglishLang;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td/div[2]/div[1]/div[2]/input[1]")
	public WebElement Username;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td/div[2]/div[1]/div[3]/input[1]")
	public WebElement Password;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td/div[2]/div[1]/div[4]/a/span/input")
	public WebElement Loginbtn;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td/div[2]/div[1]/div[3]/div[2]/img")
	public CharSequence[] CaptchaText;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr/td/div[2]/div[1]/div[3]/div[2]/input")
	public WebElement CaptchaTextBox;
	
	@FindBy(xpath="/html/body/form/div[4]/div[2]/ul/li[3]/div/a")
	public WebElement DockCongigurationTab;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div[2]/div[3]/div[2]/button[2]")
	public WebElement AddDockBtn;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[5]/div/div/div[2]/div[1]/div[2]/input")
	public WebElement DockNameTextBox;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[5]/div/div/div[2]/div[2]/div[2]/input")
	public WebElement NoDockTextBox;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[5]/div/div/div[3]/div/button[2]")
	public WebElement Submit;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[4]/div/div/div[3]/input")
	public WebElement Okbtn;
	
	@FindBy(xpath="/html/body/form/div[4]/div[2]/ul/li[4]/div/a")
	public WebElement SlotCongigurationTab;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[11]/a")
	public WebElement MayAssignDocks;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[4]/div/div/div[2]/div[3]/table/tbody/tr[13]/td[1]/input")
	public WebElement A1CheckBox;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[4]/div/div/div[2]/div[3]/table/tbody/tr[14]/td[1]/input")
	public WebElement A2CheckBox;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[4]/div/div/div[2]/div[5]/div[2]/button[2]")
	public WebElement SubmitBtn;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[3]/div/div/div[3]/button")
	public WebElement AssignnedConfirmationmsgOKbtn;
	
	@FindBy(xpath="/html/body/form/div[4]/div[1]/div[3]/div/div/button")
	public WebElement DropdownLogOut;
	
	@FindBy(xpath="/html/body/form/div[4]/div[1]/div[3]/div/div/ul/li[2]/a[2]")
	public WebElement LogOut;
	
	@FindBy(xpath="/html/body/form/div[4]/div[2]/ul/li[2]/div/a")
	public WebElement BookSlot;
	
	
	
	
	

}
