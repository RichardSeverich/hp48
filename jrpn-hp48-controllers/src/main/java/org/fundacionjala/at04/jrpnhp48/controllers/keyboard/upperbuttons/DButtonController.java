package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.DButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class DButtonController implements ActionListener, ButtonController {
  private DButtonView buttonD;

  /**
   * Constructor for the d button controller.
   */
  public DButtonController() {
    buttonD = new DButtonView();
    buttonD.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the d button.
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
   * @return The d custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return buttonD;
  }
}
