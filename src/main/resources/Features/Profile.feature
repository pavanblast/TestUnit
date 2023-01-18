Feature: Profile

Scenario Outline: Watch the profile in the application
Given I launched application and logged in with <username> and <password>
When I open profile options

Examples:
|username|password|
|pavanblast008@gmail.com|Iampavan@123|