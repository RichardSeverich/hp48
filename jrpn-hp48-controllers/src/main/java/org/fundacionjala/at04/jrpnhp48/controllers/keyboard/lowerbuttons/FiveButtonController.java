package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.FiveButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.FiveButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class FiveButtonController implements ActionListener, ButtonController {
  private FiveButtonView fiveButton;

  /**
   * Constructor for the five button controller.
   */
  public FiveButtonController() {
    fiveButton = new FiveButtonView();
    fiveButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the five button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    FiveButtonModel.firstFunction();
    UpdateStackController.updateStackBeforeAdding();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The five custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return fiveButton;
  }
}
