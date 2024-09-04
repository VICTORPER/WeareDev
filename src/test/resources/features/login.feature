Feature: Login

  Scenario: Login success

    Given user open the website
    When user enter the credentials
      | username | password |
      | admin | serenity |
    Then he will see the home page and waits for validation