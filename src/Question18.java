import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question18 {

    //Question -Convert a list of strings where key is the String and the value is the length - 79

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

     Map<String ,Integer >map =  strings.stream().collect(Collectors.toMap(i-> i , i-> i.length())) ;

     map.entrySet().stream().forEach(i-> System.out.println(i));

    }
}
