package Week10;

import java.util.Scanner;
//  A  =>  80-100
//  B  =>  70-79
//  C  =>  60-69
//  D  =>  50-59
//  E  =>  0-49

public class IfElse_Grade {
    public static void main(String[] args) {
        // รับคะแนนเข้ามาผ่านทางคีย์บอร์ด
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Score : ");
        int score = sc.nextInt();

        
        if (score >= 80) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else if (score >= 50) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        sc.close();
    }
}
