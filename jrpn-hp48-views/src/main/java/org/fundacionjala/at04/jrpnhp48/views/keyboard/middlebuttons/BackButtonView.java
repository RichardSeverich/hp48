package org.fundacionjala.at04.jrpnhp48.views.keyboard.middlebuttons;

import java.awt.Dimension;

import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;

/**
 * Created by JRPNHP48 Team.
 */
public class BackButtonView extends CalculatorButton {

  private static final String IMAGE_PATH = "middle/BACK_Button.png";
  private static final int WIDTH = 36;
  private static final int HEIGHT = 24;

  /**
   * Constructor for the back button view.
   */
  public BackButtonView() {
    super();
    setImageIcon(IMAGE_PATH);
    setFixedSize();
  }

  /**
   * This method sets the custom button fixed size.
   */
  private void setFixedSize() {
    Dimension buttonSize = new Dimension(WIDTH, HEIGHT);
    getButton().setMinimumSize(buttonSize);
    getButton().setMaximumSize(buttonSize);
    getButton().setPreferredSize(buttonSize);
  }
}
