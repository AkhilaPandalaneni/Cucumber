Feature: feature to test User user can search and select the temporary product from the 'Temporary Product' dropdown.

  Scenario Outline: gldt_TC_91&92
    Given User is in login page
    And User Gives valid <username> and <password>
    And User click on Initiate Tab
    And User clicks on GLDT_Module
    Then User clicks on product is undefined checkbox and Enters <tempproduct> in Temporary Product Name
    And User clicks on Close and logout

    Examples: 
      | username                 | password | tempproduct  | 
      | UMA_TAMAManager          | Apr@2023 | Reg_Product1 |
     
