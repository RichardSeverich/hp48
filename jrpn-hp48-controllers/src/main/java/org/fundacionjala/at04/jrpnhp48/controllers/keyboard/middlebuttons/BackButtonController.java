package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.middlebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons.BackButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.middlebuttons.BackButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public class BackButtonController implements ActionListener, ButtonController {
  private BackButtonView backButton;

  /**
   * Constructor for the back button controller.
   */
  public BackButtonController() {
    backButton = new BackButtonView();
    backButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the back button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    switch (KeysModeModel.getActualKeysMode()) {
      case (KeysModeModel.LEFT_SHIFT_MODE):
        BackButtonModel.secondFunction();
        UpdateStackController.updateStackAfterAdding();
        KeysModeModel.setNormalKeysMode();
        break;
      default:
        if (BackButtonModel.firstFunction()) {
          UpdateStackController.updateStackBeforeAdding();
        } else {
          UpdateStackController.updateStackAfterAdding();
          KeysModeModel.setNormalKeysMode();
          StatusBarView.getSingleton().clearUpperStatusText();
        }
        break;
    }
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The back custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return backButton;
  }
}
