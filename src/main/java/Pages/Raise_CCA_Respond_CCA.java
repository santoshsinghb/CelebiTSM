package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Raise_CCA_Respond_CCA extends Pages.BasePage {

	public Raise_CCA_Respond_CCA(WebDriver driver) {
		super(driver);
//		updated akshay
	}
	
	@FindBy(xpath = "//*[text()='Raise CCA']")
    public WebElement Airlne_CCA_Raise_Icon;
	
	@FindBy(xpath = "//*[text()='RAISE CCA BASED ON']/parent::div/parent::div/div[2]/igx-radio-group/igx-radio[1]/span[1]")
    public WebElement Airlne_CCA_Raise_buy_ratecheck_box;
	
	
	@FindBy(xpath = "//*[text()='RAISE CCA BASED ON']/parent::div/parent::div/div[2]/igx-radio-group/igx-radio[2]/span[1]")
    public WebElement Airlne_CCA_Raise_AWB_Rate;
	
	
	@FindBy(xpath = "//*[text()='DEBIT AMOUNT']/parent::div/parent::div/div[2]/igx-radio-group/igx-radio[1]/span[1]")
    public WebElement Airlne_CCA_Raise_Agent_Account;
	
	@FindBy(xpath = "//*[text()='DEBIT AMOUNT']/parent::div/parent::div/div[2]/igx-radio-group/igx-radio[2]/span[1]")
    public WebElement Airlne_CCA_Raise_Airline_Account;
	
	@FindBy(xpath = "//*[text()='Chargeable Weight']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Orignal_Chargble_Weight;
	
	
	@FindBy(xpath = "//*[text()='Rate']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Orinal_Rate;
	
	
	@FindBy(xpath = "//*[text()='Weight Charges']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Orignal_Weight_Charges;
	

	@FindBy(xpath = "//*[text()='Weight Charges']/parent::div/parent::div/div[4]/strong")
    public WebElement Airlne_CCA_Raise_Requested_Weight_Charges;
	
	@FindBy(xpath = "//*[text()='Valuation Charges']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Orignal_Validation_Charges;
	
	@FindBy(xpath = "//*[text()='Valuation Charges']/parent::div/parent::div/div[4]/strong")
    public WebElement Airlne_CCA_Raise_Requested_Validation_Charges;
	
	@FindBy(xpath = "//*[text()='Total Other Charges due Carrier']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Orignal_Other_Due_Carrier;

	@FindBy(xpath = "//*[text()='Total Other Charges due Carrier']/parent::div/parent::div/div[4]/strong")
    public WebElement Airlne_CCA_Raise_Requested_Other_Due_Carrier;
	
	@FindBy(xpath = "//*[text()='Total Other Charges due Agent']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Other_Orignal_Charges_due_Agent;

	@FindBy(xpath = "//*[text()='Total Other Charges due Agent']/parent::div/parent::div/div[4]/strong")
    public WebElement Airlne_CCA_Raise_Other_Requested_Charges_due_Agent;
	
	
	@FindBy(xpath = "//*[text()='Commission']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Orignal_Commission;

	@FindBy(xpath = "//*[text()='Commission']/parent::div/parent::div/div[4]/strong")
    public WebElement Airlne_CCA_Raise_Requested_Commission;
	
	
	@FindBy(xpath = "//*[text()='Incentive']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Orignal_Incentive;

	@FindBy(xpath = "//*[text()='Incentive']/parent::div/parent::div/div[4]/strong")
    public WebElement Airlne_CCA_Raise_Requested_Incentive;
	
	@FindBy(xpath = "//*[text()='Net/Net Amount']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Orinal_Net_Amount;

	@FindBy(xpath = "//*[text()='Net/Net Amount']/parent::div/parent::div/div[4]/strong")
    public WebElement Airlne_CCA_Raise_Requested_Net_Amount;
	
	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/Airline Ex.Tax']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Orignal_Ex_Tax;

	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/Airline Ex.Tax']/parent::div/parent::div/div[4]/strong")
    public WebElement Airlne_CCA_Raise_Requested_Ex_Tax;
	
	@FindBy(xpath = "//*[text()='Tax']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Orignal_TAX;

	@FindBy(xpath = "//*[text()='Tax']/parent::div/parent::div/div[4]/strong")
    public WebElement Airlne_CCA_Raise_Requested_TAX;
	
	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/ Airline Incl. Tax']/parent::div/parent::div/div[2]/strong")
    public WebElement Airlne_CCA_Raise_Orignal_INC_TAX;

	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/ Airline Incl. Tax']/parent::div/parent::div/div[4]/strong")
    public WebElement Airlne_CCA_Raise_Requested_INC_TAX;
	
	@FindBy(xpath = "//*[text()=' Update Charges ']")
    public WebElement Airlne_CCA_Raise_Update_Charges_Icon;
		
	
	@FindBy(xpath = "(//*[@for='AirlineCorrectedPrepaid'])[2]/parent::div/input")
    public WebElement Airline_CCA_Airline_Update_Charges_AirlineCorrectedPrepaid_MYC;

	@FindBy(xpath = "(//*[@for='AirlineCorrectedPrepaid'])[3]/parent::div/input")
    public WebElement Airline_CCA_Airline_Update_Charges_AirlineCorrectedPrepaid_SSC;

	@FindBy(xpath = "(//*[@for='AirlineCorrectedPrepaid'])[9]/parent::div/input")
    public WebElement Airline_CCA_Airline_Update_Charges_AirlineCorrectedPrepaid_Commission;

	@FindBy(xpath = "(//*[@for='AirlineCorrectedPrepaid'])[10]/parent::div/input")
    public WebElement Airline_CCA_Airline_Update_Charges_AirlineCorrectedPrepaid_Incentive;

	@FindBy(xpath = "(//*[@for='AirlineCorrectedPrepaid'])[7]/parent::div/input")
    public WebElement Airline_CCA_Airline_Update_Charges_AirlineCorrectedPrepaid_Commission1;

	@FindBy(xpath = "(//*[@for='AirlineCorrectedPrepaid'])[8]/parent::div/input")
    public WebElement Airline_CCA_Airline_Update_Charges_AirlineCorrectedPrepaid_Incentive1;

	@FindBy(xpath = "(//*[@id='CCA-popup-input'])[2]/div[3]/div/button[1]")
    public WebElement Airline_CCA_Airline_Update_Charges_Cancel;

	@FindBy(xpath = "(//*[@id='CCA-popup-input'])[2]/div[3]/div/button[2]")
    public WebElement Airline_CCA_Airline_Update_Charges_ApplyChanges;
	

	@FindBy(xpath = "//*[text()='Update Charges']/parent::div/parent::div/div[3]/div/button[2]")
    public WebElement Airline_CCA_Airline_Update_Charges_ApplyChanges1;

}
