@test
Feature: Calculations feature

  Scenario Outline: Operation <operation>
    When I perform <operation> on <operand1> and <operand2>
    Then I should see <result>
    Examples:
      | operation  | operand1 | operand2 | result |
      | sum        | 5        | 4        | 9      |
      | difference | 5        | 4        | 1      |
      | multiply   | 5        | 4        | 20     |
      | divide     | 5        | 4        | 1      |