Feature: CreateLead functionality of Leaftaps Application

Scenario Outline: CreateLead with Multilple data
Given Launch the Browser and Load the URL
When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then HomePage should be displayed
When Click on CRMSFA link
And Click on Leads link
And Click on CreateLead link
And Enter CompanyName as <companyName>
And Enter FirstName as <firstName>
And Enter LastName as <lastName>
And Click on Sumbit Button
Then ViewLeads Page Should be Displayed 

Examples:
|companyName|firstName|lastName|
|'TestLeaf'|'Dilip'|'kumar'|
|'TestLeaf'|'Aravind'|'R'|