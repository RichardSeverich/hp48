package org.fundacionjala.at04.jrpnhp48.views.mainframe;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorKeyboard;
import org.fundacionjala.at04.jrpnhp48.views.screen.ScreenView;

/**
 * Created by JRPNHP48 Team.
 */
public class MainBackgroundView {
  private static final String IMAGE_PATH = "resources/MainScreen.png";
  private static final int WIDTH = 332;
  private static final int HEIGHT = 720;
  private JLabel mainBackground;

  /**
   * Constructor for the main background view.
   */
  public MainBackgroundView() {
    setBackgroundImage();
    setMainBackgroundLayout();
    setMainBackgroundSize(WIDTH, HEIGHT);
  }

  /**
   * This method sets the main background image from a resource file.
   */
  private void setBackgroundImage() {
    try {
      File backgroundImage = new File(IMAGE_PATH);
      mainBackground = new JLabel(new ImageIcon(ImageIO.read(backgroundImage)));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * This method sets the main background size.
   */
  private void setMainBackgroundSize(int width, int height) {
    mainBackground.setMinimumSize(new Dimension(width, height));
    mainBackground.setPreferredSize(new Dimension(width, height));
    mainBackground.setMaximumSize(new Dimension(width, height));
  }

  /**
   * This method sets the main background box layout manager.
   */
  private void setMainBackgroundLayout() {
    BoxLayout boxLayout = new BoxLayout(mainBackground, BoxLayout.Y_AXIS);
    mainBackground.setLayout(boxLayout);
  }

  /**
   * This method add the main components of the calculator to the background.
   */
  public void addKeyboard(CalculatorKeyboard keyboard) {
    mainBackground.add(keyboard.getKeyboard());
  }

  public void addScreen(ScreenView screen) {
    mainBackground.add(screen.getScreenPanel());
  }

  /**
   * This method return the main background JLabel attribute
   *
   * @return The main background JLabel instance.
   */
  public JLabel getMainBackground() {
    return mainBackground;
  }
}
