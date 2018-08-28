package org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons;

import static junit.framework.TestCase.assertEquals;

import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by JRPNHP48 Team.
 */
public class SignButtonModelTest {

  /**
   * This method cleans the StringBuilder and numeric values list.
   */
  @Before
  public void setUp() {
    ExpressionInputModel.getSingleton().getExpression().setLength(0);
    NumericValuesListModel.getSingleton().getList().clear();
  }

  /**
   * This test is to verify that the sign button change to expression to positive sign.
   */
  @Test
  public void test_firstFunction_PositiveSignChangeToExpression() {
    ExpressionInputModel.getSingleton().getExpression().append(-10);
    final String expectedResult = "+10";
    SignButtonModel.firstFunction();
    assertEquals(expectedResult, ExpressionInputModel.getSingleton().getExpression().toString());
  }

  /**
   * This test is to verify that the sign button change to expression to negative sign.
   */
  @Test
  public void test_firstFunction_NegativeSignChangeToExpressionWhenExistSign() {
    ExpressionInputModel.getSingleton().getExpression().append(+10);
    final String expectedResult = "-10";
    SignButtonModel.firstFunction();
    assertEquals(expectedResult, ExpressionInputModel.getSingleton().getExpression().toString());
  }

  /**
   * This test is to verify that the sign button change to expression to negative sign.
   */
  @Test
  public void test_firstFunction_NegativeSignChangeToExpressionWhenNotExistSign() {
    ExpressionInputModel.getSingleton().getExpression().append(10);
    final String expectedResult = "-10";
    SignButtonModel.firstFunction();
    assertEquals(expectedResult, ExpressionInputModel.getSingleton().getExpression().toString());
  }

  /**
   * This test is to verify that the sign button change to numeric values list to positive sign.
   */
  @Test
  public void test_firstFunction_PositiveSignChangeToNumericValuesList() {
    NumericValuesListModel.getSingleton().getList().add(-10.0);
    final Double expectedResult = +10.0;
    SignButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the sign button change to numeric values list to negative sign.
   */
  @Test
  public void test_firstFunction_NegativeSignChangeToNumericValuesList() {
    NumericValuesListModel.getSingleton().getList().add(+10.0);
    final Double expectedResult = -10.0;
    SignButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }
}
