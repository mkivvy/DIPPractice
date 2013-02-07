package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author Mary
 */
public class GuiOutput implements OutputStrategy {
    @Override
    public void outputMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
