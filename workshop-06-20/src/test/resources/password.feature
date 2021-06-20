Feature: password feature
  ?A?B generate password rules

  Scenario: password > 0 && < 1000
    # arrange
    Given guess number game init a 4 digit password start with 0
    # act
    When validate password
    # assert
    Then result should be not pass

  Scenario: password contains same number
    # arrange
    Given guess number game init a 4 digit password contains same number
    # act
    When validate password
    # assert
    Then result should be not pass

  Scenario: correct password format
    # arrange
    Given guess number game init a 4 digit password > 1000 && < 10000 and no same number
    # act
    When validate password
    # assert
    Then result should be pass
