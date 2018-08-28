package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.OneButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.OneButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class OneButtonController implements ActionListener, ButtonController {
  private OneButtonView oneButton;

  /**
   * Constructor for the one button controller.
   */
  public OneButtonController() {
    oneButton = new OneButtonView();
    oneButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the one button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    OneButtonModel.firstFunction();
    UpdateStackController.updateStackBeforeAdding();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The one custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return oneButton;
  }
}
