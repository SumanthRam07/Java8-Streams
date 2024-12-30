import java.util.TreeSet;

public class Question13 {


    public static  void main(String[] args) {

        String input =  "Mr John Smith " ;
        String Output = "Mr%20John%20Smith" ;

      input =  input.trim() ;

   input =   input.replaceAll("(?i) " , "%20") ;

        System.out.println(input);


       }







    }

