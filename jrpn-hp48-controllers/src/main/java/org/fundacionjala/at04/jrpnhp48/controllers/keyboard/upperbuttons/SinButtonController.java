package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons.SinButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.SinButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */

public class SinButtonController implements ActionListener, ButtonController {
  private SinButtonView sinButton;

  /**
   * Constructor for the sin button controller.
   */
  public SinButtonController() {
    sinButton = new SinButtonView();
    sinButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the sin button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    switch (KeysModeModel.getActualKeysMode()) {
      case KeysModeModel.NORMAL_MODE:
        if (!SinButtonModel.firstFunction()) {
          StatusBarView.getSingleton().setUpperStatusText("Error: Too Few Arguments");
        }
        break;
      case KeysModeModel.LEFT_SHIFT_MODE:
        if (!SinButtonModel.secondFunction()) {
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
   * @return The sin custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return sinButton;
  }
}
