package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.EvalButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class EvalButtonController implements ActionListener, ButtonController {
  private EvalButtonView evalButton;

  /**
   * Constructor for the eval button controller.
   */
  public EvalButtonController() {
    evalButton = new EvalButtonView();
    evalButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the eval button.
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
   * @return The eval custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return evalButton;
  }
}
