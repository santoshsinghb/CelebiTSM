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

//UGANDA------NSG
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

	@Then("I logout with Acs GHA and")
	public void i_logout_with_acs_gha_and() throws Throwable {
		Thread.sleep(2000);
		WebDriverMethod.JavascriptExecutorClick( driver, E2E.DropdownLogOut);
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebDriverMethod.JavascriptExecutorClick( driver, E2E.LogOut);
		Thread.sleep(2000);
		/*TestDataReader.AcsAgentLogin();
		E2E.Username.sendKeys(Username); Thread.sleep(2000);
		E2E.Password.sendKeys(Password); Thread.sleep(2000);
		Thread.sleep(6000);
		*/
	   }

	@When("I  get login with {string} GSAuser given in {string} sheet of excel data")
	public void i_get_login_with_gs_auser_given_in_sheet_of_excel_data(String entity, String sheetName) throws Throwable {
	    	
        E2E.LanSelectDropDown.click();
		Thread.sleep(500);
		E2E.EnglishLang.click();
		Thread.sleep(500);
		Entity = entity;
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
		Thread.sleep(10000);
		E2E.Create_AWB.click();
		Thread.sleep(5000);
		E2E.MAWB_firstnumber.sendKeys("125");
		Thread.sleep(3000);
		E2E.MAWB_Secondnumber.sendKeys("64563730");
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
		Thread.sleep(500);
		E2E.EnglishLang.click();
		Thread.sleep(500);
		Entity = entity;
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

	








}
	
		
	   
	

	




