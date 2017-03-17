Feature: Logintest
Scenario: validate userid field for valid data
Given navigate to gamil
When enter userid as "jagadeeshking1" and click next
Then password will be displayed
And close site

Scenario: validate userid field for invalid data
Given navigate to gamil
When enter userid as "jagadeeshking" and click next
Then error msg will be displayed
And close site