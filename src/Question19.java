import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question19 {

    //Question : Flaten the list of integers into single list of integers

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(

                Arrays.asList(1, 2, 3),

                Arrays.asList(4, 5),

                Arrays.asList(6, 7, 8, 9)

        );

        for (Integer i : listOfLists.stream().flatMap(integers -> integers.stream()).collect(Collectors.toList())) {
            System.out.println(i);

        }


    }
}
