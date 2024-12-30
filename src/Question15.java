import java.util.Map;
import java.util.stream.Collectors;

public class Question15 {

    public static void main(String[] args) {


        //Question : Program to find the frequency of the characters - 75

        String input = "aaabbccc" ;

       Map<Character , Long>resultMap =  input.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i , Collectors.counting()));

        resultMap.entrySet().stream().forEach(i-> System.out.println( i ));


    }
}
