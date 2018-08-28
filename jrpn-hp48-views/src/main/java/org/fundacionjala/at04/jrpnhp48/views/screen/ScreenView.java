package org.fundacionjala.at04.jrpnhp48.views.screen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * Created by JRPNHP48 Team.
 */
public class ScreenView {
  private static final int RED_BG = 0;
  private static final int GREEN_BG = 0;
  private static final int BLUE_BG = 0;
  private static final int ALPHA_BG = 0;
  private static final int WIDTH = 332;
  private static final int HEIGHT = 216;
  private static final int TOP_BORDER = 50;
  private JPanel calculatorScreenPanel;
  private ActiveScreenView activeScreenPanel;

  /**
   * Constructor for the screen view.
   */
  public ScreenView() {
    calculatorScreenPanel = new JPanel();
    activeScreenPanel = new ActiveScreenView();
    Color backgroundColor = new Color(RED_BG, GREEN_BG, BLUE_BG, ALPHA_BG);
    setScreenBackground(backgroundColor);
    setScreenSize();
    setScreenBorders();
    setScreenLayout();
    addActiveScreen();
  }

  /**
   * This method sets the screen opaque background.
   */
  private void setScreenBackground(Color background) {
    calculatorScreenPanel.setOpaque(true);
    calculatorScreenPanel.setBackground(background);
  }

  /**
   * This method sets the screen panel fixed size.
   */
  private void setScreenSize() {
    Dimension screenDimension = new Dimension(WIDTH, HEIGHT);
    calculatorScreenPanel.setMinimumSize(screenDimension);
    calculatorScreenPanel.setPreferredSize(screenDimension);
    calculatorScreenPanel.setMaximumSize(screenDimension);
  }

  /**
   * This method sets the screen fices borders.
   */
  private void setScreenBorders() {
    calculatorScreenPanel.setBorder(BorderFactory.createEmptyBorder(TOP_BORDER, 0, 0, 0));
  }

  /**
   * This method sets a null Layout to the screen panel.
   */
  private void setScreenLayout() {
    calculatorScreenPanel.setLayout(new GridBagLayout());
  }

  /**
   * This method return the main calculator screen JPanel attribute.
   *
   * @return The mainScreen JPanel instance.
   */
  public JPanel getScreenPanel() {
    return calculatorScreenPanel;
  }

  /**
   * This method add the active screen to the main screen calculator panel.
   */
  private void addActiveScreen() {
    calculatorScreenPanel.add(activeScreenPanel.getActiveScreenPanel(), new GridBagConstraints());
  }
}
