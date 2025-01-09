import java.util.Arrays;
import java.util.stream.Collectors;

public class Question22 {

    //Question : remove all the  duplicates

//    Input: s = "the sky is blue"
//    Output: "blue is sky the"

    // in output there should only be a single space between the words


    public static void main(String[] args) {



        String input = "the sky is blue" ;

   String result =    Arrays.stream(input.split("\\s+")).map(i -> i.trim()).collect(Collectors.toList()).reversed().stream().collect(Collectors.joining(" "));

        System.out.println(result) ;


    }
}
