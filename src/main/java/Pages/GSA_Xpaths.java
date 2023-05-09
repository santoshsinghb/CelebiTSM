package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GSA_Xpaths extends Pages.BasePage {
	public GSA_Xpaths(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[1]/div/a")
	public WebElement GSADASHBOARD;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[3]/div/a/span")
	public WebElement GSASTOCKMANAGEMENTBAR;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[3]/div/ul/li/div/a/span")
	public WebElement GSASTOCKBUTTON;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-allocate-stock/section/div[1]/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/app-location-dropdown/form/igx-input-group/div[1]/div/input")
	public WebElement GSASTOCKSCREENJUSTCLICK;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-allocate-stock/section/div[2]/button")
	public WebElement GSAPLUSBUTTONK;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[2]/div[2]/form/igx-input-group/div[1]/div/input")
	public WebElement GSACARRIERFIELD;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[2]/div[3]/app-location-dropdown/form/igx-input-group/div[1]/div/input")
	public WebElement GSALOCATIONFIELD;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[5]/div/div/div[3]/igx-select/igx-input-group/div[1]/igx-suffix/igx-icon")
	public WebElement GSACARGOTYPE;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[5]/div/div/div[4]/igx-select/igx-input-group/div[1]/igx-suffix/igx-icon")
	public WebElement GSAPRODUCTTYPE;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[5]/div/div/div[5]/igx-select/igx-input-group/div[1]/igx-suffix/igx-icon")
	public WebElement GSASHCTYPE;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[2]/div[1]/igx-radio/span[1]")
	public WebElement GSACREATEINSEQUENCEBUTTON;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div/div[1]/div[1]/igx-radio/span[2]")
	public WebElement GSAINRANGEBUTTON;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div/div[2]/div[1]/igx-radio/span[2]")
	public WebElement GSAINCOUNTBUTTON;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[2]/div/div/div[2]/form/igx-input-group/div[1]/div/input")
	public WebElement GSASTARTINGPOINTBOX;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[2]/div/div/div[4]/form/igx-input-group/div[1]/div/input")
	public WebElement GSAENDINGPOINTBOX;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[1]/div[1]/p")
	public WebElement GSAAFTERRANGEJUSTCLICK;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[4]/div/label/span")
	public WebElement GSAEXPIRYDATETAB;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[4]/div/div[1]/div/igx-date-picker/igx-input-group/div[1]/div/input")
	public WebElement GSAEXPIRYDATEBOX;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[4]/div/div[2]/span[1]")
	public WebElement GSA3YRSTAB;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[4]/div/div[2]/span[2]")
	public WebElement GSA5YRSTAB;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[4]/div/div[3]/form/igx-input-group/div[1]/div/input")
	public WebElement GSAREMARKTAB;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[8]/button[1]/span")
	public WebElement GSACREATESTOCK;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/p")
	public WebElement GSACREATEDSUCCESSFULDOCUMENTPOPUP;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div/div[1]/div[9]/div/div[3]/p")
	public WebElement GSACREATEMOREDOCUMENT;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[2]/div[1]/igx-radio/span[1]")
	public WebElement GSACREATEINSEQUENCE2;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[1]/div[1]/div[1]/igx-radio/span[1]")
	public WebElement GSACREATEINRANGE2;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[4]/div[2]/div/div[2]/p")
	public WebElement GSAPREVIEWBUTTON;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[3]/div/button/span[1]")
	public WebElement GSAPREVIEWCLOSEBUTTON;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[8]/button[2]/span[1]")
	public WebElement GSACLOSEBUTTONMAINSCREEN;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div/div[2]/div/button[1]")
	public WebElement GSACLOSENOBUTTON;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div/div[2]/div/button[1]")
	public WebElement GSACLOSEYESYBUTTON;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[2]/div/igx-input-group/div[1]/div/input")
	public WebElement GSAQUANTITYBOX;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[1]/div/p")
	public WebElement GSAAFTERCOUNTJUSTCLICK;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[2]/div[2]/div/igx-radio/span[1]")
	public WebElement GSACREATEINSPECIFIC;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[1]/div/div[1]/div/div[2]/form/igx-input-group/div[1]/div/input")
	public WebElement GSASPECIFIC1;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[1]/p")
	public WebElement GSAAFTERSPECIFICJUSTCLICK;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[4]/div/label/span")
	public WebElement GSASPECIFICEXPIRYDATEBAR;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[5]/div/div[1]/div/igx-date-picker/igx-input-group/div[1]/div/input")
	public WebElement GSASPECIFICEXPIRYBOX;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[5]/div/div[2]/span[1]")
	public WebElement GSASPECIFIC3YRS;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[5]/div/div[3]/form/igx-input-group/div[1]/div/input")
	public WebElement GSASPECIFICREMARK;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[2]/div[2]/div/igx-radio/span[1]")
	public WebElement GSASPECIFIC2;
	
	@FindBy(xpath="")
	public WebElement GSASPECIFICCREATEMORE1;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div/div[1]/div[8]/div/div[3]/p")
	public WebElement GSASPECIFICCREATEMORE;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[1]/div/a/i")
	public WebElement HOMEDASHBOARD;

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/app-sidebar/div/div/div/div/div[5]/ul/li[3]/div/a/span")
	public WebElement stockmangementbuttom;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div/div[2]/div[1]/span")
	public WebElement CreatedDocumentPopupcloseup;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/mat-tab-header/div/div/div/div[2]")
	public WebElement contractedTab;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/mat-tab-header/div/div/div/div[1]/div[1]")
	public WebElement avialbleTab;
 
	@FindBy(xpath="")
	public WebElement Cr3;
	
	//-------------for agent login
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[5]/div/div/div[3]/igx-select/igx-input-group/div[1]/igx-suffix/igx-icon")
	public WebElement agentcargo;

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[2]/div[2]/div/igx-input-group/div[1]/div/input")
	public WebElement agentquantitybox;
	
	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[6]/div[3]/div[1]/div[2]/div[1]/igx-radio/span[1]")
	public WebElement agentquantity;

	@FindBy(xpath="/html/body/div[1]/app-root/app-container/div/div/section/div/div/div/ng-component/app-new-comp/div/mat-tab-group/div/mat-tab-body[1]/div/app-create-stock/div[1]/div[2]/div[2]/form/igx-input-group/div[1]/div/input")
	public WebElement agentspecificcarrier;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div/div[1]/div[8]/div/div[3]/p")
	public WebElement agentspecificcreatemore;

}
