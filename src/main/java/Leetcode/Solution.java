package Leetcode;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class plusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinuss(List<Integer> arr) {
        // Write your code here

        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        double proportion;


        for (int number : arr) {
            if (number>=1){
                sum2 += 1;
            } if (number == 0){
                sum1 += 1;
            } if (number<0){
                sum0 +=1;
            }
        }

        double size = arr.size();

        double divisao0 = sum0/size;
        double divisao2 = sum2/size;
        double divisao1 = sum1/size;

        DecimalFormat numberFormat = new DecimalFormat("0.000000");

        System.out.println(numberFormat.format(divisao2));
        System.out.println(numberFormat.format(divisao0));
        System.out.println(numberFormat.format(divisao1));




    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        System.out.println(n);
        System.out.println(arr);

        plusMinus.plusMinuss(arr);

        bufferedReader.close();
    }
}

