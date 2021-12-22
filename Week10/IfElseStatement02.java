package Week10;

import java.util.Scanner;

public class IfElseStatement02 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนอายุของท่าน : ");
        int age = kb.nextInt();
        if ((age >= 1) && (age <= 14)) {
            System.out.println("วัยเด็ก");
        } else if ((age >= 15) && (age <= 19)) {
            System.out.println("วัยรุ่น");
        } else if ((age >= 20) && (age <= 29)) {
            System.out.println("วัยหนุ่มสาว");
        } else if ((age >= 30) && (age <= 39)) {
            System.out.println("วัยทํางาน");
        } else if ((age >= 40) && (age <= 59)) {
            System.out.println("วัยกลางคน");
        } else if (age >= 60) {
            System.out.println("วัยชรา");
        } else {
            System.out.println("ไม่อยู่ในช่วงอายุที่กำหนด");
        }

        kb.close();
    }
}