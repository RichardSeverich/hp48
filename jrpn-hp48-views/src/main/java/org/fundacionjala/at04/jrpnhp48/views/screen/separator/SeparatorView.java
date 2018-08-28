package org.fundacionjala.at04.jrpnhp48.views.screen.separator;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;


/**
 * Created by JRPNHP48 Team.
 */
public class SeparatorView extends JLabel {
  private static final int WIDTH = 232;
  private static final int HEIGHT = 1;

  /**
   * Constructor for the separator view class.
   */
  public SeparatorView() {
    setSeparatorSize();
    setSeparatorBackgroundColor();
  }

  /**
   * This method sets the separator fixed size.
   */
  private void setSeparatorSize() {
    Dimension fixedSize = new Dimension(WIDTH, HEIGHT);
    this.setMinimumSize(fixedSize);
    this.setPreferredSize(fixedSize);
    this.setMaximumSize(fixedSize);
  }

  /**
   * This method sets the separator opaque color background.
   */
  private void setSeparatorBackgroundColor() {
    this.setOpaque(true);
    this.setBackground(Color.BLACK);
  }
}
