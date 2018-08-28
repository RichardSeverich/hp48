package org.fundacionjala.at04.jrpnhp48.app;

import org.fundacionjala.at04.jrpnhp48.controllers.MainScreenController;

/**
 * Created by JRPNHP48 Team.
 */
public class JRpnHp48Application {

  /**
  * Main application launcher.
  *
  * @param args Arguments.
  */
  public static void main(String... args) {
    MainScreenController mainScreenController = new MainScreenController();
    mainScreenController.initiateControl();
  }
}
