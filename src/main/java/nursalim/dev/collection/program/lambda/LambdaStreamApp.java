package nursalim.dev.collection.program.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class LambdaStreamApp {
    public static void main(String[] args) {
        Stream<String> names = newStream();

        // old way
        names
                .map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });

        // Using lambda && method reference
        Stream<String> names2 = newStream();
        names2.map(String::toUpperCase)
                .forEach(System.out::println);

        List<String> cars = newList();
        cars.stream()
                .filter(s -> s.indexOf("i") > -1)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }

    public static Stream<String> newStream(){
        return Stream.of("Nursalim", "Al", "Farizi");
    }

    public static List<String> newList(){
        return Arrays.asList("Toyota", "Suzuki", "Mitsubishi", "Honda");
    }
}
