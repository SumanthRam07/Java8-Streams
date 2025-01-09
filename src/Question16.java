import java.util.*;
import java.util.stream.Collectors;

public class Question16 {

    //Question - Group the list of String by their length - 76
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "melon", "pear", "plum");

        List<String> freqList = new ArrayList<>() ;

        Map<Integer, List<String>> collect = strings.stream().collect(Collectors.groupingBy(str -> str.length()));

        collect.entrySet().stream().forEach(i-> System.out.println(i));

        // Gropup the list of strings by their  value and characters length
        // ex : apple , 5




        // Group characters in each string and count their occurrences
        Map<String, Map<Character, Long>> result = strings.stream()
                .collect(Collectors.toMap(
                        str -> str, // Key is the string itself
                        str -> str.chars() // Stream of characters
                                .mapToObj(c -> (char) c) // Convert to Character
                                .collect(Collectors.groupingBy( // Group by character
                                        c -> c, // Key is the character itself
                                        Collectors.counting() // Count occurrences
                                ))
                ));

        // Print the result
        result.forEach((key, value) -> {
            System.out.println("String: " + key);
            System.out.println("Character Counts: " + value);
        });






    }
}
