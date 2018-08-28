package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

import org.junit.Before;
import org.junit.Test;


/**
 * Created by JRPNHP48 Team.
 */
public class RightButtonModelTest {

  /**
   * This method clear the Numeric Values List Model before run the unit tests.
   */
  @Before
  public void setUp() {
    NumericValuesListModel.getSingleton().getList().clear();
  }

  /**
   * This method test the swap function applied to the two first rows.
   */
  @Test
  public void testRightButtonThirdFunction_swapTheFirstTwoElementsOfTheStack() {
    final Double firstElement = 1.0;
    final Double secondElement = 20.0;
    NumericValuesListModel.getSingleton().getList().add(firstElement);
    NumericValuesListModel.getSingleton().getList().add(secondElement);
    RightButtonModel.thirdFunction();
    assertEquals(firstElement, NumericValuesListModel.getSingleton().getList().getLast());
    assertEquals(secondElement, NumericValuesListModel.getSingleton().getList().getFirst());
  }
}
