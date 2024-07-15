@rest

  Feature: Validate simple API request
    Scenario: Validate sample API request
      Given "Gokul" has a GET request for fetching user details
      When he enters the request parameters
      Then validate user details