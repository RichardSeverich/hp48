package org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons;

import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;

/**
 * Created by JRPNHP48 Team.
 */
public class FourButtonModel {

  /**
   * This method concatenates a number to a stringBuilder.
   */
  public static void firstFunction() {
    ExpressionInputModel.getSingleton().getExpression().append("4");
  }
}
