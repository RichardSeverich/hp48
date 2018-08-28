package org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */
public class BackButtonTest {

  /**
   * This method cleans the StringBuilder.
   */
  @Before
  public void setUp() {
    ExpressionInputModel.getSingleton().getExpression().setLength(0);
  }

  /**
   * This test verify the back space function of the back space left shift key mode.
   */
  @Test
  public void test_firstFunction_backspace() {
    String expectedResult = "12";
    ExpressionInputModel.getSingleton().getExpression().append("123");
    BackButtonModel.firstFunction();
    assertEquals(expectedResult, ExpressionInputModel.getSingleton().getExpression().toString());
  }

  /**
   * This test verify the drop first row function of the back space left shift key mode.
   */
  @Test
  public void test_secondFunction_dropTheFirstRow() {
    final Double stackElement = 100.0;
    NumericValuesListModel.getSingleton().getList().add(stackElement);
    BackButtonModel.secondFunction();
    assertFalse(NumericValuesListModel.getSingleton().getList().contains(stackElement));
  }
}
