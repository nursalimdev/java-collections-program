package nursalim.dev.collection.program.dsa.array;

import java.util.Arrays;

public class ArrayReverseApp {

    public static void main(String[] args){
        String[] input = {"N","U", "R", "S", "A", "L", "I", "M"};
        System.out.println(Arrays.toString(reverse(input)));
    }


    public static String[] reverse(String[] input){
        /*
            1) Initialize start and end indexes as start = 0, end = n-1
            2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
            start = start +1, end = end – 1
         */
        String temp = "";
        int start = 0;
        int end = input.length-1;

        while(start < end){
            temp = input[start];
            System.out.println("temp : " + temp);
            input[start] = input[end];
            input[end] = temp;

            start++;
            end--;
        }
        return input;
    }
}
