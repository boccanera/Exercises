package utilitiesExercises.exLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class vector5Int {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arraysInt = new ArrayList<>();

        int vector;
        int size;

        System.out.println("Size of the array: ");
        size = scan.nextInt();

            for (int i = 1; i <= size; ++i) {
                System.out.println("Select number: " + i);
                arraysInt.add(scan.nextInt());
            }

            // Training to print each number in one line.
//        System.out.println (arraysInt.toString().replace(",", "]\n");
        System.out.println(arraysInt.toString().replace(",","\n").replace("[", " ").replace("]", ""));
    }

}
