Feature: Register
  I as service user, i need register for log in

  Background:
    Given user open the website
    When user enter the credentials
      | username | password |
      | admin | serenity |

  Scenario: Register Successful


    When he user enter de data for the register new product
      | productname     | quantityperunit  | priceunit | unitinstock     | reorderlevel        | category      | supplier              |
      | pruebavictr | 2 | 100000  | 50 | 10 | test | Adidas |

    Then new product register succesfull