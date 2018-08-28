package org.fundacionjala.at04.jrpnhp48.controllers.keyboard;

import java.util.ArrayList;
import java.util.List;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.middlebuttons.BackButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.middlebuttons.DelButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.middlebuttons.EexButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.middlebuttons.EnterButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.middlebuttons.SignButtonController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorKeyboard;

/**
 * Created by JRPNHP48 Team.
 */
public class MiddleKeyboardController implements KeyboardController {

  private List<ButtonController> buttonsControllers;

  /**
   * Constructor for the middle keyboard controller.
   */
  public MiddleKeyboardController() {
    buttonsControllers = new ArrayList<>();
    addButtonsControllers();

  }

  /**
   * This method creates and add the button controllers to the middle keyboard.
   */
  @Override
  public void addButtonsControllers() {
    buttonsControllers.add(new EnterButtonController());
    buttonsControllers.add(new SignButtonController());
    buttonsControllers.add(new EexButtonController());
    buttonsControllers.add(new DelButtonController());
    buttonsControllers.add(new BackButtonController());
  }

  /**
   * This method adds the custom buttons to the upper keyboard.
   *
   * @param keyboard The upper calculator keyboard.
   */
  @Override
  public void addButtonsToKeyboard(CalculatorKeyboard keyboard) {
    for (ButtonController buttonController : buttonsControllers) {
      keyboard.addButton(buttonController.getCustomButton());
    }
  }
}
