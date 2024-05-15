
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Practice {
    public static void main(String[] args) {
        // int[] a = {1,2,3,4,5,6,7,2,3,4,5,9};
        // List<int[]> list = Arrays.asList(a);
        // Set <int[]> set = Set.copyOf(list);
        // for(int[] b : set){
        //     for(int n : b ){
        //     System.out.println(n);
        //     }
        // }

        // int[] intArray = {1, 2, 3, 4, 5,2,3,4,5};
        // Set<int[]> set = new HashSet<>();

        // for(int[] b : set){
        //     for(int n : b ){
        //     System.out.println(n);
        //     }
        // }

        // System.out.println(set);
       Integer[] a = {1,2,3,4,5,6,7,2,3,4,5,9};
        // List<Integer>list = Arrays.asList(a);
        // Set <Integer> set = Set.copyOf(list);
        // set.stream().sorted().toList().forEach(n->System.out.println(n));
        Set<Integer>s = new HashSet<>(Arrays.asList(a));
        s.forEach(n->System.out.println(n));

    
       

        
    }
}
