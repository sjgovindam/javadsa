package week2_collections.Day3;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Employee)) return false;

        Employee emp = (Employee) obj;

        return id == emp.id &&
               Objects.equals(name, emp.name) &&
               Double.compare(salary, emp.salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class FindDuplicateObjects {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", 50000),
            new Employee(2, "Rahul", 40000),
            new Employee(1, "Amit", 50000),
            new Employee(3, "Neha", 60000),
            new Employee(2, "Rahul", 40000)
        );

        Set<Employee> seen = new HashSet<>();
        Set<Employee> duplicates = new HashSet<>();

        for (Employee emp : employees) {

            if (!seen.add(emp)) {
                duplicates.add(emp);
            }
        }

        duplicates.forEach(System.out::println);
    }
}
