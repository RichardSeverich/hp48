package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.EightButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.EightButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class EightButtonController implements ActionListener, ButtonController {
  private EightButtonView eightButton;

  /**
   * Constructor for the eight button controller.
   */
  public EightButtonController() {
    eightButton = new EightButtonView();
    eightButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the alpha button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    EightButtonModel.firstFunction();
    UpdateStackController.updateStackBeforeAdding();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The eight custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return eightButton;
  }
}
