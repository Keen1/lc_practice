package leet.problem66;

public class Solution {
    public int[] plusOne(int[] digits){

        int i = digits.length -1;

        if(digits[i] < 9){
            digits[i] ++;
            return digits;
        }

        boolean carry = true;
        while(carry && i >= 0){

            if(digits[i] < 9){
                digits[i]++;
                carry = false;
            }else{
                digits[i] = 0;
                i--;
            }
        }
        //still have a carry so need to add a new 1 to the front of the array(msd)
        if(carry){
             return addSigDig(digits);

        }else{
            return digits;
        }
    }
    //add a significant digit if we reach the end of the array and still have a carry

    public int[] addSigDig(int[] og){
        int[] nog = new int[og.length + 1];
        nog[0] = 1;
        System.arraycopy(og, 0, nog, 1, og.length);
        return nog;
    }
}
