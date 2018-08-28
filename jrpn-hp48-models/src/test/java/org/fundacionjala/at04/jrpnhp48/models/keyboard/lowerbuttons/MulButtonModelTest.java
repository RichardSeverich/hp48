package org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons;

import static junit.framework.TestCase.assertEquals;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by JRPNHP48 Team.
 */
public class MulButtonModelTest {
  MulButtonModel multiplicationButton;
  LinkedList<Double> myList;


  /**
   * This is the method before.
   */
  @Before
  public void before() {
    multiplicationButton = new MulButtonModel();
    myList = new LinkedList<>();
    NumericValuesListModel.getSingleton().getList().clear();
  }

  /**
   * This test is to verify that the Multiplication with positive values.
   */
  @Test
  public void test_multiplicationFunction_PositiveMultiplicationWithPositiveValues() {
    NumericValuesListModel.getSingleton().getList().add(300.0);
    NumericValuesListModel.getSingleton().getList().add(2.0);
    final Double expectedResult = 600.0;
    MulButtonModel.multiplicationFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the Multiplication with negative values.
   */
  @Test
  public void test_multiplicationFunction_PositiveMultiplicationWithNegativesValues() {
    NumericValuesListModel.getSingleton().getList().add(-100.0);
    NumericValuesListModel.getSingleton().getList().add(-8.0);
    final Double expectedResult = 800.0;
    MulButtonModel.multiplicationFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the Multiplication with one zero value.
   */
  @Test
  public void test_multiplicationFunction_MultiplicationWithOneZerValue() {
    NumericValuesListModel.getSingleton().getList().add(123400.0);
    NumericValuesListModel.getSingleton().getList().add(0.0);
    final Double expectedResult = 0.0;
    MulButtonModel.multiplicationFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * Test Multiplication method with two basic values in stack.
   */
  @Test
  public void test_MultiplicationWithTwoBasicValuesOnTheStack() {
    myList.add(1.0);
    myList.add(2.0);
    assertEquals(2.0, multiplicationButton.multiplication(myList));
  }

  /**
   * Test Multiplication method with two Big values in stack.
   */
  @Test
  public void test_MultiplicationWithTwoBigValuesOnTheStack() {
    myList.add(1234.0);
    myList.add(2232.0);
    assertEquals(2754288.0, multiplicationButton.multiplication(myList));
  }


  /**
   * Test Multiplication method with two same values in stack.
   */
  @Test
  public void test_MultiplicationWithTwoSameValuesOnTheStack() {
    myList.add(100.0);
    myList.add(100.0);
    assertEquals(10000.0, multiplicationButton.multiplication(myList));
  }

  /**
   * Test Multiplication method with one zero value and other number in stack.
   */
  @Test
  public void test_MultiplicationWithOneZeroValueAndOtherNumberOnTheStack() {
    myList.add(1234.0);
    myList.add(0.0);
    assertEquals(0.0, multiplicationButton.multiplication(myList));
  }
}
