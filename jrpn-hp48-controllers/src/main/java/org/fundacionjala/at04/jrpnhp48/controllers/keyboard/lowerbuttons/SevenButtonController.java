package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.SevenButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.SevenButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class SevenButtonController implements ActionListener, ButtonController {
  private SevenButtonView sevenButton;

  /**
   * Constructor for the seven button controller.
   */
  public SevenButtonController() {
    sevenButton = new SevenButtonView();
    sevenButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the seven button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    SevenButtonModel.firstFunction();
    UpdateStackController.updateStackBeforeAdding();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The seven custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return sevenButton;
  }
}
