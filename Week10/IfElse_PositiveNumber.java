package Week10;

public class IfElse_PositiveNumber {
    // ต้องการหาว่าตัวเลขที่รับเช้ามาเป็นจำนวนเต็มบวก หรือ ลบ หรือ ศูนย์

    public static void main(String[] args) {
        // รับค่าตัวเลขที่จะเอาเปรียบเทียบ
        int number = -10;
        String result ="";

        if (number > 0) {
            result = number+" เป็นจำนวนเต็มบวก";
            // System.out.println(number+" เป็นจำนวนเต็มบวก");  
        } else if(number<0){
            result = number+" เป็นจำนวนเต็มลบ";
            // System.out.println(number+" เป็นจำนวนเต็มลบ");  
        } else{
            result = number+" เป็นจำนวนเต็มศูนย์";
            // System.out.println(number+" เป็นจำนวนเต็มศูนย์");  
        }
        System.out.println(result);
    }
}
