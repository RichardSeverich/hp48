package org.fundacionjala.at04.jrpnhp48.models;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team..
 */
public class SerializeModelTest {

  /**
   * This method cleans the NumericValuesListModel.
   */
  @Before
  public void before() {
    NumericValuesListModel.getSingleton().getList().clear();
  }

  /**
   * This unit test verify that serialize stack.
   */
  @Test
  public void verifySerialize() {
    NumericValuesListModel.getSingleton().getList().add(10.0);
    SerializeModel.serializeStack("../resources/serializedStack/listStack.dat");
    NumericValuesListModel.getSingleton().getList().clear();
    final int expectResult = 0;
    assertEquals(NumericValuesListModel.getSingleton().getList().size(), expectResult);

  }

  /**
   * This unit test verify that deserialize stack.
   */
  @Test
  public void verifyDeSerialize() {
    NumericValuesListModel.getSingleton().getList().add(10.0);
    SerializeModel.serializeStack("../resources/serializedStack/listStack.dat");
    NumericValuesListModel.getSingleton().getList().clear();
    SerializeModel.deSerializeStack("../resources/serializedStack/listStack.dat");
    final int expectResult = 1;
    assertEquals(NumericValuesListModel.getSingleton().getList().size(), expectResult);
  }
}
