package week3_streams.Day2;

import java.util.*;

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

public class HighestSalary {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Rahul", 50000),
            new Employee("Amit", 75000),
            new Employee("Priya", 90000),
            new Employee("Neha", 65000)
        );

        Employee highest = employees.stream()
                .max(Comparator.comparingDouble(e -> e.salary))
                .orElseThrow();

        System.out.println("Highest Salary: " + highest);
    }
}