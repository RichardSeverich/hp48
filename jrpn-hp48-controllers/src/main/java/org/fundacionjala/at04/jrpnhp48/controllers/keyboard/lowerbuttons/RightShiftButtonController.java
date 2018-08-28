package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.RightShiftButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public class RightShiftButtonController implements ActionListener, ButtonController {
  private RightShiftButtonView entryButton;

  /**
   * Constructor for the entry button controller.
   */
  public RightShiftButtonController() {
    entryButton = new RightShiftButtonView();
    entryButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the eight button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    StatusBarView.getSingleton().clearUpperStatusText();
    switch (KeysModeModel.getActualKeysMode()) {
      case (KeysModeModel.NORMAL_MODE):
        KeysModeModel.setRightShiftKeysMode();
        StatusBarView.getSingleton().setUpperStatusText("Right-Shift");
        break;
      case (KeysModeModel.RIGHT_SHIFT_MODE):
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
   * @return the eight custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return entryButton;
  }
}
