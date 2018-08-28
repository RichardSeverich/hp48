package org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */
public class TwoButtonModelTest {

  /**
   * This method cleans the StringBuilder.
   */
  @Before
  public void setUp() {
    ExpressionInputModel.getSingleton().getExpression().setLength(0);
  }

  /**
   * This test is to verify that the two button works correctly.
   */
  @Test
  public void test_firstFunction_WhenTheUserPressTwoButton() {
    TwoButtonModel.firstFunction();
    String expectedResult = "2";
    assertEquals(expectedResult, ExpressionInputModel.getSingleton().getExpression().toString());
  }

}
