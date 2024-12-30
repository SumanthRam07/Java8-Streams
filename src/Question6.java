import QuestionClasses.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Question6 {


    public static void main(String[] args) {

// Question - How many male and female employees are their in the organization

        List<Employee> employees = Arrays.asList(

                new Employee(1, "John Doe", 30, "Male", 50000),

                new Employee(2, "Jane Smith", 25, "Female", 20000),

                new Employee(3, "Mike Johnson", 40, "Male", 70000),

                new Employee(4, "Emily Davis", 35, "Female", 30000),

                new Employee(5, "Robert Brown", 50, "Male", 90000)

        );

     Map<String , Long> map1 =    employees.stream().collect(Collectors.groupingBy(employee -> employee.getGender()  , Collectors.counting() )) ;

     map1.keySet().stream().forEach(key-> System.out.println(key + " -> " + map1.get(key) ));

        Map<String , Double> map2 =    employees.stream().collect(Collectors.groupingBy(employee -> employee.getGender()  , Collectors.averagingDouble(Employee::getSalary
                ) )) ;

        map1.keySet().stream().forEach(key-> System.out.println(key + " -> " + map1.get(key) ));

        map2.keySet().stream().forEach(key-> System.out.println(key + " -> " + map2.get(key) ));

    }


}