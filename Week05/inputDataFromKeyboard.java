package Week05;
import java.util.Scanner;
public class inputDataFromKeyboard {
    public static void main(String[] args) {
//    nextByte 
//    nextShort    
//    nextInt   
//    nextLong   
//    nextFloat  
//    nextDouble
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนรหัสนักศึกษา : ");
        String id = kb.nextLine();
        System.out.print("กรุณาป้อนอายุ : ");
        short age = kb.nextShort();    


        System.out.println("รหัสที่ป้อน คือ "+id); 
        System.out.println("อายุที่ป้อน คือ "+age);
        
    }
}
