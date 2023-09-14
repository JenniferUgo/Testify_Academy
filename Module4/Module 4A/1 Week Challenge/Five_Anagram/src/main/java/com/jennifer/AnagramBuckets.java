package com.jennifer;

import java.util.*;

public class AnagramBuckets {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {

            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if (!anagramMap.containsKey(key)) {
                anagramMap.put(key, new ArrayList<>());
            }
            anagramMap.get(key).add(word);
        }

        List<List<String>> result = new ArrayList<>(anagramMap.values());

        return result;
    }
    public static void main(String[] args) {
        String[] input = {"akka", "akak", "baab", "baba", "bbaa"};
        List<List<String>> anagramBuckets = groupAnagrams(input);

        for (List<String> bucket : anagramBuckets) {
            System.out.println(bucket);
        }
    }
}



//Create anagram buckets from a given input array of words:input is
// {"akka", "akak", "baab", "baba", "bbaa"}1.2.3.4.5.JAVA CODING CHALLENGE