import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // cpunt number of occurences of a word in list

        ArrayList<String> list = new ArrayList<>() ;

        list.add("Sumanth") ;
        list.add("rohit") ;

        list.add("Sumanth") ;

        Map<String , Long> map = new HashMap<>() ;


//        list.stream().forEach(i ->
//        {
//
//
//                            {
//                               map.put(i , map.getOrDefault(i , 0)+1 );
//                            }
//
//
//
//
//
//
//        });

        Map<Integer , Long> map1  =  list.stream().collect(Collectors.groupingBy(word->word.length() , Collectors.counting()));

        Map<Integer , Long> map2 = list.stream().collect(Collectors.groupingBy(word-> word.hashCode() , Collectors.counting())) ;




        map2.keySet().stream().forEach(i-> System.out.println(i +" -> " +map1.get(i))) ;



        map1.keySet().stream().forEach(i-> System.out.println(i +" -> " +map1.get(i))) ;










    }
}