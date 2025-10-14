package org.example;

//Given string A2B3C4 and convert it to AABBBCCCC
//A occured 2 times B occured 3 times and C occured 4 times
public class A2B3C4TOAABBBCCCCJava {
    public static void main(String[] args) {
        String str = "A2B3C4";
        convertNumToChar(str);
    }

    private static void convertNumToChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                System.out.print(str.charAt(i));
            } else {
                int a = Character.getNumericValue(str.charAt(i));
                for (int j = 1; j < a; j++) {
                    System.out.print(str.charAt(i - 1));
                }
            }
        }
        //     return str;

    }
}
