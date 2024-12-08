package leet.problem69;

public class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int low = 1;
        int high = x / 2;
        while (low < high) {

            int mid = (high - low) / 2;
            int square = mid * mid;

            if (square == x) {
                return square;
            }



        }
        return high;
    }

}
