package org.fundacionjala.at04.jrpnhp48.views.screen.stack;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * Created by JRPNHP48 Team.
 */
public final class StackView {
  private static final StackView stackView = new StackView();
  private static final int WIDTH = 232;
  private static final int HEIGHT = 112;
  private static final int FIVE = 5;
  private static final int FOUR = 4;
  private static final int RED_BG = 133;
  private static final int GREEN_BG = 168;
  private static final int BLUE_BG = 152;

  private StackElementView rowOne;
  private StackElementView rowTwo;
  private StackElementView rowThree;
  private StackElementView rowFour;
  private StackElementView rowFive;
  private List<StackElementView> numericStackElements;
  private Color backgroundColor;
  private JPanel stackPanel;

  /**
   * Constructor of the stack view.
   */
  private StackView() {
    rowOne = new StackElementView();
    rowTwo = new StackElementView();
    rowThree = new StackElementView();
    rowFour = new StackElementView();
    rowFive = new StackElementView();
    numericStackElements = new ArrayList<>();
    stackPanel = new JPanel();
    backgroundColor = new Color(RED_BG, GREEN_BG, BLUE_BG);
    initializeNumericStack();
  }

  /**
   * This method initializes the stack.
   */
  private void initializeNumericStack() {
    setNumericStackSize();
    setNumericStackBackground(backgroundColor);
    setNumericStackLayout();
    addStackElementsToCollection();
    addHeadStackElements(FIVE);
    addElementsToStack();
  }

  /**
   * This method sets the stack fixed size.
   */
  private void setNumericStackSize() {
    stackPanel.setMinimumSize(new Dimension(WIDTH, HEIGHT));
    stackPanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    stackPanel.setMaximumSize(new Dimension(WIDTH, HEIGHT));
  }

  /**
   * This method sets the stack color opaque background.
   */
  private void setNumericStackBackground(Color background) {
    stackPanel.setOpaque(true);
    stackPanel.setBackground(background);
  }

  /**
   * This method sets the stack box layout manager.
   */
  private void setNumericStackLayout() {
    BoxLayout myLayout = new BoxLayout(stackPanel, BoxLayout.Y_AXIS);
    stackPanel.setLayout(myLayout);
  }

  /**
   * This method add stack elements to stack.
   */
  private void addElementsToStack() {
    for (StackElementView itemStackElementView : numericStackElements) {
      stackPanel.add(itemStackElementView);
    }
  }

  /**
   * This method add stack elements to the collection.
   */
  private void addStackElementsToCollection() {
    numericStackElements.add(rowOne);
    numericStackElements.add(rowTwo);
    numericStackElements.add(rowThree);
    numericStackElements.add(rowFour);
    numericStackElements.add(rowFive);
  }

  /**
   * This method sets the tail of the stack elements.
   */
  public void addStackLinkedListElements(LinkedList<Double> myLinkedList) {
    deleteStackElements();
    addHeadStackElements(FIVE);
    addTailStackElements(myLinkedList);
  }

  /**
   * This method sets the head of the stack elements.
   *
   * @param value This is the head limit value.
   */
  private void addHeadStackElements(int value) {
    for (int i = 0; i < value; i++) {
      numericStackElements.get(i).initializeRow();
      numericStackElements.get(i).setStackElementHead(value - i);
      numericStackElements.get(i).setStackElementText();
    }
  }

  /**
   * This method sets the tail of the stack elements.
   *
   * @param myLinkedList contains elements of stack.
   */
  private void addTailStackElements(LinkedList<Double> myLinkedList) {
    int size = myLinkedList.size();
    int ind = size - 1;
    for (int i = 0; i < FIVE && i < size; i++) {
      numericStackElements.get(FOUR - i).setStackElementTail(myLinkedList.get(ind));
      numericStackElements.get(FOUR - i).setStackElementText();
      ind--;
    }
  }

  /**
   * This method deletes stack elements.
   */
  public void deleteStackElements() {
    for (int i = 0; i < FIVE; i++) {
      numericStackElements.get(i).initializeRow();
      numericStackElements.get(i).setStackElementText();
    }
  }

  /**
   * This method sets the head of the stack while adding element.
   *
   * @param myStringBuilder Is the element that use for add to stack.
   * @param myListDouble    contains the elements of the list.
   */
  public void addStackElementsWhile(StringBuilder myStringBuilder,
                                    LinkedList<Double> myListDouble) {
    deleteStackElements();
    addHeadStackElements(FOUR);
    addTailStackElementsCopyList(myListDouble);
    numericStackElements.get(FOUR).initializeRow();
    numericStackElements.get(FOUR).setStackElementHead(myStringBuilder);
    numericStackElements.get(FOUR).setStackElementText();

  }

  /**
   * @param myListDouble contains the elements of the list.
   */
  private void addTailStackElementsCopyList(LinkedList<Double> myListDouble) {
    LinkedList<Double> myListDoubleCopy = new LinkedList<>(myListDouble);
    myListDoubleCopy.add(0.0);
    addTailStackElements(myListDoubleCopy);
  }

  /**
   * This method return the stack JPanel attribute.
   *
   * @return the JPanel instance.
   */
  public JPanel getStackPanel() {
    return stackPanel;
  }

  /**
   * This method return the singleton stack view.
   *
   * @return the stack view instance.
   */
  public static StackView getSingleton() {
    return stackView;
  }
}
