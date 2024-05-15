import java.util.Arrays;
import java.util.List;


public class MethodRefEx{
    public static void main(String[] args) {

        List<String> names = Arrays.asList("sai","rakesh","daksh"," man");

                       names.stream()    
                            .map(String::toUpperCase)   
                            .forEach(System.out::println);
                            

                


    }
}