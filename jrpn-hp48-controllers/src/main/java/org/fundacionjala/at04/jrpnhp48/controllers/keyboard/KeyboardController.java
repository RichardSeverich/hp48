package org.fundacionjala.at04.jrpnhp48.controllers.keyboard;

import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorKeyboard;

/**
 * Created by JRPNHP48 Team.
 */
public interface KeyboardController {

  /**
   * This method creates and add the button controllers to the keyboard.
   */
  void addButtonsControllers();

  /**
   * This method adds the custom buttons to the keyboard.
   *
   * @param keyboard The target calculator keyboard.
   */
  void addButtonsToKeyboard(CalculatorKeyboard keyboard);
}
