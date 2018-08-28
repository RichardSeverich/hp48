package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.FourButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.FourButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public class FourButtonController implements ActionListener, ButtonController {
  private FourButtonView fourButton;

  /**
   * Constructor for the four button controller.
   */
  public FourButtonController() {
    fourButton = new FourButtonView();
    fourButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the four button.
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    FourButtonModel.firstFunction();
    UpdateStackController.updateStackBeforeAdding();
  }

  /**
   * This mehotd return the custom calculator button attribute.
   *
   * @return The four custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return fourButton;
  }
}
