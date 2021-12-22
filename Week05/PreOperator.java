package Week05;

public class PreOperator {
    public static void main(String[] args) 
    {
        int x = 5;
        int y = 4;

        System.out.println("a before calculate is "+x);
        System.out.println("b before calculate is "+y);

        int z = x + ++y;    

        System.out.println("Result is "+z);
        System.out.println("a after calculate is "+x);
        System.out.println("b after calculate is "+y);

    }
 
}
