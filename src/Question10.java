import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question10 {


    public static void main(String[] args) {


        //find out all the numbers starting with 1 , using stream function

        List<Integer> numbers = Arrays.asList(123, 456, 101, 789, 120, 132, 204);

        numbers.stream().map(i-> String.valueOf(i)).filter(i->  i.startsWith("1")).mapToInt(i -> Integer.valueOf(i)).forEach(i-> System.out.println(i));
    }
}
