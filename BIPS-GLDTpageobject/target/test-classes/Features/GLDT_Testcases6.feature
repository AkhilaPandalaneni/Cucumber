Feature: To Verify the user can see the temporary product under Assignment section after RA process is initiated.

  @regression 
  Scenario Outline: gldt_TC_94
    Given User is in login page
    And User Gives valid <username> and <password>
    And User click on Initiate Tab
    And User clicks on GLDT_Module
    Then User clicks on product is undefined checkbox and Enters <tempproduct> in Temporary Product Name
    And <reason>,<region>,<ropu>,<country>
    And User Clicks on Initiate RA Process
    And User Clicks on Continue
    And User opens the GLDT case from the workqueue
    And validates the temporary product name in the Assignments section
    And User clicks on Close and logout

    Examples: 
      | username        | password | tempproduct  | reason      | region | ropu        | country |
      | UMA_TAMAManager | Apr@2023 | Reg_Product1 | Test Reason | EUCAN  | ROPU CANADA | CANADA  |
