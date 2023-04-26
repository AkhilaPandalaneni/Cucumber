Feature: feature to test User is able to Initiate RA Process with Existing Products.

  @regression
  Scenario Outline: gldt_TC_01(gldt_TC_03 & gldt_TC_05 &gldt_TC_07 merged)
    Given User is in login page
    And User Gives valid <username> and <password>
    And User click on Initiate Tab
    And User clicks on GLDT_Module
    When User Enters <product>
    And <reason>,<region>,<ropu>,<country>
    And User Clicks on Initiate RA Process
    And User Clicks on Continue
    Then Initialisation need to be completed and logout

    Examples: 
      | username                 | password | product  | reason      | region | ropu       | country     |
      | UMA_TAMATeamLeader       | Apr@2023 | MICARDIS | Test Reason | EM     | ROPU IMETA | Jordan      |
      | UMA_TAMASeniorManager    | Apr@2023 | MICARDIS | Test Reason | EM     | ROPU IMETA | Angola      |
      | UMA_TAMAManager          | Apr@2023 | MICARDIS | Test Reason | EM     | ROPU ASKAN | New Zealand |
      | UMA_TAMAAssociateManager | Apr@2023 | TRAJENTA | Test Reason | EM     | ROPU ASKAN | New Zealand |
