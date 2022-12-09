Feature: Login
Scenario: Successfull Login With Valid Credentials
Given User Launch Chrome browser
When User opens URL "https://products.pisystindia.com/Ecommerce/admin"
When User enters Emails as "admin@gmail.com" and password as "123456" and click on login
When User clicks on Locations
Then User clicks on City
Then User clicks on Add City
Then User enters city as "Solapur"
Then User clicks on add
Then close browser