@Functionality
Feature: Login to Pengelolaan Dana Pendidikan Sekolah Zaidan Educare
	
  Background: 
    Given User has navigated to the login page "http://ptbsp.ddns.net:6882/"
    Then User should be able to see login page

  @ValidCredentials  @TC01
  Scenario: login is successful with valid credentials
    When User enters username as "bendahara" and password as "admin123"
    And User clicks on login button
    Then User should be able to see dashboard page

  @InvalidCredential @TC02
  Scenario: login is unsuccessful with invalid credentials
    When User enters username as "benda" and password as "aman123"
    And User clicks on login button
    Then User should be able to see error message "Username atau password salah"