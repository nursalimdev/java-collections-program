package nursalim.dev.collection.program.dsa.searching;

public class LinearSearchApp {
    public static void main(String[] args) {
        // input array dan elemen yang dicari
        // output index, jika tidak ketemu index = -1
        int[] input = {110, 30, 20, 60, 100, 75, 91, 150};
        System.out.println(search(input, 1000));
    }

    public static int search(int[] input, int x){
        int length = input.length;
        for(int i = 0; i < length; i++){
            if(input[i] == x){
                return i;
            }
        }
        return -1;
    }


}
