package leet.problem66;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] test = {1,2,3,4};
        printArray(test);
        test = solution.plusOne(test);
        printArray(test);
        int[] test2 = {1,2,3,9,9};
        printArray(test2);
        test2 = solution.plusOne(test2);
        printArray(test2);


    }

    public static void printArray(int[] arr){
        System.out.print("{");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
}
