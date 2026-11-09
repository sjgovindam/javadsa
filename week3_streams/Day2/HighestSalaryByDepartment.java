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

public class HighestSalaryByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Rahul", "IT", 50000),
            new Employee("Amit", "HR", 75000),
            new Employee("Priya", "IT", 90000),
            new Employee("Neha", "HR", 65000),
            new Employee("Raj", "Finance", 80000),
            new Employee("John", "Finance", 95000)
        );

        Map<String, Optional<Employee>> result =
                employees.stream()
                    .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.maxBy(
                            Comparator.comparingDouble(e -> e.salary)
                        )
                    ));

        result.forEach((department, employee) ->
            System.out.println(department + " : " + employee.get())
        );
    }
}
