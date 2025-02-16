package ex_29_jan_2025;

import java.util.Scanner;

public class iFCondition_EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Its a Even number");
        } else {
            System.out.println("Its a Odd number");
        }
    }
}
