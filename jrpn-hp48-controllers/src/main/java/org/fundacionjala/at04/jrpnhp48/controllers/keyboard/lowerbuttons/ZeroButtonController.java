package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.ZeroButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.ZeroButtonView;


/**
 * Created by JRPNHP48 Team.
 */
public class ZeroButtonController implements ActionListener, ButtonController {
  private ZeroButtonView zeroButton;

  /**
   * Constructor for the zero button controller.
   */
  public ZeroButtonController() {
    zeroButton = new ZeroButtonView();
    zeroButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the zero button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    ZeroButtonModel.firstFunction();
    UpdateStackController.updateStackBeforeAdding();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The zero custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return zeroButton;
  }
}
