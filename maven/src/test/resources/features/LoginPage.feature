# @Functionality
# Feature: Login to Student Attendance System
	
# 	#TC011
#   Background: 
#     Given User has navigated to the login page "http://ptbsp.ddns.net:5081/"
#     Then User should be able to see login page

#   @ValidCredentials  @TC012
#   Scenario: login is successful with valid credentials
#     When User enters NIP as "12345678" and password as "admin123"
#     And User clicks on login button
#     Then User should be able to see dashboard page

# Examples: 
#       | NIP				| password	| errorMessage        													| test case										|
#       | 12345678	| admin			| Incorrect NIP or password, please try again!	| wrong password							|
#       | 12345679	| admin			| Incorrect NIP or password, please try again!	| wrong username and password	|
