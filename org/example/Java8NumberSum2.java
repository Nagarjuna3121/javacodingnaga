package org.example;

public class Java8NumberSum2 {
    public static void main(String[] args) {
        int num = 87634;

        String str = String.valueOf(num);

        int sum = str.chars().map(Character::getNumericValue).sum();

        System.out.println(sum);
    }
}
