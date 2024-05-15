import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;


public class Streambasics {
    public static void main(String[] args) {

        List<Integer> obj = Arrays.asList(1,5,3,6,4,9,0);

         Stream <Integer> s = obj.stream(); //  creation of stream
         s.sorted().forEach(n->System.out.println(n)); // sorted elements
       
      //  System.out.println(s.count());  // it gives us the size of the stream

     // obj.stream().sorted().filter(n -> n%2==1).map(n -> n*2).forEach(n -> System.out.println(n)); //  we can write in single line.

    obj.stream()  //stream creation
    .sorted()     //sorted method sort the values and returns a stream
    .filter(n -> n%2==1) //filter method filter the values by the condition  and returns a stream
    .map(n -> n*2)  //map method   the values by the condition  and returns a stream
    .forEach(n -> System.out.println(n));

//int num =obj.stream().sorted().filter(n -> n%2==1).map(n -> n*2).reduce(0,(c,e)-> c+e);

    }

}