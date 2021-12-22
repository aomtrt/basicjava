package Week10;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        // Good morning 6 - 11
        // Good Afternoon 12 - 16
        // Good Evening 17 - 20
        // Godd Night 21 - 24

        // รับช่วงเวลาเข้ามา
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time : ");
        int time = sc.nextInt();

        String result = "";
        if (time <= 11) {
            result = "Good Morning";
        } else if (time <= 16) {
            result = "Good Afternoon";
        } else if (time <= 20) {
            result = "Good Evening";
        } else {
            result = "Good Night";
        }
        System.out.println(result);

        // การเขียนโปรแกรมแบบพื้นฐาน โดยใช้ println
        // if (time <= 11) {
        // System.out.println("Good Morning");
        // } else if (time <= 16) {
        // System.out.println("Good Afternoon");
        // } else if (time <= 20) {
        // System.out.println("Good Evening");
        // } else {
        // System.out.println("Good Night");
        // }
        sc.close();
    }
}
