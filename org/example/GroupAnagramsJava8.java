package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagramsJava8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bat","tab","act","tac");

        Map<String,List<String>> map = list.stream().collect(Collectors.groupingBy(word ->{

            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            return new String(ch);

        })) ;

        map.values().forEach(System.out::println);
    }
}
