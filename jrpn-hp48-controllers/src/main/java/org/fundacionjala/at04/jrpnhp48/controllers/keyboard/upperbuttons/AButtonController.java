package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.AButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class AButtonController implements ActionListener, ButtonController {
  private AButtonView buttonA;

  /**
   * Constructor for the a button controller.
   */
  public AButtonController() {
    buttonA = new AButtonView();
    buttonA.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the a button.
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
   * @return The a custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return buttonA;
  }
}
