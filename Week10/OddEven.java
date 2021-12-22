package Week10;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        if (number%2==1){
            System.out.println("This number is Odd Number");
        }else{
            System.out.println("This number is Even Number");
        }
        sc.close();
    }
}

