package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.middlebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons.SignButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.middlebuttons.SignButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class SignButtonController implements ActionListener, ButtonController {
  private SignButtonView signButton;

  /**
   * Constructor for the sign button controller.
   */
  public SignButtonController() {
    signButton = new SignButtonView();
    signButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the sign button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    SignButtonModel.firstFunction();
    if (ExpressionInputModel.getSingleton().getStringBuilderLength() > 0) {
      UpdateStackController.updateStackBeforeAdding();
    } else if (NumericValuesListModel.getSingleton().getList().size() > 0) {
      UpdateStackController.updateStackAfterAdding();
    }
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The sign custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return signButton;
  }
}
