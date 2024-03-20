package Leetcode;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {

        Collections.sort(arr);
        Integer min = Collections.min(arr);
        Integer max = Collections.max(arr);
        int maxDiference = min - max;
        arr.remove(max);
        Integer penultimate = Collections.max(arr);
        int minDiference = max - penultimate;
        System.out.println(minDiference + " " + maxDiference);
    }

}

public class minMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
