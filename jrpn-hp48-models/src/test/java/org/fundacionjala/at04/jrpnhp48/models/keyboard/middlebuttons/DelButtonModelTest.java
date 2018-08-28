package org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */
public class DelButtonModelTest {

  /**
   * This test verify delete values of the NumericValuesListModel.
   */
  @Test
  public void test_delNumericValuesListModel_verityDeleteValues() {
    NumericValuesListModel.getSingleton().getList().add(10.0);
    DelButtonModel.delNumericValuesListModel();
    final int expectedResult = 0;
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().size());
  }
}
