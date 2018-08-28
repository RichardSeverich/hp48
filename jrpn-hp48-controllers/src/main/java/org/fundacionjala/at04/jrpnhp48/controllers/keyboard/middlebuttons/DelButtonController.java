package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.middlebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.middlebuttons.DelButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.middlebuttons.DelButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class DelButtonController implements ActionListener, ButtonController {
  private DelButtonView delButton;

  /**
   * Constructor for the del button controller.
   */
  public DelButtonController() {
    delButton = new DelButtonView();
    delButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the del button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    DelButtonModel.delNumericValuesListModel();
    UpdateStackController.updateStackAfterAdding();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The del custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return delButton;
  }
}
