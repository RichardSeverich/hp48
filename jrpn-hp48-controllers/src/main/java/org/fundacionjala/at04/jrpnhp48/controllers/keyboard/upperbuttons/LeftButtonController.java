package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.LeftButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class LeftButtonController implements ActionListener, ButtonController {
  private LeftButtonView leftButton;

  /**
   * Constructor for the left button controller.
   */
  public LeftButtonController() {
    leftButton = new LeftButtonView();
    leftButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the left button.
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
   * @return The left custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return leftButton;
  }
}
