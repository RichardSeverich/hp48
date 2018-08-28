package org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons;

import static junit.framework.TestCase.assertEquals;

import java.util.LinkedList;
import org.fundacionjala.at04.jrpnhp48.models.NumericValuesListModel;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JRPNHP48 Team.
 */
public class InvButtonModelTest {
  InvButtonModel invButton;
  LinkedList<Double> myList;

  /**
   * This is the method before where it is initialized the list and the object.
   */
  @Before
  public void before() {
    invButton = new InvButtonModel();
    myList = new LinkedList<>();
    NumericValuesListModel.getSingleton().getList().clear();
  }

  /**
   * This test is to verify that the inverse with positive value.
   */
  @Test
  public void test_firstFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(10.0);
    final Double expectedResult = 0.1;
    InvButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * This test is to verify that the inverse with basic value.
   */
  @Test
  public void test_firstFunctionWithBasicValue() {
    NumericValuesListModel.getSingleton().getList().add(2.0);
    final Double expectedResult = 0.5;
    InvButtonModel.firstFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }

  /**
   * Test inverse method with one value on the stack.
   */
  @Test
  public void test_Inverse() {
    myList.add(2.0);
    assertEquals(0.5, invButton.inverse(myList));
  }

  /**
   * Test inverse method with one basic value on the stack.
   */
  @Test
  public void test_InverseBasic() {
    myList.add(25.0);
    assertEquals(0.04, invButton.inverse(myList));
  }

  /**
   * This test is to verify that the exponent pow X with basic value.
   */
  @Test
  public void test_secondFunctionWithBasicValue() {
    NumericValuesListModel.getSingleton().getList().add(2.0);
    final Double expectedResult = 7.3890560989306495;
    InvButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * This test is to verify that the exponent pow X with short value.
   */
  @Test
  public void test_secondFunctionWithShortValue() {
    NumericValuesListModel.getSingleton().getList().add(2.0);
    final Double expectedResult = 7.3890560989306495;
    InvButtonModel.secondFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * Test E pow x method with one value on the stack.
   */
  @Test
  public void test_Epow() {
    myList.add(2.0);
    assertEquals(7.3890560989306495, invButton.exponentialPow(myList));
  }

  /**
   * Test E pow x method with one basic value on the stack.
   */
  @Test
  public void test_EpowBasic() {
    myList.add(12.0);
    assertEquals(162754.79141900383, invButton.exponentialPow(myList));
  }

  /**
   * This test is to verify that the ln with short value.
   */
  @Test
  public void test_thirdFunctionWithShortValue() {
    NumericValuesListModel.getSingleton().getList().add(2.0);
    final Double expectedResult = 0.6931471805599453;
    InvButtonModel.thirdFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * This test is to verify that the ln with positive value.
   */
  @Test
  public void test_thirdFunctionWithPositiveValue() {
    NumericValuesListModel.getSingleton().getList().add(12.0);
    final Double expectedResult = 2.4849066497880004;
    InvButtonModel.thirdFunction();
    assertEquals(expectedResult, NumericValuesListModel.getSingleton().getList().getLast());
  }


  /**
   * Test ln method with one value on the stack.
   */
  @Test
  public void test_Ln() {
    myList.add(36.0);
    assertEquals(3.58351893845611, invButton.ln(myList));
  }

  /**
   * Test ln method with one basic value on the stack.
   */
  @Test
  public void test_LnBasic() {
    myList.add(10.0);
    assertEquals(2.302585092994046, invButton.ln(myList));
  }
}
