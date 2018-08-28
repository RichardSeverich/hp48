package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.SpcButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.SpcButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class SpcButtonController implements ActionListener, ButtonController {
  private SpcButtonView spcButton;

  /**
   * Constructor for the spc button controller.
   */
  public SpcButtonController() {
    spcButton = new SpcButtonView();
    spcButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the spc button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    switch (KeysModeModel.getActualKeysMode()) {
      case (KeysModeModel.ENTRY_MODE):
        SpcButtonModel.firstFunction();
        break;
      default:
        break;
    }
    UpdateStackController.updateStackBeforeAdding();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The spc custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return spcButton;
  }
}








