package ex_29_jan_2025;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CheckNumberPostiveorNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        try {
            double number = scanner.nextDouble();
            if (number > 0) {
                System.out.println("Its a Positive number");
            } else if (number < 0) {
                System.out.println("Its a Negative number");
            } else {
                System.out.println("Its a Zero");
            }

        } catch (Exception InputMismatchException) {
            System.out.println("Error:Invalid Input");
        }
        scanner.close();
    }
}
