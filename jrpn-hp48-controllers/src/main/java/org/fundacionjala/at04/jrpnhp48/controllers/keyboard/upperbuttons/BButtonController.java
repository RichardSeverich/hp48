package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.BButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class BButtonController implements ActionListener, ButtonController {
  private BButtonView buttonB;

  /**
   * Constructor for the b button controller.
   */
  public BButtonController() {
    buttonB = new BButtonView();
    buttonB.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the b button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The b custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return buttonB;
  }
}
