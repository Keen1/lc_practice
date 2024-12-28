package leet.problem13;

public class Driver {

    public static void main(String[] args){
        int newValue = Character.getNumericValue('I');
        System.out.printf("Value of %s : %d","I", newValue);



    }

    public static void printValues(String s, int value){
        System.out.printf("String : %s \n value: %d \n ----------\n", s, value);
    }
}
