import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question16 {

    //Question - Group the list of String by their length - 76
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "melon", "pear", "plum");

        List<String> freqList = new ArrayList<>() ;

        Map<Integer, List<String>> collect = strings.stream().collect(Collectors.groupingBy(str -> str.length()));

        collect.entrySet().stream().forEach(i-> System.out.println(i));
    }
}
