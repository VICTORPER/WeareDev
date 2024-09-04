Feature: Register
  I as service user, i need register for log in

   Background:
     Given user open the website
     When user enter the credentials
       | username | password |
       | admin | serenity |

  Scenario: Register Successful


    When he user enter de data for the register
      | customerid     | companyname  | contactname | contacttype     | representative        | address      | country              | city |region      | phone | email|
      | 93890 | victorsa | 3005266676  | Medellin | Andrew Fuller | Calle 31 | Brazil | Buenos Aires | norte  |    300526675    |        victorperez105@gmail.com       |


    Then new user register succesfull