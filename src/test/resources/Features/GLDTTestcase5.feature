Feature: RA user is able to initiate ROPU process without completing it.

  Scenario Outline: gldt_HP_5
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
    
    |username|password|best Submission date|base Submission date|
   	|STG2_RegulatoryAffairs|Testing@123|01/10/2023|01/10/2023|
   