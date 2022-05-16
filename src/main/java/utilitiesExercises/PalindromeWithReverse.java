package utilitiesExercises;

import java.util.Scanner;

public class PalindromeWithReverse {

    public static void main(String args[]) {

        while (true) {
            Scanner input = new Scanner(System.in);
            String InsertWord11 = input.next();
            String reverse2 = new StringBuffer(InsertWord11).reverse().toString();
            if (reverse2.equalsIgnoreCase(InsertWord11)) {
                System.out.println("It's a palindrome.");
            } else {
                System.out.println("Its not a palindrome");
            }
        }
    }
}