package org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */
public class EnterButtonTest {

  /**
   * This method cleans the StringBuilder.
   */
  @Before
  public void setUp() {
    ExpressionInputModel.getSingleton().getExpression().setLength(0);
  }

  /**
   * This test is to verify that the enter button works correctly.
   */
  @Test
  public void test_firstFunction_VerityThatAddElements() {
    ExpressionInputModel.getSingleton().getExpression().append("150.0");
    final Double expectedResult = 150.0;
    EnterButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the enter button duplicate the last value.
   */
  @Test
  public void test_firstFunction_VerifyDuplicateTheLastValue() {
    final Double expectedResult = 10.0;
    NumericValuesListModel.getSingleton().getList().add(10.0);
    EnterButtonModel.firstFunction();
    int size = NumericValuesListModel.getSingleton().getList().size();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().get(size - 2));
  }
}
