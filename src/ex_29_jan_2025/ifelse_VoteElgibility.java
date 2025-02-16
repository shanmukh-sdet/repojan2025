package ex_29_jan_2025;

import java.util.Scanner;

public class ifelse_VoteElgibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Person age: ");
        int age = sc.nextInt();

        if (age >=100 || age <=0){
            System.out.println("Enter valid age");
        } else if (age >=18 || age <=99) {
            System.out.println("Elgible to Vote");
        }
        else {
            System.out.println("Not Elgible to Vote");
        }

    }
}
