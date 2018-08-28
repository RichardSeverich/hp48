package org.fundacionjala.at04.jrpnhp48.models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

/**
 * Created by JRPNHP48 Team.
 */
public final class SerializeModel {

  /**
   * This method serialize stack elements.
   */
  public static void serializeStack(String path) {
    try {
      //The file is created.
      FileOutputStream fileOutputStream = new FileOutputStream(path);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      //The objects are written to the file
      objectOutputStream.writeObject(NumericValuesListModel.getSingleton().getList());
      fileOutputStream.close();
      objectOutputStream.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method deserialize stack elements.
   */
  public static void deSerializeStack(String path) {
    try {
      FileInputStream fileInputStream = new FileInputStream(path);
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      NumericValuesListModel.getSingleton().getList()
              .addAll((LinkedList<Double>) objectInputStream.readObject());
      fileInputStream.close();
      objectInputStream.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
