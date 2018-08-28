package org.fundacionjala.at04.jrpnhp48.models;

/**
 * Created by JRPNHP48 Team.
 */
public final class KeysModeModel {
  private static String ACTUAL_MODE = "normal";
  public static final String ALPHA_MODE = "alpha";
  public static final String NORMAL_MODE = "normal";
  public static final String RIGHT_SHIFT_MODE = "right";
  public static final String LEFT_SHIFT_MODE = "left";
  public static final String ENTRY_MODE = "entry";

  /**
   * This method sets the alpha key mode for the keyboard events.
   */
  public static void setAlphaKeysMode() {
    ACTUAL_MODE = ALPHA_MODE;
  }

  /**
   * This method sets the normal key mode for the keyboard events.
   */
  public static void setNormalKeysMode() {
    ACTUAL_MODE = NORMAL_MODE;
  }

  /**
   * This method sets the left shift key mode for the keyboard events.
   */
  public static void setLeftShiftKeysMode() {
    ACTUAL_MODE = LEFT_SHIFT_MODE;
  }

  /**
   * This method sets the right shift key mode for the keyboard events.
   */
  public static void setRightShiftKeysMode() {
    ACTUAL_MODE = RIGHT_SHIFT_MODE;
  }

  /**
   * This method sets the right shift key mode for the keyboard events.
   */
  public static void setEntryKeysMode() {
    ACTUAL_MODE = ENTRY_MODE;
  }

  /**
   * This method return the actual key mode identifier.
   *
   * @return The actual mode object.
   */
  public static String getActualKeysMode() {
    return ACTUAL_MODE;
  }
}
