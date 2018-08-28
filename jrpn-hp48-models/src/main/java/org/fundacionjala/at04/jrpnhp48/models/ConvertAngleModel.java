package org.fundacionjala.at04.jrpnhp48.models;

import java.util.LinkedList;

/**
 * Created by Administrator on 7/21/2017.
 */
public class ConvertAngleModel {


  /**

   * @return angle converted.
   */
  public static Double convertAngle(LinkedList<Double> numericStack) {

    Double angle = numericStack.pollLast();
    return convertDegreesToRadians(angle);
  }

  /**
   * @param angle double with degrees angle.
   * @return angle on radians.
   */
  public static Double convertDegreesToRadians(Double angle) {
    return Math.toRadians(angle);
  }



  /**
   * @param angle double with degrees angle.
   * @return angle on radians.
   */
  public static Double convertToDegrees(Double angle) {
    return Math.toDegrees(angle);
  }


}
