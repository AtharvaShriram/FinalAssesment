Feature: Login
Scenario: Successfull Login With Valid Credentials
Given User Launches Chrome browser
When User opened URL "https://xlogist.pisystindia.com/admin/login"
Then User entered Emails as "admin@gmail.com" and password as "Charlie123" and then clicks on login
Then User clicked on Locations
Then User clicked on Country
Then User clicked on Add Country
Then User entered country as "Finland"
Then User clicked on add
Then closed browser