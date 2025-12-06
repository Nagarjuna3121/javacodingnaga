package org.example;

public class LongestSubstringWithoutRepeatingchars {
    public static void main(String[] args) {
        String s = "hellohowru";
        System.out.println(longestSubstringWithoutRepeatingchars(s));

    }

    private static int longestSubstringWithoutRepeatingchars(String str) {

        if(str.length() == 0 || str.length() == 1)
            return str.length();

int res = 0;

boolean[] vis = new boolean[26];

int left = 0,right = 0;
while(right < str.length()){

    while(vis[str.charAt(right) - 'a']){
         vis[str.charAt(left) - 'a'] =false;
         left++;
    }

    vis[str.charAt(right) - 'a'] = true;

    res = Math.max(res,(right-left+1));
    right++;
}

        return res;
    }
}
