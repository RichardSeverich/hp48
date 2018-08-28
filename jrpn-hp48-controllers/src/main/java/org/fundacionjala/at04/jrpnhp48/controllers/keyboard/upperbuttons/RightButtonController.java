package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons.RightButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.RightButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class RightButtonController implements ActionListener, ButtonController {
  private RightButtonView rightButton;

  /**
   * Constructor for the right button controller.
   */
  public RightButtonController() {
    rightButton = new RightButtonView();
    rightButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the right button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    switch (KeysModeModel.getActualKeysMode()) {
      case KeysModeModel.LEFT_SHIFT_MODE:
        RightButtonModel.thirdFunction();
        break;
      default:
        break;
    }
    UpdateStackController.updateStackAfterAdding();
    KeysModeModel.setNormalKeysMode();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The right custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return rightButton;
  }
}
