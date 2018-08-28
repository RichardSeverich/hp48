package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.MthButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class MthButtonController implements ActionListener, ButtonController {
  private MthButtonView mthButton;

  /**
   * Constructor for the mth button controller.
   */
  public MthButtonController() {
    mthButton = new MthButtonView();
    mthButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the mth button.
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
   * @return The mth custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return mthButton;
  }
}
