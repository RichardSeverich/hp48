package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons.TanButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.TanButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */

public class TanButtonController implements ActionListener, ButtonController {
  private TanButtonView tanButton;

  /**
   * Constructor for the tan button controller.
   */
  public TanButtonController() {
    tanButton = new TanButtonView();
    tanButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the tan button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    switch (KeysModeModel.getActualKeysMode()) {
      case KeysModeModel.NORMAL_MODE:
        if (!TanButtonModel.firstFunction()) {
          StatusBarView.getSingleton().setUpperStatusText("Error: Too Few Arguments");
        }
        break;
      case KeysModeModel.LEFT_SHIFT_MODE:
        if (!TanButtonModel.secondFunction()) {
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
   * @return The tan custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return tanButton;
  }
}
