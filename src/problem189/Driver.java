package problem189;

public class Driver {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] arr = {1,2,3};
        int k = 2;
        int[] result = solution.rotate(arr, k);
        System.out.print("{");
        for(int i = 0; i < result.length; i++){
            if(i == result.length - 1){
                System.out.printf("%d}\n", result[i]);
            }else{
                System.out.printf("%d, ", result[i]);

            }

        }
        solution.rotateInPlace(arr, k);
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        int[] arr2 = {1,2,3,4,5,6,7};
        int k2 = 3;
        int[] res = solution.rotate(arr2, k2);
        for(int i = 0; i < res.length; i++){
            System.out.printf("%d ", res[i]);
        }
        System.out.println(res);
    }
}
