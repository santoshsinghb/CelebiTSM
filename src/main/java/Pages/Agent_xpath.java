package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import junit.framework.Assert;

public class Agent_xpath extends Pages.BasePage {
	
	

	
	public Agent_xpath(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="")
	public WebElement HOMEDASHBOARD;
	
	@FindBy(xpath="")
	public WebElement agentcargo;
}
