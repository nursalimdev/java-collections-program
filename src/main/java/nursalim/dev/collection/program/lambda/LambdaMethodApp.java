package nursalim.dev.collection.program.lambda;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaMethodApp {
    public static void main(String[] args) {
        // without method reference
        Predicate<String> predicate = value -> LambdaMethodApp.isNotNull(value);

        // with method reference, dengan syarat di dalam lambda panggil method yang lain dan parameternya harus sama
        Predicate<String> predicate2 = LambdaMethodApp::isNotNull;

//        Predicate<String> predicate3 = value -> value.isEmpty();
        Predicate<String> predicate3 = String::isEmpty;

        // without method reference
        BiPredicate<String, String> biPredicate = (value1, value2) -> LambdaMethodApp.isEqual(value1, value2);

        // with method reference
        BiPredicate<String, String> biPredicate1 = LambdaMethodApp::isEqual;

        // without method reference
        String hello = "Hello ";
        Function<String, String> function = value -> hello.concat(value);

        // with method reference
        Function<String, String> function2 = hello::concat;

        // without method reference
        Consumer<String> consumer = value -> System.out.println(value);

        // with method reference
        Consumer<String> consumer2 = System.out::println;



    }

    static boolean isNotNull(String value){
        return value != null;
    }

    static boolean isEqual(String value1, String value2){
        return  value1.equals(value2);
    }
}
