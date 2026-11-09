package week2_collections.Day3;
import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class SortEmployees {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", 50000),
            new Employee(2, "Rahul", 30000),
            new Employee(3, "Priya", 70000),
            new Employee(4, "Neha", 40000)
        );

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(e -> e.salary))
                .collect(Collectors.toList());

        sortedEmployees.forEach(System.out::println);

        System.out.println("Print reversed sorted employee by salary");
        //Reversed
        List<Employee> reversedsortedEmployees = employees.stream()
        .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
        .collect(Collectors.toList());
        reversedsortedEmployees.forEach(System.out::println);


    }
}