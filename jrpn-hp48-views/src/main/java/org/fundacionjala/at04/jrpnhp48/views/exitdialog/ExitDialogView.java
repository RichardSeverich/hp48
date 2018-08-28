package org.fundacionjala.at04.jrpnhp48.views.exitdialog;

import javax.swing.JOptionPane;

/**
 * Created by JRPNHP48 Team.
 */
public class ExitDialogView {
  private static final String MESSAGE_ON_CLOSE = "Are you sure you want to exit?";
  private static final String TITLE_ON_CLOSE = "Exit JRPN HP48 Simulator";
  private int confirmation;

  /**
   * This method return the confirmation numeric value.
   *
   * @return The confirmation numeric value.
   */
  public int getConfirmation() {
    return confirmation;
  }

  /**
   * This method generate a JOptionPane confirm dialog.
   */
  public void generateConfirmation() {
    confirmation = JOptionPane.showConfirmDialog(null,
            MESSAGE_ON_CLOSE, TITLE_ON_CLOSE, JOptionPane.YES_NO_OPTION);
  }
}
