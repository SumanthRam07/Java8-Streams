import java.util.List;
import java.util.stream.Collectors;

public class Question11 {

    public static void main(String[] args) {


        //q)  Concatinate the list of strings into a single string:

        List<String> strings = List.of("apple", "banana", "cherry");

      //  strings.stream().collect(Collectors.joining(",")) ;


        String result =   strings.stream().collect(Collectors.joining()) ;


        System.out.println(result);
    }

}
