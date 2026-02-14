package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInStringJava8 {
    public static void main(String[] args) {
        String str= "i love programmin";
        String largest = Arrays.stream(str.split("\\s+")).max(Comparator.comparingInt(String::length)).get();
        System.out.println(largest);

    }
}
