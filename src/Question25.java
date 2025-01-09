import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question25 {


    //partition by example

    // partion by take the predicate and based on the predicate it divides the categories into two groups

    public static void main(String[] args) {


        record Product (String name,
                        String category,
                        int price) {};

        Stream<Product> products = Stream.of(
                new Product("Laptop",
                        "Electronics", 1000),
                new Product("TV",
                        "Electronics", 1500),
                new Product("Sofa",
                        "Furniture", 700),
                new Product("Table",
                        "Furniture", 300),
                new Product("Lamp",
                        "Home Decor", 50)
        );



        var partitionedProducts = products.collect(
                Collectors.partitioningBy(product -> product.price > 1000)
        );
        System.out.println(partitionedProducts);
    }
}
