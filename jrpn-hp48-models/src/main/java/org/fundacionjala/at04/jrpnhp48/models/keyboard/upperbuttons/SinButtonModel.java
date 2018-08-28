package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.ConvertAngleModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

/**
 * Created by JRPNHP48 Team.
 */

public class SinButtonModel {
  private static final int ZERO = 0;

  /**
   * This method add the sin result to the Linked List.
   */
  public static boolean firstFunction() {
    ConvertAngleModel angle = new ConvertAngleModel();
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()

              .add(sin(angle.convertAngle(NumericValuesListModel.getSingleton().getList())));
      return true;
    }
    return false;
  }

  /**
   * @param angle list values.
   * @return the sin result.
   */
  public static Double sin(Double angle) {
    return Math.sin(angle);
  }


  /**
   * This method add the arc sine result to the Linked List.
   */
  public static boolean secondFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()
              .add(asine(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack the list with values.
   * @return the arc sine result.
   */

  public static Double asine(LinkedList<Double> numericStack) {
    ConvertAngleModel angle = new ConvertAngleModel();
    Double a = numericStack.pollLast();
    return angle.convertToDegrees(Math.asin(a));
  }
}
