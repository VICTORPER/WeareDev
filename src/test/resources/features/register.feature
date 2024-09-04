Feature: Register
  I as service user, i need register for log in

   Background:
     Given user open the website
     When user enter the credentials
       | username | password |
       | admin | serenity |

  Scenario: Register Successful


    When he user enter de data for the register
      | customerid     | companyname  | contactname | contacttype     | representative        | address      | country              | region      | phone | email|
      | 93888 | victorsa | 3005266676  | Medellin | Anne Dodsworth | Calle 31 |  |  |   |                               |


    Then new user register succesfull