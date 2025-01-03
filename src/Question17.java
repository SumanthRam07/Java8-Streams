import java.util.Arrays;
import java.util.List;

public class Question17 {

    public static void main(String[] args) {

        //Question - Filter the numbers to only include thos greater than 10 and then find their average -78
        List<Integer> numbers = Arrays.asList(5, 10, 25, 20, 29);

      double result =   numbers.stream().filter(i -> i > 10 ).mapToInt(i -> i).average().orElse(0) ;

        System.out.println(result);





    }
}
