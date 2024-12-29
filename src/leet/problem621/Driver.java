package leet.problem621;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args){
        System.out.println(Character.getNumericValue('A'));
        System.out.println(Character.getNumericValue('B'));
        System.out.println(Character.getNumericValue('a'));
        System.out.println(Character.getNumericValue('b'));

        int[] taskCounts = new int[26];

        char[] tasks = {'A', 'B', 'A', 'B'};
        for(char c : tasks){
            taskCounts[c - 'A']++;
        }
        Arrays.sort(taskCounts);
        int maxCount = taskCounts[25];
        System.out.println(maxCount);



    }
}
