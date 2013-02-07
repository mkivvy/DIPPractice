package dippractice;
public class DIPPractice {

    public static void main(String[] args) {
        OutputStrategy outStrategy = new GuiOutput();
        MessageService msgService = new MessageService();
        msgService.outputMsg(outStrategy);
    }
}
