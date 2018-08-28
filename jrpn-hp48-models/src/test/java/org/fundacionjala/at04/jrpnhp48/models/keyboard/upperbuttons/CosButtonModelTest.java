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
public class CosButtonModelTest {
  CosButtonModel cosButton;
  ConvertAngleModel convert;
  LinkedList<Double> myList;

  /**
   * This is the method before where it is initialized the list and the object.
   */
  @Before
  public void before() {
    cosButton = new CosButtonModel();
    convert = new ConvertAngleModel();
    myList = new LinkedList<>();
    NumericValuesListModel.getSingleton().getList().clear();
  }

  /**
   * This test is to verify that the cosine with positive value.
   */
  @Test
  public void test_firstFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(25.0);
    final Double expectedResult = 0.9063077870366499;
    CosButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the cosine with short value.
   */
  @Test
  public void test_firstFunctionWithShortValue() {
    NumericValuesListModel.getSingleton().getList().add(1.0);
    final Double expectedResult = 0.9998476951563913;
    CosButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * Test cosine method with one basic angle in the stack on degrees.
   */
  @Test
  public void test_CosineWithOneBasicAngleOnDegrees() {
    myList.add(0.5);
    assertEquals(0.9999619230641713, cosButton.cos(convert.convertAngle(myList)));
  }

  /**
   * Test cosine method with one angle in the stack on degrees.
   */
  @Test
  public void test_CosineWithOneAngleOnDegrees() {
    myList.add(10.0);
    assertEquals(0.984807753012208, cosButton.cos(convert.convertAngle(myList)));
  }


  /**
   * This test is to verify that the arc cosine with positive value.
   */
  @Test
  public void test_secondFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(1.0);
    final Double expectedResult = 0.0;
    CosButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * This test is to verify that the arc cosine with short value.
   */
  @Test
  public void test_secondFunctionWithShortValue() {
    NumericValuesListModel.getSingleton().getList().add(0.01);
    final Double expectedResult = 89.42703265514285;
    CosButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * Test arc cosine method with one basic angle in the stack on degrees.
   */
  @Test
  public void test_AcosineWithOneBasicAngleOnDegrees() {
    myList.add(1.0);
    assertEquals(0.0, cosButton.acosine(myList));
  }

  /**
   * Test arc cosine method with one angle in the stack on degrees.
   */
  @Test
  public void test_AcosineWithOneAngleOnDegrees() {
    myList.add(0.2);
    assertEquals(78.46304096718453, cosButton.acosine(myList));
  }
}
