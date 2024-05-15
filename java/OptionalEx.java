import java.util.*;

public class OptionalEx {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("sai", "rakesh", "lakshmi", "kiran");
 Optional <String> name= names.stream()// optional is a class which can be empty or it can have some values
                                .filter(n->n.contains("x"))
                                .findFirst();
                                    

        System.out.println(name.get()); // get method is to print the values.
        
        // we can also use the following syntax

        // String name= names.stream()  
        //                   .filter(n->n.contains("x"))
        //                   .findFirst() // this method returns optional when it is empty
 //               rElse("Not Found"); //we applying orElse to optional which is returned by findFirst
                                    

        // System.out.println(name.get());
    }
}
