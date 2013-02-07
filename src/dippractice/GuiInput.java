package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author Mary
 */
public class GuiInput implements InputStrategy {

    @Override
    public String getMsg() {
        String msg = JOptionPane.showInputDialog("What message do you want to send? ");
        return (msg);
    }

}
