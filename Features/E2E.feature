
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

Feature: Create_Stock_USING_GSA_LOGIN_By_Range_TYPE

 

  Background: Launch DnataStock Application and Login into application
    When I login with "Acs GHA" GSAuser given in "Login" sheet of excel data


 

   #1
  @TC_E2E_1
  Scenario: To verify Dock Configuration screen screen /tab should be displayed in GHA login
   Then User is able to nevigate dock Configuration screen screen /tab should be displayed in GHA login and add dock
   Then  I logout with Acs GHA and
   When  I  get login with "AcsAGENT " GSAuser given in "Login" sheet of excel data
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   