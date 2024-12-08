package leet.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n){
        List<String> ret = new ArrayList<>();
        for(int i = 1; i < n; i++){
            if(i % 3 == 0){
                ret.add("Fizz");
            }
            if(i % 5 == 0){
                ret.add("buzz");
            }
            if (i % 15 == 0){
                ret.add("FizzBuzz");
            }
            else{
                ret.add(Integer.toString(i));
            }
        }
        return ret;
    }
}
