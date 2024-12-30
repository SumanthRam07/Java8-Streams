import java.util.stream.Collectors;

public class Question9 {

    //Find specil Character in a given String

    public static void main(String[] args) {


        String input = "Hello, World! 123 #Java$Stream";

        String output = input.chars().filter(c -> !Character.isLetterOrDigit(c)).mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());

        System.out.println(output);

    }
}