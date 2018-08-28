package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import java.util.Collections;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

/**
 * Created by JRPNHP48 Team.
 */
public class RightButtonModel {

  /**
   * This method perform a swap operation in the 2 first elements of the stack.
   */
  public static void thirdFunction() {
    int stackSize = NumericValuesListModel.getSingleton().getList().size();
    if (stackSize > 1) {
      Collections.swap(NumericValuesListModel.getSingleton().getList(),
              stackSize - 2, stackSize - 1);
    }
  }
}
