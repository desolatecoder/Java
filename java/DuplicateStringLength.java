import java.util.HashMap;
import java.util.Map;

public class DuplicateStringLength {
    public static void main(String[] args) {
        String str = "sai rakesh";
        char[] carray = str.toCharArray();
        Map <Character,Integer> a = new HashMap<>();
        System.out.println("The string is:" + str);
        System.out.println("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    count++;
                }
            }
            if (count > 1) {
                a.put(carray[i], count);
                
            }
        }
        for(char key : a.keySet()){
            System.out.println(key +"-"+ a.get(key));
        }
    }
}