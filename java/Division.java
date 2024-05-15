
import java.util.Scanner;
import java.lang.String;

public class Division{
    public String divideTwoNumbers(int number1, int number2)
    {
         try{
        int result = number1/number2;
          return ("The answer is "+result+". Thanks for using the application.");
     }
     catch(Exception e){
         return "Divison by zero is not possible. Thanks for using the application";
         }
    }
     
    public static void main(String []args){

        Division obj = new Division();
        
      
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.close();
        
        
        
        System.out.println(obj.divideTwoNumbers(number1, number2));

        



     
        
        
    }
}

