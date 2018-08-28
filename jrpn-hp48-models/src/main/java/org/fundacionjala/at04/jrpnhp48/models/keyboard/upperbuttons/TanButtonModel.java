package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.ConvertAngleModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

/**
 * Created by JRPNHP48 Team.
 */

public class TanButtonModel {
  private static final int ZERO = 0;

  /**
   * This method add the tan result to the Linked List.
   */
  public static boolean firstFunction() {
    ConvertAngleModel angle = new ConvertAngleModel();
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()
              .add(tan(angle.convertAngle(NumericValuesListModel.getSingleton().getList())));
      return true;
    }
    return false;
  }

  /**
   * This method
   *
   * @param angle list values.
   * @return the tan result.
   */
  public static Double tan(Double angle) {
    return Math.tan(angle);
  }

  /**
   * This method add the arc tangent result to the Linked List.
   */
  public static boolean secondFunction() {
    if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      NumericValuesListModel.getSingleton().getList()
              .add(atangent(NumericValuesListModel.getSingleton().getList()));
      return true;
    }
    return false;
  }

  /**
   * @param numericStack the list with values.
   * @return the arc tangent result.
   */

  public static Double atangent(LinkedList<Double> numericStack) {
    ConvertAngleModel angle = new ConvertAngleModel();
    Double a = numericStack.pollLast();
    return angle.convertToDegrees(Math.atan(a));
  }

}
