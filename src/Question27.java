import java.util.*;

public class Question27 {

    //collections.swap
    // interchanges trhe position of the elements int he list

    public static void main(String[] args) {

        List<String> list = Arrays.asList("sumanth" , "rohit" , "manoj" , "bhanu" , "jashwanth" , "harsha") ;

        Collections.swap(list , 0 , 4);

        System.out.println(list);

        // min an max with Collections

        String shortestName = Collections.min(list , (s, q) -> s.length() -q.length()) ;

        String LongestName = Collections.min(list , (s, q) -> q.length() -s.length()) ;

        System.out.println(shortestName) ;

        System.out.println(LongestName);


        // disjoint - check if the two list have no common elements,
        // since we have a common element " sumanth" we are getting the false

        Boolean b  = Collections.disjoint(list , Arrays.asList("sumanth")) ;

        System.out.println(b) ;





    }
}
