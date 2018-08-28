package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import static junit.framework.TestCase.assertEquals;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */
public class SqrtButtonModelTest {
  SqrtButtonModel sqrtButton;
  LinkedList<Double> myList;

  /**
   * This is the method before where it is initialized the list and the object.
   */
  @Before
  public void before() {
    sqrtButton = new SqrtButtonModel();
    myList = new LinkedList<>();
    NumericValuesListModel.getSingleton().getList().clear();
  }


  /**
   * This test is to verify that the sqrt with positive value.
   */
  @Test
  public void test_firstFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(225.0);
    final Double expectedResult = 15.0;
    SqrtButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the sqrt with Big value.
   */
  @Test
  public void test_firstFunctionWithBigValue() {
    NumericValuesListModel.getSingleton().getList().add(223432.0);
    final Double expectedResult = 472.68594224918513;
    SqrtButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * Test Sqrt method with one basic value on the stack.
   */
  @Test
  public void test_SqrtBasic() {
    myList.add(25.0);
    assertEquals(5.0, sqrtButton.sqrt(myList));
  }

  /**
   * Test Sqrt method with one value on the stack.
   */
  @Test
  public void test_Sqrt() {
    myList.add(80.0);
    assertEquals(8.94427190999916, sqrtButton.sqrt(myList));
  }

  /**
   * This test is to verify that the pow square with positive value.
   */
  @Test
  public void test_secondFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(40.0);
    final Double expectedResult = 1600.0;
    SqrtButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the pow square with big value.
   */
  @Test
  public void test_secondFunctionWithBigValue() {
    NumericValuesListModel.getSingleton().getList().add(12351.0);
    final Double expectedResult = 1.52547201E8;
    SqrtButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * Test pow square method with one basic value on the stack.
   */
  @Test
  public void test_PowSquareBasic() {
    myList.add(3.0);
    assertEquals(9.0, sqrtButton.powSquare(myList));
  }

  /**
   * Test pow square method with one value on the stack.
   */
  @Test
  public void test_PowSquare() {
    myList.add(15.0);
    assertEquals(225.0, sqrtButton.powSquare(myList));
  }

  /**
   * This test is to verify that the sqrtX with positive value.
   */
  @Test
  public void test_thirdFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(255.0);
    NumericValuesListModel.getSingleton().getList().add(4.0);
    final Double expectedResult = 3.996088014880467;
    SqrtButtonModel.thirdFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * This test is to verify that the sqrtX with short value.
   */
  @Test
  public void test_thirdFunctionWithShortValue() {
    NumericValuesListModel.getSingleton().getList().add(25.0);
    NumericValuesListModel.getSingleton().getList().add(3.0);
    final Double expectedResult = 2.924017738212866;
    SqrtButtonModel.thirdFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * Test sqrt x method with one basic value on the stack.
   */
  @Test
  public void test_SqrtXtWithOneAngleOnDegrees() {
    myList.add(25.0);
    myList.add(3.0);
    assertEquals(2.924017738212866, sqrtButton.sqrtX(myList));
  }

}
