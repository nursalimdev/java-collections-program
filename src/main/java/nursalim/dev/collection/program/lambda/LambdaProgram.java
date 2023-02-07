package nursalim.dev.collection.program.lambda;

import java.util.function.Supplier;

public class LambdaProgram {
    public static void main(String[] args) {

        // versi java 7
        printLambda(new Supplier<String>() {
            @Override
            public String get() {
                return "Nursalim Anonymous class";
            }
        });

        // versi lambda
        Supplier<String> supplier = () -> "Nursalim Lambda 1";
        printLambda(supplier);

        printLambda(() -> "Nursalim Lambda 2");

    }

    public static void printLambda(Supplier<String> supplier){
        System.out.println(supplier.get());
    }
}
