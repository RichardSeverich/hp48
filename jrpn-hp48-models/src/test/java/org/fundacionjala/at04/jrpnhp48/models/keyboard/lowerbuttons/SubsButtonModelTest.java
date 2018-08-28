package org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons;

import static junit.framework.TestCase.assertEquals;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */
public class SubsButtonModelTest {
  SubsButtonModel subtractionButton;
  LinkedList<Double> myList;

  /**
   * This is the method before.
   */
  @Before
  public void before() {
    subtractionButton = new SubsButtonModel();
    myList = new LinkedList<>();
    NumericValuesListModel.getSingleton().getList().clear();
  }

  /**
   * This test is to verify that the subtraction with positive values.
   */
  @Test
  public void test_subtraction_PositiveSubsWithPositiveValues() {
    NumericValuesListModel.getSingleton().getList().add(600.0);
    NumericValuesListModel.getSingleton().getList().add(200.0);
    final Double expectedResult = 400.0;
    SubsButtonModel.subtractionFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the subtraction with negative values.
   */
  @Test
  public void test_subtraction_NegativeSubsWithPositiveValues() {
    NumericValuesListModel.getSingleton().getList().add(-300.0);
    NumericValuesListModel.getSingleton().getList().add(-200.0);
    final Double expectedResult = -100.0;
    SubsButtonModel.subtractionFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * This test is to verify that the subtraction with negative values.
   */
  @Test
  public void test_subtraction_NegativeSubsWithSameValues() {
    NumericValuesListModel.getSingleton().getList().add(200.0);
    NumericValuesListModel.getSingleton().getList().add(200.0);
    final Double expectedResult = 0.0;
    SubsButtonModel.subtractionFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * Test Subtraction method with two short values in stack.
   */
  @Test
  public void test_SubtractionWithTwoShortValuesOnTheStack() {
    myList.add(1.0);
    myList.add(2.0);
    assertEquals(-1.0, subtractionButton.subtraction(myList));
  }

  /**
   * Test Subtraction method with two Negative values in stack.
   */
  @Test
  public void test_SubtractionWithNegativeValuesOnTheStack() {
    myList.add(-1.0);
    myList.add(-2.0);
    assertEquals(1.0, subtractionButton.subtraction(myList));
  }


  /**
   * Test Subtraction method with two big values in stack.
   */
  @Test
  public void test_SubtractionWithTwoBigValuesOnTheStack() {
    myList.add(257689.0);
    myList.add(124568.0);
    assertEquals(133121.0, subtractionButton.subtraction(myList));
  }

  /**
   * Test Subtraction method with two same values in stack.
   */
  @Test
  public void test_SubtractionWithSameValuesOnTheStack() {
    myList.add(12345.0);
    myList.add(12345.0);
    assertEquals(0.0, subtractionButton.subtraction(myList));
  }

}
