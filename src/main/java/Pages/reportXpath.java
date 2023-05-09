package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class reportXpath extends Pages.BasePage {
	
	public  reportXpath(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[1]/div/a/i")
	public WebElement dashboardIcon;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[6]/div/a/span")
	public WebElement exportIcon;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[6]/div/ul/li[7]/div/a/span")
	public WebElement reportIcon;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[6]/div/ul/li[7]/div/ul/li[2]/div/a/span")
	public WebElement staffperformanceIcon;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-staffperformance/section/div/div[2]/div/div/form/div[1]/div[1]/div/div[1]/igx-input-group/div[1]/div/input")
	public WebElement AWBprefix;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-staffperformance/section/div/div[2]/div/div/form/div[1]/div[1]/div/div[2]/igx-input-group/div[1]/div/input")
	public WebElement AWBnumber;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-staffperformance/section/div/div[2]/div/div/form/div[2]/div/button[2]")
	public WebElement VIEWbutton;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-staffperformance/section/div/div[2]/div/div/form/div[2]/div/button[1]")
	public WebElement ClearButton;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-staffperformance/section/div/div[3]/div/div/form/div[1]/div[2]/app-dateformat/form/igx-date-picker/igx-input-group/div[1]/div/input")
	public WebElement ExecuteDateField;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-staffperformance/section/div/div[2]/div/div/form/div[1]/div[3]/app-commonmultiselectdropdown/form/igx-combo/igx-input-group/div[1]/div/input")
	public WebElement Originfield;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/igx-input-group/div[1]/div/input")
	public WebElement OriginSearchbar;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-staffperformance/section/div/div[2]/div/div/form/div[1]/div[4]/app-commonmultiselectdropdown/form/igx-combo/igx-input-group/div[1]/div/input")
	public WebElement DestinationField;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/igx-input-group/div[1]/div/input")
	public WebElement Destinationsearchbar;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-staffperformance/section/div/div[2]/div/div/form/div[1]/div[5]/app-commondropdown/form/igx-select/igx-input-group/div[1]/div/input")
	public WebElement staffnamefield;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-staffperformance/section/div/div[2]/div/div/form/div[1]/div[7]/app-commonmultiselectdropdown/form/igx-combo/igx-input-group/div[1]/div/input")
	public WebElement AWBmode;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-staffperformance/section/div/div[2]/div/div/form/div[1]/div[2]/app-dateformat/form/igx-date-picker/igx-input-group/div[1]/igx-prefix/igx-icon")
	public WebElement calendericon;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/igx-calendar-container/igx-calendar/div/section[1]/div[1]/igx-icon")
	public WebElement Calendermonthbackward;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/igx-calendar-container/igx-calendar/div/section[2]/igx-days-view/div[4]/igx-day-item[3]/span")
	public WebElement date14feb;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/igx-display-container/igx-combo-item[1]/igx-checkbox/div/span")
	public WebElement cashtypeAWBnumber;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/igx-display-container/igx-combo-item[2]/igx-checkbox/div/span")
	public WebElement chequetypeAWBnumber;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/igx-display-container/igx-combo-item[3]/igx-checkbox")
	public WebElement creditAWBnumber;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/igx-display-container/igx-combo-item[4]/igx-checkbox/div")
	public WebElement upiAWBnumber;
	
	
	
	@FindBy(xpath = "")
	public WebElement Exp;
	
	@FindBy(xpath = "")
	public WebElement Exp1;
	
	@FindBy(xpath = "")
	public WebElement Ex3;
	
	@FindBy(xpath = "")
	public WebElement Exp4;
	
	@FindBy(xpath = "")
	public WebElement Exp5;
	
	@FindBy(xpath = "")
	public WebElement Exp6;
	
	@FindBy(xpath = "")
	public WebElement Exp7;
	
	
}
