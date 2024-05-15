import java.util.Scanner;
class Calculator{
        public int add(int n1, int n2){
            System.out.print("The added result is : ");
            return n1+n2;
        }
    }

public class understandingclass{
@SuppressWarnings("resource")
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
     int num1 = sc.nextInt();
     System.out.println("Enter the second number");
    int num2 = sc.nextInt();
    Calculator calc = new Calculator();
   
    System.out.println(calc.add(num1,num2));
    }
}
