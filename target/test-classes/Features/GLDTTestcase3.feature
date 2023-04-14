Feature: To test Verify User is able to complete Ropu Process.
 
Scenario Outline: gldt_HP_03
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And User Opens Existing ROLD Case
    And User Enters <BestDate>,<BaseDate>,<AcheivedDate> in ePAF Submission Date Column.
    And clicks on Not Applicable checkbox of P&R Dossier Submission Date Column.
    And clicks on Not Applicable checkbox of Cut Off Date for IPR Column.
    And clicks on Not Applicable checkbox of Official Price Publication for unreimbursed launch Date Column.
    And clicks on Not Applicable checkbox of Official Price Publication for reimbursed launch Column.
    And clicks on Not Applicable checkbox of Unreimbursed Launch Date Column.
    And clicks on Not Applicable checkbox of Reimbursed Launch Date Column.
    And Ropu User clicks on Complete button.
    
    Examples:
    |username|password|BestDate|BaseDate|AcheivedDate|
    |STG2_ROPU|Testing@123|01/10/2023|01/10/2023|04/01/2023|
    