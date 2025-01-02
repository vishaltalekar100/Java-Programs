package stream.api;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream4 {
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Method - 1
        for (Integer n : numbers) {
            if (n > 5) {
                System.out.println(n);
            }
        }

        System.out.println();

        // Method - 2 (NOTE: Streams are immutable like Strings)
        Stream<Integer> streamOfIntegers = Arrays.stream(numbers);

        streamOfIntegers.filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer > 5;
                    }
                })
                .forEach(System.out::println);

        // Optimized
        /*streamOfIntegers.filter(integer -> integer > 5)
                .forEach(System.out::println);*/

        System.out.println();

        int[] numbers1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stream<Integer> streamOfIntegers1 = Arrays.stream(numbers1).boxed();
        IntStream streamOfIntegers2 = Arrays.stream(numbers1);

        streamOfIntegers1
                .peek(num -> System.out.println(num))
                .filter(integer -> integer > 5)
                .forEach(num -> System.out.println(num));

        System.out.println();

        streamOfIntegers2
                .peek(System.out::println)
                .filter(integer -> integer > 5)
                .forEach(System.out::println);
    }
}