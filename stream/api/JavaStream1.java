package stream.api;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class JavaStream1 {
    public static void main(String[] args) {

        Supplier<String> supplier = new Supplier<>() {
            @Override
            public String get() {
                return "Hello Stream!";
            }
        };

        // Supplier<String> supplier = () -> "Hello Stream!";

        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        // Consumer<String> consumer = s -> System.out.println(s);

        // Consumer<String> consumer = System.out::println;

        Stream<String> streamOfStrings = Stream.generate(supplier);

        streamOfStrings.forEach(consumer);
    }
}
