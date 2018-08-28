package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.DivButtonModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.MulButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.DivButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;


/**
 * Created by JRPNHP48 Team.
 */
public class DivButtonController implements ActionListener, ButtonController {
  private DivButtonView divButton;

  /**
   * Constructor for the div button controller.
   */
  public DivButtonController() {
    divButton = new DivButtonView();
    divButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the div button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    switch (KeysModeModel.getActualKeysMode()) {
      case KeysModeModel.ENTRY_MODE:
        DivButtonModel.firstFunction();
        UpdateStackController.updateStackBeforeAdding();
        break;
      case KeysModeModel.NORMAL_MODE:
        if (!DivButtonModel.divisionFunction()) {
          StatusBarView.getSingleton().setUpperStatusText("Error: Too Few Arguments");
        }
        UpdateStackController.updateStackAfterAdding();
        break;
      default:
        break;
    }

  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The div custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return divButton;
  }
}
