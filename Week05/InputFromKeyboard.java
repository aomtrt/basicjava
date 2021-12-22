package Week05;
import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
 
        System.out.print("Enter your name : ");
        String name = kb.next();
        System.out.println("Hello "+ name);
        kb.close();
    }

}
