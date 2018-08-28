package org.fundacionjala.at04.jrpnhp48.models;

/**
 * Created by JRPNHP48 Team.
 */
public class ExceptionRpnValidation extends Exception {
  /**
   * Constructs a <code>NumberFormatException</code> with no detail message.
   */
  public ExceptionRpnValidation() {
    super();
  }

  /**
   * Constructs a <code>NumberFormatException</code> with the
   * specified detail message.
   *
   * @param s the detail message.
   */
  public ExceptionRpnValidation(String s) {
    super(s);
  }
}
