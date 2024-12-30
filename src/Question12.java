import java.util.*;
import java.util.stream.Collectors;

public class Question12 {


   // Find the first non-repeating character in a string ?

    public static void main(String[] args) {

        String input = "iindia";


        Map<Character, Long> map = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c-> c, Collectors.counting())) ;


        Optional<Character> firstNonRepeating = input.chars().mapToObj(c -> (char)c).filter(i -> map.get(i) == 1).findFirst();

        System.out.println(firstNonRepeating.get());


    }
}
