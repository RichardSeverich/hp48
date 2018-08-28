package org.fundacionjala.at04.jrpnhp48.views.keyboard.middlekeyboard;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;

import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorKeyboard;

/**
 * Created by JRPNHP48 Team.
 */
public class MiddleKeyboardView extends CalculatorKeyboard {
  private static final int WIDTH = 332;
  private static final int HEIGHT = 50;
  private static final int TOP = 2;
  private static final int LEFT = 18;
  private static final int BOTTOM = 2;
  private static final int RIGHT = 18;
  private static final int SPACING = 15;
  private static final Dimension RIGID_AREA = new Dimension(SPACING, 0);

  /**
   * Constructor for the middle keyboard view.
   */
  public MiddleKeyboardView() {
    super();
    setBorder(TOP, LEFT, BOTTOM, RIGHT);
    setFixedSize(WIDTH, HEIGHT);
    setLayoutManager();
  }

  /**
   * This method sets the middle keyboard box layout manager.
   */
  @Override
  public void setLayoutManager() {
    getKeyboard().setLayout(new BoxLayout(getKeyboard(), BoxLayout.X_AXIS));
  }

  /**
   * This method adds a custom button to the middle keyboard panel.
   *
   * @param button A custom button object.
   */
  @Override
  public void addButton(CalculatorButton button) {
    getKeyboard().add(button.getButton());
    getKeyboard().add(Box.createRigidArea(RIGID_AREA));
  }
}
