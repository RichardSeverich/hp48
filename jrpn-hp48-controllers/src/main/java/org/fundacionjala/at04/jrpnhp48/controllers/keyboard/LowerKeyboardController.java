package org.fundacionjala.at04.jrpnhp48.controllers.keyboard;

import java.util.ArrayList;
import java.util.List;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.AlphaButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.DivButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.EightButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.FiveButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.FourButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.LeftShiftButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.MulButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.NineButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.OnButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.OneButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.PointButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.RightShiftButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.SevenButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.SixButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.SpcButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.SubsButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.SumButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.ThreeButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.TwoButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.lowerbuttons.ZeroButtonController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorKeyboard;

/**
 * Created by JRPNHP48 Team.
 */
public class LowerKeyboardController implements KeyboardController {

  private List<ButtonController> buttonControllers;

  /**
   * Constructor for the lower keyboard controller.
   */
  public LowerKeyboardController() {
    buttonControllers = new ArrayList<>();
    addButtonsControllers();
  }

  /**
   * This method creates and add the button controllers to the lower keyboard.
   */
  @Override
  public void addButtonsControllers() {
    buttonControllers.add(new AlphaButtonController());
    buttonControllers.add(new SevenButtonController());
    buttonControllers.add(new EightButtonController());
    buttonControllers.add(new NineButtonController());
    buttonControllers.add(new DivButtonController());
    buttonControllers.add(new LeftShiftButtonController());
    buttonControllers.add(new FourButtonController());
    buttonControllers.add(new FiveButtonController());
    buttonControllers.add(new SixButtonController());
    buttonControllers.add(new MulButtonController());
    buttonControllers.add(new RightShiftButtonController());
    buttonControllers.add(new OneButtonController());
    buttonControllers.add(new TwoButtonController());
    buttonControllers.add(new ThreeButtonController());
    buttonControllers.add(new SubsButtonController());
    buttonControllers.add(new OnButtonController());
    buttonControllers.add(new ZeroButtonController());
    buttonControllers.add(new PointButtonController());
    buttonControllers.add(new SpcButtonController());
    buttonControllers.add(new SumButtonController());
  }

  /**
   * This method adds the custom buttons to the lower keyboard.
   *
   * @param lowerKeyboardView The lower calculator keyboard.
   */
  @Override
  public void addButtonsToKeyboard(CalculatorKeyboard lowerKeyboardView) {
    for (ButtonController buttonController : buttonControllers) {
      lowerKeyboardView.addButton(buttonController.getCustomButton());
    }
  }
}
