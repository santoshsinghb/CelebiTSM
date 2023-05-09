package Helper;

import org.openqa.selenium.WebDriver;

import Methods.API_Methods;
import Methods.CommonMethods;
import Methods.PropertyFileUtils;
import Methods.ReadExcelMethod;
import Methods.ScreenShotMethod;
import Methods.WebDriverMethod;
//import Methods.WebdriverMethods;
import Pages.Airline_xpath;
import Pages.Business_validations;
import Pages.CommonOprations;
import Pages.E2EObject;
import Pages.E_Freight_PrintTerminalXpath;
import Pages.GeneralOprations;
import Pages.Export_xpath;
import Pages.GSA_Xpaths;
import Pages.Agent_xpath;
import Pages.Login_Screen;
import Pages.reportXpath;
import TestDataOperations.POJO;
import TestDataOperations.TestDataReader;

public class BaseObjects {

	
	public static WebDriver driver;
	public static ReadExcelMethod read;
	public static POJO pojo;
	
	public static WebDriverMethod wm;	
	public static CommonMethods cm;
	
	public static CommonOprations co;
	public static GeneralOprations go;
	public static E_Freight_PrintTerminalXpath efpt;
	public static ScreenShotMethod ss;
	public static PropertyFileUtils prop;
	public static API_Methods Post;
	public static GSA_Xpaths GSA;
	public static Airline_xpath AIRLINE;
	public static Agent_xpath AGENT;
	public static Business_validations Business;
	public static Export_xpath export;
	public static reportXpath report;
	public static E2EObject E2E;
	public static TestDataReader TDR;
public static Login_Screen loginScreen;
//	public static Home_Screen homeScreen;
//	public static ExportsPage exportsScreen;
//	public static ImportsPage importscreen;
	
	public static TestDataReader testData;
	
	
	

}
