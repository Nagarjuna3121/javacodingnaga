package org.example;

public class LongestSubStringWithoutRepeatingCharsASCII {
    public static void main(String[] args) {
        System.out.println(lengthOfLongest("abcabcbb"));
    }

    private static int lengthOfLongest(String str) {
        int[] lastSeen = new int[128];

   //     int maxLen = 0;
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }
            int left = 0;
            int right = 0;
           int maxLen = 0;

            for (right = 0; right < str.length(); right++) {
                char c = str.charAt(right);

                if (lastSeen[c] >= left) {
                    left = lastSeen[c] + 1;
                }
                lastSeen[c] = right;
                maxLen = Math.max(maxLen, right - left + 1);
            }



        return maxLen;
    }
}
