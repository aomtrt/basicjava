package Week04;

public class GlobalLocalVar {
    public static void main(String[] args) {
        // Global Variable
        int a = 100;
        int b = 200;
        System.out.println(a);

        {
            // Local Variable วงจรชีวิตของ ตัวแปร c จะทำงานเฉพาะในบรรทัดที่ 8-13 เท่านั้น
            int c = 300;
            System.out.println(c);
            System.out.println("A = " + a); // เรียกใช้ได้ เพราะวงจรชีวิตของ a อยู่ในช่วงของปีกกาตั้งแต่เปิดถึงปิดอันแรก
        }
        System.out.println(b);
        // System.out.println(c); // หาไม่เจอ เพราะวงจรชีวิตของ c จบตตั้งแต่บันทัดที่ 13
    }

}
