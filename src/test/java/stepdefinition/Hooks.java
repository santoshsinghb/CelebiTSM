package stepdefinition;

import static Helper.BaseObjects.*;
import static Helper.BaseObjects.co;
import static Helper.BaseObjects.driver;
//import static Helper.BaseObjects.home_screen;
//import static Helper.BaseObjects.loginScreen;
//import static Helper.BaseObjects.pojo;
//import static Helper.BaseObjects.ss;
import static Helper.BaseObjects.testData;
import static Helper.BaseVariables.BrowserName;
import static Helper.BaseVariables.FilePath;
import static Helper.BaseVariables.ScenarioID;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Methods.BrowserFactory;
import Methods.CommonMethods;
import Methods.ScreenShotMethod;
import Methods.WebDriverMethod;
import Pages.Agent_xpath;
import Pages.Airline_xpath;
import Pages.Business_validations;
import Pages.CommonOprations;
import Pages.E2EObject;
import Pages.Export_xpath;
import Pages.GSA_Xpaths;
import Pages.Login_Screen;
import Pages.reportXpath;
import TestDataOperations.ConfigFileHandler;
import TestDataOperations.POJO;
import TestDataOperations.TestDataReader;
import Utils.BrowserUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



import static Helper.Constants.*;


public class Hooks {

	@Before(order=1)
	public void Init(Scenario scenario) throws Throwable {
		System.out.println(" <----------------------- Scenario Start ------------------------->");
		ScenarioID = scenario.getName();
		TestDataReader.initTestDataReader();
		TestDataReader.ReadScenarioDetails();
		//TestDataReader.ReadLoginDetails();
		System.out.println("Scenario ID : " + ScenarioID);
		
		ConfigFileHandler.initConfigFileHandler();
		ConfigFileHandler.getBrowserName();
		
		driver = BrowserUtils.LaunchBrowser(BrowserName);
		driver.get(URL);
		
		wm= new WebDriverMethod(driver);
		co= new CommonOprations(driver);
		cm= new CommonMethods(driver);
		GSA= new GSA_Xpaths(driver); 
		AIRLINE= new Airline_xpath(driver); 
		pojo = new POJO(driver);
	   loginScreen= new Login_Screen(driver);
	   Business = new Business_validations(driver);
	   export = new Export_xpath(driver);
	   AGENT= new Agent_xpath(driver);
	   report= new reportXpath(driver);
		//homeScreen= new Home_Screen(driver);
		//exportsScreen= new ExportsPage(driver);
		//importscreen= new ImportsPage(driver);
		E2E=new E2EObject(driver);	
		//TDR=new TestDataReader();
	}
		
	@After(order=1)
	public void TakeAndAttachScreenshot(Scenario sc) throws Throwable
	{
		ConfigFileHandler.initConfigFileHandler();
		FilePath= ConfigFileHandler.getScreenshotPath();
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshot, "image/png", "image");
		File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		ss = new ScreenShotMethod(driver);
		ss.ReportScreenshot(driver, sc, FilePath);		
		Thread.sleep(2000);		
		driver.quit();			
		System.out.println(" <----------------------- Run After the Scenario ------------------------->");
		
	}
	
	@After(order=0)
	public void CloseBrowser()
	{
		driver.quit();		
		System.out.println(" <----------------------- Scenario End ------------------------->");
	}
	
	
}
