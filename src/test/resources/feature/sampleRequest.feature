@rest

Feature: Validate simple API request

  Scenario: Validate sample API request
    Given "Gokul" has a GET request for fetching user details
    When he try to get user details
    Then validate user details

Feature: Register user

  Scenario: Validation new user registration
    Given "Gokul" wants to register
    When he enters the <email> and <password> for registration
    Then he validate the login <message>
      | email         | password |
      | gokul@gma.com | sdnkjs   |