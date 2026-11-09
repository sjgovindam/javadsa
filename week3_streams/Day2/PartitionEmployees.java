package week3_streams.Day2;

package week3_streams.Day2;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class PartitionEmployees {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Rahul", "IT", 50000),
            new Employee("Amit", "HR", 75000),
            new Employee("Priya", "IT", 90000),
            new Employee("Neha", "HR", 65000),
            new Employee("Raj", "Finance", 40000)
        );

        Map<Boolean, List<Employee>> result =
                employees.stream()
                    .collect(Collectors.partitioningBy(
                        e -> e.salary > 60000
                    ));

        System.out.println("Salary > 60000:");
        result.get(true).forEach(System.out::println);

        System.out.println("\nSalary <= 60000:");
        result.get(false).forEach(System.out::println);
    }
}
