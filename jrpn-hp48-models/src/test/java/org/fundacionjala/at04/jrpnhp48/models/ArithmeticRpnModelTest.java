package org.fundacionjala.at04.jrpnhp48.models;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * Created by JRPNHP48 Team.
 */

public class ArithmeticRpnModelTest {
  ArithmeticRpnModel arithmeticRpnOperation;

  /**
   * this is the before method.
   */
  @Before
  public void before() {
    arithmeticRpnOperation = new ArithmeticRpnModel();
  }

  /**
   * this unit test verify is the basic sum is correct.
   */
  @Test
  public void testCalculate_sum() {
    assertEquals("12.0", arithmeticRpnOperation.calculate("5 7 +"));
  }

  /**
   * this unit test verify is the basic division is correct.
   */
  @Test
  public void testCalculate_Division() {
    assertEquals("2.5", arithmeticRpnOperation.calculate("5 2 /"));
  }

  /**
   * this unit test verify is the basic multiplication is correct.
   */
  @Test
  public void testCalculate_BasicMultiplication() {
    assertEquals("35.0", arithmeticRpnOperation.calculate("5 7 *"));
  }

  /**
   * this unit test verify is the basic subtraction is correct.
   */
  @Test
  public void testCalculate_BasicSubtraction() {
    assertEquals("3.0", arithmeticRpnOperation.calculate("5 2 -"));
  }

  /**
   * this unit test is for verify the correct calculation of two operations.
   */
  @Test
  public void testCalculate_TwoOperationsSumAndMultiplication() {
    assertEquals("24.0", arithmeticRpnOperation.calculate("5 7 + 2 *"));
  }

  /**
   * this unit test is for verify the correct calculation with all operations.
   */
  @Test
  public void testCalculate_AllOperations() {
    assertEquals("17.0", arithmeticRpnOperation.calculate("5 7 4 2 / * 2 - +"));
  }

  /**
   * this unit test is for verify the correct calculation of three operations.
   */
  @Test
  public void testCalculate_ThreeOperationsSumAndMultiplicationAndSubtraction() {
    assertEquals("22.0", arithmeticRpnOperation.calculate("5 7 + 2 * 2 -"));
  }

  /**
   * this unit test is for verify the correct calculation with all operations
   * and verify the decimals result.
   */
  @Test
  public void testCalculate_AllOperationsWithADecimalsResult() {
    assertEquals("6.5", arithmeticRpnOperation.calculate("5 7 2 4 / * 2 - + "));
  }
}
