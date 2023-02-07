package nursalim.dev.collection.program.codinginterview;

public class LoopRecursive {
    public static void main(String[] args) {
//        for(int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }

        recursiveLoop(10, 1);

    }

    public static void recursiveLoop(int n, int i){
        if(i > n){
            return ;
        }else{
            System.out.println(i);
            i++;
            recursiveLoop(n, i);
        }
    }
}
