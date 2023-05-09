package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Business_validations extends Pages.BasePage {

	public Business_validations(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[6]/div/a/i")
	public WebElement export_icon;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[6]/div/a/span")
	public WebElement export;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[6]/div/a/em")
	public WebElement export_downarrow;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[6]/div/ul/li[1]/div/a/span")
	public WebElement Job_maintenance;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div[2]/div/app-search-job-dropdown/div[2]/div[2]/app-dateformat/form/igx-date-picker/igx-input-group/div[1]/igx-suffix/igx-icon")
	public WebElement clear_FromDate;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div[2]/div/app-search-job-dropdown/div[2]/div[2]/app-dateformat/form/igx-date-picker/igx-input-group/div[1]/div/input")
	public WebElement FromDate;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/label[1]")
	public WebElement Newjob;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[3]/div[1]/app-commonshipperautocomplete/form/div/div[2]/igx-input-group/div[1]/div/input")
	public WebElement Shipper;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[3]/div[2]/app-commonshipperautocomplete/form/div/div[2]/igx-input-group/div[1]/div/input")
	public WebElement Consignee;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[9]/div[1]/app-cargosummary/div/form/div[1]/div[1]/igx-input-group/div[1]/div/input")
	public WebElement Total_pieces;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[9]/div[1]/app-cargosummary/div/form/div[1]/div[2]/div[1]/div[1]/igx-input-group/div[1]/div/input")
	public WebElement Gross_weight;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[9]/div[1]/app-cargosummary/div/form/div[2]/div[1]/app-commonmultiselectdropdown/form/igx-combo/igx-input-group/div[1]/div/input")
	public WebElement SHC_downarrow;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/igx-display-container/igx-combo-item[2]/igx-checkbox/div")
	public WebElement SHC;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[9]/div[1]/app-cargosummary/div/form/div[3]/div[1]/igx-input-group/div[1]/div/textarea")
	public WebElement Cargo_Des;
	
	@FindBy(css="#chkIsAgree > div > span > svg")
	public WebElement Agree;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[7]/div[2]/app-commonautocomplete/form/igx-input-group/div[1]/div/input")
	public WebElement Des_Airport;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[9]/div[3]/div[1]/span/button")
	public WebElement Save_job;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/app-joblist/div[1]/div[2]/div[1]/div/div[1]/strong")
	public WebElement Capture_createdID;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[4]/span/button[1]")
	public WebElement Assign_AWB;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form/div/div[1]/div[2]/app-commondropdown/form/igx-select/igx-input-group/div[1]/div/input")
	public WebElement Assign_Awb_stock_type;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/igx-select-item[2]/span")
	public WebElement Stock_type_commudity;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form/div/div[1]/div[3]/app-commondropdown/form/igx-select/igx-input-group/div[1]/div/input")
	public WebElement Airline;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div/igx-select-item[20]/span")
	public WebElement AirlineType;
	
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[5]/form/div/div[2]/div/button[3]")
	public WebElement Assign;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[4]/div[2]/small")
	public WebElement rate;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[2]/app-rates/div[1]/div/div[3]/div[3]/div/div[1]/h5/div/div[7]/button")
	public WebElement Rate_downArrow;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[2]/app-rates/div[1]/div/div[3]/div[3]/div/div[2]/div/div/div/div[1]/div[2]/div[3]")
	public WebElement Ratevalidity;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[2]/app-rates/div[1]/div/div[3]/div[3]/div/div[2]/div/div/div/div[1]/div[2]/div[4]")
	public WebElement Display_Rate;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[2]/app-rates/div[1]/div/div[3]/div[3]/div/div[2]/div/div/div/div[1]/div[2]/div[7]/span/button")
	public WebElement Rate_accept;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[4]/div[3]/span")
	public WebElement Flights;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[3]/app-flights/div/div[1]/div[2]/div[3]/div/div/div[1]/div[7]/button[2]")
	public WebElement Flights_select;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div/div[10]/div/button[2]")
	public WebElement BookingRequest;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[6]/ul/li[2]/a/i")
	public WebElement Logout_asky;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[5]/div/a/i")
	public WebElement Export_Icon;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[5]/div/a/em")
	public WebElement Export_downArrow;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[5]/div/ul/li[3]/div/a")
	public WebElement Request_booking;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-flight-booking-request/form/section/div/div/div[3]/app-update-flight-booking-details/form/div[3]/div/div/div[2]/div[6]/button[4]")
	public WebElement ConformBooking;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[6]/ul/li[2]/a/i")
	public WebElement Logout_agent;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div[2]/div/app-search-job-dropdown/div[1]/div[1]/form/igx-input-group/div[1]/div/input")
	public WebElement Search;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[2]/div[4]/span/button[2]")
	public WebElement Execute_AWB;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/app-dialog/div/div/div[2]/button[1]")
	public WebElement Execute_AWB_yes;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div/div/div/div/div[3]/div/button[2]")
	public WebElement Yes_execute_changes;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div/div/div/div/div[2]/div[5]/div/div/div[2]/div")
	public WebElement as_agreed;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[1]/div/div[2]/div/ul/li[1]")
	public WebElement master_jobs;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[4]/h4")
	public WebElement Routing_information;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[3]/div[2]/span[2]/button")
	public WebElement print_AWB;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/p[1]/button[1]")
	public WebElement shipper_change;

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/app-commonshipperautocomplete/form/div/div[2]/igx-input-group/div[1]/div/input")
	public WebElement shipper_textbox;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[5]/h4")
	public WebElement Custominformation_downarrow;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[5]/div[1]/div[2]/div[5]/div/div/div/div[1]/igx-input-group/div[1]/div/input")
	public WebElement Custominformation_textbox;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[2]/div[6]/div/button[1]")
	public WebElement Save;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[9]/div[1]/app-cargosummary/div/form/div[2]/div[2]/app-commonautocomplete/form/igx-input-group/div[1]/div/input")
	public WebElement community;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/div[1]/app-createjob/div/form/div/div/div[5]/div[2]/div/div[3]/button[1]")
	public WebElement Today;
	
	@FindBy(xpath = "//*[text()='TODAY']")
    public WebElement NewJob_TODAY;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-masterpage/section/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/app-joblist/div[1]/div[2]/div[1]/div/div[2]/div[1]/strong")
	public WebElement AWB_text;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[3]/div/a/i")
	public WebElement stockmanagement_icon;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[3]/div/ul/li[1]/div/a/span")
	public WebElement stockmanagement;
	
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/mat-tab-header/div/div/div/div[5]/div")
	public WebElement search_stock;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[5]/div/app-uplift-advanced-search/div/div[2]/div[2]/div[2]/div/igx-radio/span[1]")
	public WebElement searchfordocument;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[5]/div/app-uplift-advanced-search/div/div[3]/div/div/div/div[2]/div/igx-input-group/div[1]/div/input")
	public WebElement document_number;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-blank-layout/app-login/div/div/div[2]/div[2]/form/div/div[1]/igx-input-group[1]/div[1]/div/input")
	public WebElement username;
	
	@FindBy(xpath = "/html/body/div[1]/app-root/app-blank-layout/app-login/div/div/div[2]/div[2]/form/div/div[1]/igx-input-group[2]/div[1]/div/input")
    public WebElement Password;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-blank-layout/app-login/div/div/div[2]/div[2]/form/div/div[1]/div[6]/button[1]")
	public WebElement login;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[5]/div/app-uplift-advanced-search/div/form[2]/div[2]/button[1]")
	public WebElement stock_search;
	
	
	
	
}
