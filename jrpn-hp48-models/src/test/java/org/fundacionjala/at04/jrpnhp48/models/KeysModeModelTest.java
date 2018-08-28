package org.fundacionjala.at04.jrpnhp48.models;

import static junit.framework.TestCase.assertEquals;

import org.fundacionjala.at04.jrpnhp48.models.KeysModeModel;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */

public class KeysModeModelTest {

  /**
   * This unit test verify the change to the alpha keys mode.
   */
  @Test
  public void testSetAlphaKeysMode_changeKeyModeToAlpha() {
    final String alphaKeyMode = "alpha";
    KeysModeModel.setAlphaKeysMode();
    assertEquals(alphaKeyMode, KeysModeModel.getActualKeysMode());
  }

  /**
   * This unit test verify the change to the normal keys mode.
   */
  @Test
  public void testSetNormalKeysMode_changeKeyModeToNormal() {
    final String normalKeyMode = "normal";
    KeysModeModel.setNormalKeysMode();
    assertEquals(normalKeyMode, KeysModeModel.getActualKeysMode());
  }

  /**
   * This unit test verify the change to the left shift keys mode.
   */
  @Test
  public void testSetLeftShiftKeysMode_changeKeyModeToLeftShift() {
    final String leftShiftKeyMode = "left";
    KeysModeModel.setLeftShiftKeysMode();
    assertEquals(leftShiftKeyMode, KeysModeModel.getActualKeysMode());
  }

  /**
   * This unit test verify the change to the right shift keys mode.
   */
  @Test
  public void testSetRightShiftKeysMode_changeKeyModeToRightShift() {
    final String rightShiftKeyMode = "right";
    KeysModeModel.setRightShiftKeysMode();
    assertEquals(rightShiftKeyMode, KeysModeModel.getActualKeysMode());
  }

  /**
   * This unit test verify the change to the user entry keys mode.
   */
  @Test
  public void testSetEntryKeysMode_changeKeyModeToEntry() {
    final String rightShiftKeyMode = "entry";
    KeysModeModel.setEntryKeysMode();
    assertEquals(rightShiftKeyMode, KeysModeModel.getActualKeysMode());
  }
}
