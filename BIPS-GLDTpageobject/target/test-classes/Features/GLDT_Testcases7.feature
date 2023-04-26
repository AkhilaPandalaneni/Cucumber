Feature: To Verify Reset filters is available when the user accesses GLDT from the Access tab.

  @regression
  Scenario Outline: gldt_TC_225- To Verify the button 'Reset filters’ is available when the user accesses GLDT from the Access tab.
    Given User is in login page
    And User Gives valid <username> and <password>
    And User clicks on Analysis and Insights tab
    And clicks on GLDT-Global Launch Date Tracker
    Then User checks if Reset filters button is available or not
    And User clicks on Close and logout

    Examples: 
      | username         | password    |
      | STG2_TAMAManager | Testing@123 |
