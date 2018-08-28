package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import static junit.framework.TestCase.assertEquals;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.ConvertAngleModel;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */
public class SinButtonModelTest {
  SinButtonModel sinButton;
  ConvertAngleModel convert;
  LinkedList<Double> myList;

  /**
   * This is the method before where it is initialized the list and the object.
   */
  @Before
  public void before() {
    sinButton = new SinButtonModel();
    convert = new ConvertAngleModel();
    myList = new LinkedList<>();
    NumericValuesListModel.getSingleton().getList().clear();
  }


  /**
   * This test is to verify that the sine with positive value.
   */
  @Test
  public void test_firstFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(25.0);
    final Double expectedResult = 0.42261826174069944;
    SinButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the sine with short value.
   */
  @Test
  public void test_firstFunctionWithShortValue() {
    NumericValuesListModel.getSingleton().getList().add(0.4);
    final Double expectedResult = 0.0069812602979615525;
    SinButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * Test Sine method with one angle in the stack on degrees.
   */
  @Test
  public void test_SineWithOneAngleOnDegrees() {
    myList.add(100.0);
    assertEquals(0.984807753012208, sinButton.sin(convert.convertAngle(myList)));
  }

  /**
   * Test Sine method with one angle in the stack on degrees.
   */
  @Test
  public void test_SineWithOneBasicAngleOnDegrees() {
    myList.add(90.0);
    assertEquals(1.0, sinButton.sin(convert.convertAngle(myList)));
  }

  /**
   * This test is to verify that the sine with positive value.
   */
  @Test
  public void test_secondFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(1.0);
    final Double expectedResult = 90.0;
    SinButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * This test is to verify that the sine with short value.
   */
  @Test
  public void test_secondFunctionWithShortValue() {
    NumericValuesListModel.getSingleton().getList().add(0.1);
    final Double expectedResult = 5.739170477266787;
    SinButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * Test arc Sine method with one angle in the stack on degrees.
   */
  @Test
  public void test_AsineWithOneBasicAngleOnDegrees() {
    myList.add(1.0);
    assertEquals(90.0, sinButton.asine(myList));
  }

  /**
   * Test arc Sine method with one angle in the stack on degrees.
   */
  @Test
  public void test_AsineWithOneAngleOnDegrees() {
    myList.add(0.5);
    assertEquals(30.000000000000004, sinButton.asine(myList));
  }
}
