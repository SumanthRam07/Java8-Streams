import java.util.*;

public class Question29 {

    //synchronized collection

    public static void main(String[] args) {

        List<String> list = Arrays.asList("sumanth" , "rohit" , "manoj" , "bhanu" , "jashwanth" , "harsha") ;


        Collection<String> synchro = Collections.synchronizedCollection( new ArrayList<>(list)) ;

    }
}
