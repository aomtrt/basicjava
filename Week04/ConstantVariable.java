package Week04;

public class ConstantVariable {
    public static void main(String[] args) {
        // ตัวแปรแบบไม่มีการเปลี่ยนแปลงค่าจะต้องมีการกำหนดค่าเริ่มต้นไว้เสมอ
        final int NUM1 = 10; // ค่าเริ่มต้น = 10
        final int NUM2 = 20; // ค่าเริ่มต้น = 20

        // ทดลองกำหนดค่าใหม่ให้กับตัวแปรเดิม
        // NUM2=100;

        System.out.println("ค่าตัวแปรที่ 1 = " + NUM1); // แสดงผล num1
        System.out.println("ค่าตัวแปรที่ 2 = " + NUM2); // แสดงผล num2

        // หรือจะนิยามก่อน แล้วค่อยกำหนดค่าภายหลังก็ได้
        // final int NUM1; // นิยามตัวแปร
        // final int NUM2; // นิยามตัวแปร
        // NUM1 = 10; // ค่าเริ่มต้น = 10
        // NUM2 = 20; // ค่าเริ่มต้น = 20
    }

}
