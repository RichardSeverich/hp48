package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.DownButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class DownButtonController implements ActionListener, ButtonController {
  private DownButtonView downButton;

  /**
   * Constructor for the down button controller.
   */
  public DownButtonController() {
    downButton = new DownButtonView();
    downButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the down button.
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
   * @return The down custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return downButton;
  }
}
