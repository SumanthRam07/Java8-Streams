import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question26 {

    //binarySearch using the collections framework

    //steps
       // alwasy sort the list in the asceding natural order

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


        List<Product> productList = products.collect(Collectors.toList());



        productList.sort(Comparator.comparing(product -> product.name())) ;


        System.out.println(productList) ;

      int index =   Collections.binarySearch(productList , new Product("Laptop" ,"Electronics" , 1000 ) , Comparator.comparing(product -> product.name) ) ;

        System.out.println(index) ;

    }
}
