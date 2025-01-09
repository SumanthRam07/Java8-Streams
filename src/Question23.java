import java.util.List;
import java.util.stream.Stream;

public class Question23 {


     // how to create immutable list in java
    public static void main(String[] args) {

        // when you create a stream and then save it as a toList()
        // as a return product , it creates an immutable list
        // null values are also allowed


        // if we use Arrays.asList function to creare a list, it creates a partial  unmodifable list as it alows to replace the exisiting
        // values but does not allow to add new values



        List<String> list = Stream.of("red ", "black ", "blue").toList();



        System.out.println(list);


        // collect method will create mutable list







    }

}
