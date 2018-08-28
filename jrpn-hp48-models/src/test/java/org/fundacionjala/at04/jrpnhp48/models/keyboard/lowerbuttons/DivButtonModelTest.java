package org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons;

import static junit.framework.TestCase.assertEquals;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */
public class DivButtonModelTest {

  DivButtonModel divisionButton;
  LinkedList<Double> myList;

  /**
   * This is the method before.
   */
  @Before
  public void before() {

    divisionButton = new DivButtonModel();
    myList = new LinkedList<>();
    NumericValuesListModel.getSingleton().getList().clear();
  }


  /**
   * This test is to verify that the division with positive values.
   */
  @Test
  public void test_DivisionFunction_PositiveDivisionWithPositiveValues() {
    NumericValuesListModel.getSingleton().getList().add(800.0);
    NumericValuesListModel.getSingleton().getList().add(2.0);
    final Double expectedResult = 400.0;
    DivButtonModel.divisionFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * This test is to verify that the division with negative values.
   */
  @Test
  public void test_DivisionFunction_NegativeDivisionWithNegativeValues() {
    NumericValuesListModel.getSingleton().getList().add(-900.0);
    NumericValuesListModel.getSingleton().getList().add(-300.0);
    final Double expectedResult = 3.0;
    DivButtonModel.divisionFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the division with Zero.
   */
  @Test
  public void test_DivisionFunction_DivisionWithZero() {
    NumericValuesListModel.getSingleton().getList().add(800.0);
    NumericValuesListModel.getSingleton().getList().add(0.0);

    DivButtonModel.divisionFunction();
    assertEquals(2, NumericValuesListModel.getSingleton().getList().size());
  }

  /**
   * This test is to verify that the division with one zero value.
   */
  @Test
  public void test_DivisionFunction_DivisionWithOneZerValue() {
    NumericValuesListModel.getSingleton().getList().add(0.0);
    NumericValuesListModel.getSingleton().getList().add(791340.0);
    final Double expectedResult = 0.0;
    DivButtonModel.divisionFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * Test Division method with two basic values in stack.
   */
  @Test
  public void test_DivisionWithTwoBasicValuesOnTheStack() {
    myList.add(2.0);
    myList.add(4.0);
    assertEquals(0.5, divisionButton.division(myList));
  }

  /**
   * Test Division method with two Negatives values in stack.
   */
  @Test
  public void test_DivisionWithTwoNegativesValuesOnTheStack() {
    myList.add(-2.0);
    myList.add(-4.0);
    assertEquals(0.5, divisionButton.division(myList));
  }


  /**
   * Test Division method with two same values in stack.
   */
  @Test
  public void test_DivisionWithTwoSameValuesOnTheStack() {
    myList.add(1356.0);
    myList.add(1356.0);
    assertEquals(1.0, divisionButton.division(myList));
  }

  /**
   * Test Division method with one zero value and other number on the stack.
   */
  @Test
  public void test_DivisionWithOneZeroValueAndOtherNumberOnTheStack() {
    myList.add(0.0);
    myList.add(123.0);
    assertEquals(0.0, divisionButton.division(myList));
  }

}
