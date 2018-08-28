package org.fundacionjala.at04.jrpnhp48.views.mainframe;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Created by JRPNHP48 Team.
 */
public class MainFrameView {
  private JFrame mainFrame;
  private static final int FRAME_WIDTH = 332;
  private static final int FRAME_HEIGHT = 720;


  /**
   * Constructor for the main frame.
   *
   * @param title Window title.
   */
  public MainFrameView(String title) {
    mainFrame = new JFrame(title);
    setFixedSize();
    setMainFrameLocation();
    mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
  }

  /**
   * This method sets the main frame size.
   */
  public void setFixedSize() {
    mainFrame.setResizable(false);
    mainFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }

  /**
   * This method sets the main frame location at the center of the screen.
   */
  private void setMainFrameLocation() {
    mainFrame.setLocationRelativeTo(null);
  }

  /**
   * This method add the main background to the main frame.
   */
  public void addBackground(MainBackgroundView mainBackground) {
    mainFrame.add(mainBackground.getMainBackground());
  }

  /**
   * This method return the main frame attribute.
   *
   * @return The main frame JFrame instance.
   */
  public JFrame getMainFrame() {
    return mainFrame;
  }
}
