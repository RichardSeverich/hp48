package org.fundacionjala.at04.jrpnhp48.views.screen.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;

/**
 * Created by JRPNHP48 Team.
 */
public class MenuElementView extends JLabel {
  private static final int WIDTH = 36;
  private static final int HEIGHT = 16;
  private static final int BG_RED = 133;
  private static final int BG_GREEN = 168;
  private static final int BG_BLUE = 152;

  /**
   * Constructor for the menu element view.
   */
  public MenuElementView() {
    setupMenuElementFont();
    setMenuElementSize(WIDTH, HEIGHT);
  }

  /**
   * This method setup the font family of the menu element view.
   */
  private void setupMenuElementFont() {
    Color backgroundColor = new Color(BG_RED, BG_GREEN, BG_BLUE);
    this.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
    this.setHorizontalAlignment(CENTER);
    this.setOpaque(true);
    this.setBackground(Color.BLACK);
    this.setForeground(backgroundColor);
  }

  /**
   * This method set size of the menu item view.
   */
  private void setMenuElementSize(int with, int height) {
    this.setMinimumSize(new Dimension(with, height));
    this.setPreferredSize(new Dimension(with, height));
    this.setMaximumSize(new Dimension(with, height));
  }
}
