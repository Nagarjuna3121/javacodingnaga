package org.example;

public class CapitalToSmallLttersJava8 {
    public static String toggleCase(String input) {
        return input.chars()
                .mapToObj(c -> {
                    char ch = (char) c;
                    return Character.isUpperCase(ch)
                            ? Character.toLowerCase(ch)
                            : Character.toUpperCase(ch);
                })
                .map(String::valueOf)
                .collect(java.util.stream.Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(toggleCase("Hello World!"));
    }
}
