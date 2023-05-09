package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;
public class Airline_xpath extends Pages.BasePage {

	public Airline_xpath(WebDriver driver) {
		super(driver);
	
	}
	
	//FOR BY RANGE
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[1]")
	public WebElement Firstdashboardclick;  
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[3]/div/a/span")
	public WebElement StockManagementBar;  
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[3]/div/ul/li/div/a/span")
	public WebElement StockSectionBar;  

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-allocate-stock/div/div[1]/div[1]/div[2]/div[1]/app-location-dropdown/form/igx-input-group/div[1]/div/input")
	public WebElement StockSectionPage;  

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-allocate-stock/div/div[1]/div[2]/div[1]")
	public WebElement StockSectionPageAllDetails;  

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-allocate-stock/div/div[1]/div[1]/div[4]/cdk-virtual-scroll-viewport/div[1]/div[2]/igx-card/div/div/div[1]/div/div[2]")
	public WebElement OneRangeSelect;  

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-allocate-stock/div[1]/div/div[3]/button")
	public WebElement RightPlusButton;  
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[2]/div[2]/form/igx-input-group/div[1]/div/input")
	public WebElement CarrierField;  

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[2]/div[3]/app-location-dropdown/form/igx-input-group/div[1]/div/input")
	public WebElement LocationField;  
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[5]/div/div/div[1]/p")
	public WebElement DocumentType;  
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[5]/div/div/div[3]/igx-select/igx-input-group/div[1]/igx-suffix/igx-icon")
	public WebElement CargoType; 
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[5]/div/div/div[4]/igx-select/igx-input-group/div[1]/igx-suffix/igx-icon")
	public WebElement ProductType;  
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[5]/div/div/div[5]/igx-select/igx-input-group/div[1]/igx-suffix/igx-icon")
	public WebElement SHEType;  
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[2]/div[1]/igx-radio/span[1]")
	public WebElement CreateSequenceTik;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[2]/div[2]/div/igx-radio/span[1]")
	public WebElement CreateSpecificTik; 
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div/div[1]/div[1]/igx-radio/span[1]")
	public WebElement ByRangeTik; 
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div/div[2]/div[1]/igx-radio/span[1]")
	public WebElement ByCountTik; 
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[1]/div[1]/div[2]/p")
	public WebElement DocumentCreatedPopupTitle; 
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[1]/div[9]/div/div[3]/p")
	public WebElement CreateMoreButtonInPopup;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[2]/div[1]/igx-radio/span[1]")
	public WebElement CreateInSequence2;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div/div[1]/div[1]/igx-radio/span[1]")
	public WebElement ByRangTik2;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[4]/div[3]/div")
	public WebElement DocumentInUseMesg;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[4]/div[2]/div/div[2]/p")
	public WebElement DocumentPreviewButton;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[3]/div/button/span[1]")
	public WebElement PreviewPOPupCloseButton; 
	

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[8]/button[2]/span[1]")
	public WebElement CalcelButtonmain; 
	

	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div/div[2]/div/button[1]")
	public WebElement CalcelButtonmainNo; 
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div/div[2]/div/button[2]")
	public WebElement CalcelButtonmainYes; 
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-allocate-stock/div/div[1]/div[2]/div[1]/div[6]/div[2]/div[7]/igx-expansion-panel/igx-expansion-panel-header/div/div[1]/igx-expansion-panel-title/div/div[6]/igx-navbar/nav/div[2]/button/igx-icon")
	public WebElement DashBoardPage3Dot; 
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-allocate-stock/div/div[1]/div[2]/div[1]/div[6]/div[2]/div[7]/igx-expansion-panel/igx-expansion-panel-header/div/div[1]/igx-expansion-panel-title/div/div[6]/div/div/div/div/div/igx-drop-down-item[1]/span/span/span/div")
	public WebElement ViewHistory3Dot; 
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[2]/img")
	public WebElement HistoryPageCloseButton; 
	
	//FOR BY COUNT
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[2]/div[1]/igx-input-group/div[1]/div/input")
	public WebElement QuantityBox; 
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[1]/div/p")
	public WebElement AfterQuantityclick; 
	
	//FOR BY SPECIFIC
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[1]/div/div[1]/div/div[2]/form/igx-input-group/div[1]/div/input")
	public WebElement SpecificBox1; 
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/igx-input-group/div[1]/div/input")
	public WebElement SpecificBox2; 
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[1]/p")
	public WebElement AfterSpecificClick;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[5]/div/div[1]/div/igx-date-picker/igx-input-group/div[1]/div/input")
	public WebElement SpecificCalenderField; 
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[5]/div/div[2]/span[1]")
	public WebElement Specific3yrs; 
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[5]/div/div[2]/span[2]")
	public WebElement Specific5yrs; 
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[5]/div/div[3]/form/igx-input-group/div[1]/div/input")
	public WebElement SpecificRemarkBox; 
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[1]/div[8]/div/div[3]/p")
	public WebElement SpecificCreateMoreButton;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div/div[1]/div[8]/div/div[3]/p")
	public WebElement agentSpecificCreateMoreButton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[2]/div[2]/div/igx-radio/span[1]")
	public WebElement CreateInSpecific2;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[8]/button[1]")
	public WebElement SpecificCreatestockButton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-allocate-stock/div/div[1]/div[2]/div[1]/div[6]/div[2]/div[7]/igx-expansion-panel/igx-expansion-panel-header/div/div[1]/igx-expansion-panel-title/div/div[6]/igx-navbar/nav/div[2]/button/igx-icon")
	public WebElement Specific3DotButton;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-allocate-stock/div/div[1]/div[2]/div[1]/div[6]/div[2]/div[7]/igx-expansion-panel/igx-expansion-panel-header/div/div[1]/igx-expansion-panel-title/div/div[6]/div/div/div/div/div/igx-drop-down-item[1]/span/span/span/div")
	public WebElement Specific3DotHistoryButton;
}

