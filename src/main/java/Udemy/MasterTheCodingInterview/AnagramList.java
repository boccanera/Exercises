package Udemy.MasterTheCodingInterview;

import java.util.*;

public class AnagramList {

    public static boolean isAnagram(List<String> wordsList, List<String> queryList) {

        Map<String, Boolean> wordsCharList = new TreeMap<>();

        List<String> queriesCharList = new ArrayList<>();

        char[] wordsChars = {};
        char[] queriesChars = {};


        for (int i = 0; i < wordsList.size(); i++) {
            wordsChars = wordsList.get(i).toCharArray();
            Arrays.sort(wordsChars);
            wordsCharList.put(String.valueOf(wordsChars), true);
        }

        for (int i = 0; i < queryList.size(); i++) {
            queriesChars = queryList.get(i).toCharArray();
            Arrays.sort(queriesChars);
            queriesCharList.add(String.valueOf(queriesChars));
        }

        System.out.println(queriesCharList.get(0));

        for (String queries : queriesCharList) {
            if (wordsCharList.containsKey(queries)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        List<String> w = Arrays.asList("thread", "safe", "listen");
        List<String> q = Arrays.asList("hreadt", "dasdsa", "esaf", "listen");

        System.out.println(AnagramList.isAnagram(w, q));
    }

}
