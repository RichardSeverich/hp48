package org.fundacionjala.at04.jrpnhp48.views.screen;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

import org.fundacionjala.at04.jrpnhp48.views.screen.menu.MenuView;
import org.fundacionjala.at04.jrpnhp48.views.screen.stack.StackView;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public class ActiveScreenView {
  private static final int WIDTH = 232;
  private static final int HEIGHT = 158;
  private MenuView menuView;
  private JPanel activeScreenPanel;

  /**
   * Constructor for the active screen view.
   */
  public ActiveScreenView() {
    activeScreenPanel = new JPanel();
    menuView = new MenuView();
    setActiveScreenSize();
    setActiveScreenLayout();
    addActiveScreenElements();
  }

  /**
   * This method set the active screen size.
   */
  private void setActiveScreenSize() {
    Dimension screenDimension = new Dimension(WIDTH, HEIGHT);
    activeScreenPanel.setMinimumSize(screenDimension);
    activeScreenPanel.setPreferredSize(screenDimension);
    activeScreenPanel.setMaximumSize(screenDimension);
  }

  /**
   * This method sets the active screen layout.
   */
  private void setActiveScreenLayout() {
    activeScreenPanel.setLayout(new BorderLayout());
  }

  /**
   * This method add screen elements to the active screen.
   */
  private void addActiveScreenElements() {
    activeScreenPanel.add(StatusBarView.getSingleton().getStatusBarPanel(), BorderLayout.NORTH);
    activeScreenPanel.add(StackView.getSingleton().getStackPanel(), BorderLayout.CENTER);
    activeScreenPanel.add(menuView.getMenuPanel(), BorderLayout.SOUTH);
  }

  /**
   * This method return the active screen panel JPanel attribute.
   *
   * @return The active screen JPanel instance.
   */
  public JPanel getActiveScreenPanel() {
    return activeScreenPanel;
  }
}
