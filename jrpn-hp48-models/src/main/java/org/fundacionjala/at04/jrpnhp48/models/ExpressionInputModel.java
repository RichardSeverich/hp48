package org.fundacionjala.at04.jrpnhp48.models;

/**
 * Created by JRPNHP48 Team.
 */
public final class ExpressionInputModel {

  private static final ExpressionInputModel mySingleton = new ExpressionInputModel();
  private StringBuilder myStringBuilder;

  /**
   * This method a private constructor.
   */
  private ExpressionInputModel() {
    myStringBuilder = new StringBuilder();
  }

  /**
   * This method return a String Builder.
   *
   * @return StringBuilder.
   */
  public StringBuilder getExpression() {
    return myStringBuilder;
  }

  /**
   * This method return the String Builder length.
   *
   * @return StringBuilder length number.
   */
  public int getStringBuilderLength() {
    return myStringBuilder.length();
  }

  /**
   * This method return a single instance.
   *
   * @return mySingleton.
   */
  public static ExpressionInputModel getSingleton() {
    return mySingleton;
  }
}
