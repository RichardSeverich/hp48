package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.NxtButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class NxtButtonController implements ActionListener, ButtonController {
  private NxtButtonView nxtButton;

  /**
   * Constructor for the nxt button controller.
   */
  public NxtButtonController() {
    nxtButton = new NxtButtonView();
    nxtButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the nxt button.
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
   * @return The nxt custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return nxtButton;
  }
}
