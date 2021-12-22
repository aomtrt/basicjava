package Week05;
import java.util.Scanner;

public class InputFromKeyboard2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your ID : ");
        long id = kb.nextLong();
        kb.nextLine();
        System.out.print("Enter your name and surname : ");
        String name = kb.nextLine();
        System.out.print("Enter your address : ");
        String addr = kb.nextLine();
        System.out.print("Enter your age : ");
        int age = kb.nextInt();   
        System.out.print("Enter your GPA : ");
        double gpa = kb.nextDouble();
        System.out.println(id+" "+name+" "+age+" "+gpa+" "+addr);
        kb.close();

    }

}
