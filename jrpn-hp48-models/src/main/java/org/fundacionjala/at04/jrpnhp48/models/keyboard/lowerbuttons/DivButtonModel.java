package org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

/**
 * Created by JRPNHP48 Team.
 */
public class DivButtonModel {
  private static final int ONE = 1;

  /**
   * This method add the number to the Linked List.
   */
  public static boolean divisionFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ONE) {
      Double aux = division(NumericValuesListModel.getSingleton().getList());
      if (aux != null) {
        NumericValuesListModel.getSingleton().getList()
                .add(aux);
        return true;
      }
    }
    return false;
  }

  /**
   * @param numericStack list values.
   * @return the division result.
   */
  public static Double division(LinkedList<Double> numericStack) {
    if (numericStack.getLast() == 0) {
      return null;
    } else {
      Double a = numericStack.pollLast();
      Double b = numericStack.pollLast();
      return b / a;
    }
  }

  /**
   * This method concatenates a number to a stringBuilder.
   */
  public static void firstFunction() {
    ExpressionInputModel.getSingleton().getExpression().append(" /");
  }
}
