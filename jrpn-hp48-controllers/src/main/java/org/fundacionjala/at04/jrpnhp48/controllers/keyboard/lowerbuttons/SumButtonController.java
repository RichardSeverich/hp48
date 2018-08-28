package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.SumButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.SumButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public class SumButtonController implements ActionListener, ButtonController {
  private SumButtonView sumButton;

  /**
   * Constructor for the sum button controller.
   */
  public SumButtonController() {
    sumButton = new SumButtonView();
    sumButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the sum button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    switch (KeysModeModel.getActualKeysMode()) {
      case KeysModeModel.ENTRY_MODE:
        SumButtonModel.firstFunction();
        UpdateStackController.updateStackBeforeAdding();
        break;
      case KeysModeModel.NORMAL_MODE:
        StatusBarView.getSingleton().clearUpperStatusText();
        if (!SumButtonModel.sumFunction()) {
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
   * @return The sum custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return sumButton;
  }
}
