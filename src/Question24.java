import java.util.*;
import java.util.stream.Collectors;

public class Question24 {

    // example for the summarizing statics
    // prints the  count , sum , avg , min, max as a single output

    public static void main(String[] args) {
    List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "melon", "pear", "plum") ;

    //custom sorting

        Collections.sort(strings  , (i, j) -> j.length() - i.length()
        );

        System.out.println(strings);

        Map<String , IntSummaryStatistics> result1 = strings.stream()
                .collect(Collectors.toMap(
                        str-> str ,
                        str -> str.chars().mapToObj(c ->c).collect(Collectors.summarizingInt(c -> c.hashCode()))


                ));

        result1.entrySet().stream().forEach( i-> System.out.println(i.getKey() + " count"+ i.getValue()));
    }
}
