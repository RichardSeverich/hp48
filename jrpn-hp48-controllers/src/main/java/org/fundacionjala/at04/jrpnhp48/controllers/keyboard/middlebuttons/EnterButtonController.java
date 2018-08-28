package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.middlebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.ExpressionInputModel;
import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons.EnterButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.middlebuttons.EnterButtonView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public class EnterButtonController implements ActionListener, ButtonController {
  private EnterButtonView enterButton;

  /**
   * Constructor for the enter button controller.
   */
  public EnterButtonController() {
    enterButton = new EnterButtonView();
    enterButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the enter button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    StatusBarView.getSingleton().clearUpperStatusText();
    switch (KeysModeModel.getActualKeysMode()) {
      case KeysModeModel.ENTRY_MODE:
        if (!EnterButtonModel.expressionCalculate()) {
          StatusBarView.getSingleton().setUpperStatusText("Not RPN format");
          UpdateStackController.updateStackBeforeAdding();
        } else {
          StatusBarView.getSingleton().setUpperStatusText(" ");
          UpdateStackController.updateStackAfterAdding();
          KeysModeModel.setNormalKeysMode();
        }
        break;
      case KeysModeModel.NORMAL_MODE:
        EnterButtonModel.firstFunction();
        UpdateStackController.updateStackAfterAdding();
        break;
      default:
        break;
    }
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The enter custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return enterButton;
  }
}
