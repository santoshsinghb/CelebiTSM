
    #Author:Pratiksha.kamble@kalelogistics.com
#Keywords Summary : E2E


#@E2Eendtoend
#Feature: Endtoend
  
  
  #Background: validate URl is launched successfully
  #Given validate 'Sign Up' is displayed
 # When I login with "Acs Agent" user given in "Login" sheet of excel data

    
   # @TC_E2E_1
#Scenario: To verify that application should display all field display in read only mode.
#When create job and send adhoc rate request to airline.
#When Airline user

Feature: Celebi_TSM

 

  Background: Launch  Celebi Application and Login into application
    When I login with "Acs GHA" GSAuser given in "Login" sheet of excel data


 

   #1
  @TC_E2E_1
  Scenario: To verify Dock Configuration screen screen /tab should be displayed in GHA login
   Then User is able to nevigate dock Configuration screen screen /tab should be displayed in GHA login and add dock
   Then  In Dock configuration screen only 3 column should be displayed
   When  I  get login with GSAuser given in sheet of excel data
   Then  User should be able to add new dock in configuration screen
   Then  User should be able to search with dock name filter
   Then  User should be able to delete added dock from dock configuration screen
   Then  User should be able to assign created dock in slot configuration screen
   When  To verify assign dock configuration and count of dock should be displayed in book slot screen
   Then  In dock configuration screen legend icon and legend description should be displayed
   Then  User should be able to block slot by selecting  Adhoc option  
   Then  User should be able to block slot by selecting  Date range option 
   When  If user blocks dock then legend for same should be updated
   When  To verify after blocking dock when user click on block period icon block period details should reflect
   When  To verify if user assign no of docks then the docks should get added to the select dock name 
   When  User should be able to edit added dock from dock configuration screen
   Then  User should be able to unblock blocked period dock
   Then  To verify user should be able to block slot for assign dock only
   Then  To verify if user blocks dock then blocked dock should not be display in book slot screen
   When  If user logins with Turkish language then headers should display in Turkish language
   When  If dock is assigned and user updates dock name then the updated dock name should be displayed in slot configuration assign dock list
   When  To verify user is able to navigate to create AWB screen  
   Then  To verify user is able to create direct AWB in agent login 
   Then  To verify user is able to create consol AWB in agent login
   Then  To verify after AWB is created is should be displayed in MAWB listing page 
   Then  To verify user is able to change Airline code in create AWB screen
   When  To verify user is able to update airline code in create AWB screen 
   When  To verify if Airline code is kept blank then user is not able to save AWB details and proper validation should be displayed
   When  To verify user is able to select AWB from the listing page and book slot 
   Then  To verify user should be able to change vehicle type and book slot 
   Then  To verify VCT generated from ACS should be displayed in GHA VCT Generation  Screen 
   Then  To verify user is able to view VCT print in ACS 
   Then  To verify user is able to update VCT details 
   When  To verify if VCT details are updated then same should be updated in GHA 
   When  To verify user should be able to cancel VCT in ACS 
   When  To verify if VCT is canceled then same VCT details will not display  in GHA 
   Then  To verify in HHT application user is able to navigate to gate in screen in HHT application 
   Then  To verify user is able to scan QR code from TSM VCT and record gate in details in HHT 
   Then  To verify after gate in same status should be displayed in GHA login 
   When  To verify if gate is done user should not be able to cancel VCT in TSM
   When  To verify user is able to manually search with VCT number in gate in screen 
   When  To verify if user search with invalid VCT number then proper validation should be displayed in gate in screen
   Then  To verify if gate in is not done user should not be able to record dock in
   Then  To verify if gate in is not done user should not be able to record dock 
   Then  To verify user is able to navigate to VCT acceptance screen in GHA
   Then  To verify user is able to record gate in GHA 
   Then  To verify if gate in is recorded in GHA then legend for same should be in ACS
   Then  To verify user is able to record dock  in GHA 
   Then  To verify if dock in is recorded in GHA then legend for same should be in ACS
   When  To verify user is able to complete shipment Acceptance in GHA
   When  To verify if shipment acceptance is completed then status for same should be updated in GHA
   When  To verify if gate in is recorded then SMS to the entered agent mobile number should be received
   When  To verify if dock  is recorded then SMS to the entered agent mobile number should be received
   When  To verify user is able to upload excel and AWB details should be added
   When  To verify user is able to book one slot for multiple AWB
   Then  To  verify ACS GHA admin is able to add  configure slots for expiry and cancellation in date range for registered  forwarder only
   Then  To  verify ACS GHA Admin is able to edit configure slots for expiry and cancellation in date range for forwarder
   Then  To  verify ACS GHA admin is able to delete  configure slots for expiry and cancellation in date range for forwarder
   Then  To verify forwarder is not able to book slot if he has reached cancellation or expiry limit .
   Then  To verify  ACS GHA admin is able to view blocked forwarders list
   Then  To verify ACS GHA admin is able to unblock a forwarder from forwarders blocked list
   Then  To  verify ACS GHA admin is not  able to add  configure slots for expiry and cancellation in date range for non registered  forwarder
   Then  To verify user is able to view slot usage report in GHA Login
   Then  If from date is not selected in search parameter then proper validation should be displayed in slot usage report screen
   Then  If to date is not selected in search parameter then proper validation should be displayed in slot usage report screen
   When  If slot status is not selected in search parameter then proper validation should be displayed in slot usage report screen
   When  User should be able to search with forwarders name in slot usage report screen
   When  User should be able to search with Vehicle ID  in slot usage report screen
   When  User should be able to search with VCT no   in slot usage report screen
   When  If user select slot status as both then booked and canceled status slots should be displayed
   When  If user select slot status both then booked and canceled status slots should be displayed
   Then  If user select slot status as both then booked canceled status slots should be displayed
   Then  If user click on clear button then searched details in slot usage report search parameter should be cleared
   Then  User is able to generate  slot usage report in GHA Login in given format
   Then  In slot usage report grid the filters should be working and data should be displayed as per the applied filters
   Then  To verify to download report format type and export report print should be displayed in slot usage report screen 
   When  User should be able to download slot usage report in excel format
   When  User should be able to download slot usage report in PDF format
   When  If user download report in PDF format then proper details should be display in report as per the format
   When  To verify if user clicks on VCT no then VCT popup of AWB details should be opened 
   When  In VCT popup box title should be selected VCT no
   Then  If VCT is canceled then in VCT popup box no record found should be displayed
   Then  In VCT pop up box headers and details of AWB should be displayed as per the format
   Then  To Verify in slot usage report grid in TSM column correct status should be displayed as yes/no
   Then  To verify in slot usage report grid correct dock in time should be displayed in 24 hr. format
   When  To verify in slot usage report grid correct dock out time should be displayed in 24 hr. format
   When  To verify for canceled VCT in report grid "-" should be displayed
   When  If user download report in excel format then proper details should be display in report as per the format and in second sheet AWB details should be displayed
   When  In verify if in one VCT multiple AWB are added then in downloaded excel format AWB wise pieces and weight should be displayed
   Then  To verify in slot usage report screen in vct details popup on print icon user should be able to print label
   Then  To verify user is able to navigate to walk-in customer screen 
   Then  To verify agent representative details should be updated from galaxy 
   Then  TO verify if user enter invalid agent representative details then proper validation should be display
   Then  TO verify user should be able to create VCT in walk in customer screen for Walk In truck
   Then  To verify Walk-in Truck VCT series should be generated in given format 
   When  TO verify user should be able to create VCT in fast truck customer screen for Walk In truck
   When  To verify Fast  Truck VCT series should be generated in given format
   When  To verify for registered agent VCT should be created in given format 
   When  To verify Walk In truck VCT should be displayed in GHA 
   When  To verify user should be able to record gate in for walk in truck VCT 
   When  To verify user user is able to record dock in for walk-in truck in GHA
   Then  To verify user is able to complete shipment Acceptance in GHA for walk in truck AWB 
   Then  To verify user is able  to record dock out for walk in truck VCT 
   Then  To verify Fast  truck VCT should be displayed in GHA 
   Then  To verify user should be able to record gate in for fast  truck VCT
   Then  To verify user user is able to record dock in for fast truck in GHA 
   Then  To verify user is able to complete shipment Acceptance in GHA for fast  truck AWB 
   When  To verify user is able  to record dock out for fast  truck VCT 
   When  To verify Walk-in truck VCT details should be displayed in slot usage report 
   Then  To verify Fast truck VCT details should be displayed in slot usage report 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
   