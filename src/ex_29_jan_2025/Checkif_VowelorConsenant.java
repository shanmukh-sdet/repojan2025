package ex_29_jan_2025;

import java.util.Scanner;

public class Checkif_VowelorConsenant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character :");
        String input = sc.next();
        if (input.length() != 1) {
            System.out.println("Error:Invalid input ,enter one character");
        }
        else{
            char ch = input.charAt(0);
            if (Character.isDigit(ch)){
                System.out.println("Error:Entered a number.try enter the character");
            }
            else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                System.out.println( ch+ " is a Vowel");
            }
            else {
                System.out.println(ch+ " is a Consonant");
            }
        }
        sc.close();
    }
}


