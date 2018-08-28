package org.fundacionjala.at04.jrpnhp48.models.keyboard.lowerbuttons;

import static junit.framework.TestCase.assertEquals;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by JRPNHP48 Team.
 */
public class SumButtonModelTest {
  SumButtonModel sumButton;
  LinkedList<Double> myList;


  /**
   * this is the method before.
   */
  @Before
  public void before() {
    sumButton = new SumButtonModel();
    myList = new LinkedList<>();
    NumericValuesListModel.getSingleton().getList().clear();
  }


  /**
   * This test is to verify that the sum with positive values.
   */
  @Test
  public void test_sumFunctionPositiveSumWithPositiveValues() {
    NumericValuesListModel.getSingleton().getList().add(300.0);
    NumericValuesListModel.getSingleton().getList().add(200.0);
    final Double expectedResult = 500.0;
    SumButtonModel.sumFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the sum with negative numbers.
   */
  @Test
  public void test_sumFunction_NegativeSumWithNegativeValues() {
    NumericValuesListModel.getSingleton().getList().add(-300.0);
    NumericValuesListModel.getSingleton().getList().add(-600.0);
    final Double expectedResult = -900.0;
    SumButtonModel.sumFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the sum with negative numbers.
   */
  @Test
  public void test_sumFunction_NegativeSumWithSameValues() {
    NumericValuesListModel.getSingleton().getList().add(300.0);
    NumericValuesListModel.getSingleton().getList().add(300.0);
    final Double expectedResult = 600.0;
    SumButtonModel.sumFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * Test Sum method with two basic values in stack.
   */
  @Test
  public void test_SumWithTwoBasicValuesOnTheStack() {
    myList.add(100.0);
    myList.add(0.0);
    assertEquals(100.0, sumButton.sum(myList));
  }

  /**
   * Test Sum method  two Big values in stack.
   */
  @Test
  public void test_SumWithTwoBigValuesOnTheStack() {
    myList.add(2234.0);
    myList.add(1243.0);
    assertEquals(3477.0, sumButton.sum(myList));
  }

  /**
   * Test Sum method  with two short values in stack.
   */
  @Test
  public void test_SumWithTwoShortValuesOnTheStack() {
    myList.add(2.0);
    myList.add(1.0);
    assertEquals(3.0, sumButton.sum(myList));
  }

  /**
   * Test Sum method with two same values in stack.
   */
  @Test
  public void test_SumWithTwoSameValuesOnTheStack() {
    myList.add(1234.0);
    myList.add(1234.0);
    assertEquals(2468.0, sumButton.sum(myList));
  }

}
