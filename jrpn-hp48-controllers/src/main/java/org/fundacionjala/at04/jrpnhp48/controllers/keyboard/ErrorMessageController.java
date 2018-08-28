package org.fundacionjala.at04.jrpnhp48.controllers.keyboard;

import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.fundacionjala.at04.jrpnhp48.views.screen.statusbar.StatusBarView;

/**
 * Created by JRPNHP48 Team.
 */
public final class ErrorMessageController {

  /**
   * This method manage the error messages in normal keyboard mode..
   */
  public static void checkNormalKeyMode() {
    if (KeysModeModel.getActualKeysMode().equals(KeysModeModel.NORMAL_MODE)) {
      StatusBarView.getSingleton().clearUpperStatusText();
    }
  }
}
