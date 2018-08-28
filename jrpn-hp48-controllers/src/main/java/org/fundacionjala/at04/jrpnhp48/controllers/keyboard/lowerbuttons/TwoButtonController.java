package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.TwoButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.TwoButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class TwoButtonController implements ActionListener, ButtonController {
  private TwoButtonView twoButton;

  /**
   * Constructor for the two button controller.
   */
  public TwoButtonController() {
    twoButton = new TwoButtonView();
    twoButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the two button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    TwoButtonModel.firstFunction();
    UpdateStackController.updateStackBeforeAdding();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The two custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return twoButton;
  }
}
