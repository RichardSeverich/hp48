package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.VarButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class VarButtonController implements ActionListener, ButtonController {
  private VarButtonView varButton;

  /**
   * Constructor for the var button controller.
   */
  public VarButtonController() {
    varButton = new VarButtonView();
    varButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the var button.
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
   * @return The var custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return varButton;
  }
}
