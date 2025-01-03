import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question20 {

     // new Questoion : Splitting Strings into Words
     //Suppose you have a list of sentences, and you want a list of all words.
    public static void main(String[] args) {

        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "FlatMap is useful"
        );

   List<String> result =      sentences.stream().flatMap(str -> Arrays.stream(str.split(" "))).collect(Collectors.toList()) ;

   result.stream().forEach(i -> System.out.println(i));


    }
}
