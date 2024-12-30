import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {

        // how to filter an array of String by a given prefix using java 8 stream.



        String[] arr = new String[]{ "sumanth" , "rohit" , "Bhanu" , "apple" , null} ;

       //  Arrays.stream(arr).filter(i-> i != null).sorted( (i, j) -> j.length() - i.length() ).forEach(i-> System.out.println(i));

        String prefix = "app";

         Arrays.stream(arr).filter(str-> str != null).filter(str -> str.indexOf("app") == 0).sorted().forEach(str-> System.out.println(str));


         // Arrays.stream(arr).filter(str -> str != null).filter(str-> str.contains("app")).sorted().forEach(str-> System.out.println(str));



    }
}
