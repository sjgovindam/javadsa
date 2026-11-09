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

public class EmployeesAboveSalary {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Rahul", 50000),
            new Employee("Amit", 75000),
            new Employee("Priya", 90000),
            new Employee("Neha", 65000)
        );

        double X = 60000;

        List<Employee> result = employees.stream()
                .filter(e -> e.salary > X)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
