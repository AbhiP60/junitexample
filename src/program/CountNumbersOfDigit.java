package program;

import java.util.Scanner;

public class CountNumbersOfDigit {
    public static int countDigits(int n) {
        if (n == 0) return 1;

        // Handle negative numbers correctly
        if (n < 0) n = -n;

        int res = 0;
        while (n != 0) {
            n = n / 10;
            res++;
        }
        return res;
    }

    public static void main(String args[]) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int n = scn.nextInt(); // input the number
            System.out.println("The number of digits in " + n + " is: " + countDigits(n));
        }
    }
}


