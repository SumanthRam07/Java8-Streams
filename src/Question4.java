import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Question4 {


    public static void main(String[] args) {
        //Question4 : How to convert String to Date Object in Java 8?

        String date = "12-10-2024" ;


        //Java 8 introduced the java.time package, which provides
        // modern date and time APIs for parsing and formatting.
        // You can use DateTimeFormatter to parse a String into a LocalDate, LocalDateTime, or any other date/time object.


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy" , Locale.ENGLISH) ;

        LocalDate localDate  = LocalDate.parse(date , dateTimeFormatter) ;

        System.out.println(localDate.format(dateTimeFormatter));

        System.out.println(localDate.format(dateTimeFormatter));


        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MM-dd-yyyy" , Locale.ENGLISH) ;


        LocalDate localDate1 = LocalDate.parse(date , dateTimeFormatter1) ;

        System.out.println(localDate1.format(dateTimeFormatter));


    }
}
