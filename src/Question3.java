import java.util.Arrays;
import java.util.HashSet;

public class Question3 {

    public static void main(String[] args) {


        // Question How to remove all duplicates from an array of integers in Java using
        //Java 8?


        int[] arr = new int[] {1, 2, 4, 5, 1, 1, 1} ;

        HashSet<Integer> set = new HashSet<>() ;

        Arrays.stream(arr).filter(i-> ! set.contains(i)) .forEach(i->
        {
            set.add(i);
            System.out.println(i) ;
        });


        System.out.println(  Arrays.stream(arr).distinct().count() );





    }

}
