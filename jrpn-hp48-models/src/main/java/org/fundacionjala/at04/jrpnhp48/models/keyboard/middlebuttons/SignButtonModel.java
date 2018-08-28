package org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons;

import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;

/**
 * Created by JRPNHP48 Team.
 */
public class SignButtonModel {

  private static final int ZERO = 0;

  /**
   * This method controls whether a sign is added to the expression or list;.
   */
  public static void firstFunction() {
    if (ExpressionInputModel.getSingleton().getStringBuilderLength() > ZERO) {
      addNegativeOrPositiveSignToExpression();
    } else if (NumericValuesListModel.getSingleton().getList().size() > ZERO) {
      addNegativeOrPositiveSignToNumericValuesList();
    }
  }


  /**
   * this method add sign to expression.
   */
  public static void addNegativeOrPositiveSignToExpression() {
    switch (ExpressionInputModel.getSingleton().getExpression().charAt(0)) {
      case ('+'):
        ExpressionInputModel.getSingleton().getExpression().replace(0, 1, "-");
        break;
      case ('-'):
        ExpressionInputModel.getSingleton().getExpression().replace(0, 1, "+");
        break;
      default:
        String value = ExpressionInputModel.getSingleton().getExpression().toString();
        ExpressionInputModel.getSingleton().getExpression().setLength(ZERO);
        ExpressionInputModel.getSingleton().getExpression().append("-");
        ExpressionInputModel.getSingleton().getExpression().append(value);
        break;
    }
  }

  /**
   * This method adds a sign to the first item in the list.
   */
  private static void addNegativeOrPositiveSignToNumericValuesList() {
    Double value = NumericValuesListModel.getSingleton().getList().pollLast() * -1;
    NumericValuesListModel.getSingleton().getList().add(value);
  }
}
