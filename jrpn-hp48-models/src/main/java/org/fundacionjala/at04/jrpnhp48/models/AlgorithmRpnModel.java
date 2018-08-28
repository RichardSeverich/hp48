package org.fundacionjala.at04.jrpnhp48.models;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by JRPNHP48 Team.
 */

public final class AlgorithmRpnModel {
  private static final StringBuilder output = new StringBuilder();
  private static final Deque<String> stack = new LinkedList<>();

  private enum Operator {
    ADD(1), SUBTRACT(2), MULTIPLY(3), DIVIDE(4);
    final int precedence;

    Operator(int p) {
      precedence = p;
    }
  }

  /**
   * this method is for add the operators to the map.
   */
  private static Map<String, Operator> operators = new HashMap<String, Operator>() {
    {
      put("+", Operator.ADD);
      put("-", Operator.SUBTRACT);
      put("*", Operator.MULTIPLY);
      put("/", Operator.DIVIDE);
    }
  };

  /**
   * this method is for determine the precedence.
   *
   * @param op  the operator.
   * @param sub the reference to the key.
   * @return true or false.
   */
  private static boolean isHigherPrecedence(String op, String sub) {
    return (operators.containsKey(sub) && operators.get(sub)
            .precedence >= operators.get(op).precedence);
  }

  /**
   * this method covert to rpn format.
   *
   * @param expression is the input in other format.
   * @return output in format rpn.
   */
  public static String convertToRpn(String expression) {
    cleanOutputAndStack();
    verityElements(expression);
    sortRpnElements();
    return output.toString();
  }

  /**
   * this method sort RPN elements.
   */
  private static void sortRpnElements() {
    while (!stack.isEmpty()) {
      output.append(stack.pop()).append(' ');
    }
  }

  /**
   * this method verify operators value.
   *
   * @param infix is the expression to change.
   */
  private static void verityElements(String infix) {
    for (String token : infix.split(" ")) {
      if (operators.containsKey(token)) {
        appendHigherPrecToOutput(token);
      } else {
        appendOutputElements(token);
      }
    }
  }

  /**
   * this method compare and add the elements.
   *
   * @param token is a element.
   */
  private static void appendOutputElements(String token) {
    String element = token;
    switch (element) {
      case "(":
        stack.push(token);
        break;
      case ")":
        appendRightParenthesis();
        stack.pop();
        break;
      default:
        output.append(token).append(' ');
        break;
    }
  }

  /**
   * this method compare the right parenthesis.
   */
  private static void appendRightParenthesis() {
    while (!stack.peek().equals("(")) {
      output.append(stack.pop()).append(' ');
    }
  }

  /**
   * this method add the elements with more value.
   *
   * @param token is a element.
   */
  private static void appendHigherPrecToOutput(String token) {
    while (!stack.isEmpty() && isHigherPrecedence(token, stack.peek())) {
      output.append(stack.pop()).append(' ');
    }
    stack.push(token);
  }

  /**
   * this method clean the static elements.
   */
  private static void cleanOutputAndStack() {
    output.setLength(0);
    stack.clear();
  }
}
