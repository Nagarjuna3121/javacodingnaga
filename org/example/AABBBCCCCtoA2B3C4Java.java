package org.example;


public class AABBBCCCCtoA2B3C4Java {
    public static void main(String[] args) {
        String str = "AABBBCCCC";

        int count;
        for(int i=0;i<str.length();i=i+count){
            count = 1;
            for(int j=i+1;j<str.length();j++) {
                // count = 1;
                if (str.charAt(i) == str.charAt(j)) {
                    count = count + 1;
                }else {
                    break;
                }

            }
            System.out.print(str.charAt(i)+""+count);
        }
    }
}

