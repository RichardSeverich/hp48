package org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons;

import org.fundacionjala.at04.jrpnhp48.models.ExceptionRpnValidation;
import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.fundacionjala.at04.jrpnhp48.models.MessageExceptionRpnValidation;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

/**
 * Created by JRPNHP48 Team.
 */
public class EnterButtonModel {

  private static final int ZERO = 0;

  /**
   * This method add the number to the Linked List.
   */
  public static void firstFunction() {
    if (ExpressionInputModel.getSingleton().getStringBuilderLength() > ZERO) {
      NumericValuesListModel.getSingleton().getList().add(Double
          .parseDouble(ExpressionInputModel.getSingleton().getExpression().toString()));
    } else if (NumericValuesListModel.getSingleton().getList().size() > 0) {
      NumericValuesListModel.getSingleton().getList()
          .add(NumericValuesListModel.getSingleton().getList().getLast());
    }
  }

  /**
   * this method calculate expression and stack add.
   *
   * @return true while stack add.
   */
  public static boolean expressionCalculate() {
    String input = ExpressionInputModel.getSingleton().getExpression().toString();
    MessageExceptionRpnValidation messageRpn = new MessageExceptionRpnValidation();
    try {
      String result = messageRpn.message(input);
      NumericValuesListModel.getSingleton().getList().add(Double.parseDouble(result));
      return true;
    } catch (ExceptionRpnValidation e) {
      return false;
    }
  }
}
