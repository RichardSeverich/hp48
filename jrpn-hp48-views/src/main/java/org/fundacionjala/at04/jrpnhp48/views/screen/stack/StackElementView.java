package org.fundacionjala.at04.jrpnhp48.views.screen.stack;

import java.awt.Dimension;
import java.awt.Font;
import java.util.Collections;
import javax.swing.JLabel;

/**
 * Created by JRPNHP48 Team.
 */
public class StackElementView extends JLabel {
  private StringBuilder rowContents;
  private static final int WIDTH = 232;
  private static final int HEIGHT = 20;
  private static final int CAPACITY = 22;
  private static final int LIMIT = 23;
  private static final int SIZE_FONT = 16;
  private static final int ONE = 1;
  private static final int ZERO = 0;

  /**
   * Constructor of the stack element view.
   */
  public StackElementView() {
    initializeRow();
    setStackElementFont();
    setStackElementSize();
  }

  /**
   * This method setup the font family of the stack element view.
   */
  private void setStackElementFont() {
    this.setFont(new Font(Font.MONOSPACED, Font.PLAIN, SIZE_FONT));
  }

  /**
   * This method sets the fixed size to the stack element view.
   */
  private void setStackElementSize() {
    this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
    this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
  }

  /**
   * This method set Text to the stack element view.
   */
  public void setStackElementText() {
    this.setText(rowContents.toString());
  }

  /**
   * This method add an element to the head of the stack element view.
   *
   * @param rowValue Is the value of the stack element in the stack.
   */
  public void setStackElementHead(StringBuilder rowValue) {
    int end = rowValue.length() - ONE;
    rowContents.replace(ZERO, end, String.format("%s", rowValue.toString()));
  }

  /**
   * This method add an element to the head of the stack element view.
   *
   * @param rowValue Is the position of the stack element in the stack.
   */
  public void setStackElementHead(int rowValue) {
    rowContents.replace(ZERO, ONE, String.format("%d:", rowValue));
  }

  /**
   * This method add an element to the tail of the stack element view.
   *
   * @param rowValue Is the numeric value for the stack element.
   */
  public void setStackElementTail(Double rowValue) {
    int intNumber = rowValue.intValue();
    if (rowValue == intNumber) {
      int start = LIMIT - Integer.toString(intNumber).length();
      rowContents.replace(start, LIMIT, Integer.toString(intNumber));
    } else {
      int start = LIMIT - rowValue.toString().length();
      rowContents.replace(start, LIMIT, rowValue.toString());
    }
  }

  /**
   * This method initialize the elements of the row.
   */
  public void initializeRow() {
    rowContents = new StringBuilder(String.join("", Collections.nCopies(CAPACITY, " ")));
  }
}
