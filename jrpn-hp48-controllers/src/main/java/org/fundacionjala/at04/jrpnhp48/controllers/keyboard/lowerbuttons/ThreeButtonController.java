package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.ThreeButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.ThreeButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class ThreeButtonController implements ActionListener, ButtonController {
  private ThreeButtonView threeButton;

  /**
   * Constructor for the three button controller.
   */
  public ThreeButtonController() {
    threeButton = new ThreeButtonView();
    threeButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the three button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    ThreeButtonModel.firstFunction();
    UpdateStackController.updateStackBeforeAdding();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The three custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return threeButton;
  }
}
