package org.fundacionjala.at04.jrpnhp48.models;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */
public class AlgorithmRpnModelTest {
  AlgorithmRpnModel algorithm;

  /**
   * this unit test is before.
   */
  @Before
  public void before() {
    algorithm = new AlgorithmRpnModel();
  }

  /**
   * this unit test is basic Test Without Parenthesis.
   */
  @Test
  public void basicTestWithoutParenthesis() {
    assertEquals(" 5 7 + ", algorithm.convertToRpn(" 5 + 7 "));
  }

  /**
   * this unit test basic Test With Parenthesis.
   */
  @Test
  public void basicTestWithParenthesis() {
    assertEquals("5 7 + 2 * ", algorithm.convertToRpn("( 5 + 7 ) * 2"));
  }

  /**
   * this unit test complex Test Without Parenthesis.
   */
  @Test
  public void complexTestWithoutParenthesis() {
    assertEquals("5 7 2 4 / * 2 - + ", algorithm.convertToRpn("5 + 7 * 2 / 4 - 2 "));
  }

  /**
   * this unit test complex Test With Parenthesis.
   */
  @Test
  public void complexTestWithParenthesis() {
    assertEquals("5 7 + 2 4 / 2 - * ", algorithm.convertToRpn("( 5 + 7 ) * ( 2 / 4 - 2 )"));
  }

  /**
   * this unit test With Parenthesis Joined.
   */
  @Test
  public void testWithParenthesisJoin() {
    assertEquals("5 7 + 2 * 2 - ", algorithm.convertToRpn("( ( 5 + 7 ) * 2 ) - 2"));
  }
}
