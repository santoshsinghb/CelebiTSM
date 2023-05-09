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
import static Helper.BaseVariables.Password;
import TestDataOperations.TestDataReader;
import static Helper.BaseVariables.Entity;



public class Test_E2E {

	

	
	
	@When("I login with {string} GSAuser given in {string} sheet of excel data")
	public void i_login_with_gs_auser_given_in_sheet_of_excel_data(String entity, String sheetName) throws Throwable {
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
		Thread.sleep(5000);

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
		Thread.sleep(2000);
		WebDriverMethod.JavascriptExecutorClick( driver, E2E.A1CheckBox);
		Thread.sleep(2000);
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
		Thread.sleep(5000);
		WebDriverMethod.JavascriptExecutorClick( driver, E2E.BookSlot);
		Thread.sleep(5000);
		
}

	








}
	
		
	   
	

	




