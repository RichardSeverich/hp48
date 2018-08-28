package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.NineButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.NineButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public class NineButtonController implements ActionListener, ButtonController {
  private NineButtonView nineButton;

  /**
   * Constructor for the nine button controller.
   */
  public NineButtonController() {
    nineButton = new NineButtonView();
    nineButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the nine button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    NineButtonModel.firstFunction();
    UpdateStackController.updateStackBeforeAdding();

  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The nine custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return nineButton;
  }
}
