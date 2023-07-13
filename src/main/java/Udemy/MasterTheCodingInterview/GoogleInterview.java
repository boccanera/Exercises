package Udemy.MasterTheCodingInterview;

import java.util.*;

public class GoogleInterview {

    //collection of numbers, find matching pair that is equal to the sum. [1,2,4,4] sum = 8.


    public static void main(String[] args) {


//        UMA DAS SOLUÇÕES, POREM É O(n²), ou seja, ineficaz.

//        for (int i = 0; i < numbers.size(); i++)
//            for (int j = 0; j < numbers.size(); j++){
//                int sum = numbers.get(i) + numbers.get(j);
//                if (sum >= 8)
//                    System.out.println(numbers.get(i) + " " + numbers.get(j));
//            }

//        Aqui vamos trabalhar com O(n).



        List<Integer> array = Arrays.asList(1, 2, 4, 4);
        List<Integer> array1 = Arrays.asList(3, 5, 8, 4);
        HashSet<Integer> colection = new HashSet<>();

        HashMap<Object, Boolean> myMap = new HashMap<>();

        myMap.put(1, true);
        myMap.put(2, true);
        myMap.put("2", true);

        for (int i = 0; i < array.size(); i++) {

            myMap.put(array.get(i), true);

            if (myMap.containsKey(array1.get(i))) {

                System.out.println(true);

            } else {

                System.out.println(false);
            }

        }






        }

    }

