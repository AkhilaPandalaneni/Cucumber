
Feature: feature to test login functionality

  #Scenario: Login as  user
    #Given User is in login page
    #When User gives username and password
    #And User clicks on login
    #Then Login is succesfull
    #Then Click on Logout
    
   Scenario: Login as TamaManager 
    Given User is logged in as TamaManager
    And User click on Initiate Tab
    And clicks on GLDT_Module
    When User Enters product
    And User Enters reason
    And User Enters region
    And User Enters ropu
    And User Enters country
    And User Clicks on Initiate RA Process
    And User Clicks on Continue
    

    
    
    
