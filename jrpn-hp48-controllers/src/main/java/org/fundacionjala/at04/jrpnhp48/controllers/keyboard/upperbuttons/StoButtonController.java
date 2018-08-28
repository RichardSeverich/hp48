package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.StoButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class StoButtonController implements ActionListener, ButtonController {
  private StoButtonView stoButton;

  /**
   * Constructor for the sto button controller.
   */
  public StoButtonController() {
    stoButton = new StoButtonView();
    stoButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the sto button.
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
   * @return The sto custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return stoButton;
  }
}
