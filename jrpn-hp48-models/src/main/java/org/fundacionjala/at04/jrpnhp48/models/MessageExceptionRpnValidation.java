package org.fundacionjala.at04.jrpnhp48.models;

/**
 * Created by JRPNHP48 Team.
 */
public class MessageExceptionRpnValidation {
  /**
   * this method validate expression and if is correct calculate the operation.
   * @param rpn is string with format rpn.
   * @return message of validation
   * @throws ExceptionRpnValidation exception of rpn.
   */
  public String message(String rpn) throws ExceptionRpnValidation {
    ValidationRpnModel validationRpnModel = new ValidationRpnModel();
    if (!validationRpnModel.isValidRpnExpression(rpn)) {
      throw new ExceptionRpnValidation("Not RPN Format");
    } else {
      ArithmeticRpnModel arithmeticRpnModel = new ArithmeticRpnModel();
      return arithmeticRpnModel.calculate(rpn);
    }
  }

}
