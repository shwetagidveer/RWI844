// File: BuiltInFunctionalInterfaceExample.java

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using Consumer
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello, Consumer!");

        // Using Function
        Function<Integer, String> function = i -> "The number is " + i;
        System.out.println(function.apply(5));

        // Using Predicate
        Predicate<Integer> predicate = i -> i > 10;
        System.out.println("Is 15 greater than 10? " + predicate.test(15));

        // Using Supplier
        Supplier<String> supplier = () -> "Hello from Supplier!";
        System.out.println(supplier.get());
    }
}

//O/p: Hello, Consumer!
// The number is 5
// Is 15 greater than 10? true
// Hello from Supplier!
