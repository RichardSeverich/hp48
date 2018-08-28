package org.fundacionjala.at04.jrpnhp48.models;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

import org.junit.Before;
import org.junit.Test;



/**
 * Created by JRPNHP48 Team.
 */
public class ValidationRpnModelTest {
  ValidationRpnModel arithmeticOperationValidationModel;

  /**
   * this unit test is before.
   */
  @Before
  public void before() {
    arithmeticOperationValidationModel = new ValidationRpnModel();
  }

  /**
   * this unit test verify that an expression for basic sum is correct.
   */
  @Test
  public void testIsValidRpnExpression_basicSum() {
    assertTrue(arithmeticOperationValidationModel.isValidRpnExpression("5 7 +"));
  }

  /**
   * this unit test verify that an expression for basic subtraction is correct.
   */
  @Test
  public void testIsValidRpnExpression_BasicSubtraction() {
    assertTrue(arithmeticOperationValidationModel.isValidRpnExpression("35 7 -"));
  }

  /**
   * this unit test verify that an expression for basic multiplication is correct.
   */
  @Test
  public void testIsValidRpnExpression_BasicMultiplication() {
    assertTrue(arithmeticOperationValidationModel.isValidRpnExpression("10 5 *"));
  }

  /**
   * this unit test verify that an expression for basic division is correct.
   */
  @Test
  public void testIsValidRpnExpression_BasicDivision() {
    assertTrue(arithmeticOperationValidationModel.isValidRpnExpression("40 5 /"));
  }

  /**
   * this unit test verify that an expression with single number before the operator is incorrect.
   */
  @Test
  public void testIsValidRpnExpression_OnlyOneFirstNumber() {
    assertFalse(arithmeticOperationValidationModel.isValidRpnExpression("5 + 6 "));
  }

  /**
   * this unit test verify that an expression with two number before the operator is correct.
   */
  @Test
  public void testIsValidRpnExpression_twoFirstNumber() {
    assertTrue(arithmeticOperationValidationModel.isValidRpnExpression("5 7 / 2 - "));
  }

  /**
   * this unit test verify that an expression with four first number before the operator is correct.
   */
  @Test
  public void testIsValidRpnExpression_FourFirstNumber() {
    assertTrue(arithmeticOperationValidationModel.isValidRpnExpression("5 7 2 4 / * 2 - + "));
  }

  /**
   * this unit test verify that numbers and operators do not should same.
   */
  @Test
  public void testIsValidRpnExpression_SameOperatorThatNumber() {
    assertFalse(arithmeticOperationValidationModel.isValidRpnExpression("5 7 / 4 / * 2 - "));
  }

  /**
   * this unit test verify that do not should exist more operators that numbers.
   */
  @Test
  public void testIsValidRpnExpression_MoreOperatorThatNumber() {
    assertFalse(arithmeticOperationValidationModel.isValidRpnExpression("5 7 / 4 / * 2 - +"));
  }

  /**
   * this unit test verify that only should exist a number more that operators.
   */
  @Test
  public void testIsValidRpnExpression_MoreNumberThatOperators() {
    assertFalse(arithmeticOperationValidationModel.isValidRpnExpression("5 16 8 / 8 * 2 7 +"));
  }

  /**
   * verify that RPN format is correct with only numbers at the beginning and operators at the end.
   */
  @Test
  public void testIsValidRpnExpression_OnlyFirstNumbers() {
    assertTrue(arithmeticOperationValidationModel
        .isValidRpnExpression("90 34 12 33 55 66 + * - + -"));
  }

  /**
   * this unit test verify that only should to exist number and basic operator.
   */
  @Test
  public void testIsValidRpnExpression_AnotherElementInTheExpressionMiddle() {
    assertFalse(arithmeticOperationValidationModel
        .isValidRpnExpression("90 34 12 33 55 66 ( * - + -"));
  }

  /**
   * this unit test verify that only should to exist number and basic operator.
   */
  @Test
  public void testIsValidRpnExpression_AnotherElementAtTheExpressionFinal() {
    assertFalse(arithmeticOperationValidationModel.isValidRpnExpression("4 5 + ("));
  }

}
