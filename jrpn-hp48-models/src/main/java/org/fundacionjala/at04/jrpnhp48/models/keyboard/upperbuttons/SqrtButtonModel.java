package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;


/**
 * Created by JRPNHP48 Team.
 */

public class SqrtButtonModel {
  private static final int ZERO = 0;
  private static final int ONE = 1;
  private static final int DOS = 2;

  /**
   * This method add the sqrt result to the Linked List.
   */
  public static boolean firstFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()

              .add(sqrt(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack list values.
   * @return the sqrt result.
   */
  public static Double sqrt(LinkedList<Double> numericStack) {
    Double a = numericStack.pollLast();
    return Math.sqrt(a);
  }

  /**
   * This method add the pow Square result to the Linked List.
   */
  public static boolean secondFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()

              .add(powSquare(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack list values.
   * @return the pow Square result.
   */
  public static Double powSquare(LinkedList<Double> numericStack) {
    Double a = numericStack.pollLast();
    return Math.pow(a, DOS);
  }

  /**
   * This method add the pow Square result to the Linked List.
   */
  public static boolean thirdFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ONE) {
      NumericValuesListModel.getSingleton().getList()

              .add(sqrtX(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack list values.
   * @return the pow Square result.
   */
  public static Double sqrtX(LinkedList<Double> numericStack) {
    Double a = numericStack.pollLast();
    Double b = numericStack.pollLast();
    return Math.pow(b, ONE / a);
  }
}
