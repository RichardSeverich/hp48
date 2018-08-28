package org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons;

import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;

/**
 * Created by JRPNHP48 Team.
 */
public class PointButtonModel {
  /**
   * This method concatenates a point to stringBuilder.
   */
  public static void firstFunction() {
    ExpressionInputModel.getSingleton().getExpression().append(".");
  }
}
