package dio.exLoops;

import java.util.Scanner;

public class score0to10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int score;

        System.out.println("What's your score: ");
        score = scan.nextInt();
        boolean invalidScore = score < 0 || score > 10;

        while (invalidScore) {
            System.out.println("Invalid Score, please enter a number between 0 to 10.");
            score = scan.nextInt();
            invalidScore = score < 0 || score > 10;
        }
        System.out.println("Thank you!");

    }
}

