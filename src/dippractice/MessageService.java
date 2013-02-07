package dippractice;

/**
 *
 * @author Mary
 */
public class MessageService {
    private static final String MSG = "Hello";
     
    
    public void outputMsg(OutputStrategy out) {
        out.outputMsg(MSG);
//        
//        System.out.println(MSG); //detail - depend instead on abstraction
        //sout makes this rigid
        //fragile - replacing sout w/JOptionPane may break something
        //not portable - tied into console
    }
}
