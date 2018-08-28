package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.LeftShiftButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public class LeftShiftButtonController implements ActionListener, ButtonController {
  private LeftShiftButtonView userButton;

  /**
   * Constructor for the user button controller.
   */
  public LeftShiftButtonController() {
    userButton = new LeftShiftButtonView();
    userButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the user button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    StatusBarView.getSingleton().clearUpperStatusText();
    switch (KeysModeModel.getActualKeysMode()) {
      case (KeysModeModel.NORMAL_MODE):
        KeysModeModel.setLeftShiftKeysMode();
        StatusBarView.getSingleton().setUpperStatusText("Left-Shift");
        break;
      case (KeysModeModel.LEFT_SHIFT_MODE):
        KeysModeModel.setNormalKeysMode();
        StatusBarView.getSingleton().setUpperStatusText(" ");
        break;
      default:
        break;
    }
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The user custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return userButton;
  }
}
