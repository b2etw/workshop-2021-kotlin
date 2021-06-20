Feature: check feature
  ?A?B

  Scenario Outline: guess number check logic
    # arrange
    Given we have a guess number game
    And set password to <password>
    # act
    When check <input>
    # assert
    Then result should be <output>

    Examples:
      | password | input | output |
      | 1234     | 5678  | 0A0B   |
      | 1234     | 2678  | 0A1B   |
      | 1234     | 2178  | 0A2B   |
      | 1234     | 3128  | 0A3B   |
      | 1234     | 4321  | 0A4B   |
      | 1234     | 1567  | 1A0B   |
      | 1234     | 1467  | 1A1B   |
      | 1234     | 1427  | 1A2B   |
      | 1234     | 1423  | 1A3B   |
      | 1234     | 1267  | 2A0B   |
      | 1234     | 1245  | 2A1B   |
      | 1234     | 1243  | 2A2B   |
      | 1234     | 1237  | 3A0B   |
      | 1234     | 1234  | 4A0B   |