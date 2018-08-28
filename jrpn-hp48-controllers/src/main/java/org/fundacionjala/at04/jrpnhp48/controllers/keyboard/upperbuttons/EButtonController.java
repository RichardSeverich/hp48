package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.EButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class EButtonController implements ActionListener, ButtonController {
  private EButtonView buttonE;

  /**
   * Constructor for the e button controller.
   */
  public EButtonController() {
    buttonE = new EButtonView();
    buttonE.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the e button.
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
   * @return The e custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return buttonE;
  }
}
