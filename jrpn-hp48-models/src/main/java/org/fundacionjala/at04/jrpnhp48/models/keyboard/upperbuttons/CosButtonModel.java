package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.ConvertAngleModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

/**
 * Created by JRPNHP48 Team.
 */

public class CosButtonModel {
  private static final int ZERO = 0;

  /**
   * This method add the cos result to the Linked List.
   */
  public static boolean firstFunction() {
    ConvertAngleModel angle = new ConvertAngleModel();
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()
              .add(cos(angle.convertAngle(NumericValuesListModel.getSingleton().getList())));
      return true;
    }
    return false;
  }

  /**
   * @param angle list values.
   * @return the cos result.
   */
  public static Double cos(Double angle) {
    return Math.cos(angle);
  }

  /**
   * This method add the the arc cos result to the Linked List.
   */
  public static boolean secondFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()
              .add(acosine(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack the list with values.
   * @return the arc sine result.
   */

  public static Double acosine(LinkedList<Double> numericStack) {
    ConvertAngleModel angle = new ConvertAngleModel();
    Double a = numericStack.pollLast();
    return angle.convertToDegrees(Math.acos(a));
  }
}
