package utilitiesExercises.exLoops;

import java.util.Scanner;


public class meanGreaterThan {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 1;
        int greater = 0;
        int mean = 0;
        int sum = 0;


        do {
            System.out.println("Insert " + count + " number:");
            int number = scan.nextInt();
            count++;
            sum += number;
            if (number>greater) greater = number;
        } while (count <=5);
        System.out.println("The greater number is: " + greater);
        mean = sum/5;
        System.out.println("The mean is: " + mean);



    }
}