import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Question28 {


    //replace all your characters with single value



    public static void main(String[] args) {


        List<String> list = Arrays.asList("sumanth" , "rohit" , "manoj" , "bhanu" , "jashwanth" , "harsha") ;


        Collections.fill(list , "one");

        System.out.println(list);



    }
}
