package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.SixButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.SixButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class SixButtonController implements ActionListener, ButtonController {
  private SixButtonView sixButton;

  /**
   * Constructor for the six button controller.
   */
  public SixButtonController() {
    sixButton = new SixButtonView();
    sixButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the six button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    SixButtonModel.firstFunction();
    UpdateStackController.updateStackBeforeAdding();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The six custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return sixButton;
  }
}
