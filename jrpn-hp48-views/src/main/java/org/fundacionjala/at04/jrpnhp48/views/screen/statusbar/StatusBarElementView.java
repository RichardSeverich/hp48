package org.fundacionjala.at04.jrpnhp48.views.screen.statusbar;

import java.awt.Font;
import javax.swing.JLabel;

/**
 * Created by JRPNHP48 Team.
 */
public class StatusBarElementView extends JLabel {
  private static final int WIDTH = 232;
  private static final int HEIGHT = 16;
  private static final int FONT_SIZE = 12;

  /**
   * Constructor of the status bar element view.
   */
  public StatusBarElementView() {
    setStatusBarElementFont();
    setStatusElementSize();
  }

  /**
   * This method sets the status bar element font family.
   */
  private void setStatusBarElementFont() {
    this.setFont(new Font(Font.MONOSPACED, Font.PLAIN, FONT_SIZE));
  }

  /**
   * This method sets the status bar element fixed size.
   */
  private void setStatusElementSize() {
    this.setSize(WIDTH, HEIGHT);
  }

  /**
   * This method sets the status bar element text content.
   *
   * @param content The string parameter for the text content.
   */
  public void setStatusElementText(String content) {
    this.setText(content);
  }
}
