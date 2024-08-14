package leet.problem27;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] test = {3, 3};
        int testK = 5;

        int returnValue = solution.removeElement(test, testK);
        System.out.println(returnValue);
        System.out.print("{");
        for(int i = 0; i < test.length; i++){
            System.out.print(test[i] + ", ");
        }
        System.out.print("}");
        System.out.println();
    }
}
