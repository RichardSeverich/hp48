package org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

/**
 * Created by JRPNHP48 Team.
 */
public class DelButtonModel {

  /**
   * This method deletes all the values of Linked List.
   */
  public static void delNumericValuesListModel() {
    NumericValuesListModel.getSingleton().getList().clear();
  }
}
