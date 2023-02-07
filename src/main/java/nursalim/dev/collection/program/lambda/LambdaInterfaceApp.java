package nursalim.dev.collection.program.lambda;

public class LambdaInterfaceApp {
    public static void main(String[] args) {
//        ArgConsumer<String> consumer = arg ->printAll(arg);
        ArgConsumer<String> consumer = LambdaInterfaceApp::printAll;
        consumer.consume("Nursalim", "Al", "Farizi");
    }

    static void printAll(String[] arg){
        for (String value: arg){
            System.out.println(value);
        }
    }

    @FunctionalInterface
    interface ArgConsumer<T> {
        void consume(T... args);
    }
}
