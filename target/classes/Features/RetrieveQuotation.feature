Feature: Retrieve Quotation

Scenario Outline: Retrieve quotation from an application
Given I launched application and logged in with <username> and <password>
When I click in retrieve quotation,enter <quotationnumber> and retrieve the quotation details

Examples:
  | username                | password     |  | quotationnumber |
  | pavanblast008@gmail.com | Iampavan@123 |  | 20447           |