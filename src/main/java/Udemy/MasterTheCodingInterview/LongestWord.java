package Udemy.MasterTheCodingInterview;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWord {
    /*
            Have the function LongestWord(sen) take the sen parameter being passed and return the longest word
        in the string. If there are two or more words that are the same length, return the first word from the string
        with that length. Ignore punctuation and assume sen will not be empty. Words may also contain numbers,
        for example "Hello world123 567"
        Examples
        Input: "fun&!! time"
        Output: time
        Input: "I love dogs"
        Output: love
     */

    public static void main(String[] args) {
//        Input: "fun&!! time"
//        Output: time

        LongestWord.longestWordFilter("fun&!! time");
        LongestWord.longestWordFilter("I love dogs");


    }

    public static String longestWordFilter(String words){

        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(words);
        boolean matches = matcher.find();
        String longestWord = "";



        while(matcher.find()){
            String currentWord = matcher.group();
            if (currentWord.length() > longestWord.length()){
                longestWord = currentWord;
                System.out.println(longestWord);
            }
        } return longestWord;

    }

}

