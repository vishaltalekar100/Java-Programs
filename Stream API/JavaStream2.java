import java.util.function.Consumer;
import java.util.stream.Stream;

public class JavaStream2 {
    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        integerStream.forEach(consumer);
        // New line
        System.out.println();

        // Optimized - 1
        Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                .forEach(i -> System.out.println(i));
        // New line
        System.out.println();

        // Optimized - 2
        Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                .forEach(System.out::println);
        // New line
        System.out.println();

        // Optimization for JavaStream1 - 1 (Non-short-circuit operation consumes infinite stream)
        Stream.generate(() -> "Hello Stream!")
                .limit(10)
                .forEach(System.out::println);
    }
}
