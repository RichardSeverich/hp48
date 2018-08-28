package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpdateStackController;
import org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons.PointButtonModel;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerbuttons.PointButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class PointButtonController implements ActionListener, ButtonController {
  private PointButtonView pointButton;

  /**
   * Constructor for the point button controller.
   */
  public PointButtonController() {
    pointButton = new PointButtonView();
    pointButton.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the point button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
    PointButtonModel.firstFunction();
    UpdateStackController.updateStackBeforeAdding();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The point custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return pointButton;
  }
}
