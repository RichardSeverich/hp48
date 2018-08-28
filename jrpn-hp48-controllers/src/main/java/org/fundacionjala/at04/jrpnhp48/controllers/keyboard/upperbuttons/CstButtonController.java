package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.CstButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class CstButtonController implements ActionListener, ButtonController {
  private CstButtonView cstButton;

  /**
   * Constructor for the cst button controller.
   */
  public CstButtonController() {
    cstButton = new CstButtonView();
    cstButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the cst button.
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
   * @return The cst custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return cstButton;
  }
}
