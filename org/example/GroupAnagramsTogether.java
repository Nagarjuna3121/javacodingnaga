package org.example;

import java.util.*;

public class GroupAnagramsTogether {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs ==null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] arr = {"abc","acb","mcf","mfc"};
        GroupAnagramsTogether solution = new GroupAnagramsTogether();
        List<List<String>> str = solution.groupAnagrams(arr);
        str.forEach(System.out::println);

    }
}

//i/p :  String[] arr = {"abc","acb","mcf","mfc"};

//o/p : [abc, acb],[mcf, mfc]