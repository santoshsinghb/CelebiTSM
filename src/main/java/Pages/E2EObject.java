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
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[7]/div/div[3]/a[2]/span/input")
	public WebElement BookSlot_Back;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[6]/div[2]/div[1]/div[3]/div[2]/div[1]/div[3]/div[4]/a/span/div/button")
	public WebElement Create_AWB;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[2]/input[1]")
	public WebElement MAWB_firstnumber;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[2]/input[2]")
	public WebElement MAWB_Secondnumber;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[3]/input")
	public WebElement AirlneCode;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[4]/input")
	public WebElement Orign;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[5]/input")
	public WebElement Destination;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[7]/input")
	public WebElement Gr_wt;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[12]/select")
	public WebElement SelectComoditiyType;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[13]/span/div/button")
	public WebElement SHC_code;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[13]/span/div/ul/li[2]/a/label/input")
	public WebElement SHC_code_Select;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[12]/select/option[2]")
	public WebElement Baggege;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[14]/input")
	public WebElement NOG;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[4]/div/button[2]")
	public WebElement CreateAWB_SAVE;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[6]/div[2]/div[1]/div[3]/div[1]/fieldset/div[4]/table/tbody/tr[2]/td[1]/span/input")
	public WebElement Select_Slot;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[6]/div[2]/div[1]/div[3]/div[2]/div[1]/div[3]/div[1]/a/span/div/input")
	public WebElement Book_Slot;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[5]/div/div/div[2]/div/div[1]/div[2]/ul/li[20]/button")
	public WebElement Book_TIME_Slot;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[7]/div/div[3]/a[1]/span/input")
	public WebElement Book_TIME_Slot_Save;
	
	@FindBy(xpath="//*[@id='divMstAlert']/div/div/div[3]")
	public WebElement Book_TIME_Slot_ok;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[4]/div/button[1]/span")
	public WebElement CreateAWB_Cancel;
	
	@FindBy(xpath="/html/body/form/div[3]/div[4]/div[2]/div[3]/div/div/div[3]/div[2]/input")
	public WebElement Galaxy_Username;
	
	@FindBy(xpath="/html/body/form/div[3]/div[4]/div[2]/div[3]/div/div/div[4]/div[2]/input")
	public WebElement Galaxy_Pass;
	
	@FindBy(xpath="/html/body/form/div[3]/div[4]/div[2]/div[3]/div/div/div[5]/input")
	public WebElement Galaxy_login;
	
	@FindBy(xpath="/html/body/form/div[4]/div[1]/div/ul/li[1]/a")
	public WebElement Galaxy_Exports;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div[1]/ul/li[3]/a")
	public WebElement Galaxy_VCTacceptance;
	
	@FindBy(xpath="//*[@id='ctl00_Toolbar2_btnSearchNew']")
	public WebElement Galaxy_VCTacceptance_Search;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/fieldset[2]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/input")
	public WebElement Galaxy_VCTacceptance_Date;
	
	@FindBy(xpath="/html/body/div[3]/table/tbody/tr[4]/td[2]")
	public WebElement Galaxy_VCTacceptance_Date19;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/fieldset[2]/table/tbody/tr/td[2]/div/input")
	public WebElement Galaxy_VCTacceptance_Hour;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/fieldset[2]/table/tbody/tr/td[3]")
	public WebElement Galaxy_VCTacceptance_GateIn;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/fieldset[3]/table/tbody/tr/td[1]/select")
	public WebElement Galaxy_VCTacceptance_DoorSelect;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/fieldset[3]/table/tbody/tr/td[1]/select/option[2]")
	public WebElement Galaxy_VCTacceptance_DoorSelect1;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/fieldset[3]/table/tbody/tr/td[4]/input")
	public WebElement Galaxy_VCTacceptance_DockIn;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/table/tbody/tr[2]/td[3]/fieldset/table/tbody/tr[1]/td/table/tbody/tr[2]/td[5]/input")
	public WebElement Galaxy_VCTacceptance_GroupId;
	
	
	
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/fieldset[1]/table/tbody/tr/td[1]/input")
	public WebElement Galaxy_VCTacceptance_VCTno;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/table/tbody/tr[2]/td[1]/fieldset[1]/table/tbody/tr[1]/td/div/div/table/tbody/tr[3]/td[1]/input[1]")
	public WebElement Galaxy_VCTacceptance_CargoAccept;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[2]/div/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td[6]/input")
	public WebElement Galaxy_VCTacceptance_NOP;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[6]/div[2]/div[6]/div/div/div[3]/input")
	public WebElement Galaxy_VCTacceptance_shipmentAccept;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/table/tbody/tr[2]/td[3]/fieldset/table/tbody/tr[6]/td/div/div[1]/table/tbody/tr[2]/td[1]/input[2]")
	public WebElement Galaxy_VCTacceptance_NOPVolume;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/table/tbody/tr[2]/td[3]/fieldset/table/tbody/tr[6]/td/div/div[1]/table/tbody/tr[2]/td[3]/input")
	public WebElement Galaxy_VCTacceptance_NOPLength;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/table/tbody/tr[2]/td[3]/fieldset/table/tbody/tr[6]/td/div/div[1]/table/tbody/tr[2]/td[4]/input")
	public WebElement Galaxy_VCTacceptance_NOPWidth;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/table/tbody/tr[2]/td[3]/fieldset/table/tbody/tr[6]/td/div/div[1]/table/tbody/tr[2]/td[5]/input")
	public WebElement Galaxy_VCTacceptance_NOPHeight;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/table/tbody/tr[2]/td[3]/fieldset/table/tbody/tr[6]/td/div/div[1]/table/tbody/tr[2]/td[6]/input")
	public WebElement Galaxy_VCTacceptance_Volume;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[1]/div/fieldset/table/tbody/tr[2]/td[3]/fieldset/div/table/tbody/tr/td[4]/input")
	public WebElement Galaxy_VCTacceptance_NOPAcceptCargO;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div[1]/ul/li[2]/a")
	public WebElement Galaxy_VCTGeneration;

	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[2]/div[2]/div[1]/fieldset/div[1]/div/table/tbody/tr[9]/td[1]/input[1]")
	public WebElement Galaxy_VCTGeneration_SelectNumber;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[6]/div[2]/div[1]/div[3]/div[1]/fieldset/div[4]/table/tbody/tr[2]/td[1]/span/input")
	public WebElement AWB_shipmentTypeSelect;
	
	@FindBy(xpath="/html/body/form/div[4]/div[2]/ul/li[2]/div")
	public WebElement E2E_slotUsageReport;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[1]/table/tbody/tr[1]/td[2]/img")
	public WebElement E2E_slotUsageReport_Date;
	
	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[1]/td[7]/a")
	public WebElement E2E_slotUsageReport_Date1;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[1]/table/tbody/tr[1]/td[4]/img")
	public WebElement E2E_slotUsageReport_Date2;
	
	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[2]/td[4]/a")
	public WebElement E2E_slotUsageReport_date5;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[1]/table/tbody/tr[1]/td[6]/select")
	public WebElement E2E_slotUsageReport_slotStatusSelect;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[1]/table/tbody/tr[3]/td[8]/input")
	public WebElement E2E_slotUsageReport_ViewReport;
	
	@FindBy(xpath="/html/body/form/div[4]/div[2]/ul/li[5]/div")
	public WebElement E2E_WalkinCustomer;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[1]/table/tbody/tr[5]/td[2]/input[1]")
	public WebElement E2E_WalkinCustomer_AgentName;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[1]/table/tbody/tr[5]/td[2]/input[2]")
	public WebElement E2E_WalkinCustomer_AgentVerification;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[6]/div/div/div[2]/div/div[1]/div/div/table/tbody/tr[4]/td[1]/span/input")
	public WebElement E2E_WalkinCustomer_select_Agility;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[6]/div/div/div[2]/div/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/button")
	public WebElement E2E_WalkinCustomer_Agility_ok;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[1]/table/tbody/tr[3]/td[4]/input")
	public WebElement E2E_WalkinCustomer_vehicle_no;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[1]/table/tbody/tr[5]/td[4]/input")
	public WebElement E2E_WalkinCustomer_mobile_no;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div/div[2]/div[5]/div[1]/table/tbody/tr[12]/td[5]/input[2]")
	public WebElement E2E_WalkinCustomer_Next;
	
	@FindBy(xpath="/html/body/form/div[4]/div[1]/div/ul/li[4]/a")
	public WebElement E2E_Billing;
	
	@FindBy(xpath="/html/body/form/div[4]/div[3]/div[4]/ul/li[3]/a/span")
	public WebElement E2E_Billing_customerinovice;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/fieldset/table/tbody/tr/td/table[2]/tbody/tr/td[2]/input[1]")
	public WebElement E2E_Billing_DocumentID;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/fieldset/table/tbody/tr/td/table[2]/tbody/tr/td[2]/input[3]")
	public WebElement E2E_Billing_DocumentID_Search;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/fieldset/table/tbody/tr/td/table[2]/tbody/tr/td[5]/table/tbody/tr/td[2]/img")
	public WebElement E2E_Billing_generatInvoice;
	
	@FindBy(xpath="/html/body/form/div[3]/fieldset/fieldset[2]/table[1]/tbody/tr[1]/td/div/div/table/tbody/tr[3]")
	public WebElement E2E_Billing_generatInvoice_Select;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/fieldset/table/tbody/tr/td/table[5]/tbody/tr[1]/td[7]/input")
	public WebElement E2E_Billing_generatInvoice_calCharges;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[2]/div/div/table/tbody/tr[2]/td[2]/div/div[2]/div/table[3]/tbody/tr[1]/td[1]/input")
	public WebElement E2E_Billing_generatInvoice_Create_Invoice;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[2]/div/div/table/tbody/tr[2]/td[1]/div/div[1]/span[2]/span/span/span")
	public WebElement E2E_Billing_generatInvoice_InvoiceHistory;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/div[2]/div/div/table/tbody/tr[2]/td[5]/input")
	public WebElement E2E_Billing_generatInvoice_printOption;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/div[2]/div/div/table/tbody/tr[2]/td[6]/input")
	public WebElement E2E_Billing_generatInvoice_ACTION;
	
	@FindBy(xpath="/html/body/form/div[3]/div[3]/div[2]/div/div/table/tbody/tr[2]/td[2]/div/div[2]/div/table[3]/tbody/tr[1]/td[3]/input[1]")
	public WebElement E2E_Billing_generatInvoice_PayNproceed;
	
	
	
	
	
	
	
	
}
