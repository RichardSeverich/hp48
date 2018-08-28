package org.fundacionjala.at04.jrpnhp48.views.screen.statusbar;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import org.fundacionjala.at04.jrpnhp48.views.screen.separator.SeparatorView;

/**
 * Created by JRPNHP48 Team.
 */
public final class StatusBarView {
  private static final StatusBarView statusBarView = new StatusBarView();
  private static final int WIDTH = 232;
  private static final int HEIGHT = 36;
  private static final int RED_BG = 133;
  private static final int GREEN_BG = 168;
  private static final int BLUE_BG = 152;
  private StatusBarElementView upperStatusRow;
  private StatusBarElementView lowerStatusRow;
  private SeparatorView separatorView;
  private Color backgroundColor;
  private JPanel statusBarPanel;

  /**
   * Constructor of the status bar view class.
   */
  private StatusBarView() {
    statusBarPanel = new JPanel();
    upperStatusRow = new StatusBarElementView();
    lowerStatusRow = new StatusBarElementView();
    separatorView = new SeparatorView();
    backgroundColor = new Color(RED_BG, GREEN_BG, BLUE_BG);
    initializeStatusBar();
  }

  /**
   * This method initializes the status bar.
   */
  private void initializeStatusBar() {
    setStatusBarSize();
    setStatusBarBackground();
    setStatusBarLayout();
    clearUpperStatusText();
    setLowerStatusText();
    addStatusBarElements();
  }

  /**
   * This method sets the status bar fixed size.
   */
  private void setStatusBarSize() {
    statusBarPanel.setMinimumSize(new Dimension(WIDTH, HEIGHT));
    statusBarPanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    statusBarPanel.setMaximumSize(new Dimension(WIDTH, HEIGHT));
  }

  /**
   * This method sets the status bar opaque color background.
   */
  private void setStatusBarBackground() {
    statusBarPanel.setOpaque(true);
    statusBarPanel.setBackground(backgroundColor);
  }

  /**
   * This method sets the status bar box layout manager.
   */
  private void setStatusBarLayout() {
    BoxLayout myLayout = new BoxLayout(statusBarPanel, BoxLayout.Y_AXIS);
    statusBarPanel.setLayout(myLayout);
  }

  /**
   * This method clear the upper status bar element text content.
   */
  public void clearUpperStatusText() {
    upperStatusRow.setStatusElementText(" ");
  }

  /**
   * This method sets the lower status bar element text content.
   */
  private void setLowerStatusText() {
    lowerStatusRow.setStatusElementText("{ HOME }");
  }

  /**
   * This method sets the upper status bar element text content.
   */
  public void setUpperStatusText(String message) {
    upperStatusRow.setStatusElementText(message);
  }

  /**
   * This method add the status bar elements to the status bar.
   */
  private void addStatusBarElements() {
    statusBarPanel.add(upperStatusRow);
    statusBarPanel.add(lowerStatusRow);
    statusBarPanel.add(separatorView);
  }

  /**
   * This method return the status bar JPanel attribute.
   *
   * @return the JPanel instance.
   */
  public JPanel getStatusBarPanel() {
    return statusBarPanel;
  }

  /**
   * This method return the singleton status bar instance.
   *
   * @return the status bar instance.
   */
  public static StatusBarView getSingleton() {
    return statusBarView;
  }
}
