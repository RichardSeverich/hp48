package org.fundacionjala.at04.jrpnhp48.controllers.keyboard;

import java.util.ArrayList;
import java.util.List;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.AButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.BButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.CButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.CosButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.CstButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.DButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.DownButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.EButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.EvalButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.FButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.InvButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.LeftButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.MthButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.NxtButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.PotButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.PrgButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.PrmButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.RightButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.SinButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.SqrtButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.StoButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.TanButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.UpButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons.VarButtonController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorKeyboard;

/**
 * Created by JRPNHP48 Team.
 */
public class UpperKeyboardController implements KeyboardController {

  private List<ButtonController> buttonsControllers;

  /**
   * Constructor for the upper keyboard controller.
   */
  public UpperKeyboardController() {
    buttonsControllers = new ArrayList<>();
    addButtonsControllers();
  }

  /**
   * This method creates and add the button controllers to the lower keyboard.
   */
  @Override
  public void addButtonsControllers() {
    buttonsControllers.add(new AButtonController());
    buttonsControllers.add(new BButtonController());
    buttonsControllers.add(new CButtonController());
    buttonsControllers.add(new DButtonController());
    buttonsControllers.add(new EButtonController());
    buttonsControllers.add(new FButtonController());
    buttonsControllers.add(new MthButtonController());
    buttonsControllers.add(new PrgButtonController());
    buttonsControllers.add(new CstButtonController());
    buttonsControllers.add(new VarButtonController());
    buttonsControllers.add(new UpButtonController());
    buttonsControllers.add(new NxtButtonController());
    buttonsControllers.add(new PrmButtonController());
    buttonsControllers.add(new StoButtonController());
    buttonsControllers.add(new EvalButtonController());
    buttonsControllers.add(new LeftButtonController());
    buttonsControllers.add(new DownButtonController());
    buttonsControllers.add(new RightButtonController());
    buttonsControllers.add(new SinButtonController());
    buttonsControllers.add(new CosButtonController());
    buttonsControllers.add(new TanButtonController());
    buttonsControllers.add(new SqrtButtonController());
    buttonsControllers.add(new PotButtonController());
    buttonsControllers.add(new InvButtonController());
  }

  /**
   * This method adds the custom buttons to the lower keyboard.
   *
   * @param upperKeyboardView The lower calculator keyboard.
   */
  @Override
  public void addButtonsToKeyboard(CalculatorKeyboard upperKeyboardView) {
    for (ButtonController buttonController : buttonsControllers) {
      upperKeyboardView.addButton(buttonController.getCustomButton());
    }
  }
}
