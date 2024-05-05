Feature: Login Functionality of LeafTaps Applications

Scenario Outline: Login with Positive Credentials
Given Launch the Browser and Load the URL
When Enter the username as <Username>
And Enter the password as <Password>
And Click on LoginButton
Then HomePage should be displayed
But HomePage should not be displayed

Examples:
|Username|Password|
|'Demosalesmanager'|'crmsfa'|
|'Demo'|'crmsfa'|