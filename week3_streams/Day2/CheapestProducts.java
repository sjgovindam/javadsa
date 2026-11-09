package week3_streams.Day2;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

public class CheapestProducts {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
            new Product("Laptop", 60000),
            new Product("Mouse", 500),
            new Product("Keyboard", 1500),
            new Product("Monitor", 12000),
            new Product("Headphones", 2000)
        );

        List<Product> cheapest = products.stream()
                .sorted(Comparator.comparingDouble(p -> p.price))
                .limit(3)
                .collect(Collectors.toList());

        cheapest.forEach(System.out::println);
    }
}
