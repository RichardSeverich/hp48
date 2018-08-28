package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.PrgButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class PrgButtonController implements ActionListener, ButtonController {
  private PrgButtonView prgButton;

  /**
   * Constructor for the prg button controller.
   */
  public PrgButtonController() {
    prgButton = new PrgButtonView();
    prgButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the prg button.
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
   * @return The prg custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return prgButton;
  }
}
