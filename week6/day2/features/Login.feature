Feature: Login Functionality of LeafTaps Applications

#background keyword is used for common steps for all the Scenario
#its will run for every scenario
#Background:
#Given Launch the Browser and Load the URL

@smoke
Scenario: Login with Positive Credentials1
When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then HomePage should be displayed

@sanity
Scenario: Login with Negative Credentials
When Enter the username as 'Demo'
And Enter the password as 'crmsfa'
And Click on LoginButton
But HomePage should not be displayed

@dilip @smoke
Scenario: Login with Positive Credentials2
When Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then HomePage should be displayed

@smoke @sanity
Scenario: Login with Positive Credentials3
When Enter the username as 'DemoSalesmanager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then HomePage should be displayed

