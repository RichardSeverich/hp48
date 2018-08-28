package org.fundacionjala.at04.jrpnhp48.controllers.keyboard;

import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.fundacionjala.at04.jrpnhp48.views.screen.stack.StackView;

/**
 * Created by JRPNHP48 Team.
 */
public class UpdateStackController {

  /**
   * This method updates the view stack before adding to stack.
   */
  public static void updateStackBeforeAdding() {
    StackView.getSingleton().addStackElementsWhile(ExpressionInputModel
            .getSingleton().getExpression(), (NumericValuesListModel.getSingleton().getList()));
  }

  /**
   * This method updates the view stack after adding to stack.
   */
  public static void updateStackAfterAdding() {
    StackView.getSingleton().addStackLinkedListElements((NumericValuesListModel
            .getSingleton().getList()));
    ExpressionInputModel.getSingleton().getExpression().setLength(0);
  }
}
