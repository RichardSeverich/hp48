package org.fundacionjala.at04.jrpnhp48.models;

import static junit.framework.TestCase.assertEquals;

import java.util.LinkedList;

import org.fundacionjala.at04.jrpnhp48.models.keyboard.upperbuttons.CosButtonModel;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by JRPNHP48 Team.
 */
public class ConvertAngleModelTest {
  ConvertAngleModel convert;
  LinkedList<Double> myList;

  /**
   * This is the method before where it is initialized the list and the object.
   */
  @Before
  public void before() {
    convert = new ConvertAngleModel();
    myList = new LinkedList<>();
  }


  /**
   * convert angle degrees to radians.
   */
  @Test
  public void test_ConvertAngle() {
    myList.add(0.5);
    assertEquals(0.008726646259971648, convert.convertAngle(myList));
  }

  /**
   * convert angle degrees to radians.
   */
  @Test
  public void test_ConvertAngle2() {
    myList.add(12.0);
    assertEquals(0.20943951023931953, convert.convertAngle(myList));
  }

  /**
   * convert angle to degrees.
   */
  @Test
  public void test_ConvertToDegress() {
    myList.add(12.0);
    assertEquals(0.20943951023931953, convert.convertDegreesToRadians(myList.getLast()));
  }

  /**
   * convert angle to degrees.
   */
  @Test
  public void test_ConvertToDegress2() {
    myList.add(1.0);
    assertEquals(0.017453292519943295, convert.convertDegreesToRadians(myList.getLast()));
  }
}
