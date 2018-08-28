package org.fundacionjala.at04.jrpnhp48.controllers.keyboard;

import org.fundacionjala.at04.jrpnhp48.models.SerializeModel;

/**
 * Created by JRPNHP48 Team.
 */
public class SerializeController {

  private static final String PATH_LIST_STACK = "resources/serializedStack/listStack.dat";

  /**
   * This method shows initial Screen.
   */
  public static void initialScreen() {
    deserializeStack();
    UpdateStackController.updateStackAfterAdding();
  }

  /**
   * This method deserialize the stack.
   */
  public static void deserializeStack() {
    SerializeModel.deSerializeStack(PATH_LIST_STACK);
  }

  /**
   * This method serialize the stack.
   */
  public static void serializeStack() {
    SerializeModel.serializeStack(PATH_LIST_STACK);
  }
}
