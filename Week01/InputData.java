package Week01;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter name = ");
        String name = sc.nextLine();

        System.out.println("===> "+name);
    }
}
