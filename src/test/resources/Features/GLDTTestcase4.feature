Feature: feature to test Tamamanager is able to Initiate RA Process

  
  Scenario Outline: gldt_HP_04
    Given User is in login page
    And User Gives valid <username> and <password>
    And User click on Initiate Tab
    And User clicks on GLDT_Module
    When User Enters <product>,<reason>,<region>,<ropu>,<country>
    And User Clicks on Initiate RA Process
    And User Clicks on Continue
    Then Initialisation need to be completed and logout

    Examples: 
      | username         | password    | product  | reason      | region | ropu     | country |
      | STG2_TAMAManager | Testing@123 | MICARDIS | Test Reason | EM     | ROPU TCM | China   |
