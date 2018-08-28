package org.fundacionjala.at04.jrpnhp48.views.keyboard;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Created by JRPNHP48 Team.
 */
public abstract class CalculatorButton {

  private JButton button;
  private static final String basePath = "resources/";

  /**
   * Constructor for the calculator button abstract class.
   */
  public CalculatorButton() {
    button = new JButton();
    setOpaqueBackground();
    disableFocus();
    disableBorderPainted();
    disableContentArea();
  }

  /**
   * This method sets a opaque background to the custom button.
   */
  private void setOpaqueBackground() {
    button.setOpaque(false);
    button.setBackground(new Color(0, 0, 0, 0));
  }

  /**
   * This method disables the focus events of the custom button.
   */
  private void disableFocus() {
    button.setFocusable(false);
    button.setFocusPainted(false);
  }

  /**
   * This method disables the border painted of the custom button.
   */
  private void disableBorderPainted() {
    button.setBorderPainted(false);
  }

  /**
   * This method disables the content area fill of the custom button.
   */
  private void disableContentArea() {
    button.setContentAreaFilled(false);
  }

  /**
   * This method sets a image background to the custom button.
   *
   * @param imageName The image filename path.
   */
  protected void setImageIcon(String imageName) {
    button.setIcon(new ImageIcon(String.format("%s%s", basePath, imageName)));
  }

  /**
   * This method return the JButton attribute.
   *
   * @return The custom button object.
   */
  public JButton getButton() {
    return button;
  }
}
