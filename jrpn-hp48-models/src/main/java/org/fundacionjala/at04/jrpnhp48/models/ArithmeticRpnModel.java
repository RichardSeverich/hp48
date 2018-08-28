package org.fundacionjala.at04.jrpnhp48.models;

import java.util.LinkedList;

/**
 * Created by JRPNHP48 Team.
 */
public class ArithmeticRpnModel {

  private double num1;
  private double num2;
  private LinkedList<String> copy;

  public ArithmeticRpnModel() {
    copy = new LinkedList();
  }


  /**
   * this method calculate the result when was sent in RPN format.
   *
   * @param rpn string de numbers and operators in RPN format.
   * @return the calculation result.
   */
  public String calculate(String rpn) {
    String[] token = rpn.split(" ");
    double result;
    for (int i = 0; i < token.length; i++) {
      switch (token[i]) {
        case "+":
          changeVariable();
          copy.add((String.valueOf(num2 + num1)));
          break;
        case "-":
          changeVariable();
          copy.add((String.valueOf(num2 - num1)));
          break;
        case "*":
          changeVariable();
          copy.add((String.valueOf(num2 * num1)));
          break;
        case "/":
          changeVariable();
          copy.add((String.valueOf(num2 / num1)));
          break;
        default:
          copy.add(token[i]);
          break;
      }
    }
    return copy.get(0);
  }

  /**
   * this method change the variable format.
   */
  private void changeVariable() {
    num1 = Double.parseDouble(copy.pollLast());
    num2 = Double.parseDouble(copy.pollLast());
  }

}
