Story:Login Success

Scenario: Login with valid credentials to the application
Given I launched application and logged in with <username> and <password>
Then I should be loggedin

Examples:
|username|password|
|pavanblast008@gmail.com|Test@123|