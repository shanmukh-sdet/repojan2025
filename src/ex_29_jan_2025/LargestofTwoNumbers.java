package ex_29_jan_2025;

import java.util.Scanner;

public class LargestofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("Largest number is : "+num1);
        }else if(num1 < num2){
            System.out.println("Largest number is : "+num2);
        } else{
            System.out.println("Entered numbers are equal");
        }
        sc.close();
    }
}
