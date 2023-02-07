package nursalim.dev.collection.program.codinginterview;

public class FizzBuzzApp {
    public static void main(String[] args) {
    }

    public static void fizzBuzz(int total){
        for(int i = 1; i <= total; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizBuzz");
            }else if(i%3 == 0){
                System.out.println("Fiz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
