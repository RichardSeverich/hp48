package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.SubsButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.SubsButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public class SubsButtonController implements ActionListener, ButtonController {
  private SubsButtonView subsButton;

  /**
   * Constructor for the subs button controller.
   */
  public SubsButtonController() {
    subsButton = new SubsButtonView();
    subsButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the subs button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    switch (KeysModeModel.getActualKeysMode()) {
      case KeysModeModel.ENTRY_MODE:
        SubsButtonModel.firstFunction();
        UpdateStackController.updateStackBeforeAdding();
        break;
      case KeysModeModel.NORMAL_MODE:
        if (!SubsButtonModel.subtractionFunction()) {
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
   * @return The subs custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return subsButton;
  }
}
