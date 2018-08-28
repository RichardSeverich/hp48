package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.MulButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.MulButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public class MulButtonController implements ActionListener, ButtonController {
  private MulButtonView multButton;

  /**
   * Constructor for the mul button controller.
   */
  public MulButtonController() {
    multButton = new MulButtonView();
    multButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the mul button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    switch (KeysModeModel.getActualKeysMode()) {
      case KeysModeModel.ENTRY_MODE:
        MulButtonModel.firstFunction();
        UpdateStackController.updateStackBeforeAdding();
        break;
      case KeysModeModel.NORMAL_MODE:
        StatusBarView.getSingleton().clearUpperStatusText();
        if (!MulButtonModel.multiplicationFunction()) {
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
   * @return The mul custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return multButton;
  }
}
