package Week05;

import java.util.Scanner;
public class InputTutorial {
    public static void main(String[] args) {

// ประกาศใช้งาน Class | new
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine(); //รับค่า String จากแป้นพิมพ์ เก็บไว้ที่ตัวแปร name
        System.out.print("ป้อนปีเกิด พ.ศ. : ");
        int year = sc.nextInt(); //รับค่า Integer จากแป้นพิมพ์ เก็บไว้ที่ตัวแปร year

        int age = 2564-year; //คำนวณอายุ

        System.out.println("Your name = "+name);
        System.out.println("ปี พ.ศ. ที่เกิด = "+year);
        System.out.println("อายุ = "+age);
    }
}

