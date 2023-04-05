Feature: Facebook Login
  As a PO
  I want to login to application
  So that verify login function work well

    
    @parameter
    Scenario: Scenario 03: Have parameter
    Given Open Facebook application
    Then Input FB email textbox with "sasintest2@gmail.com"
    And Input FB password textbox with "123456"
    And Click to FB Submit button
    #Verify error notice appears
    And Close application
    
 