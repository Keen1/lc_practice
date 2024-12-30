package leet.twitterpost;

import java.util.Stack;

/*
* 1. Write a function that takes a string of parentheses as an argument and returns true if the parentheses are balanced
*
* 2. Given a grid of booleans, where True is land, False is water, and adjacent lands form an island, count the number of
* islands.
*
* 3. Design a data structure that has this API:
*  -- insert(value)
*  -- delete(value)
* get_uniform_random() -> value
* Where all methods are faster than O(n)
* */
public class Solution {

    public boolean balanceParens(String s){
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> parenStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                parenStack.push(s.charAt(i));

            }
            if(s.charAt(i) == ')'){
                if(parenStack.pop() != '('){
                    return false;
                }
            }

        }
        return true;
    }
    public boolean balancedParens(String s){
        int depth = 0;
        for(int i = 0; i < s.length(); i++){
            if(depth < 0){
                return false;
            }
            if(s.charAt(i) == '('){
                depth++;
            }
            if(s.charAt(i) == ')'){
                depth--;
            }
        }
        return depth == 0;
    }

    public int howManyIslands(boolean[] grid){
        if(grid.length == 0){
            return 0;
        }
        int index = 0;
        int count = 0;
        boolean inIsland = false;
        while(index < grid.length){
            if(grid[index] && !inIsland){
                inIsland = true;
                count++;
                index++;
            }
            if(grid[index] && inIsland){
                index++;
            }
            else{
                inIsland = false;
                index++;
            }
        }
        return count;
    }

    public int islandCount(boolean[] grid){
        if(grid.length == 0){
            return 0;
        }
        int count = 0;
        boolean onIsland = false;
        for(int i = 0; i < grid.length; i++){
            if(grid[i]){
                if(!onIsland){
                    onIsland = true;
                    count++;
                }

            }else{
                if(onIsland){
                    onIsland = false;
                }
            }

        }
        return count;
    }
}
