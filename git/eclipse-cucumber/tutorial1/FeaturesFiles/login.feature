Feature: Test OrangeHrm

  Scenario: Login
    Given login onto OrangeHRM
    When user insert correct Username and Password
    Then user on Login Page
    #And click on the admin page
   # Then click on the Add Button
    #Then click on UserRole and select admin dropDown,employee name,username,staus,password&confirm password
   # Then click on save button
