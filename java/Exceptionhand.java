import java.util.*;

public class Exceptionhand {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        int num = sc.nextInt();
        System.out.println("Enter the denominator: ");
        int dem = sc.nextInt();
        sc.close();
       // String s = null;
        try{
            int result = num/dem;
           // System.out.println(s.length()); //trying to print the legth of null string
            System.out.println("the quotient is "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Enter the proper demoninator");
        }
        catch(Exception e){
                System.out.println("something went wrong...");
        }

       

        

    }
}
