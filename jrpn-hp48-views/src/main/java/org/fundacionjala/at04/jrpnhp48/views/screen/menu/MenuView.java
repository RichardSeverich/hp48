package org.fundacionjala.at04.jrpnhp48.views.screen.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 * Created by JRPNHP48 Team.
 */
public class MenuView {
  private static final int WIDTH = 232;
  private static final int HEIGHT = 20;
  private static final int ROWS_LAYOUT = 1;
  private static final int COLS_LAYOUT = 6;
  private static final int HORIZONTAL_SPACING = 2;
  private static final int BG_RED = 133;
  private static final int BG_GREEN = 168;
  private static final int BG_BLUE = 152;
  private MenuElementView vectorItem;
  private MenuElementView matrixItem;
  private MenuElementView listItem;
  private MenuElementView hypItem;
  private MenuElementView realItem;
  private MenuElementView baseItem;
  private JPanel menuPanel;

  /**
   * Constructor for the main menu view.
   */
  public MenuView() {
    menuPanel = new JPanel();
    vectorItem = new MenuElementView();
    matrixItem = new MenuElementView();
    listItem = new MenuElementView();
    hypItem = new MenuElementView();
    realItem = new MenuElementView();
    baseItem = new MenuElementView();
    Color backgroundColor = new Color(BG_RED, BG_GREEN, BG_BLUE);
    setMenuLayout();
    setMenuSize();
    setMenuBackground(backgroundColor);
    setElementsText();
    addElementsToMenu();
  }

  /**
   * This method set the menu background color.
   */
  private void setMenuBackground(Color background) {
    menuPanel.setBackground(background);
  }

  /**
   * This method sets menu grid layout manager.
   */
  private void setMenuLayout() {
    GridLayout myGridLayout = new GridLayout(ROWS_LAYOUT, COLS_LAYOUT);
    myGridLayout.setHgap(HORIZONTAL_SPACING);
    menuPanel.setLayout(myGridLayout);
  }

  /**
   * This method sets the menu fixed size.
   */
  private void setMenuSize() {
    menuPanel.setMinimumSize(new Dimension(WIDTH, HEIGHT));
    menuPanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    menuPanel.setMaximumSize(new Dimension(WIDTH, HEIGHT));
  }

  /**
   * This method add elements to the menu.
   */
  private void addElementsToMenu() {
    menuPanel.add(vectorItem);
    menuPanel.add(matrixItem);
    menuPanel.add(listItem);
    menuPanel.add(hypItem);
    menuPanel.add(realItem);
    menuPanel.add(baseItem);
  }

  /**
   * This method sets the text of the menu elements views.
   */
  private void setElementsText() {
    vectorItem.setText("VECTR");
    matrixItem.setText("MATR");
    listItem.setText("LIST");
    hypItem.setText("HYP");
    realItem.setText("REAL");
    baseItem.setText("BASE");
  }

  /**
   * This method return the menu JPanel attribute.
   *
   * @return the JPanel instance.
   */
  public JPanel getMenuPanel() {
    return menuPanel;
  }
}
