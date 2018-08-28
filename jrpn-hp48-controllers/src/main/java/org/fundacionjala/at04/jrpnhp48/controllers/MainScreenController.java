package org.fundacionjala.at04.jrpnhp48.controllers;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.LowerKeyboardController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.MiddleKeyboardController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.SerializeController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.UpperKeyboardController;
import org.fundacionjala.at04.jrpnhp48.views.exitdialog.ExitDialogView;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.lowerkeyboard.LowerKeyboardView;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.middlekeyboard.MiddleKeyboardView;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperkeyboard.UpperKeyboardView;
import org.fundacionjala.at04.jrpnhp48.views.mainframe.MainBackgroundView;
import org.fundacionjala.at04.jrpnhp48.views.mainframe.MainFrameView;
import org.fundacionjala.at04.jrpnhp48.views.screen.ScreenView;

/**
 * Created by JRPNHP48 Team.
 */
public class MainScreenController extends WindowAdapter {
  private ScreenView screenView = new ScreenView();
  private MainFrameView mainFrameView;
  private ExitDialogView exitDialogView;
  private MainBackgroundView mainBackgroundView;
  private LowerKeyboardView lowerKeyboardView;
  private MiddleKeyboardView middleKeyboardView;
  private UpperKeyboardView upperKeyboardView;
  private LowerKeyboardController lowerKeyboardController;
  private MiddleKeyboardController middleKeyboardController;
  private UpperKeyboardController upperKeyboardController;

  /**
   * Constructor of the Main Screen Controller.
   */
  public MainScreenController() {
    mainFrameView = new MainFrameView("RPN HP48 Simulator");
    exitDialogView = new ExitDialogView();
    mainBackgroundView = new MainBackgroundView();
    lowerKeyboardView = new LowerKeyboardView();
    middleKeyboardView = new MiddleKeyboardView();
    upperKeyboardView = new UpperKeyboardView();
    lowerKeyboardController = new LowerKeyboardController();
    middleKeyboardController = new MiddleKeyboardController();
    upperKeyboardController = new UpperKeyboardController();
    initializeComponents();
  }

  /**
   * This method initialize all the components od the main screen.
   */
  private void initializeComponents() {
    lowerKeyboardController.addButtonsToKeyboard(lowerKeyboardView);
    middleKeyboardController.addButtonsToKeyboard(middleKeyboardView);
    upperKeyboardController.addButtonsToKeyboard(upperKeyboardView);
    mainBackgroundView.addScreen(screenView);
    mainBackgroundView.addKeyboard(upperKeyboardView);
    mainBackgroundView.addKeyboard(middleKeyboardView);
    mainBackgroundView.addKeyboard(lowerKeyboardView);
    mainFrameView.addBackground(mainBackgroundView);
    SerializeController.initialScreen();
  }

  /**
   * Method that initializes the Controller tasks.
   */
  public void initiateControl() {
    mainFrameView.getMainFrame().addWindowListener(this);
    mainFrameView.getMainFrame().setVisible(true);
  }

  /**
   * Overrides the Window Closing event.
   *
   * @param e is the window event.
   */
  @Override
  public void windowClosing(WindowEvent e) {
    exitDialogView.generateConfirmation();
    if (exitDialogView.getConfirmation() == JOptionPane.YES_OPTION) {
      SerializeController.serializeStack();
      mainFrameView.getMainFrame().dispose();
    }
  }
}
