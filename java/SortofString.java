import java.util.*;

public class SortofString {
    public static void main(String a[]){

        Comparator<String> com = ( i, j) ->  i.length() > j.length()?1:-1;
        List<String> obj = new ArrayList<>();
        obj.add("sai");
        obj.add("Rakesh");
        obj.add("manideep");
        obj.add("roja");
        System.out.println(obj);
        Collections.sort(obj, com);
        System.out.println(obj);

    }
}
