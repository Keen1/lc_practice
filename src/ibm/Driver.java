package ibm;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args){
        start();
    }

    public static void start(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two positive integers separated by a single space: ");
        String input = scanner.nextLine();
        String[] args = input.split(" ");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.printf("x: %d, y: %d", x, y);
        GCDSolution solution = new GCDSolution(x, y);
        int answer = solution.gcd();
        System.out.printf("gcd of %d and %d is : %d", solution.getX(), solution.getY(), answer);
    }
}
