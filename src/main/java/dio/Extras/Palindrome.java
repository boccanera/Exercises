package dio.Extras;

import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String InsertWord = input.next();
        String reverse = "";

        for (int i = (InsertWord.length() - 1); i >= 0; i--) {
            reverse += InsertWord.charAt(i);
        }
        if (reverse.equalsIgnoreCase(InsertWord)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("Its not a palindrome");

        }
    }
}

////
