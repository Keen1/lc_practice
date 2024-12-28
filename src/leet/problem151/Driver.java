package leet.problem151;

public class Driver {
    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "the sky is blue";
        String reversed  = solution.reverseWords(s);
        print(s, reversed);
    }
    public static void print(String s, String reversed){
        System.out.printf("initial: %s\n reversed: %s\n", s, reversed);
    }
}
