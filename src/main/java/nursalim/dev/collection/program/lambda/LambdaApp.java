package nursalim.dev.collection.program.lambda;

import java.util.function.*;

public class LambdaApp {
    public static void main(String[] args) {
        Predicate<String> predicate = (value) -> value != null;
        System.out.println(predicate.test("Nursalim"));

        Function<String, String> function = (value) -> value.toUpperCase();
        System.out.println(function.apply("Nursalim"));

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Nursalim");


        Supplier<String> supplier = () -> "Nursalim";
        System.out.println(supplier.get());

        BiPredicate<String, String> biPredicate = (s, s2) -> s.length() > s2.length();
        System.out.println(biPredicate.test("Nursalim", "Azis"));

    }
}
