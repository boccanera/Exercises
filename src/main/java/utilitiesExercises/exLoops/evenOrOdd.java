package utilitiesExercises.exLoops;

import java.util.Scanner;

public class evenOrOdd {

    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            if (number % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
    }
}
