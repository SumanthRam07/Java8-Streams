import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question14 {


    //Question : Concatining two arrays and find the distinct elements in the result set


    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3,4, 5} ;
        int[] arr2 = new int[]{5, 6, 7,8, 9} ;

        List<Integer> collect = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().boxed().collect(Collectors.toList()) ;

        collect.stream().forEach(i-> System.out.println(i));

    }


}
