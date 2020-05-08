Feature: verify facebook details

  Scenario Outline: verify login page
    Given user is on facebook page
    When user enter "<userName>" and "<passWord>"
    Then user click login button

    Examples: 
      | userName  | passWord |
      | michelin |   123456 |
      | madhan    |  5769809 |
