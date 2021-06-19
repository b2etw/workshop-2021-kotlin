Feature: guess number game
  ?A?B

  Background:
    Given user input a number
    When check it with answer

  Scenario: all number and digit is wrong
    And all number and digit is wrong
    Then return 0A0B

  Scenario: 1 number is right but digit is wrong
    And 1 number is right but digit is wrong
    Then return 0A1B

  Scenario: 2 number is right but digit is wrong
    And 2 number is right but digit is wrong
    Then return 0A2B

  Scenario: 3 number is right but digit is wrong
    And 3 number is right but digit is wrong
    Then return 0A3B

  Scenario: 4 number is right but digit is wrong
    And 4 number is right but digit is wrong
    Then return 0A4B

  Scenario: 1 number and digit is right, number and digit of rest one is wrong
    And 1 number and digit is right, number and digit of rest one is wrong
    Then return 1A0B

  Scenario: 1 number and digit is right, 1 number is right but digit is wrong, rest element number and digit is wrong
    And 1 number and digit is right, 1 number is right but digit is wrong, rest element number and digit is wrong
    Then return 1A1B

  Scenario: 1 number and digit is right, 2 number is right but digit is wrong, rest element number and digit is wrong
    And 1 number and digit is right, 2 number is right but digit is wrong, rest element number and digit is wrong
    Then return 1A2B

  Scenario: 1 number and digit is right, 3 number is right but digit is wrong
    And 1 number and digit is right, 3 number is right but digit is wrong
    Then return 1A3B

  Scenario: 2 number and digit is right, number and digit of rest one is wrong
    And 2 number and digit is right, number and digit of rest one is wrong
    Then return 2A0B

  Scenario: 2 number and digit is right, 1 number is right but digit is wrong, rest element number and digit is wrong
    And 2 number and digit is right, 1 number is right but digit is wrong, 1 number and digit is wrong
    Then return 2A1B

  Scenario: 2 number and digit is right, 2 number is right but digit is wrong
    And 2 number and digit is right, 1 number is right but digit is wrong, 1 number and digit is wrong
    Then return 2A2B

  Scenario: 3 number and digit is right, number and digit of rest one is wrong
    And 3 number and digit is right, number and digit of rest 1 is wrong
    Then return 3A0B

  Scenario: all number is right
    And all number is right
    Then return 4A0B
