
import java.util.stream.Stream;

public class Fibanocci {
    public static void main(String[] args) {
        int a=1,b=1,c;
        for (int i = 0; i < 30; i++) {
            System.out.print(a+" ");
            c =a +b ;
            a = b;
            b = c;
            
       }      
       
       //fibanocci using stream
            Stream.iterate(new int[]{0,1},n->new int []{
                n[1],
                n[0]+n[1]})
                .limit(10)
                .map(n->n[0])
                .forEach(n->System.out.println(n));



           
            
      
    }
}
