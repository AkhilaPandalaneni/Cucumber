Feature: To Verify all the buttons and not applicable checkbox functionality in the ROLD case.

  #@regression1
  #Scenario Outline: gldt_HP_01 -To Verify Tamamanager is able to Initiate RA Process
  #Given User is in login page
  #And User Gives valid <username> and <password>
  #And User click on Initiate Tab
  #And User clicks on GLDT_Module
  #When User Enters <product>
  #And <reason>,<region>,<ropu>,<country>
  #And User Clicks on Initiate RA Process
  #And User Clicks on Continue
  #Then Initialisation need to be completed and logout
  #
  #Examples:
  #| username         | password | product  | reason      | region | ropu  | country |
  #| STG2_TAMAManager | Testing@123 | MICARDIS | Test Reason | EM     | ROPU TCM | China   |
  @regression
  Scenario Outline: gldt_HP_2- To Verify RA user is able to initiate ROPU process with complete
    Given User is in login page as RA user
    And User gives <username> and <password>
    And User clicks on GLDT parentcase id
    And User selects  <best Submission date> and <base Submission date>,Achieved Submission date
    And User clicks on Not Applicable check box in Approval Date column.
    When User clicks on Initiate ROPU Process button.
    And User clicks on Ok in the pop up dialog.
    And User clicks on complete button
    And User clicks on close button
    Then ROPU process intiated and loggedout

    Examples: 
      | username               | password    | best Submission date | base Submission date |
      | STG2_RegulatoryAffairs | Testing@123 | 01/10/2023           | 01/10/2023           |

  @regression
  Scenario Outline: gldt_HP_107 - Verify "Save & Notify" button is available in the ROLD case.
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And Ropu User Opens Existing ROLD Case
    And checks if Save & Notify button is available in the ROLD case
    And User clicks on close button and then logout

    Examples: 
      | username  | password    |
      | STG2_ROPU | Testing@123 |

  @regression
  Scenario Outline: gldt_HP_108 - Verify "Complete" button is available in the ROLD case.
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And Ropu User Opens Existing ROLD Case
    And checks if Complete button is available in the ROLD case
    And User clicks on close button and then logout

    Examples: 
      | username  | password    |
      | STG2_ROPU | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_127 - Verify "Apply changes" pop is displayed when clicked on the not applicable checkmark in the ROLD case.
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And Ropu User Opens Existing ROLD Case
    Then User checks if Apply changes pop is displayed when clicked on the not applicable checkmark in the ROLD case
    And User clicks on close button and then logout

    Examples: 
      | username  | password    |
      | STG2_ROPU | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_128 - Verify Not applicable checkmark of ePAF Submission Date Column in the ROLD case.
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And Ropu User Opens Existing ROLD Case
    And User clicks on Not Applicable checkbox of ePAF Submission Date Column in the ROLD case
    And User clicks on cancel button on Apply changes pop
    And User clicks on Not Applicable checkbox of ePAF Submission Date Column in the ROLD case
    And User clicks on Continue button on Apply changes pop up
    Then checks if ePAF Submission Date Column is Disabled.
    And User clicks on Not Applicable checked checkbox of ePAF Submission Date Column in the ROLD case
    Then checks if ePAF Submission Date Column is Enabled
    And User clicks on close button and then logout

    Examples: 
      | username  | password    |
      | STG2_ROPU | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_129 - Verify Not applicable checkmark of P&R Dossier Submission Date Column in the ROLD case.
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And Ropu User Opens Existing ROLD Case
    And clicks on Not Applicable checkbox of P&R Dossier Submission Date Column.
    And User clicks on cancel button on Apply changes pop
    And clicks on Not Applicable checkbox of P&R Dossier Submission Date Column.
    And User clicks on Continue button on Apply changes pop up
    Then checks if P&R Dossier Submission Date Column is Disabled.
    And User clicks on Not Applicable checked checkbox of P&R Dossier Submission Date Column in the ROLD case
    Then checks if P&R Dossier Submission Date Column is Enabled
    And User clicks on close button and then logout

    Examples: 
      | username  | password    |
      | STG2_ROPU | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_130 - Verify Not applicable checkmark of Cut Off Date for IPR Column in the ROLD case.
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And Ropu User Opens Existing ROLD Case
    And clicks on Not Applicable checkbox of Cut Off Date for IPR Column.
    And User clicks on cancel button on Apply changes pop
    And clicks on Not Applicable checkbox of Cut Off Date for IPR Column.
    And User clicks on Continue button on Apply changes pop up
    Then checks if Cut Off Date for IPR Column is Disabled.
    And User clicks on Not Applicable checked checkbox of Cut Off Date for IPR Column in the ROLD case
    Then checks if Cut Off Date for IPR Column is Enabled
    And User clicks on close button and then logout

    Examples: 
      | username  | password    |
      | STG2_ROPU | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_131 - Verify Not applicable checkmark of Official Price Publication for unreimbursed launch Column in the ROLD case.
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And Ropu User Opens Existing ROLD Case
    And clicks on Not Applicable checkbox of Official Price Publication for unreimbursed launch Column.
    And User clicks on cancel button on Apply changes pop
    And clicks on Not Applicable checkbox of Official Price Publication for unreimbursed launch Column.
    And User clicks on Continue button on Apply changes pop up
    Then checks if Official Price Publication for unreimbursed launch Column is Disabled.
    And User clicks on Not Applicable checked checkbox of Official Price Publication for unreimbursed launch Column in the ROLD case
    Then checks if Official Price Publication for unreimbursed launch Column is Enabled.
    And User clicks on close button and then logout

    Examples: 
      | username  | password    |
      | STG2_ROPU | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_132 - Verify Not applicable checkmark of Official Price Publication for reimbursed launch Column in the ROLD case.
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And Ropu User Opens Existing ROLD Case
    And clicks on Not Applicable checkbox of Official Price Publication for reimbursed launch Column.
    And User clicks on cancel button on Apply changes pop
    And clicks on Not Applicable checkbox of Official Price Publication for reimbursed launch Column.
    And User clicks on Continue button on Apply changes pop up
    Then checks if Official Price Publication for reimbursed launch is Disabled.
    And User clicks on Not Applicable checked checkbox of Official Price Publication for reimbursed launch Column in the ROLD case
    Then checks if Official Price Publication for reimbursed launch Column is Enabled.
    And User clicks on close button and then logout

    Examples: 
      | username  | password    |
      | STG2_ROPU | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_133 - Verify Not applicable checkmark of Unreimbursed Launch Date Column in the ROLD case.
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And Ropu User Opens Existing ROLD Case
    And clicks on Not Applicable checkbox of Unreimbursed Launch Date Column.
    And User clicks on cancel button on Apply changes pop
    And clicks on Not Applicable checkbox of Unreimbursed Launch Date Column.
    And User clicks on Continue button on Apply changes pop up
    Then checks if Unreimbursed Launch Date Column is Disabled.
    And User clicks on Not Applicable checked checkbox of Unreimbursed Launch Date Column in the ROLD case
    Then checks if Unreimbursed Launch Date Column is Enabled.
    And User clicks on close button and then logout

    Examples: 
      | username  | password    |
      | STG2_ROPU | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_134 - Verify Not applicable checkmark of Reimbursed Launch Date Column in the ROLD case.
    Given Ropu User is in login page
    And Ropu User Gives valid <username> and <password>
    And Ropu User Opens Existing ROLD Case
    And clicks on Not Applicable checkbox of Reimbursed Launch Date Column.
    And User clicks on cancel button on Apply changes pop
    And clicks on Not Applicable checkbox of Reimbursed Launch Date Column.
    And User clicks on Continue button on Apply changes pop up
    Then checks if Reimbursed Launch Date Column is Disabled.
    And User clicks on Not Applicable checked checkbox of Reimbursed Launch Date Column in the ROLD case
    Then checks if Reimbursed Launch Date Column is Enabled.
    And User clicks on close button and then logout

    Examples: 
      | username  | password    |
      | STG2_ROPU | Testing@123 |
