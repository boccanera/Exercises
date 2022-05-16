package utilitiesExercises.exLoops;


//test1 to hackerrank: print all number with 4 digits that cannot bypass the number given
// and the sum of the digits is limited to 50.

import java.util.Scanner;

public class numberLengthAndSum {

    Scanner scan = new Scanner(System.in);
    int inputNumber = scan.nextInt();
    String dig = Integer.toString(this.inputNumber);

    void countDigits() {
        System.out.println("The length of the number is:" + dig.length());
    }

    void sum() {

        for (int limit = 4; 0 <= limit; --limit) {
            int charat = dig.charAt(limit);
            int sum = +charat;
            System.out.println("The sum of the digits is: " + sum + charat + limit);

        }
    }

    public static void main(String[] args) {
        numberLengthAndSum x = new numberLengthAndSum();
        x.countDigits();
        x.sum();
    }

}


//        boolean limit = dig.length() == 4;
//        DecimalFormat df = new DecimalFormat();
//        df.setMaximumFractionDigits(2);
//        System.out.println("%. 2f" + insertNumber);
//
//        numberLengthAndSum myInstance = new numberLengthAndSum();
//        myInstance.countDigits(insertNumber);
//        System.out.println(countDigits());
//
//        countDigits();
//
//
//    }
//

//
//    void myMethod() {
//        System.out.println("I just got executed!");
//    }
//}


//        for (i = 0; ){
//
//
//            while (limit) {
//                // print all numbers with 4 numbers.
//                for (i = 0; )
//                    System.out.println();
//
//            }
////        for (int i = 0; i <= 4; ++i)
////            System.out.println(dig.charAt(i));
//
//    }

//    static void scanner() {
//        Scanner scan = new Scanner(System.in);
//        int insertNumber = scan.nextInt();
////        countDigits(insertNumber);
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int insertNumber = scan.nextInt();
//        for (int i = 0; i <= 4; ++i) {
//
//            int check = insertNumber()
//
//        }

//        int number = 345;
//        countDigits(number);




