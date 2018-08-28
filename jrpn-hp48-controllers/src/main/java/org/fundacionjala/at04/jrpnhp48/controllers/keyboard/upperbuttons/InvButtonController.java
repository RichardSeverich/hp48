package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons.InvButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.InvButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */

public class InvButtonController implements ActionListener, ButtonController {
  private InvButtonView invButton;

  /**
   * Constructor for the inv button controller.
   */
  public InvButtonController() {
    invButton = new InvButtonView();
    invButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the inv button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    switch (KeysModeModel.getActualKeysMode()) {
      case KeysModeModel.NORMAL_MODE:
        if (!InvButtonModel.firstFunction()) {
          StatusBarView.getSingleton().setUpperStatusText("Error: Too Few Arguments");
        }
        break;
      case KeysModeModel.LEFT_SHIFT_MODE:
        if (!InvButtonModel.secondFunction()) {
          StatusBarView.getSingleton().setUpperStatusText("Error: Too Few Arguments");
        }
        break;
      case KeysModeModel.RIGHT_SHIFT_MODE:
        if (!InvButtonModel.thirdFunction()) {
          StatusBarView.getSingleton().setUpperStatusText("Error: Too Few Arguments");
        }
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
   * @return The inv custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return invButton;
  }
}
