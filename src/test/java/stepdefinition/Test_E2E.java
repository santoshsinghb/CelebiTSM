package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Helper.Constants;
//import Helpers.TestDataReader;
import Pages.Login_Screen;
import static Helper.BaseObjects.*;
import static Helper.BaseVariables.*;
import Methods.WebDriverMethod;
import static Helper.BaseObjects.E2E;
import static Helper.BaseVariables.Username;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;

import static Helper.BaseVariables.Password;
import TestDataOperations.TestDataReader;
import static Helper.BaseVariables.Entity;



public class Test_E2E {

	

	
	
	@When("I login with {string} GSAuser given in {string} sheet of excel data")
	public void i_login_with_gs_auser_given_in_sheet_of_excel_data(String entity, String sheetName) throws Throwable {

//
//		driver.get("https://galaxydemo.kalelogistics.in/GalaxyV3/Login.aspx");
		//		Thread.sleep(16000);
		//		E2E.Galaxy_Username.sendKeys("kale");
		//		Thread.sleep(6000);
		//		E2E.Galaxy_Pass.sendKeys("Kale@123");
		//		Thread.sleep(3000);
		//		E2E.Galaxy_login.click();
		//		Thread.sleep(6000);
		//		E2E.E2E_Billing.click();
		//		Thread.sleep(3000);
		
	
		
		
		//		E2E.E2E_Billing_customerinovice.click();
		//		Thread.sleep(22000);
	
		//		String parent=driver.getWindowHandle();

		//       Set<String>s=driver.getWindowHandles();



        // // Now iterate using Iterator
		//        Iterator<String> I2ndagnt= s.iterator();



		//        while(I2ndagnt.hasNext())
		//        {



		//        String child_window=I2ndagnt.next();




		//        if(!parent.equals(child_window))
		//        {
		//       driver.switchTo().window(child_window);
		//        Thread.sleep(4000);
		//        System.out.println(driver.switchTo().window(child_window));
        
		//        driver.close();

		//       }



		//        }
		//        driver.switchTo().window(parent);
		//       Thread.sleep(3000);
      
		
		//		driver.switchTo().frame(0);
		//      Thread.sleep(3000);
		
		
		
		//		E2E.E2E_Billing_DocumentID.sendKeys("125-94949444~HAWB2~BA303~02-07-2023");
		//		Thread.sleep(6000);
		//		E2E.E2E_Billing_DocumentID_Search.click();
		//		Thread.sleep(8000);
		//		E2E.E2E_Billing_generatInvoice.click();
		//		Thread.sleep(22000);
	////	E2E.E2E_Billing_generatInvoice_Select.click();
	////	Thread.sleep(12000);
		//		E2E.E2E_Billing_generatInvoice_calCharges.click();
		//		Thread.sleep(28000);
		//		E2E.E2E_Billing_generatInvoice_InvoiceHistory.click();
		//		Thread.sleep(8000);
		//		E2E.E2E_Billing_generatInvoice_printOption.click();
		//		Thread.sleep(8000);
		//		E2E.E2E_Billing_generatInvoice_ACTION.click();
		//		Thread.sleep(88000);
		//		E2E.E2E_Billing_generatInvoice_PayNproceed.click();
		//		Thread.sleep(8000);
		
		
		
		
		
		
		

//E2E----------------------		
		E2E.LanSelectDropDown.click();
		Thread.sleep(5000);
		E2E.EnglishLang.click();
		Thread.sleep(5000);
		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= "+Username);
		System.out.println("pwd= "+Password);
  
		Thread.sleep(20000);
//		E2E.CaptchaTextBox.sendKeys(E2E.CaptchaText);
//		Thread.sleep(1000);
		loginScreen.Login(Entity,Username, Password);
		 //these below line added
		//  driver.navigate().refresh();
		//   loginScreen.Login(Entity, Username, Password);
		Thread.sleep(5000);
		
// added steps for testing by vishnu
		
	
        
		
		
	

	}

	
	@Then("User is able to nevigate dock Configuration screen screen \\/tab should be displayed in GHA login and add dock")
	public void user_is_able_to_nevigate_dock_configuration_screen_screen_tab_should_be_displayed_in_gha_login() throws InterruptedException {
		WebDriverMethod.JavascriptExecutorClick( driver, E2E.DockCongigurationTab);
				Thread.sleep(500);
				WebDriverMethod.JavascriptExecutorClick( driver, E2E.AddDockBtn);
				Thread.sleep(500);
				E2E.DockNameTextBox.sendKeys("B");
				Thread.sleep(2000);
				E2E.NoDockTextBox.sendKeys("2");
				Thread.sleep(2000);
				WebDriverMethod.JavascriptExecutorClick( driver, E2E.Submit);
				Thread.sleep(4000);
				WebDriverMethod.JavascriptExecutorClick( driver, E2E.Okbtn);
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(2000);
				WebDriverMethod.JavascriptExecutorClick( driver, E2E.SlotCongigurationTab);
				Thread.sleep(2000);
				WebDriverMethod.JavascriptExecutorClick( driver, E2E.MayAssignDocks);
				Thread.sleep(6000);
				WebDriverMethod.JavascriptExecutorClick( driver, E2E.A1CheckBox);
				Thread.sleep(6000);
				WebDriverMethod.JavascriptExecutorClick( driver, E2E.A2CheckBox);
				Thread.sleep(2000);
				WebDriverMethod.JavascriptExecutorClick( driver, E2E.SubmitBtn);
				Thread.sleep(2000);
				WebDriverMethod.JavascriptExecutorClick( driver, E2E.AssignnedConfirmationmsgOKbtn);

		
	}

//	io.cucumber.junit.UndefinedStepException: The step 'In Dock configuration screen only 3 column should be displayed' and 1 other step(s) are undefined.
//	You can implement these steps using the snippet(s) below:

//	@Then("In Dock configuration screen only {int} column should be displayed")
//	public void in_dock_configuration_screen_only_column_should_be_displayed(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("In dock configuration screen proper alignment of column should be displayed")
//	public void in_dock_configuration_screen_proper_alignment_of_column_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}



	
	@Then("In Dock configuration screen only {int} column should be displayed")
	public void in_dock_configuration_screen_only_column_should_be_displayed(Integer int1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException(); {
		Thread.sleep(2000);
		WebDriverMethod.JavascriptExecutorClick( driver, E2E.DropdownLogOut);
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebDriverMethod.JavascriptExecutorClick( driver, E2E.LogOut);
		Thread.sleep(2000);
	/*	TestDataReader.AcsAgentLogin();
		E2E.Username.sendKeys(Username); Thread.sleep(2000);
		E2E.Password.sendKeys(Password); Thread.sleep(2000);
	*/	//Thread.sleep(6000);
		
//		io.cucumber.junit.UndefinedStepException: The step 'I  get login with {string} GSAuser given in {string} sheet of excel data' is undefined.
//		You can implement this step using the snippet(s) below:

//		@When("I  get login with \\{string} GSAuser given in \\{string} sheet of excel data")
//		public void i_get_login_with_gs_auser_given_in_sheet_of_excel_data(String entity, String sheetName) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}



		
	   }

//	@When("I  get login with {string} GSAuser given in {string} sheet of excel data")
//	public void i_get_login_with_gs_auser_given_in_sheet_of_excel_data(String entity, String sheetName) throws Throwable {
//@When("I  get login with \\{string} GSAuser given in \\{string} sheet of excel data")
//public void i_get_login_with_gs_auser_given_in_sheet_of_excel_data(String entity, String sheetName) throws Throwable {
	@When("I  get login with GSAuser given in sheet of excel data")
	public void i_get_login_with_gs_auser_given_in_sheet_of_excel_data()throws Throwable {
	    // Write code here that turns the phrase above into concrete actions 
	//    throw new io.cucumber.java.PendingException();
        E2E.LanSelectDropDown.click();
		Thread.sleep(5000);
		E2E.EnglishLang.click();
		Thread.sleep(5000);
//		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= "+Username); 
		System.out.println("pwd= "+Password);
//   loginScreen.isLoginScreenDisplayed();
		Thread.sleep(20000);
		//E2E.CaptchaTextBox.sendKeys(E2E.CaptchaText);
		//Thread.sleep(1000);
		loginScreen.Login(Entity,Username, Password);
		 //these below line added
		//  driver.navigate().refresh();
		//   loginScreen.Login(Entity, Username, Password);
		Thread.sleep(12000);
		WebDriverMethod.JavascriptExecutorClick( driver, E2E.BookSlot);
		Thread.sleep(5000);
		
		E2E.BookSlot_Back.click();
		Thread.sleep(18000);
		E2E.Create_AWB.click();
		Thread.sleep(5000);
		E2E.MAWB_firstnumber.sendKeys("125");
		Thread.sleep(3000);
		E2E.MAWB_Secondnumber.sendKeys("64235415");
		Thread.sleep(4000);
		E2E.AirlneCode.sendKeys("");
		Thread.sleep(4000);
		E2E.Orign.sendKeys("ist");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("click");Thread.sleep(6000);
		Thread.sleep(3000);
		E2E.Destination.sendKeys("lhr");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("click");Thread.sleep(6000);
		Thread.sleep(3000);
		E2E.Galaxy_VCTacceptance_NOP.sendKeys("12");
		Thread.sleep(3000);
		E2E.Gr_wt.sendKeys("50");
		Thread.sleep(3000);
		E2E.SelectComoditiyType.click();
		Thread.sleep(4000);
		E2E.Baggege.click();
		Thread.sleep(3000);
		E2E.SHC_code.click();
		Thread.sleep(8000);
		E2E.SHC_code_Select.click();
		Thread.sleep(8000);
		
		E2E.NOG.sendKeys("high");
		Thread.sleep(3000);
		E2E.CreateAWB_SAVE.click();
		Thread.sleep(5000);
		
		E2E.Galaxy_VCTacceptance_shipmentAccept.click();
		Thread.sleep(8000);
	//	E2E.CreateAWB_Cancel.click();
	//	Thread.sleep(3000);
		
		E2E.AWB_shipmentTypeSelect.click();
		Thread.sleep(3000);
		
		E2E.Book_Slot.click();
		Thread.sleep(12000);
		E2E.Book_TIME_Slot.click();
		Thread.sleep(3000);
		E2E.Book_TIME_Slot_Save.click();
		Thread.sleep(36000);
		E2E.Book_TIME_Slot_ok.click();
		Thread.sleep(26000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		driver.get("https://galaxydemo.kalelogistics.in/GalaxyV3/Login.aspx");
		Thread.sleep(16000);
		E2E.Galaxy_Username.sendKeys("kale");
		Thread.sleep(6000);
		E2E.Galaxy_Pass.sendKeys("Kale@123");
		Thread.sleep(3000);
		E2E.Galaxy_login.click();
		Thread.sleep(6000);
		E2E.Galaxy_Exports.click();
		Thread.sleep(3000);
		E2E.Galaxy_VCTGeneration.click(); 
		Thread.sleep(3000);
		String parent=driver.getWindowHandle();

        Set<String>s=driver.getWindowHandles();



        // Now iterate using Iterator
        Iterator<String> I2ndagnt= s.iterator();



        while(I2ndagnt.hasNext())
        {



        String child_window=I2ndagnt.next();




        if(!parent.equals(child_window))
        {
        driver.switchTo().window(child_window);
        Thread.sleep(4000);
        System.out.println(driver.switchTo().window(child_window));
        
      //  driver.close();

        }



        }
        driver.switchTo().window(parent);
        Thread.sleep(3000);
      
		
		driver.switchTo().frame(0);
       Thread.sleep(3000);
//		WebElement m=driver.findElement(By.linkText("Company"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",E2E.Galaxy_VCTGeneration_SelectNumber );
		
//		E2E.Galaxy_VCTGeneration_SelectNumber.click();
		Thread.sleep(26000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	
//		driver.switchTo().frame(0);
 //       Thread.sleep(3000);
		 driver.switchTo().window(parent);
	        Thread.sleep(3000);
        
		E2E.Galaxy_VCTacceptance.click();
		Thread.sleep(48000);
		driver.switchTo().frame(0);
        Thread.sleep(3000);
        
        
      E2E.Galaxy_VCTacceptance_VCTno.sendKeys("T2023060100007");
       Thread.sleep(3000);
		E2E.Galaxy_VCTacceptance_Search.click();
		Thread.sleep(3000);
		E2E.Galaxy_VCTacceptance_Date.sendKeys("14/06/2023");
		Thread.sleep(12000);
		E2E.Galaxy_VCTacceptance_Date19.click();
		Thread.sleep(3000);
		E2E.Galaxy_VCTacceptance_Hour.sendKeys("1800");
		Thread.sleep(18000);
		E2E.Galaxy_VCTacceptance_GateIn.click();
		Thread.sleep(26000);
//		E2E.Galaxy_VCTacceptance_DoorSelect.click();
//		Thread.sleep(6000);
//		E2E.Galaxy_VCTacceptance_DoorSelect1.click();
//		Thread.sleep(6000);
		E2E.Galaxy_VCTacceptance_DockIn.click();
		Thread.sleep(16000);
		
		E2E.Galaxy_VCTacceptance_CargoAccept.click();
		Thread.sleep(16000);
		
		E2E.Galaxy_VCTacceptance_GroupId.sendKeys("6471337");
		Thread.sleep(16000);
		
		
		E2E.Galaxy_VCTacceptance_NOPVolume.sendKeys("4");
		Thread.sleep(8000);
		E2E.Galaxy_VCTacceptance_NOPLength.sendKeys("5");
		Thread.sleep(8000);
		E2E.Galaxy_VCTacceptance_NOPWidth.sendKeys("8");
		Thread.sleep(8000);
		E2E.Galaxy_VCTacceptance_NOPHeight.sendKeys("4");
		Thread.sleep(8000);
		E2E.Galaxy_VCTacceptance_Volume.click();
		Thread.sleep(8000);
		E2E.Galaxy_VCTacceptance_NOPAcceptCargO.click();
		Thread.sleep(32000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(4000);
		driver.get("http://172.2.0.68/ACS_IST_NEW/UI/UpliftLogin.aspx");
		Thread.sleep(16000);
		E2E.LanSelectDropDown.click();
		Thread.sleep(5000);
		E2E.EnglishLang.click();
		Thread.sleep(5000);
//		Entity = entity;
		TestDataReader.ReadLoginDetails(Entity);
		Thread.sleep(500);
		System.out.println("usr= "+Username);
		System.out.println("pwd= "+Password);
//   loginScreen.isLoginScreenDisplayed();
		Thread.sleep(20000);
//		//E2E.CaptchaTextBox.sendKeys(E2E.CaptchaText);
//		//Thread.sleep(1000);
//		loginScreen.Login(Entity,Username, Password);
		 //these below line added
		//  driver.navigate().refresh();
		//   loginScreen.Login(Entity, Username, Password);
//		Thread.sleep(5000);
		E2E.E2E_slotUsageReport.click();
		Thread.sleep(5000);
		E2E.E2E_slotUsageReport_Date.click();
		Thread.sleep(5000);
		E2E.E2E_slotUsageReport_Date1.click();
		Thread.sleep(5000);
		E2E.E2E_slotUsageReport_Date2.click();
		Thread.sleep(5000);
		E2E.E2E_slotUsageReport_date5.click();
		Thread.sleep(5000);
		E2E.E2E_slotUsageReport_slotStatusSelect.click();
		Thread.sleep(5000);
		E2E.E2E_slotUsageReport_ViewReport.click();
		Thread.sleep(5000);
		
		E2E.E2E_WalkinCustomer.click();
		Thread.sleep(5000);
		E2E.E2E_WalkinCustomer_AgentName.sendKeys("AGILITY LOJISTIK AS # Istanbul # C5CB39AB-866D-4EAC-9C13-B032D8BCC097");
		Thread.sleep(12000);
		E2E.E2E_WalkinCustomer_AgentVerification.click();
		Thread.sleep(5000);
		E2E.E2E_WalkinCustomer_select_Agility.click();
		Thread.sleep(8000);
		E2E.E2E_WalkinCustomer_Agility_ok.click();
		Thread.sleep(8000);
		E2E.E2E_WalkinCustomer_vehicle_no.sendKeys("4534576");
		Thread.sleep(5000);
		E2E.E2E_WalkinCustomer_mobile_no.sendKeys("837487874");
		Thread.sleep(5000);
		E2E.E2E_WalkinCustomer_Next.click();
		Thread.sleep(5000);
		
		E2E.MAWB_firstnumber.sendKeys("125");
		Thread.sleep(3000);
		E2E.MAWB_Secondnumber.sendKeys("74782923");
		Thread.sleep(4000);
		E2E.AirlneCode.sendKeys("");
		Thread.sleep(4000);
		E2E.Orign.sendKeys("ist");
	//	Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("click");Thread.sleep(6000);
		Thread.sleep(3000);
		E2E.Destination.sendKeys("lhr");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("click");Thread.sleep(6000);
		Thread.sleep(3000);
		E2E.Galaxy_VCTacceptance_NOP.sendKeys("12");
		Thread.sleep(3000);
		E2E.Gr_wt.sendKeys("50");
		Thread.sleep(3000);
		E2E.SelectComoditiyType.click();
		Thread.sleep(4000);
		E2E.Baggege.click();
		Thread.sleep(3000);
		E2E.NOG.sendKeys("high");
		Thread.sleep(3000);
		E2E.CreateAWB_SAVE.click();
		Thread.sleep(5000);
	
}

//io.cucumber.junit.UndefinedStepException: The step 'I  get login with GSAuser given in sheet of excel data' and 106 other step(s) are undefined.
//You can implement these steps using the snippet(s) below:

//@When("I  get login with GSAuser given in sheet of excel data")
//public void i_get_login_with_gs_auser_given_in_sheet_of_excel_data() {
    // Write code here that turns the phrase above into concrete actions
 //   throw new io.cucumber.java.PendingException();
//}
@Then("User should be able to add new dock in configuration screen")
public void user_should_be_able_to_add_new_dock_in_configuration_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("User should be able to search with dock name filter")
public void user_should_be_able_to_search_with_dock_name_filter() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("User should be able to delete added dock from dock configuration screen")
public void user_should_be_able_to_delete_added_dock_from_dock_configuration_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("User should be able to assign created dock in slot configuration screen")
public void user_should_be_able_to_assign_created_dock_in_slot_configuration_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify assign dock configuration and count of dock should be displayed in book slot screen")
public void to_verify_assign_dock_configuration_and_count_of_dock_should_be_displayed_in_book_slot_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("In dock configuration screen legend icon and legend description should be displayed")
public void in_dock_configuration_screen_legend_icon_and_legend_description_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("User should be able to block slot by selecting  Adhoc option")
public void user_should_be_able_to_block_slot_by_selecting_adhoc_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("User should be able to block slot by selecting  Date range option")
public void user_should_be_able_to_block_slot_by_selecting_date_range_option() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("If user blocks dock then legend for same should be updated")
public void if_user_blocks_dock_then_legend_for_same_should_be_updated() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify after blocking dock when user click on block period icon block period details should reflect")
public void to_verify_after_blocking_dock_when_user_click_on_block_period_icon_block_period_details_should_reflect() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify if user assign no of docks then the docks should get added to the select dock name")
public void to_verify_if_user_assign_no_of_docks_then_the_docks_should_get_added_to_the_select_dock_name() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("User should be able to edit added dock from dock configuration screen")
public void user_should_be_able_to_edit_added_dock_from_dock_configuration_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("User should be able to unblock blocked period dock")
public void user_should_be_able_to_unblock_blocked_period_dock() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user should be able to block slot for assign dock only")
public void to_verify_user_should_be_able_to_block_slot_for_assign_dock_only() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify if user blocks dock then blocked dock should not be display in book slot screen")
public void to_verify_if_user_blocks_dock_then_blocked_dock_should_not_be_display_in_book_slot_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("If user logins with Turkish language then headers should display in Turkish language")
public void if_user_logins_with_turkish_language_then_headers_should_display_in_turkish_language() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("If dock is assigned and user updates dock name then the updated dock name should be displayed in slot configuration assign dock list")
public void if_dock_is_assigned_and_user_updates_dock_name_then_the_updated_dock_name_should_be_displayed_in_slot_configuration_assign_dock_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify user is able to navigate to create AWB screen")
public void to_verify_user_is_able_to_navigate_to_create_awb_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to create direct AWB in agent login")
public void to_verify_user_is_able_to_create_direct_awb_in_agent_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to create consol AWB in agent login")
public void to_verify_user_is_able_to_create_consol_awb_in_agent_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify after AWB is created is should be displayed in MAWB listing page")
public void to_verify_after_awb_is_created_is_should_be_displayed_in_mawb_listing_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to change Airline code in create AWB screen")
public void to_verify_user_is_able_to_change_airline_code_in_create_awb_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify user is able to update airline code in create AWB screen")
public void to_verify_user_is_able_to_update_airline_code_in_create_awb_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify if Airline code is kept blank then user is not able to save AWB details and proper validation should be displayed")
public void to_verify_if_airline_code_is_kept_blank_then_user_is_not_able_to_save_awb_details_and_proper_validation_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify user is able to select AWB from the listing page and book slot")
public void to_verify_user_is_able_to_select_awb_from_the_listing_page_and_book_slot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user should be able to change vehicle type and book slot")
public void to_verify_user_should_be_able_to_change_vehicle_type_and_book_slot() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify VCT generated from ACS should be displayed in GHA VCT Generation  Screen")
public void to_verify_vct_generated_from_acs_should_be_displayed_in_gha_vct_generation_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to view VCT print in ACS")
public void to_verify_user_is_able_to_view_vct_print_in_acs() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to update VCT details")
public void to_verify_user_is_able_to_update_vct_details() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify if VCT details are updated then same should be updated in GHA")
public void to_verify_if_vct_details_are_updated_then_same_should_be_updated_in_gha() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify user should be able to cancel VCT in ACS")
public void to_verify_user_should_be_able_to_cancel_vct_in_acs() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify if VCT is canceled then same VCT details will not display  in GHA")
public void to_verify_if_vct_is_canceled_then_same_vct_details_will_not_display_in_gha() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify in HHT application user is able to navigate to gate in screen in HHT application")
public void to_verify_in_hht_application_user_is_able_to_navigate_to_gate_in_screen_in_hht_application() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to scan QR code from TSM VCT and record gate in details in HHT")
public void to_verify_user_is_able_to_scan_qr_code_from_tsm_vct_and_record_gate_in_details_in_hht() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify after gate in same status should be displayed in GHA login")
public void to_verify_after_gate_in_same_status_should_be_displayed_in_gha_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify if gate is done user should not be able to cancel VCT in TSM")
public void to_verify_if_gate_is_done_user_should_not_be_able_to_cancel_vct_in_tsm() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify user is able to manually search with VCT number in gate in screen")
public void to_verify_user_is_able_to_manually_search_with_vct_number_in_gate_in_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify if user search with invalid VCT number then proper validation should be displayed in gate in screen")
public void to_verify_if_user_search_with_invalid_vct_number_then_proper_validation_should_be_displayed_in_gate_in_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify if gate in is not done user should not be able to record dock in")
public void to_verify_if_gate_in_is_not_done_user_should_not_be_able_to_record_dock_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify if gate in is not done user should not be able to record dock")
public void to_verify_if_gate_in_is_not_done_user_should_not_be_able_to_record_dock() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to navigate to VCT acceptance screen in GHA")
public void to_verify_user_is_able_to_navigate_to_vct_acceptance_screen_in_gha() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to record gate in GHA")
public void to_verify_user_is_able_to_record_gate_in_gha() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify if gate in is recorded in GHA then legend for same should be in ACS")
public void to_verify_if_gate_in_is_recorded_in_gha_then_legend_for_same_should_be_in_acs() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to record dock  in GHA")
public void to_verify_user_is_able_to_record_dock_in_gha() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify if dock in is recorded in GHA then legend for same should be in ACS")
public void to_verify_if_dock_in_is_recorded_in_gha_then_legend_for_same_should_be_in_acs() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify user is able to complete shipment Acceptance in GHA")
public void to_verify_user_is_able_to_complete_shipment_acceptance_in_gha() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify if shipment acceptance is completed then status for same should be updated in GHA")
public void to_verify_if_shipment_acceptance_is_completed_then_status_for_same_should_be_updated_in_gha() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify if gate in is recorded then SMS to the entered agent mobile number should be received")
public void to_verify_if_gate_in_is_recorded_then_sms_to_the_entered_agent_mobile_number_should_be_received() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify if dock  is recorded then SMS to the entered agent mobile number should be received")
public void to_verify_if_dock_is_recorded_then_sms_to_the_entered_agent_mobile_number_should_be_received() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify user is able to upload excel and AWB details should be added")
public void to_verify_user_is_able_to_upload_excel_and_awb_details_should_be_added() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify user is able to book one slot for multiple AWB")
public void to_verify_user_is_able_to_book_one_slot_for_multiple_awb() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To  verify ACS GHA admin is able to add  configure slots for expiry and cancellation in date range for registered  forwarder only")
public void to_verify_acs_gha_admin_is_able_to_add_configure_slots_for_expiry_and_cancellation_in_date_range_for_registered_forwarder_only() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To  verify ACS GHA Admin is able to edit configure slots for expiry and cancellation in date range for forwarder")
public void to_verify_acs_gha_admin_is_able_to_edit_configure_slots_for_expiry_and_cancellation_in_date_range_for_forwarder() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To  verify ACS GHA admin is able to delete  configure slots for expiry and cancellation in date range for forwarder")
public void to_verify_acs_gha_admin_is_able_to_delete_configure_slots_for_expiry_and_cancellation_in_date_range_for_forwarder() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify forwarder is not able to book slot if he has reached cancellation or expiry limit .")
public void to_verify_forwarder_is_not_able_to_book_slot_if_he_has_reached_cancellation_or_expiry_limit() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify  ACS GHA admin is able to view blocked forwarders list")
public void to_verify_acs_gha_admin_is_able_to_view_blocked_forwarders_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify ACS GHA admin is able to unblock a forwarder from forwarders blocked list")
public void to_verify_acs_gha_admin_is_able_to_unblock_a_forwarder_from_forwarders_blocked_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To  verify ACS GHA admin is not  able to add  configure slots for expiry and cancellation in date range for non registered  forwarder")
public void to_verify_acs_gha_admin_is_not_able_to_add_configure_slots_for_expiry_and_cancellation_in_date_range_for_non_registered_forwarder() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to view slot usage report in GHA Login")
public void to_verify_user_is_able_to_view_slot_usage_report_in_gha_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("If from date is not selected in search parameter then proper validation should be displayed in slot usage report screen")
public void if_from_date_is_not_selected_in_search_parameter_then_proper_validation_should_be_displayed_in_slot_usage_report_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("If to date is not selected in search parameter then proper validation should be displayed in slot usage report screen")
public void if_to_date_is_not_selected_in_search_parameter_then_proper_validation_should_be_displayed_in_slot_usage_report_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("If slot status is not selected in search parameter then proper validation should be displayed in slot usage report screen")
public void if_slot_status_is_not_selected_in_search_parameter_then_proper_validation_should_be_displayed_in_slot_usage_report_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("User should be able to search with forwarders name in slot usage report screen")
public void user_should_be_able_to_search_with_forwarders_name_in_slot_usage_report_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("User should be able to search with Vehicle ID  in slot usage report screen")
public void user_should_be_able_to_search_with_vehicle_id_in_slot_usage_report_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("User should be able to search with VCT no   in slot usage report screen")
public void user_should_be_able_to_search_with_vct_no_in_slot_usage_report_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("If user select slot status as both then booked and canceled status slots should be displayed")
public void if_user_select_slot_status_as_both_then_booked_and_canceled_status_slots_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("If user select slot status both then booked and canceled status slots should be displayed")
public void if_user_select_slot_status_both_then_booked_and_canceled_status_slots_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("If user select slot status as both then booked canceled status slots should be displayed")
public void if_user_select_slot_status_as_both_then_booked_canceled_status_slots_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("If user click on clear button then searched details in slot usage report search parameter should be cleared")
public void if_user_click_on_clear_button_then_searched_details_in_slot_usage_report_search_parameter_should_be_cleared() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("User is able to generate  slot usage report in GHA Login in given format")
public void user_is_able_to_generate_slot_usage_report_in_gha_login_in_given_format() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("In slot usage report grid the filters should be working and data should be displayed as per the applied filters")
public void in_slot_usage_report_grid_the_filters_should_be_working_and_data_should_be_displayed_as_per_the_applied_filters() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify to download report format type and export report print should be displayed in slot usage report screen")
public void to_verify_to_download_report_format_type_and_export_report_print_should_be_displayed_in_slot_usage_report_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("User should be able to download slot usage report in excel format")
public void user_should_be_able_to_download_slot_usage_report_in_excel_format() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("User should be able to download slot usage report in PDF format")
public void user_should_be_able_to_download_slot_usage_report_in_pdf_format() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("If user download report in PDF format then proper details should be display in report as per the format")
public void if_user_download_report_in_pdf_format_then_proper_details_should_be_display_in_report_as_per_the_format() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify if user clicks on VCT no then VCT popup of AWB details should be opened")
public void to_verify_if_user_clicks_on_vct_no_then_vct_popup_of_awb_details_should_be_opened() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("In VCT popup box title should be selected VCT no")
public void in_vct_popup_box_title_should_be_selected_vct_no() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("If VCT is canceled then in VCT popup box no record found should be displayed")
public void if_vct_is_canceled_then_in_vct_popup_box_no_record_found_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("In VCT pop up box headers and details of AWB should be displayed as per the format")
public void in_vct_pop_up_box_headers_and_details_of_awb_should_be_displayed_as_per_the_format() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To Verify in slot usage report grid in TSM column correct status should be displayed as yes\\/no")
public void to_verify_in_slot_usage_report_grid_in_tsm_column_correct_status_should_be_displayed_as_yes_no() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify in slot usage report grid correct dock in time should be displayed in {int} hr. format")
public void to_verify_in_slot_usage_report_grid_correct_dock_in_time_should_be_displayed_in_hr_format(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify in slot usage report grid correct dock out time should be displayed in {int} hr. format")
public void to_verify_in_slot_usage_report_grid_correct_dock_out_time_should_be_displayed_in_hr_format(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify for canceled VCT in report grid {string} should be displayed")
public void to_verify_for_canceled_vct_in_report_grid_should_be_displayed(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("If user download report in excel format then proper details should be display in report as per the format and in second sheet AWB details should be displayed")
public void if_user_download_report_in_excel_format_then_proper_details_should_be_display_in_report_as_per_the_format_and_in_second_sheet_awb_details_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("In verify if in one VCT multiple AWB are added then in downloaded excel format AWB wise pieces and weight should be displayed")
public void in_verify_if_in_one_vct_multiple_awb_are_added_then_in_downloaded_excel_format_awb_wise_pieces_and_weight_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify in slot usage report screen in vct details popup on print icon user should be able to print label")
public void to_verify_in_slot_usage_report_screen_in_vct_details_popup_on_print_icon_user_should_be_able_to_print_label() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to navigate to walk-in customer screen")
public void to_verify_user_is_able_to_navigate_to_walk_in_customer_screen() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify agent representative details should be updated from galaxy")
public void to_verify_agent_representative_details_should_be_updated_from_galaxy() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("TO verify if user enter invalid agent representative details then proper validation should be display")
public void to_verify_if_user_enter_invalid_agent_representative_details_then_proper_validation_should_be_display() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("TO verify user should be able to create VCT in walk in customer screen for Walk In truck")
public void to_verify_user_should_be_able_to_create_vct_in_walk_in_customer_screen_for_walk_in_truck() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify Walk-in Truck VCT series should be generated in given format")
public void to_verify_walk_in_truck_vct_series_should_be_generated_in_given_format() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("TO verify user should be able to create VCT in fast truck customer screen for Walk In truck")
public void to_verify_user_should_be_able_to_create_vct_in_fast_truck_customer_screen_for_walk_in_truck() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify Fast  Truck VCT series should be generated in given format")
public void to_verify_fast_truck_vct_series_should_be_generated_in_given_format() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify for registered agent VCT should be created in given format")
public void to_verify_for_registered_agent_vct_should_be_created_in_given_format() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify Walk In truck VCT should be displayed in GHA")
public void to_verify_walk_in_truck_vct_should_be_displayed_in_gha() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify user should be able to record gate in for walk in truck VCT")
public void to_verify_user_should_be_able_to_record_gate_in_for_walk_in_truck_vct() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify user user is able to record dock in for walk-in truck in GHA")
public void to_verify_user_user_is_able_to_record_dock_in_for_walk_in_truck_in_gha() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to complete shipment Acceptance in GHA for walk in truck AWB")
public void to_verify_user_is_able_to_complete_shipment_acceptance_in_gha_for_walk_in_truck_awb() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able  to record dock out for walk in truck VCT")
public void to_verify_user_is_able_to_record_dock_out_for_walk_in_truck_vct() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify Fast  truck VCT should be displayed in GHA")
public void to_verify_fast_truck_vct_should_be_displayed_in_gha() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user should be able to record gate in for fast  truck VCT")
public void to_verify_user_should_be_able_to_record_gate_in_for_fast_truck_vct() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user user is able to record dock in for fast truck in GHA")
public void to_verify_user_user_is_able_to_record_dock_in_for_fast_truck_in_gha() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify user is able to complete shipment Acceptance in GHA for fast  truck AWB")
public void to_verify_user_is_able_to_complete_shipment_acceptance_in_gha_for_fast_truck_awb() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify user is able  to record dock out for fast  truck VCT")
public void to_verify_user_is_able_to_record_dock_out_for_fast_truck_vct() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("To verify Walk-in truck VCT details should be displayed in slot usage report")
public void to_verify_walk_in_truck_vct_details_should_be_displayed_in_slot_usage_report() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("To verify Fast truck VCT details should be displayed in slot usage report")
public void to_verify_fast_truck_vct_details_should_be_displayed_in_slot_usage_report() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



	








}
	
		
	   
	

	




