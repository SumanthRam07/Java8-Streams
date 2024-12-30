import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting ;

public class Question8 {


    public static void main(String[] args) {

        //Question8  - Remove all occurences of a character in a given string


        String str = "java interview";

        char ch = 'a';





      String result1 =  str.chars().mapToObj(c-> String.valueOf((char)c)).collect(Collectors.joining()); ;

        System.out.println(result1 + "current");



      String result =    str.chars().filter(i ->  i != 'a').mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());

        System.out.println(result);


        String c = String.valueOf('C') ;

        System.out.println(c) ;



    }
}
