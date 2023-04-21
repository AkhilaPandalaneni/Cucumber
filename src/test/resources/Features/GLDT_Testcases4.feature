Feature: To Verify all the buttons is available in the RALD case.

  @regression
  Scenario Outline: gldt_TC_01
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
      | username         | password    | product  | reason      | region | ropu     | country |
      | STG2_TAMAManager | Testing@123 | MICARDIS | Test Reason | EM     | ROPU TCM | China   |

  @regression
  Scenario Outline: gldt_TC_117- To Verify "Apply changes" pop is displayed when clicked on the not applicable checkmark in the RALD case.
    Given User is in login page as RA user
    And User gives <username> and <password>
    And User clicks on GLDT parentcase id
    Then User checks if Apply changes pop is displayed when clicked on the not applicable checkmark
    And User clicks on close button and then logout

    Examples: 
      | username               | password    |
      | STG2_RegulatoryAffairs | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_119- Verify functionality of Submission Check mark(RA User)
    Given User is in login page as RA user
    And User gives <username> and <password>
    And User clicks on GLDT parentcase id
    Then User checks the functionality of Not Applicable checkbox of Submission Column in the RALD case
    And User clicks on close button and then logout

    Examples: 
      | username               | password    |
      | STG2_RegulatoryAffairs | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_120- Verify functionality of Approval Check mark(RA User)
    Given User is in login page as RA user
    And User gives <username> and <password>
    And User clicks on GLDT parentcase id
    Then User checks the functionality of Not Applicable checkbox of Approval Column in the RALD case
    And User clicks on close button and then logout

    Examples: 
      | username               | password    |
      | STG2_RegulatoryAffairs | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_99- To Verify "Initiate ROPU Process" button is available in the RALD case.
    Given User is in login page as RA user
    And User gives <username> and <password>
    And User clicks on GLDT parentcase id
    Then User Check if Initiate ROPU Process button is displayed in the disabled form
    And User clicks on close button and then logout

    Examples: 
      | username               | password    |
      | STG2_RegulatoryAffairs | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_101- To Verify "Save & Notify" button is available in the RALD case.
    Given User is in login page as RA user
    And User gives <username> and <password>
    And User clicks on GLDT parentcase id
    And User Check if Save & Notify button is displayed in the disabled form
    And User clicks on close button and then logout

    Examples: 
      | username               | password    |
      | STG2_RegulatoryAffairs | Testing@123 |

  @regression
  Scenario Outline: gldt_TC_102- To Verify "Complete" button is available in the RALD case.
    Given User is in login page as RA user
    And User gives <username> and <password>
    And User clicks on GLDT parentcase id
    And User Check if Complete button is displayed in the disabled form
    And User clicks on close button and then logout

    Examples: 
      | username               | password    |
      | STG2_RegulatoryAffairs | Testing@123 |
