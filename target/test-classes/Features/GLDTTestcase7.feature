Feature: RA user is able to Complete ROPU process.

  
  Scenario Outline: gldt_HP_7
    Given User is in login page as RA user
    And User gives <username> and <password>
    And User clicks on GLDT parentcase id
    And User clicks on complete button
    And User clicks on close button
    Then ROPU process intiated and loggedout

    Examples: 
      | username               | password    |
      | STG2_RegulatoryAffairs | Testing@123 |
