package utilitiesExercises.exLoops;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayInReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayInt = new ArrayList<>();
        int size;


        System.out.println("Enter array size: ");
        size = scan.nextInt();


        for (int i = 1; i <= size; ++i) {
            System.out.println("Select number " + i);
            arrayInt.add(scan.nextInt());
            }
        Collections.reverse(arrayInt);
        System.out.println(arrayInt.toString().replace(",", "\n").replace("[", " ").replace("]", ""));

    }
}
