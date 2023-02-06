package nursalim.dev.collection.program.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaApp {
    public static void main(String[] args) {
        Predicate<String> predicate = (String value) -> {
          return value != null;
        };

        Function<String, String> function = (String value) -> {
            return value.toUpperCase();
        };

        Consumer<String> consumer = (String value) -> {
            System.out.println(value);
        };

        
    }
}
