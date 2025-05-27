@Functionality
Feature: Login to Pengelolaan Dana Pendidikan Sekolah Zaidan Educare
	
  Background: 
    Given User has navigated to the login page "http://ptbsp.ddns.net:6882/"
    Then User should be able to see login page

  @ValidCredentials  @TC01
  Scenario: login is successful with valid credentials
    When User enters NIP as "12345678" and password as "admin123"
    And User clicks on login button
    Then User should be able to see dashboard page

#  @InvalidCredentials @TC016 @TC017
#   Scenario Outline: login is unsuccessful with invalid credentials
#     When User enters NIP as "<NIP>" and password as "<password>"
#     And User clicks on login button 
#     Then Current screen still on login page 
#     And System will show error message "<errorMessage>" under the both field


# Examples: 
#       | NIP				| password	| errorMessage        													| test case										|
#       | 12345678	| admin			| Incorrect NIP or password, please try again!	| wrong password							|
#       | 12345679	| admin			| Incorrect NIP or password, please try again!	| wrong username and password	|
