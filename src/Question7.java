import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question7 {


    public static void main(String[] args) {


       // question -  find the number of even or odd numbers

        List<Integer> numbers = Arrays.asList(1, 2, 2, 4, 5, 6, 7, 8, 9, 10);




        Map<String , Long> map1 =   numbers.stream().collect(Collectors.groupingBy(i -> (i % 2 == 0)? "Even" : "ODD" , Collectors.counting())) ;


  Long number =    numbers.stream().collect(Collectors.groupingBy(i-> i , Collectors.counting())).entrySet().stream().filter(i-> i.getValue() >1).count() ;


        List<Integer> number1 = numbers.stream().distinct().collect(Collectors.toList());


       number1.stream().forEach(i-> System.out.print(i));

        System.out.println();
//
//     Map<String , Long> map1=  numbers.stream().collect(Collectors.groupingBy(i -> (i % 2 == 0) ? "Even" : "Odd",  Collectors.counting()) );
//
//        map1.keySet().stream().forEach(k -> System.out.println(k + " ->" + map1.get(k))) ;


        // question2 - remove duplicates

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 4);

      // Long number =  numbers1.stream().collect(Collectors.groupingBy(i-> i , Collectors.counting())).entrySet().stream().filter(i->i.getValue()>1).count() ;

        System.out.println(number);







    }


}
