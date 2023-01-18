Story:Login failure

Scenario: Login with invalid credentials into the application
Given I launched application and logged in with <username> and <password>
Then I should not be loggedin

Examples:
|username|password|
|pavanblast008@gmail.com|Iampavan@123|