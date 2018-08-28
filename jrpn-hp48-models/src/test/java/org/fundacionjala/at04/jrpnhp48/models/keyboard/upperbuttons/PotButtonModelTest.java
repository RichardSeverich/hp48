package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import static junit.framework.TestCase.assertEquals;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */
public class PotButtonModelTest {
  PotButtonModel potButton;
  LinkedList<Double> myList;

  /**
   * This is the method before where it is initialized the list and the object.
   */
  @Before
  public void before() {
    potButton = new PotButtonModel();
    myList = new LinkedList<>();
    NumericValuesListModel.getSingleton().getList().clear();
  }

  /**
   * This test is to verify that the pow with positive value.
   */
  @Test
  public void test_firstFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(10.0);
    NumericValuesListModel.getSingleton().getList().add(5.0);
    final Double expectedResult = 100000.0;
    PotButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the pow with short value.
   */
  @Test
  public void test_firstFunctionWithShortValue() {
    NumericValuesListModel.getSingleton().getList().add(2.0);
    NumericValuesListModel.getSingleton().getList().add(10.0);
    final Double expectedResult = 1024.0;
    PotButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * this test calculate Pot.
   */
  @Test
  public void test_PowBasic() {
    myList.add(2.0);
    myList.add(2.0);
    assertEquals(4.0, potButton.pow(myList));
  }

  /**
   * Test Potency method with two values on the stack.
   */
  @Test
  public void test_Pow() {
    myList.add(35.0);
    myList.add(5.0);
    assertEquals(52521875.0, potButton.pow(myList));
  }

  /**
   * This test is to verify that the ten pow X with short value.
   */
  @Test
  public void test_secondFunctionWithShortValue() {
    NumericValuesListModel.getSingleton().getList().add(2.0);
    final Double expectedResult = 100.0;
    PotButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the ten pow X with positive value.
   */
  @Test
  public void test_secondFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(7.0);
    final Double expectedResult = 1.0E7;
    PotButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * Test ten pow x method with two values on the stack.
   */
  @Test
  public void test_TenPowtBasic() {
    myList.add(2.0);
    assertEquals(100.0, potButton.tenPow(myList));
  }

  /**
   * Test ten pow x method with two values on the stack.
   */
  @Test
  public void test_TenPow() {
    myList.add(11.0);
    assertEquals(100000000000.0, potButton.tenPow(myList));
  }

  /**
   * This test is to verify that the logarithm with positive value.
   */
  @Test
  public void test_thirdFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(12.0);
    final Double expectedResult = 1.0791812460476249;
    PotButtonModel.thirdFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the logarithm with positive value.
   */
  @Test
  public void test_thirdFunctionWithBigValue() {
    NumericValuesListModel.getSingleton().getList().add(60.0);
    final Double expectedResult = 1.7781512503836436;
    PotButtonModel.thirdFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * Test logarithm method with one value on the stack.
   */
  @Test
  public void test_LogBasic() {
    myList.add(10.0);
    assertEquals(1.0, potButton.log(myList));
  }


  /**
   * Test logarithm method with two values on the stack.
   */
  @Test
  public void test_Log() {
    myList.add(45.0);
    assertEquals(1.6532125137753437, potButton.log(myList));
  }

}
