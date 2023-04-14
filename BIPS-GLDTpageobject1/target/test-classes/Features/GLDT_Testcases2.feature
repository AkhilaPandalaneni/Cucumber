Feature: feature to test User is able to Initiate RA Process with Temporary Products.

  Scenario Outline: gldt_TC_02(gldt_TC_04 & gldt_TC_06 & gldt_TC_08 merged)
    Given User is in login page
    And User Gives valid <username> and <password>
    And User click on Initiate Tab
    And User clicks on GLDT_Module
    Then User clicks on product is undefined checkbox and Enters <tempproduct> in Temporary Product Name
    And <reason>,<region>,<ropu>,<country>
    And User Clicks on Initiate RA Process
    And User Clicks on Continue
    Then Initialisation need to be completed and logout

    Examples: 
      | username                 | password | tempproduct  | reason      | region | ropu       | country     |
      | UMA_TAMATeamLeader       | Apr@2023 | Temp_Proj_3  | Test Reason | EM     | ROPU IMETA | Jordan      |
      | UMA_TAMASeniorManager    | Apr@2023 | Temp_Proj_17 | Test Reason | EM     | ROPU IMETA | Angola      |
      | UMA_TAMAManager          | Apr@2023 | Temp_Proj_2  | Test Reason | EM     | ROPU ASKAN | New Zealand |
      | UMA_TAMAAssociateManager | Apr@2023 | Temp_Proj_3  | Test Reason | EM     | ROPU ASKAN | New Zealand |
