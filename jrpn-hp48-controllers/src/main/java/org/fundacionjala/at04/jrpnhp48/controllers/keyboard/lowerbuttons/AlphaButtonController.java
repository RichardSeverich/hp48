package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.AlphaButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public class AlphaButtonController implements ActionListener, ButtonController {
  private CalculatorButton alphaButton;

  /**
   * Constructor for the alpha button controller.
   */
  public AlphaButtonController() {
    alphaButton = new AlphaButtonView();
    alphaButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the alpha button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    StatusBarView.getSingleton().clearUpperStatusText();
    switch (KeysModeModel.getActualKeysMode()) {
      case (KeysModeModel.NORMAL_MODE):
        KeysModeModel.setAlphaKeysMode();
        StatusBarView.getSingleton().setUpperStatusText("Alpha");
        break;
      case (KeysModeModel.RIGHT_SHIFT_MODE):
        KeysModeModel.setEntryKeysMode();
        StatusBarView.getSingleton().setUpperStatusText("Entry mode");
        break;
      case (KeysModeModel.ALPHA_MODE):
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
   * @return The alpha custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return alphaButton;
  }
}
