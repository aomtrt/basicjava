package Week05;

public class PostOperator {
    public static void main(String[] args) 
    {
        int i = 20;
        int result;

        System.out.println("i before calculate is "+i);

        result = 20*i++;  

        System.out.println("Result is "+result);
        System.out.println("i after calculate is "+i);

    }

}
