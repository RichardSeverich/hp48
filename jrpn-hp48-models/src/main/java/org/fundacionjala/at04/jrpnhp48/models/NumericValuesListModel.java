package org.fundacionjala.at04.jrpnhp48.models;

import java.util.LinkedList;

/**
 * Created by JRPNHP48 Team.
 */
public final class NumericValuesListModel {
  private static final NumericValuesListModel mySingleton = new NumericValuesListModel();
  private LinkedList<Double> myLinkedList;

  /**
   * This method is a private constructor.
   */
  private NumericValuesListModel() {
    myLinkedList = new LinkedList<>();
  }

  /**
   * This method return LinkedList.
   *
   * @return myLinkedList.
   */
  public LinkedList<Double> getList() {
    return myLinkedList;
  }

  /**
   * This method return a single instance.
   *
   * @return mySingleton.
   */
  public static NumericValuesListModel getSingleton() {
    return mySingleton;
  }
}
