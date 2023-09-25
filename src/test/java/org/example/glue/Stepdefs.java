package org.example.glue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stepdefs {

  public int actualResult;

  @When("I perform {word} on {int} and {int}")
  public void operate(String operation, int operand1, int operand2) {
    switch (operation) {
      case "sum":
        actualResult = operand1 + operand2;
        break;
      case "difference":
        actualResult = operand1 - operand2;
        break;
      case "multiply":
        actualResult = operand1 * operand2;
        break;
      case "divide":
        actualResult = operand1 / operand2;
        break;
    }
  }

  @Then("I should see {int}")
  public void result(int expectedResult) {
    assertEquals(expectedResult, actualResult);
  }

}
