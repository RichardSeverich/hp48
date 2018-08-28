package org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

/**
 * Created by JRPNHP48 Team.
 */
public class MulButtonModel {
  private static final int ONE = 1;

  /**
   * This method add the number to the Linked List.
   */
  public static boolean multiplicationFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ONE) {
      NumericValuesListModel.getSingleton().getList()
              .add(multiplication(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack list values.
   * @return the multiplication result.
   */
  public static double multiplication(LinkedList<Double> numericStack) {
    Double a = numericStack.pollLast();
    Double b = numericStack.pollLast();
    return a * b;
  }

  /**
   * This method concatenates a number to a stringBuilder.
   */
  public static void firstFunction() {
    ExpressionInputModel.getSingleton().getExpression().append(" *");
  }
}
