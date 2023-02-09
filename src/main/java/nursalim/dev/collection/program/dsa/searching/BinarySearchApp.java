package nursalim.dev.collection.program.dsa.searching;

import java.util.Arrays;

public class BinarySearchApp {
    public static void main(String[] args) {
        int[] input = {100, 30, 75, 25, 60, 90, 15, 27};
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        System.out.println(search(input, 11, 0, input.length-1));
    }

    public static int search(int[] input, int value, int left, int right){
        // 1. sort array

        int middle = (left + right) / 2;

        if( right >= left) {
            if(input[middle] == value){
                return middle;
            }else{
                if(value < input[middle]){
                    return search(input, value, left, middle -1 );
                }else{
                    return search(input, value, left + 1, middle -1 );
                }
            }
        }
        return -1;


    }
}
