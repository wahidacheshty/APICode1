@CompleteTest
Feature: Desktops 
Background: 
	Given User is on Retail Website 
	When User click on Desktops tab 
	And User click on show all desktops 

@verifyItems 
Scenario: User verify all items are present in Desktops tab 
	Then User should see all items are present in Desktops page 
	
@cartSuccessMessage 
Scenario: User add HP LP 3065 from Desktops tab to the cart 
	And User click  ADD TO CART option on ‘HP LP3065’ item 
	And User select quantity '1' 
	And User click add to Cart buttonn 
	Then User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’ 
@addCanon 
Scenario: User add Canon EOS 5D from Desktops tab to the cart 

	And User click ADD TO CART option on 'Canon EOS 5D' item 
	And User select color from dropdown ‘Red’ 
	And User select canon quantity '1' 
	And User click add to Cart button canon 
	Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’