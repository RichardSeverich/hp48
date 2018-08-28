package org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons;

import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

/**
 * Created by JRPNHP48 Team.
 */
public class BackButtonModel {

  /**
   * This method perform the drop row operation in the first element of the stack.
   */
  public static boolean firstFunction() {
    int expressionSize = ExpressionInputModel.getSingleton().getStringBuilderLength();
    if (expressionSize > 1) {
      ExpressionInputModel.getSingleton().getExpression().setLength(expressionSize - 1);
      return true;
    } else {
      return false;
    }
  }

  /**
   * This method perform the drop row operation in the first element of the stack.
   */
  public static void secondFunction() {
    int stackSize = NumericValuesListModel.getSingleton().getList().size();
    if (stackSize > 0) {
      NumericValuesListModel.getSingleton().getList().removeLast();
    }
  }
}
