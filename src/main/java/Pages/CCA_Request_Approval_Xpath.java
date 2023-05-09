package Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CCA_Request_Approval_Xpath extends Pages.BasePage {

	public CCA_Request_Approval_Xpath(WebDriver driver) {
		super(driver);
//		updated akshay
	}
	
	@FindBy(xpath = "//*[@id='txtEmailId']")
    public WebElement LoginUsername1;
	
	@FindBy(xpath = "//*[@id='txtPasswordId']")
    public WebElement LoginPassword1;
	
	@FindBy(xpath ="//*[@id='btnLoginId']")
    public WebElement signin1;
	
	@FindBy(xpath = "//*[@class='floating-btn']")
    public WebElement NewJobIcon;
	
	@FindBy(xpath = "(//*[text()='CCA'])[1]")
    public WebElement Airline_CCA_Icon;
	
	@FindBy(xpath = "//*[text()='Booking Request']")
    public WebElement Airline_Booking_Request_Icon;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-flight-booking-request/form/section/div/div/div[3]/app-update-flight-booking-details/form/div[3]/div/div/div[2]/div[3]/div[2]/form/div/div/igx-input-group/div[1]/div/input")
    public WebElement beforbookingRemark ;
	
	
	@FindBy(xpath = "//*[text()='AWB Amendment Request']")
    public WebElement Export_AWB_Amendment_Request_Icon;
		
	@FindBy(xpath = "//*[text()='Shipper *']/parent::div/input")
    public WebElement NewJob_AddShipper_Input;

	@FindBy(xpath = "//*[@aria-label='AkshayShindeIndustries(1827)']/span/span")
    public WebElement NewJob_AddShipper_Input_akkk;

	@FindBy(xpath = "//*[text()='Consignee']/parent::div/input")
    public WebElement NewJob_Consignee_input;
	
	@FindBy(xpath = "//*[@aria-label='shindeakshayindustry(1232)']/span/span")
    public WebElement NewJob_Consignee_input_akk;
	
	@FindBy(xpath = "//*[text()='TODAY']")
    public WebElement NewJob_TODAY;
		
	
	@FindBy(xpath = "//*[text()='Destination Airport *']/parent::div/input")
    public WebElement NewJob_Destination_Airport;
	
	@FindBy(xpath = "//*[@aria-label='LHR - Heathrow Airport ( United Kingdom ) ']/span")
    public WebElement NewJob_Destinatio_Airport_LHR_Select;

	@FindBy(xpath = "//*[@id='TotNoOfPieces']")
    public WebElement NewJob_TotNoOfPieces;
	
	@FindBy(xpath = "//*[@id='GrossWeight']")
    public WebElement NewJob_GrossWeight;
	

	@FindBy(xpath = "(//*[text()='Commodity'])[1]/parent::div/input")
    public WebElement NewJob_Commodity;
	

	@FindBy(xpath = "//*[@aria-label='AIR - AIRCRAFT PARTS']")
    public WebElement NewJob_Commodity_AIR_AIRCRAFT_PARTS;
	
	
	@FindBy(xpath = "//*[@formcontrolname='TotVol']")
    public WebElement NewJob_TotVolue;
		
	@FindBy(xpath = "//*[text()='SHC *']/parent::div/input")
    public WebElement NewJob_SHC;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/igx-display-container/igx-combo-item/igx-checkbox/div/span")
    public WebElement NewJob_SHC_checkbox1;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/igx-display-container/igx-combo-item[1]/igx-checkbox/div/span")
    public WebElement NewJob_SHC_checkbox2;
	
	@FindBy(xpath = "//*[text()='Create Export Job']/parent::div/parent::div/parent::div/div[11]/div/button[3]")
    public WebElement NewJob_SAVE_JOB;
	
	

	@FindBy(xpath = "//*[@class='dashboardDefault']")
    public WebElement dashboardDefault;
	

	@FindBy(xpath = "//*[@title='Export']")
    public WebElement ExportIcon;
	
	
	@FindBy(xpath = "//*[text()='Job Maintenance']")
    public WebElement Job_Maintenance;
	
	@FindBy(xpath = "(//*[@formcontrolname='searchJob'])[1]")
    public WebElement searchJobs;
	
	@FindBy(xpath = "//*[text()='Shipper Name']/parent::igx-drop-down-item-group/igx-drop-down-item/span/span")
    public WebElement searchJobs_1st_select;
	
	@FindBy(xpath = "//*[text()='Job ID']/parent::igx-drop-down-item-group/igx-drop-down-item/span/span")
    public WebElement Airline_searchJobs_Booking_1_Request;
	
	@FindBy(xpath = "(//*[@class='ml-2 new-btn-primary ng-star-inserted'])[2]")
    public WebElement Airline_Booking_Request_Confirm;
	
	
	@FindBy(xpath = "//*[@class='listview__list listview__current ng-star-inserted']/div")
    public WebElement MainJobs;
	
	@FindBy(xpath = "(//*[text()='Rates'])[1]")
    public WebElement MainRatesIcon;
	
	@FindBy(xpath = "//*[@class='title-shipper-info']/span")
    public WebElement Shipper_No;
	
	@FindBy(xpath = "//*[@data-target='#collapse0']")
    public WebElement EK_Emirates_Arrow_select;
	
	@FindBy(xpath = "(//*[@name='Search'])[1]")
    public WebElement RateTab_Search_Carriers;
	
	@FindBy(xpath = "//*[@id='ChargerHeader00']")
    public WebElement EK_Emirates_Arrow_Accept;
	
	@FindBy(xpath = "//*[@id='collapse0']/div/div/div/div/div[2]/div[7]/span/button")
    public WebElement EK_Emirates_Arrow_select_Accept_button;
	
	@FindBy(xpath = "//*[text()='Flights']")
    public WebElement FlightsIcon;
	
	@FindBy(xpath = "(//*[text()='LHR'])[1]/parent::div/parent::div/div[7]/button[2]")
    public WebElement FlightsIcon_Select;
	
	@FindBy(xpath = "(//*[@formcontrolname='AllotmentID'])[2]")
    public WebElement FlightsIcon_Select_AllotmentID;
	
	@FindBy(xpath = "(//*[@title='Agent Created'])[2]")
    public WebElement FlightsIcon_Select_Agent_Created;
	
	@FindBy(xpath = "(//*[@title='Community'])[2]")
    public WebElement FlightsIcon_Select_Community;
	
	@FindBy(xpath = "(//*[@title='Contractual'])[2]")
    public WebElement FlightsIcon_Select_Contractual;
	
//	@FindBy(xpath = "(//*[@title='Contractual'])[2]")
//    public WebElement FlightsIcon_Select_Contractual;
//	
	
	@FindBy(xpath = "//*[@class='title-ation-exawb']/button[2]")
    public WebElement Export_AWB_Amendment_Request_Icon_Amend;
	
	@FindBy(xpath = "//*[@class='title-ation-exawb']/button[1]")
    public WebElement Export_AWB_Amendment_Request_Icon_Submit;
	
	@FindBy(xpath = "//*[text()='Submit Air Waybill Amendment?']/parent::div/parent::div/div[3]/div/button[2]")
    public WebElement Export_AWB_Amendment_Request_Icon_Submit_Yes;
	
	@FindBy(xpath = "(//*[@class='mx-3 text-right new-btn-flat'])[2]/button[2]")
    public WebElement Export_AWB_Amendment_Request_Icon_Submit_Yes1;
	
	@FindBy(xpath = "//*[@class='nature-qty-goods bdr-l']/div[2]/div/i")
    public WebElement Export_AWB_Amendment_Request_Icon_Amend_Edit_Cargo_Deatails;
	
	@FindBy(xpath = "//*[@aria-describedby='gridcargo_NumberOfPieces']/igx-input-group/div/div/input")
    public WebElement Export_AWB_Amendment_Request_Icon_Amend_Edit_Cargo_Deatails_NumberOfPieces;
	
	@FindBy(xpath = "//*[@aria-describedby='gridcargo_GrossWeight']/igx-input-group/div/div/input")
    public WebElement Export_AWB_Amendment_Request_Icon_Amend_Edit_Cargo_Deatails_GrossWeight;
	
	
	@FindBy(xpath = "(//*[@id='saveAWB_Btn' and @class='new-btn-primary'])[2]")
    public WebElement Export_AWB_Amendment_Request_Icon_Amend_Edit_Cargo_Deatails_Save_Changes;
	
	@FindBy(xpath = "//*[@id='saveAWB_Btn' and @class='new-btn-primary' and @displaydensity='compact']")
    public WebElement Export_AWB_Amendment_Request_Icon_Amend_Edit_Cargo_Deatails_Save_Changes1;
	
	@FindBy(xpath = "//*[@class='title-ation-exawb']/button[1]")
    public WebElement Airlin_Export_AWB_Amendment_Request_Icon_Accept;
	
	@FindBy(xpath = "//*[text()='Raise CCA']")
    public WebElement Raise_CCA_Icon1;
	
	@FindBy(xpath = "//*[text()='Commodity Items No.']")
    public WebElement Airline_Amend_AWB_Scrollupto;
	
	@FindBy(xpath = "//*[@title='Click Here to Raise CCA Request']")
    public WebElement Raise_CCA_Icon2;
	
	@FindBy(xpath = "//*[text()='Raise CCA Request']/parent::div/parent::div//parent::div/parent::app-ccarequest-detail/div[2]/div/div/h5/div/div[2]/strong[1]")
    public WebElement Raise_CCA_Prefix;
	
	@FindBy(xpath = "//*[text()='Raise CCA Request']/parent::div/parent::div//parent::div/parent::app-ccarequest-detail/div[2]/div/div/h5/div/div[2]/strong[2]")
    public WebElement Raise_CCA__AWB_No;
	
	@FindBy(xpath = "//*[text()='Chargeable Weight']/parent::div/parent::div/div[2]/strong")
    public WebElement Raise_CCA_Orignal_Weight;

	@FindBy(xpath = "//*[text()='Rate']/parent::div/parent::div/div[2]/strong")
    public WebElement Raise_CCA_Orignal_Rate;

	@FindBy(xpath = "//*[text()='Weight Charges']/parent::div/parent::div/div[2]/strong")
    public WebElement Raise_CCA_Orignal_Weight_Charges;

//	@FindBy(xpath = "//*[text()='Rate']/parent::div/parent::div/div[2]/strong")
//    public WebElement Raise_CCA_Requested_Weight_Charges;

	@FindBy(xpath = "//*[text()='Weight Charges']/parent::div/parent::div/div[4]/strong")
    public WebElement Raise_CCA_Requested_Weight_Charges;

	
	@FindBy(xpath = "//*[text()='Total Other Charges due Carrier']/parent::div/parent::div/div[2]/strong")
    public WebElement Raise_CCA_Orignal_Total_Other_Charges_due_Carrier;

	@FindBy(xpath = "//*[text()='Total Other Charges due Carrier']/parent::div/parent::div/div[4]/strong")
    public WebElement Raise_CCA_Reqested_Total_Other_Charges_due_Carrier;

	@FindBy(xpath = "//*[text()='Net/Net Amount']/parent::div/parent::div/div[2]/strong")
    public WebElement Raise_CCA_Orignal_Net_Amount;

	@FindBy(xpath = "//*[text()='Net/Net Amount']/parent::div/parent::div/div[4]/strong")
    public WebElement Raise_CCA_Requested_Net_Amount;

	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/Airline Ex.Tax']/parent::div/parent::div/div[2]/strong")
    public WebElement Raise_CCA_Orignal_TotalPayableReceivabletofromAgentAirlineExTax;

	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/Airline Ex.Tax']/parent::div/parent::div/div[4]/strong")
    public WebElement Raise_CCA_Requested_TotalPayableReceivabletofromAgentAirlineExTax;

	
	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/ Airline Incl. Tax']/parent::div/parent::div/div[2]/strong")
    public WebElement Raise_CCA_Orignal_TotalPayableReceivabletofromAgentAirlineInclTax;

	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/ Airline Incl. Tax']/parent::div/parent::div/div[4]/strong")
    public WebElement Raise_CCA_Requested_TotalPayableReceivabletofromAgentAirlineInclTax;

	
	@FindBy(xpath = "//*[text()='Total Payable To Carrier Incl. Tax']/parent::div/parent::div/div[2]/strong")
    public WebElement Raise_CCA_Requested_Total_Payble_From_Carrier_Incl_Tax;
	
	@FindBy(xpath = "//*[text()='Total Receivable From Carrier Incl. Tax']/parent::div/parent::div/div[2]/strong")
    public WebElement Raise_CCA_Requested_Total_Receivable_From_Carrier_Incl_Tax;
	
	//updatechareges

	@FindBy(xpath = "//*[text()=' Update Charges ']")
    public WebElement Agent_Raise_CCA_Update_Chaeges;
	
	@FindBy(xpath = "(//*[text()='MYC'])[2]/parent::div/parent::div//parent::div/div[3]/div/div/div/igx-input-group/div/div/input")
    public WebElement Agent_Raise_CCA_Update_Chaeges_MYC;
	

	@FindBy(xpath = "(//*[text()='MYC'])/parent::div/parent::div//parent::div/div[3]/div/div/div/igx-input-group/div/div/input")
    public WebElement Agent_Raise_CCA_Update_Chaeges_MYC1;
	
	@FindBy(xpath = "(//*[text()='MYC'])[2]/parent::div/parent::div//parent::div/div[2]/div/div/div/span")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Orignal_MYC;
	
	@FindBy(xpath = "(//*[text()='MYC'])/parent::div/parent::div//parent::div/div[2]/div/div/div/span")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Orignal_MYC1;
	
	@FindBy(xpath = "(//*[text()='SCC'])[2]/parent::div/parent::div//parent::div/div[3]/div/div/div/igx-input-group/div/div/input")
    public WebElement Agent_Raise_CCA_Update_Chaeges_ssc;
	
	@FindBy(xpath = "(//*[text()='SCC'])/parent::div/parent::div//parent::div/div[3]/div/div/div/igx-input-group/div/div/input")
    public WebElement Agent_Raise_CCA_Update_Chaeges_ssc1;
	
	
	@FindBy(xpath = "(//*[text()='SCC'])[2]/parent::div/parent::div//parent::div/div[2]/div/div/div/span")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Orignal_ssc;
	

	@FindBy(xpath = "(//*[text()='SCC'])/parent::div/parent::div//parent::div/div[2]/div/div/div/span")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Orignal_ssc1;
	
	@FindBy(xpath = "(//*[text()='Commission'])[2]/parent::div/parent::div//parent::div/div[3]/div/div/div/igx-input-group/div/div/input")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Commission;
	

	@FindBy(xpath = "(//*[text()='Commission'])[2]/parent::div/parent::div//parent::div/div[3]/div/div/div[1]/igx-input-group/div/div/input")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Commission1;
	

	@FindBy(xpath = "(//*[text()='Commission'])[2]/parent::div/parent::div//parent::div/div[2]/div/div/div/span")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Orignal_Commission;
	

	@FindBy(xpath = "(//*[text()='Commission'])/parent::div/parent::div//parent::div/div[2]/div/div/div/span")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Orignal_Commission1;
	
	@FindBy(xpath = "(//*[text()='Incentive'])[2]/parent::div/parent::div//parent::div/div[3]/div/div/div/igx-input-group/div/div/input")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Incentive;
	
	@FindBy(xpath = "(//*[text()='Incentive'])[2]/parent::div/parent::div//parent::div/div[3]/div/div/div[1]/igx-input-group/div/div/input")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Incentive1;
	
	@FindBy(xpath = "(//*[text()='Incentive'])/parent::div/parent::div//parent::div/div[2]/div/div/div/span")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Orignal_Incentive1;
	

	@FindBy(xpath = "(//*[text()='Incentive'])[2]/parent::div/parent::div//parent::div/div[2]/div/div/div/span")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Orignal_Incentive;
	
	@FindBy(xpath = "(//*[text()='Total Payable/Receivable to/from Agent/Airline Ex.Tax'])[2]/parent::div/parent::div//parent::div/div[3]/div/div/strong")
    public WebElement Agent_Raise_CCA_Update_Chaeges_TotalPayableReceivabletofromAgentAirlineExTax;
	
	@FindBy(xpath = "(//*[text()='Update Charges'])/parent::div/parent::div/parent::div/div[3]/div/button[2]")
    public WebElement Agent_Raise_CCA_Update_Chaeges_Apply_Changes;
	
	
	
	@FindBy(xpath = "//*[text()='Raise CCA Request']/parent::div/parent::div/parent::app-ccarequest-detail/div[2]/div[2]/div[2]/div[1]/button")
    public WebElement Raise_CCA_Upload_Documnet;

	@FindBy(xpath = "//*[@id='fileimgId']")
    public WebElement Raise_CCA_Upload_Documnet_choose_file;

	
	@FindBy(xpath = "//*[text()='Raise CCA Request']/parent::div/parent::div/parent::app-ccarequest-detail/div[2]/div[2]/div[2]/div[2]/button")
    public WebElement Raise_CCA_Resion_Code;
	
	
	@FindBy(xpath = "//*[text()='Reason Code']/parent::div/input")
    public WebElement Raise_CCA_Resion_Code_input;
	
	@FindBy(xpath = "//*[@title='Billed to Wrong Agent Location']/span")
    public WebElement Raise_CCA_Resion_Code_input_BilledtoWrongAgentLocation;
	
	
	
	@FindBy(xpath = "//*[text()='Raise CCA Request']/parent::div/parent::div/parent::app-ccarequest-detail/div[2]/div[2]/div[2]/div[3]/button")
    public WebElement Raise_CCA_Remark;

	@FindBy(xpath = "//*[text()='Remark (Optional)']/parent::div/input")
    public WebElement Raise_CCA_Remark_input;

	@FindBy(xpath = "//*[@id='accordionOne']/parent::div/div[2]/div[4]/div/button[1]")
    public WebElement Raise_CCA_Raise_CCA_;

	@FindBy(xpath = "//*[@id='accordionOne']/parent::div/div[2]/div[4]/div/button[2]")
    public WebElement Raise_CCA_Cancel;

	//Airline
	
	@FindBy(xpath = "//*[text()='APPROVE']")
    public WebElement Airline_CCA_APPROVE;
	
	@FindBy(xpath = "//*[text()='AIRLINE HANDLED']")
    public WebElement Airline_CCA_AIRLINE_HANDLED;
	
	@FindBy(xpath = "//*[text()='REJECT']")
    public WebElement Airline_CCA_REJECT;

	@FindBy(xpath = "(//*[text()='Airline Corrected'])[1]/parent::igx-checkbox/div/span")
    public WebElement Airline_CCA_Airline_Corrected_checkbox;
	
	@FindBy(xpath = "(//*[@for='CorrctdChrgWeight'])[3]/parent::div/input")
    public WebElement Airline_CCA_Airline_CorrctdChrgWeight;
	
	@FindBy(xpath = "//*[text()='Weight Charges']/parent::span/parent::div//parent::div/div[2]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Orignal_Weight_Charges;
	
	@FindBy(xpath = "//*[text()='Weight Charges']/parent::span/parent::div//parent::div/div[3]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Requested_Weight_Charges;
	
	
	@FindBy(xpath = "//*[text()='Weight Charges']/parent::span/parent::div//parent::div/div[4]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Corrctd_Weight_Charges;
	
	@FindBy(xpath = "//*[text()='Total Other Charges due Carrier']/parent::span/parent::div//parent::div/div[2]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Orignal_TotalOtherChargesdueCarrier;
	
	@FindBy(xpath = "//*[text()='Total Other Charges due Carrier']/parent::span/parent::div//parent::div/div[3]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Requested_TotalOtherChargesdueCarrier;
	
	
	@FindBy(xpath = "//*[text()='Total Other Charges due Carrier']/parent::span/parent::div//parent::div/div[4]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Corrctd_TotalOtherChargesdueCarrier;
	
	@FindBy(xpath = "//*[text()='Net/Net Amount']/parent::span/parent::div//parent::div/div[2]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Orignal_NetAmount;
	
	@FindBy(xpath = "//*[text()='Net/Net Amount']/parent::span/parent::div//parent::div/div[3]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Requested_NetAmount;
	
	
	@FindBy(xpath = "//*[text()='Net/Net Amount']/parent::span/parent::div//parent::div/div[4]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Corrctd_NetAmount;
	
	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/Airline Ex.Tax']/parent::span/parent::div//parent::div/div[2]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Orignal_TotalPayableReceivabletofromAgentAirlineExTax;
	
	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/Airline Ex.Tax']/parent::span/parent::div//parent::div/div[3]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Requested_TotalPayableReceivabletofromAgentAirlineExTax;
	
	
	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/Airline Ex.Tax']/parent::span/parent::div//parent::div/div[4]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Corrctd_TotalPayableReceivabletofromAgentAirlineExTax;
	
	
	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/ Airline Incl.Tax (All in AED)']/parent::small/parent::div//parent::div/div[2]/div/div[1]/small/strong")
    public WebElement Airline_CCA_Airline_Orignal_Total_PayableReceivablefromAgentAirline_InclTax_AllinAED;
	
	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/ Airline Incl.Tax (All in AED)']/parent::small/parent::div//parent::div/div[3]/div/div[1]/small/strong")
    public WebElement Airline_CCA_Airline_Requested_Total_PayableReceivablefromAgentAirline_InclTax_AllinAED;
	
	
	@FindBy(xpath = "//*[text()='Total Payable/Receivable to/from Agent/ Airline Incl.Tax (All in AED)']/parent::small/parent::div//parent::div/div[4]/div/div[1]/small/strong")
    public WebElement Airline_CCA_Airline_Corrctd_Total_PayableReceivablefromAgentAirline_InclTax_AllinAED;

	
	@FindBy(xpath = "//*[text()='Total Receivable From Agent Incl.Tax']/parent::div/parent::div/div[2]/strong")
    public WebElement Airline_CCA_Airline_Total_ReceivableFromAgentInclTax;
	
	@FindBy(xpath = "//*[@id=\"collapseTwo\"]/div[1]/div[3]/div/div[2]/strong")
    public WebElement Airline_CCA_Airline_Total_ReceivableFromAgentInclTax1;
	
	
	@FindBy(xpath = "//*[text()='Commission']/parent::span/parent::div//parent::div/div[4]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Corrctd_Commission;
	
	
	@FindBy(xpath = "//*[text()='Incentive']/parent::span/parent::div//parent::div/div[4]/div/div[1]/span/small")
    public WebElement Airline_CCA_Airline_Corrctd_Incentive;
	
	
	@FindBy(xpath = "//*[text()='Total Receivable From Agent Incl.Tax']/parent::div/parent::div/div[2]/strong")
    public WebElement Airline_CCA_Airline_TotalReceivableFromAgentInclTax;
	
	@FindBy(xpath = "//*[text()=' Update Charges']")
    public WebElement Airline_CCA_Airline_Update_Charges;

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


	@FindBy(xpath = "//*[text()=' Airline Remark']")
    public WebElement Airline_CCA_Airline_Remark;
	
	@FindBy(xpath = "//*[@id='AirlineRemarks']")
    public WebElement Airline_CCA_AirlineRemarks_Input;

	
	
	@FindBy(xpath = "//*[text()='Total Payable To Carrier Incl. Tax']/parent::small/parent::div/parent::div/parent::div/div[3]/div[2]/div/div/small/text()")
    public WebElement Agent_Lastconfimred_CCA_Total;
	

	@FindBy(xpath = "//*[text()='Total Payable To Carrier Incl. Tax']/parent::small/parent::div/parent::div/parent::div/div[3]/div[2]/div/div/small")
    public WebElement Agent_Lastconfimred_CCA_Total1;

	@FindBy(xpath = "//*[text()='Total Payable To Carrier Incl. Tax']/parent::small/parent::div/parent::div/parent::div/div[2]/div[2]/div/div[1]/small")
    public WebElement Agent_Lastconfimred_CCA_Weight;
	

	@FindBy(xpath = "//*[text()='Total Payable To Carrier Incl. Tax']/parent::small/parent::div/parent::div/parent::div/div[2]/div[2]/div/div[4]/small")
    public WebElement Agent_Lastconfimred_CCA_Other_Charges;
	
	
	@FindBy(xpath = "//*[text()='Total Receivable From Agent Incl.Tax']/parent::small/parent::div/parent::div/parent::div/div[3]/div[2]/div/div/small/text()")
    public WebElement Airlin_Lastconfimred_CCA_Total;
	

	@FindBy(xpath = "//*[text()='Total Receivable From Agent Incl.Tax']/parent::small/parent::div/parent::div/parent::div/div[3]/div[2]/div/div/small")
    public WebElement Airlin_Lastconfimred_CCA_Total1;

	@FindBy(xpath = "//*[text()='Total Receivable From Agent Incl.Tax']/parent::small/parent::div/parent::div/parent::div/div[2]/div[2]/div/div[1]/small")
    public WebElement Airlin_Lastconfimred_CCA_Weight;
	

	@FindBy(xpath = "//*[text()='Total Receivable From Agent Incl.Tax']/parent::small/parent::div/parent::div/parent::div/div[2]/div[2]/div/div[4]/small")
    public WebElement Airlin_Lastconfimred_CCA_Other_Charges;
	
	@FindBy(xpath = "//*[text()='CONFIRM']")
    public WebElement Agent_Lastconfimred_CCA_;
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[3]/div[4]/div/div/span/small")
    public WebElement Agent_Lastconfimred_CCA_Weight_Charges;
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[5]/div[4]/div/div/span/small")
    public WebElement Agent_Lastconfimred_CCA_Total_Other_Charges_due_Carrier;
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[7]/div[4]/div/div/span/small")
    public WebElement Agent_Lastconfimred_CCA_Commission;
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[8]/div[4]/div/div/span/small")
    public WebElement Agent_Lastconfimred_CCA_Incentive;
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[9]/div[4]/div/div/span/small")
    public WebElement Agent_Lastconfimred_CCA_Net_Amount;
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[10]/div[4]/div/div/span/small")
    public WebElement Agent_Lastconfimred_CCA_TotalPayableReceivable_tofrom_AgentAirline_Ex_Tax;
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[12]/div[4]/div/div/small/strong")
    public WebElement Agent_Lastconfimred_CCA_TotalPayableReceivabletofromAgentAirline_InclTax_AllinAED;

	
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[3]/div[5]/div/div/span/small")
    public WebElement Airlin_Lastconfimred_CCA_Weight_Charges1;
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[5]/div[5]/div/div/span/small")
    public WebElement Airlin_Lastconfimred_CCA_Total_Other_Charges_due_Carrier1;
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[9]/div[5]/div/div/span/small")
    public WebElement Airlin_Lastconfimred_CCA_Net_Amount1;
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[10]/div[5]/div/div/span/small")
    public WebElement Airlin_Lastconfimred_CCA_TotalPayableReceivable_tofrom_AgentAirline_Ex_Tax1;
	
	@FindBy(xpath = "//*[text()='Revised/Correct Charges']/parent::strong/parent::div/parent::div/parent::div/div[12]/div[5]/div/div/small/strong")
    public WebElement Airlin_Lastconfimred_CCA_TotalPayableReceivabletofromAgentAirline_InclTax_AllinAED1;

	@FindBy(xpath = "//*[text()='Flights']")
    public WebElement Agent_Flights_Icon;
	
	@FindBy(xpath = "//*[text()='Preferred Carrier']")
    public WebElement Agent_Flights_IconPreferred_Carrier_Text;
	
	
	
	@FindBy(xpath = "//*[@class='m-3 availability-status ng-star-inserted']/div/div[1]/div[7]/button[2]")
    public WebElement Agent_Flights_Icon_Select_Button;

	@FindBy(xpath = "(//*[text()='Stock Type *'])[2]/parent::div/parent::div/igx-suffix/igx-icon")
    public WebElement Agent_Flights_Icon_Select_Button_Stock_Type;
	
	@FindBy(xpath = "(//*[@title='Community'])[2]/span")
    public WebElement Agent_Flights_Icon_Select_Button_Stock_Type_Community;
	
	@FindBy(xpath = "(//*[@title='Contractual'])[2]/span")
    public WebElement Agent_Flights_Icon_Select_Button_Stock_Type_Contractual;
	
	@FindBy(xpath = "(//*[text()='Air Waybill'])/parent::div/parent::div/parent::div/div[10]/div/button[2]")
    public WebElement Agent_Flights_Icon_Select_Button_Send_Booking_Request;
	
	@FindBy(xpath = "(//*[text()='Air Waybill'])/parent::div/parent::div/parent::div/div[10]/div/button[2]")
    public WebElement Agent_Flights_Icon_Select_Button_Send_Booking_Request1;
	
	@FindBy(xpath = "(//*[text()='Send Flight Booking Request'])/parent::div/parent::div/div[3]/div/button[2]")
    public WebElement Agent_Flights_Icon_Select_Button_Send_Booking_Request2;
	
	@FindBy(xpath = "//*[text()='Flight Details']")
    public WebElement Agent_Flights_Icon_Select_Button_Flight_Details_disply;
	
	
	@FindBy(xpath = "(//*[@name='searchText'])")
    public WebElement Agent_Flights_Icon_searchText;
	
	@FindBy(xpath = "//*[@id='isShow']/div[2]/div[4]/span/button[2]")
    public WebElement Agent_Execute_AWB;
	

	@FindBy(xpath = "(//*[@id='chkTerms']/div/span)//*[@class='igx-checkbox__composite-mark']")
    public WebElement Agent_Execute_AWB_check_Box;
	
	@FindBy(xpath = "//*[text()='Yes']")
    public WebElement Agent_Execute_AWB_Yes;
	

	@FindBy(xpath = "//*[text()='Confirm']/parent::div/parent::div/div[2]/button/div/span")
    public WebElement Agent_Execute_AWB_Yes1;
	
	@FindBy(xpath = "//*[text()='Execute Air waybill?']/parent::h2/parent::div/parent::div/div[3]/div/button[2]")
    public WebElement Agent_Execute_AWB_Yes_YES_EXECUTE_Changes;
	

	@FindBy(xpath = "//*[text()='Confirmed Rate']/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/div[3]/div/button[2]")
    public WebElement Agent_Execute_AWB_Yes_YES_EXECUTE_Changes1;
	
	@FindBy(xpath = "//*[text()='AIRLINE HANDLED']")
    public WebElement Scroll_Downupto_;
	
	@FindBy(xpath = "//*[@class='title-ation']/button")
    public WebElement Print_CCA;
	
	
//	After Excuted Job Raise CCA by main CCA button
	
	@FindBy(xpath = "//*[@class='awb-number bdr-l']")
    public WebElement AWB_Number;
	
	@FindBy(xpath = "//*[@class='awb-perfix']")
    public WebElement AWB_Prefix;
	
	@FindBy(xpath = "//*[@class='showCCABtn']")
    public WebElement Main_CCA_Button;
	
	
	@FindBy(xpath = "(//*[@class='showNewJobBtn'])[1]/parent::ul/li[3]")
    public WebElement Main_Excuted_AWB1;
	
	@FindBy(xpath = "(//*[@class='showCCABtn'])[1]/parent::ul/li[3]")
    public WebElement Main_Excuted_AWB2;
	
	
	@FindBy(xpath = "//*[@title='CCA Requests']/parent::div/igx-navbar/nav/div[2]/button")
    public WebElement main_CCA_Reaquest_Button;
	
	@FindBy(xpath = "//*[text()='Prefix']/parent::div/input")
    public WebElement main_CCA_Reaquest_Button_Prefix_Input;
	
	@FindBy(xpath = "//*[@aria-label='176']/span/span")
    public WebElement main_CCA_Reaquest_Button_Prefix_Input_176_Select;
	
	
	@FindBy(xpath = "//*[text()='AWB/CBV no']/parent::div/input")
    public WebElement main_CCA_Reaquest_Button_AWB_Input;
	
	@FindBy(xpath = "//*[text()='AWB']/parent::igx-drop-down-item-group/igx-drop-down-item/span/span")
    public WebElement main_CCA_Reaquest_Button_AWB_Input_Select;
	
	@FindBy(xpath = "//*[text()='Next']")
    public WebElement main_CCA_Reaquest_Button_Next;
	
	
	
	
	// CCA reqeust send without Amed(WA)
	
	@FindBy(xpath = "//*[@for='TotChrWt_Requested']/parent::div/input")
    public WebElement Agent_Raise_CCA_Requested_Weight_WA;
	
	@FindBy(xpath = "//*[@for='Rate_Requested']/parent::div/input")
    public WebElement Agent_Raise_CCA_Requested_Rate_WA;
	
	
	
	
	
}

