package leet.problem69;

public class Main {
    public static void main(String[] args){
        Solution sol = new Solution();
        int result = 0;
        for(int i = 0; i <= 100; i++){
            System.out.print("Input: " + i);
            System.out.println(" | Square root (rounded down): " + sol.mySqrt(i));

        }
    }
}
