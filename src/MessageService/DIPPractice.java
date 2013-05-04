package MessageService;
public class DIPPractice {

    public static void main(String[] args) {
        OutputStrategy outStrategy = new GuiOutput();
        InputStrategy inStrategy = new ConsoleInput();
        MessageService msgService = new MessageService();
        msgService.setMsg(inStrategy);
        msgService.outputMsg(outStrategy);
    }
}
