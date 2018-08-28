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

public class TanButtonModelTest {
  TanButtonModel tanButton;
  ConvertAngleModel convert;
  LinkedList<Double> myList;

  /**
   * This is the method before where it is initialized the list and the object.
   */
  @Before
  public void before() {
    tanButton = new TanButtonModel();
    convert = new ConvertAngleModel();
    myList = new LinkedList<>();
    NumericValuesListModel.getSingleton().getList().clear();
  }

  /**
   * This test is to verify that the tangent with positive value.
   */
  @Test
  public void test_firstFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(3.0);
    final Double expectedResult = 0.052407779283041196;
    TanButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the tangent with big value.
   */
  @Test
  public void test_firstFunctionWithBigValue() {
    NumericValuesListModel.getSingleton().getList().add(30.0);
    final Double expectedResult = 0.5773502691896257;
    TanButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the tangent with short value.
   */
  @Test
  public void test_firstFunctionWithShortValue() {
    NumericValuesListModel.getSingleton().getList().add(0.01);
    final Double expectedResult = 1.745329269716253E-4;
    TanButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * Test tangent method with one angle in the stack on degrees.
   */

  @Test
  public void test_TangentWithOneAngleOnDegrees() {
    myList.add(10.0);
    assertEquals(0.17632698070846498, tanButton.tan(convert.convertAngle(myList)));
  }

  /**
   * Test tangent method with one basic angle in the stack on degrees.
   */
  @Test
  public void test_TangentWithOneBasicAngleOnDegrees() {
    myList.add(45.0);
    assertEquals(0.9999999999999999, tanButton.tan(convert.convertAngle(myList)));
  }


  /**
   * This test is to verify that the arc tangent with positive value.
   */
  @Test
  public void test_secondFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(0.5);
    final Double expectedResult = 26.56505117707799;
    TanButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the arc tangent with basic value.
   */
  @Test
  public void test_secondFunctionWithBasicValue() {
    NumericValuesListModel.getSingleton().getList().add(1.0);
    final Double expectedResult = 45.0;
    TanButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * Test arc tangent method with one angle in the stack on degrees.
   */
  @Test
  public void test_AtangentWithOneAngleOnDegrees() {
    myList.add(0.5);
    assertEquals(26.56505117707799, tanButton.atangent(myList));
  }

  /**
   * Test arc tangent method  with one basic angle in the stack on degrees.
   */
  @Test
  public void test_AtangentWithOneBasicAngleOnDegrees() {
    myList.add(1.0);
    assertEquals(45.0, tanButton.atangent(myList));
  }
}
