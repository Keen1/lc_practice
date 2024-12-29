package leet.problem621;
/*
* You are given an array of CPU tasks, each labeled with a letter from A to Z, and a number n.
* Each CPU interval can be idle or allow the completion of one task.
* Tasks can be completed in any order, but there's a constraint: there has to be a gap of at least n intervals between two tasks with the same label.
* Return the minimum number of CPU intervals required to complete all tasks.
*
*
*
* */


import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public int leastInterval(char[] tasks, int n){
        //need to determine the frequency for each task. The number of tasks possible is simply the alphabet(26)
        int[] taskCounts = new int[26];

        //count the frequency for each task and assign it to the task counts
        for(char task : tasks){
            taskCounts[task - 'A']++;
        }
        //sort them, the highest frequency will be the last index of the array
        Arrays.sort(taskCounts);
        int maxCount = taskCounts[25];
        //need to determine if there are any other tasks that have the same frequency
        int maxFrequencyCount = 0;
        while(maxFrequencyCount < 26 && taskCounts[25 - maxFrequencyCount] == maxCount){
            maxFrequencyCount++;
        }
        //the interval
        int intervals = (maxCount - 1) * (n + 1) + maxFrequencyCount;
        return Math.max(intervals, tasks.length);

    }
}
