Feature: HappyPath2-Complete Flow

  @regression
  Scenario Outline: gldt_HP_04- To test Tamamanager is able to Initiate RA Process
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
      | username         | password | product  | reason      | region | ropu  | country |
      | STG1_TAMAManager | Nov@2023 | MICARDIS | Test Reason | JAPAN  | JAPAN | JAPAN   |

  @regression
  Scenario Outline: gldt_HP_5 - To test RA user is able to initiate ROPU process without completing it.
    Given User is in login page as RA user
    And User gives <username> and <password>
    And User clicks on GLDT parentcase id
    And User selects  <best Submission date> and <base Submission date>,Achieved Submission date
    And User clicks on Not Applicable check box in Approval Date column.
    When User clicks on Initiate ROPU Process button.
    And User clicks on Ok in the pop up dialog.
    And User clicks on close button
    Then ROPU process intiated and loggedout

    Examples: 
      | username               | password | best Submission date | base Submission date |
      | STG1_RegulatoryAffairs | test@124 | 01/10/2023           | 01/10/2023           |

  @regression
  Scenario Outline: gldt_HP_06- To test Ropu User is able to complete Ropu Process.
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And Ropu User Opens Existing ROLD Case
    And Ropu User Enters <BestDate>,<BaseDate>,<AcheivedDate> in ePAF Submission Date Column.
    And clicks on Not Applicable checkbox of P&R Dossier Submission Date Column.
    And User clicks on Continue button on Apply changes pop up
    And clicks on Not Applicable checkbox of Cut Off Date for IPR Column.
    And User clicks on Continue button on Apply changes pop up
    And clicks on Not Applicable checkbox of Official Price Publication for unreimbursed launch Column.
    And User clicks on Continue button on Apply changes pop up
    And clicks on Not Applicable checkbox of Official Price Publication for reimbursed launch Column.
    And User clicks on Continue button on Apply changes pop up
    And clicks on Not Applicable checkbox of Unreimbursed Launch Date Column.
    And User clicks on Continue button on Apply changes pop up
    And clicks on Not Applicable checkbox of Reimbursed Launch Date Column.
    And User clicks on Continue button on Apply changes pop up
    And Ropu User clicks on Complete button.

    Examples: 
      | username  | password | BestDate   | BaseDate   | AcheivedDate |
      | STG1_ROPU | Mar@2023 | 01/10/2023 | 01/10/2023 | 04/01/2023   |

  @regression
  Scenario Outline: gldt_HP_7- RA user is able to Complete ROPU process.
    Given User is in login page as RA user
    And User gives <username> and <password>
    And User clicks on GLDT parentcase id
    And User clicks on complete button
    And User clicks on close button and then logout

    Examples: 
      | username               | password |
      | STG1_RegulatoryAffairs | test@124 |
