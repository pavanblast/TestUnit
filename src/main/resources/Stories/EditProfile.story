Story: Edit Profile

Scenario: Edit your profile in the application
Given I launched application and logged in with <username> and <password>
When I open edit profile option
Then I update <Firstname> and <LastName> and click on update user button

Examples:
|username|password|Firstname|LastName|
|pavanblast008@gmail.com|Iampavan@123|Pavan|Chingepally|