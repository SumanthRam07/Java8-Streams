import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question5 {


    // Question : How to count number of occurences of  each Character a string in java

    public static void main(String[] args) {


        String str = "sumanth";


        Map<Character, Long> characterCount =    str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c->c , Collectors.counting())) ;



        Map<Character, Long> characterCount1 =     str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));


//        Map<Character, Long> characterCount = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
//
//
//        characterCount.keySet().stream().forEach(i-> System.out.println(i + "-> " +characterCount.get(i) ));
//
//
//        String str1 = "example";
//
//        Character[] characters = new Character[str1.length()] ;
//
//        int i = 0 ;
//
//        for( char c : str1.toCharArray())
//        {
//            characters[i] = c ;
//            i++ ;
//
//        }
//
//
//
//        Map<Character, Long> characterCount1  = Arrays.asList(characters).stream().collect(Collectors.groupingBy(c ->c , Collectors.counting())) ;
//
//
//
//
//
//    }


    }

}
