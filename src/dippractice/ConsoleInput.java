package dippractice;

import java.util.Scanner;

public class ConsoleInput implements InputStrategy {
    @Override
    public String getMsg() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a message to send: ");
        
        String newMsg = keyboard.nextLine();
        
        return newMsg;
        
    }
}
