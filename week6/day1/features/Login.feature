Feature: Login Functionality of LeafTaps Applications

Scenario: Login with Positive Credentials
Given Launch the Browser and Load the URL
When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then HomePage should be displayed


Scenario: Login with Negative Credentials
Given Launch the Browser and Load the URL
When Enter the username as 'Demo'
And Enter the password as 'crmsfa'
And Click on LoginButton
But HomePage should not be displayed