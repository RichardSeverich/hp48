package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.middlebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.middlebuttons.EexButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class EexButtonController implements ActionListener, ButtonController {
  private EexButtonView eexButton;

  /**
   * Constructor for the eex button controller.
   */
  public EexButtonController() {
    eexButton = new EexButtonView();
    eexButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the eex button.
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
   * @return The eex custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return eexButton;
  }
}
