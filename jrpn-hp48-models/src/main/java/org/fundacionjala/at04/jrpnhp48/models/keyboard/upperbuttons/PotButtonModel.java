package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;


/**
 * Created by JRPNHP48 Team.
 */

public class PotButtonModel {
  private static final int ZERO = 0;
  private static final int ONE = 1;
  private static final int TEN = 10;

  /**
   * This method add the pow result to the Linked List.
   */
  public static boolean firstFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ONE) {
      NumericValuesListModel.getSingleton().getList()
              .add(pow(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack list values.
   * @return the pow result.
   */
  public static Double pow(LinkedList<Double> numericStack) {
    Double a = numericStack.pollLast();
    Double b = numericStack.pollLast();
    return Math.pow(b, a);
  }

  /**
   * This method add the ten pow Square result to the Linked List.
   */
  public static boolean secondFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()

              .add(tenPow(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack list values.
   * @return the ten pow Square result.
   */
  public static Double tenPow(LinkedList<Double> numericStack) {
    Double a = numericStack.pollLast();
    return Math.pow(TEN, a);
  }

  /**
   * This method add the pow Square result to the Linked List.
   */
  public static boolean thirdFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()

              .add(log(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack list values.
   * @return the pow Square result.
   */
  public static Double log(LinkedList<Double> numericStack) {
    Double a = numericStack.pollLast();
    return Math.log10(a);
  }
}
