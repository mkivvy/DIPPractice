package MessageService;

/**
 *
 * @author Mary
 */
public class ConsoleOutput implements OutputStrategy {
    @Override
    public void outputMsg(String msg) {
        System.out.println(msg);
    }
}
