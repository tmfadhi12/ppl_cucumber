@Functionality
Feature: Logout from Pengelolaan Dana Pendidikan Sekolah Zaidan Educare

  Background: 
    Given User has logged in to the application "http://ptbsp.ddns.net:6882/" with username as "bendahara" and password as "admin123"
    And User at dashboard page

    @ValidLogout @TC03
    Scenario: User logout successfully
        When User clicks on the logout button
        And User clicks 'Ya' button on the confirmation dialog
        Then User should be redirected to the login page