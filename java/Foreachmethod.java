import java.util.*;

public class Foreachmethod {
    public static void main(String[] args) {
        
        List<Integer> num = Arrays.asList(1,2,3,4,6);
        //   List<String> num = Arrays.asList("sai", "rakesh" , "sita" , "satya");
       // Consumer con = n -> System.out.println(n)
         // This is happening behind the scenes so we can pass "con" in forEach method but instead of
         // passing con we can pass the "n -> System.out.println(n)"
       

        num.forEach(n -> System.out.println(n)); //foreach method to print number without using loop.
    }
}
