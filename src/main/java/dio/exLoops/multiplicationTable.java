package dio.exLoops;

import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int multiplication = 1;

        while (true) {
            System.out.println("Choose a number between 0 and 10: ");
            num = scan.nextInt();
            boolean invalidNumber = num < 0 || num > 10;
            if (invalidNumber) {
                System.out.println("Number out of range. Insert a valid number between 0 and 10.");
                num = scan.nextInt();
            } else {
                for (int i = 0; i <= 10; ++i) { // we can use it backwards too, leaving
                    multiplication = i * num;
                    System.out.println("Multiplication table of number " + multiplication + " is: ");
                }

            }


        }


    }

}


