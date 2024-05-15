// @FunctionalInterface
// interface A{
//     int show(int is);
// }

// public class Lambdaexp {
//     public static void main(String[] args) {
//         A obj= i->  i;
//         int result = obj.show(2);
//         System.out.println(result);
        
//     }
// }


interface A{
    int show(int is , int js);
}


public class Lambdaexp {
    public static void main(String[] args) {
       
        A obj= (int i, int j )->  i+j;

        // A obj = ( i ,  j) ->{
        //         return i+j;
        //     };
    
        int result = obj.show(2,3);
        System.out.println(result);
        
    }
}
