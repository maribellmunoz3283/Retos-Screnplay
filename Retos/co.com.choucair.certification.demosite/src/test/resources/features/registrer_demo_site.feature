
Feature: Register User
  As User
  I want to login
  To register on the platform

  @RunnerTags
  Scenario: Register User

    Given wants to access the Web Automation Demo Site

    When he performs the login on the page
    |firstName|lastName |address|emailAddress|phone|gender |hobbies|languages|skills|country|selectCountry|year|month|day|password|confirmPassword|
    |Maribell|Munoz|carrera 88 83-15|mary198mx@gmail.com |3006295223|FeMale|movies |English,French|Python|Chile|Japan|1981|October|19|Daniel20*|Daniel20*|

    Then verifies that the screen is loading with text Double Click on Edit Icon to EDIT the Table Row



