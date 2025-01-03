import java.util.Optional;

public class Question21 {

    public static void main(String[] args) {


                Optional<String> optionalValue = Optional.of("Hello");

                Optional<Integer> result = optionalValue
                        .flatMap(value -> Optional.of(value.length()));

                System.out.println(result); // Output: Optional[5]
            }
        }


