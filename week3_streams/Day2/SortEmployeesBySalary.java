package week3_streams.Day2;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class SortEmployeesBySalary {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Rahul", 50000),
            new Employee("Amit", 75000),
            new Employee("Priya", 90000),
            new Employee("Neha", 65000)
        );

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingDouble(e -> e.salary))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);

        List<Employee> sorteddesc = employees.stream()
        .sorted(Comparator.comparingDouble(
            (Employee e) -> e.salary
        ).reversed())
        .collect(Collectors.toList());

        System.out.println("Descending");

        sorteddesc.forEach(System.out::println);

    }
}
