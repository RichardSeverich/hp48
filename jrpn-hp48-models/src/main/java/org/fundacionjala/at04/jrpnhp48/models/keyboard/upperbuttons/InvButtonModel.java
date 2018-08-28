package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

/**
 * Created by JRPNHP48 Team.
 */

public class InvButtonModel {
  private static final int ZERO = 0;
  private static final int ONE = 1;

  /**
   * This method add the inverse result to the Linked List.
   */
  public static boolean firstFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()
              .add(inverse(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack list values.
   * @return the inverse result.
   */
  public static Double inverse(LinkedList<Double> numericStack) {
    Double a = numericStack.pollLast();
    return ONE / a;
  }

  /**
   * This method add the ln result to the Linked List.
   */
  public static boolean secondFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()

              .add(exponentialPow(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack list values.
   * @return the ln result.
   */
  public static Double exponentialPow(LinkedList<Double> numericStack) {
    Double a = numericStack.pollLast();
    return Math.pow(Math.E, a);
  }

  /**
   * This method add the ln result to the Linked List.
   */
  public static boolean thirdFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()
              .add(ln(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack list values.
   * @return the ln result.
   */
  public static Double ln(LinkedList<Double> numericStack) {
    Double a = numericStack.pollLast();
    return Math.log(a);
  }

}
