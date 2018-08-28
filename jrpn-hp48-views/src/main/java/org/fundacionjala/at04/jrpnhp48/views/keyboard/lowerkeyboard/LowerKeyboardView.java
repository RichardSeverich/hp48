package org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerkeyboard;

import java.awt.GridLayout;

import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorKeyboard;

/**
 * Created by JRPNHP48 Team.
 */
public class LowerKeyboardView extends CalculatorKeyboard {
  private static final int TOP = 8;
  private static final int LEFT = 16;
  private static final int BOTTOM = 18;
  private static final int RIGHT = 16;
  private static final int WIDTH = 332;
  private static final int HEIGHT = 220;
  private static final int ROWS = 4;
  private static final int COLS = 5;
  private static final int HORIZONTAL_GAP = 16;
  private static final int VERTICAL_GAP = 22;

  /**
   * Constructor for the lower keyboard view.
   */
  public LowerKeyboardView() {
    super();
    setBorder(TOP, LEFT, BOTTOM, RIGHT);
    setFixedSize(WIDTH, HEIGHT);
    setLayoutManager();
  }

  /**
   * This method sets the lower keyboard grid layout manager.
   */
  @Override
  public void setLayoutManager() {
    GridLayout gridLayout = new GridLayout(ROWS, COLS);
    gridLayout.setHgap(HORIZONTAL_GAP);
    gridLayout.setVgap(VERTICAL_GAP);
    getKeyboard().setLayout(gridLayout);
  }

  /**
   * This method adds a custom button to the lower keyboard panel.
   *
   * @param button A custom button object.
   */
  @Override
  public void addButton(CalculatorButton button) {
    getKeyboard().add(button.getButton());
  }
}
