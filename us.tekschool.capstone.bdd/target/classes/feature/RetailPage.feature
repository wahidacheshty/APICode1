@retailAll
Feature: 

Background:
Given User is on Retail website three
And User click on MyAccount
When User click on Login
And User enter username "ali.ahmad@gmail.com" and password "23456"
And User click on Login button
Then User should be logged in to MyAccount dashboard

@Register
Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on Register for an Affiliate Account link
And User fill affiliate form with below information
|company|website|taxID|paymentMethod|cheque payee name|
|Shark|tek-school.comTekSchool|IncomeTax|Cheque|Personal|
And User check on About us check box
And User click on Continue button zero
Then User should see a success message zero

@EditAffiliate
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on Edit your affiliate information link one
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|America|2527|2222|Checking|123456|
And User click on Continue button one
Then User should see a success message two

@EditAccount
Scenario: Edit your account Information
When User click on "Edit your account information" link two
And User modify below information
|firstname|lastName|email|telephone|
|Bahar|Ahadi|bahar.ahadi@gmail.com|5711234567|
And User click on continue button two
Then User should see a message last "Success: Your account has been successfully updated"