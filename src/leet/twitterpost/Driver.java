package leet.twitterpost;

public class Driver {
    public static void main(String[] args){
        String parens = "())";



        boolean[] islands = {true, true, false, true, false, false, false, true, true};
        Solution solution = new Solution();
        int islandCount = solution.howManyIslands(islands);
        System.out.printf("Balance? -> %b\n", solution.balancedParens(parens));
        System.out.printf("number of islands: %d\n", islandCount);
    }
}
