package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.PrmButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class PrmButtonController implements ActionListener, ButtonController {
  private PrmButtonView prmButton;

  /**
   * Constructor for the prm button controller.
   */
  public PrmButtonController() {
    prmButton = new PrmButtonView();
    prmButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the prm button.
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
   * @return The prm custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return prmButton;
  }
}
