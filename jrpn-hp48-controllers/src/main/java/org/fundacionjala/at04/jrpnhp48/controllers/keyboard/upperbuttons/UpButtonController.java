package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.UpButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class UpButtonController implements ActionListener, ButtonController {
  private UpButtonView upButton;

  /**
   * Constructor for the up button controller.
   */
  public UpButtonController() {
    upButton = new UpButtonView();
    upButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the up button.
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
   * @return The up custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return upButton;
  }
}
