package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class E_Freight_PrintTerminalXpath extends Pages.BasePage {

	public E_Freight_PrintTerminalXpath(WebDriver driver) {
		super(driver);
	
	}

	@FindBy(xpath = "//*[@class='dashboardDefault']")
	public WebElement DashboardModule;
	
	@FindBy(xpath = "//*[@title='Company Setup']")
	public WebElement CompanySetupModuleArrow;

	@FindBy(xpath = "//*[text()='Company']")
	public WebElement CompanyModule;
	
	//@FindBy(xpath = "//*[@class='listview__right-tabs pt-2 pl-1 addscroll-horizontal max-w-100-percent']")
	//public WebElement CompanyScrollBar;
	
	@FindBy(xpath = "(//*[text()=' Active'])/parent::div/parent::div/div[3]/button[1]/i")
	public WebElement CompanyParameterEdit;
	
	@FindBy(xpath = "//*[text()=' Airline Parameters']")
	public WebElement CompanyAirlineParameter;
	
	@FindBy(xpath = "//*[text()=' Airline Parameters']")
	public WebElement CompanyAirlineParameterEFreightCompliant;
	
	@FindBy(xpath = "//*[text()=' E-freight Configuration']")
	public WebElement CompanyEFreightConfiguration;
	
	@FindBy(xpath = "(//*[text()='Airport Code'])/parent::table/tr[4]/td[2]/app-commonautocomplete/form/igx-input-group/div/div/input")
	public WebElement CompanyEFreightConfigurationLHR;
	
	@FindBy(xpath = "//*[@title='System Library']")
	public WebElement EFreightPlatformSystemLibrary;
	
	@FindBy(xpath = "//*[text()='SHC']")
	public WebElement EFreightPlatformSHC;
	
	@FindBy(xpath = "(//*[text()='Search'])[1]/parent::div/input")
	public WebElement EFreightGeneralSearch;
	
	@FindBy(xpath = "(//*[text() = 'SHC Code'])/parent::igx-drop-down-item-group/igx-drop-down-item/span/span")
	public WebElement EFreightSearchHSCCode;
	
	@FindBy(xpath = "(//*[text() = 'Yes'])[2]")
	public WebElement EFreightHSCCodeYesECP;
	
	@FindBy(xpath = "(//*[text() = 'No'])[2]")
	public WebElement EFreightHSCCodeNoANM;
	
	@FindBy(xpath = "//*[@title='Export']")
	public WebElement EFreightExportModuleArrow;
		
	@FindBy(xpath = "//*[text()='Job Maintenance']")
	public WebElement EFreightJobMaintenance;
	
	@FindBy(xpath = "//*[@class='floating-btn']")
    public WebElement EFreightNewJob;
	
	@FindBy(xpath = "(//*[text()='Shipper *'])/parent::div/input")
    public WebElement EFreightShipperNameDropdown;
	
	@FindBy(xpath = "//*[@aria-label='PriyankaIndustries(8391)']/span/span")
    public WebElement EFreightNewJobShipperInputNamePriyanka;
	  
    @FindBy(xpath = "(//*[text()='Consignee'])[2]/parent::div/input")
    public WebElement EFreightConsineeNameDropdown;
		
    @FindBy(xpath = "//*[@aria-label='ChetanIndustries(2689)']/span/span")
    public WebElement EFreightNewJobConsineeInputNameChetan;
	  
    @FindBy(xpath = "(//*[text()='Create Export Job'])/parent::div/parent::div/parent::div/parent::div/div/div[5]/div[2]/div/div[3]/button")
    public WebElement EFreightNewJob_TODAY;
	  
    @FindBy(xpath = "//*[text()='Destination Airport *']/parent::div/input")
    public WebElement EFreightNewJob_Destination_Airport;
    
    @FindBy(xpath = "//*[@aria-label='LHR - Heathrow Airport ( United Kingdom ) ']/span")
    public WebElement EFreightNewJob_Destinatio_Airport_LHR_Select;	
    
    
    @FindBy(xpath = "//*[@id='TotNoOfPieces']")
    public WebElement EFreightNewJob_TotNoOfPieces;
    
    @FindBy(xpath = "//*[@id='GrossWeight']")
    public WebElement EFreightNewJob_GrossWeight;
    
    @FindBy(xpath = "//*[@formcontrolname='TotVol']")
    public WebElement EFreightNewJob_TotVolue;
    
    @FindBy(xpath = "//*[text()='SHC *']/parent::div/input")
    public WebElement EFreightNewJob_SHC;
    
    @FindBy(xpath = "//*[@name='searchInput']")
    public WebElement EFreightNewJob_SHCSearch;
    
    @FindBy(xpath = "//*[text()='Commodity']/parent::div/input")
    public WebElement EFreightNewJob_Commodity;
    
    @FindBy(xpath = "(//*[text()='Stackable'])[1]/parent::div/parent::div/parent::div/parent::div/parent::form/parent::div/parent::app-cargosummary/parent::div/parent::div/parent::div/div[10]/div/button[3]")
    public WebElement EFreightNewJob_SAVE_JOB;
    
    @FindBy(xpath = "(//*[text()='Rates'])[1]")
	public WebElement EFreightRatesTab;
	
	@FindBy(xpath = "(//*[text()='Published'])/parent::p/parent::div/parent::div/div[7]/button")
	public WebElement EFreightRateAcceptArrow;
	
	@FindBy(xpath = "(//*[text()='Published'])/parent::p/parent::div/parent::div/parent::h5/parent::div/parent::div/div[2]/div/div/div/div/div[2]/div[7]/span/button")
	public WebElement EFreightRateAccept;
	
	@FindBy(xpath = "(//*[text()='Flights'])[1]")
	public WebElement EFreightFilghtsTab;
	
	@FindBy(xpath = "(//*[@src='https://acsintapigw.azurewebsites.net/Upload/Logo/CompLogo_download emi_202332912929.png'])[2]/parent::div/parent::div/div[7]/button[2]")
	//@FindBy(xpath = "(//*[@src='https://acsintapigw.azurewebsites.net/Upload/Logo/CompLogo_Logo_202331712338.png'])[2]/parent::div/parent::div/div[7]/button[2]")
	public WebElement EFreightSelectFlight; 
	
	@FindBy(xpath = "(//*[text()='Stock Type *'])[2]/parent::div/input")
	public WebElement EFreightFlightStockType;
	
	@FindBy(xpath = "(//*[@title='Community'])[2]/span")
	public WebElement EFreightFlightStockTypeCommunity;
	    
	@FindBy(xpath = "(//*[@title='Contractual'])[2]/span")
	public WebElement EFreightFlightStockTypeContractual;
	
	@FindBy(xpath = "//*[text()='Preferred Carrier']")
	public WebElement EFreightFlightsIconPreferredCarrier_Text;

	@FindBy(xpath = "(//*[text()='(Optional)'])[2]/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::form/div/div[3]/div/button[2]")
	public WebElement EFreightFlightBookingRequest;
	
	@FindBy(xpath = "//li[@title = 'Booking Request']")
	public WebElement EFreightBookingRequestModule;
	
	@FindBy(xpath = "(//*[text() = 'Organization Name'])/parent::igx-drop-down-item-group/igx-drop-down-item/span/span")
	public WebElement EFreightSelectAirlineOrgName;
	
	@FindBy(xpath = "(//*[text() = 'Shipper Name'])/parent::igx-drop-down-item-group/igx-drop-down-item/span/span")
	public WebElement EFreightSelectShipperNamePriyanka;
	
	@FindBy(xpath = "(//*[@id= 'txtApproverRemarks'])/parent::div/parent::div/parent::igx-input-group/parent::div/parent::div/parent::form/parent::div/parent::div/parent::div/div[6]/button[4]")	
	public WebElement EFreightConfirlFlightBooking;
	
	@FindBy(xpath = "(//*[text() = 'KG'])[1]/parent::strong/parent::div/parent::div/div[4]/span/button[2]")
	public WebElement EFreightExecuteAWBButton;
	
	@FindBy(xpath = "//*[text()='Terminal Master']")
	public WebElement EFreightTerminalMaster;
	
	@FindBy(xpath = "(//*[text() = 'Yes'])[2]")
	public WebElement EFreightExecuteAWBYes;
	
	@FindBy(xpath = "(//*[text()='As Agreed'])/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/div[6]/div/p/igx-checkbox/div/span")
	public WebElement EFreightCheckboxTermCondition;
	
	@FindBy(xpath = "(//*[text()='Rate to be printed on AWB'])/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/div[3]/div/button[2]")
	public WebElement EFreightYesExecuteAWBChangeButton;
	
	@FindBy(xpath = "(//*[@class='listview__top-tabs'])/ul/li[3]")
	public WebElement EFreightExecutedAWBTab;
	
	@FindBy(xpath = "(//*[text()='PRE'])")
	public WebElement EFreightPREButton;
	
	@FindBy(xpath = "//*[text()='Print Queue']")
	public WebElement EFreightPrintQueue;
	
	
	
	
	
	
	
	
	
    
}