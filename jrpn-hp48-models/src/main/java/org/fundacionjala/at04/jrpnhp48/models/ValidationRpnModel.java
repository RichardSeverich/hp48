package org.fundacionjala.at04.jrpnhp48.models;

/**
 * Created by JRPNHP48 Team.
 */
public class ValidationRpnModel {


  private int contDigit = -1;
  private int contOperator = 0;

  /**
   * this method verify that RPN format is correct.
   *
   * @param rpn received operation in format rpn.
   * @return isValidRpnExpression true or false.
   */
  public boolean isValidRpnExpression(String rpn) {
    for (String token : rpn.split(" ")) {
      if (isNumeric(token)) {
        contDigit++;
      } else if (isValidOperator(token)) {
        contOperator++;
        if (contOperator > contDigit) {
          return false;
        }
      } else {
        return false;
      }
    }
    return contOperator == contDigit;
  }

  /**
   * @param string of element of the rpn.
   * @return true if content a operator.
   */
  private static boolean isValidOperator(String string) {
    return string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/");
  }

  /**
   * this method verify that a number is digit.
   * @param string for evaluate.
   * @return true if content a number.
   */
  private static boolean isNumeric(String string) {
    try {
      Integer.parseInt(string);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
