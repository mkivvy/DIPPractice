package MessageService;

/**
 *
 * @author Mary
 */
public class MessageService {
    private String msg = "Hello";
    
    public void setMsg (InputStrategy in) {
        msg = in.getMsg();
//        System.out.println("DEBUG: " + msg);
    }
    
    public void outputMsg(OutputStrategy out) {
        out.outputMsg(msg);
//        
//        System.out.println(MSG); //detail - depend instead on abstraction
        //sout makes this rigid
        //fragile - replacing sout w/JOptionPane may break something
        //not portable - tied into console
    }
}
