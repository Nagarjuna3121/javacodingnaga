package org.example;

import java.util.stream.Stream;

public class Java8NumberSum {
    public static void main(String[] args) {
        int n = 34921;

        int numberSum = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(numberSum);
    }
}
