package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringInStringSlidingWindow {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        int start = 0;
        for (int end = 0; end < n; end++) {
            char ch = s.charAt(end);

            // If char already exists, move start pointer
            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }

            map.put(ch, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(s));
    }
}

