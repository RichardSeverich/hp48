package org.fundacionjala.at04.jrpnhp48.views.keyboard;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * Created by JRPNHP48 Team.
 */
public abstract class CalculatorKeyboard {
  private JPanel keyboard;

  /**
   * Constructor for the calculator keyboard abstract class.
   */
  public CalculatorKeyboard() {
    keyboard = new JPanel();
    setOpaqueBackground();
  }

  /**
   * This method sets the opaque background for the custom keyboard panel.
   */
  private void setOpaqueBackground() {
    keyboard.setOpaque(true);
    keyboard.setBackground(new Color(0, 0, 0, 0));
  }

  /**
   * This method sets the opaque background for the custom keyboard panel.
   *
   * @param top    The top border in px.
   * @param left   The left border in px.
   * @param bottom The bottom border in px.
   * @param right  the right border in px.
   */
  protected void setBorder(int top, int left, int bottom, int right) {
    keyboard.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
  }

  /**
   * This method sets the fixed size of the custom keyboard panel.
   *
   * @param with   The with in px.
   * @param height The height in px.
   */
  protected void setFixedSize(int with, int height) {
    keyboard.setMinimumSize(new Dimension(with, height));
    keyboard.setPreferredSize(new Dimension(with, height));
    keyboard.setMaximumSize(new Dimension(with, height));
  }

  /**
   * This method set the layout manager of the custom keyboard panel.
   */
  protected abstract void setLayoutManager();

  /**
   * This method adds a custom button to the custom keyboard panel.
   *
   * @param button A custom button object.
   */
  public abstract void addButton(CalculatorButton button);

  /**
   * This method return the JPanel attribute.
   *
   * @return the custom keyboard panel object.
   */
  public JPanel getKeyboard() {
    return keyboard;
  }
}
