package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurence {

    public static void main(String[] args) {
        String input = "gainjavakn 7721o wledge AA D";

        // Map<String, Long> output = Arrays.stream(input.replaceAll("\\s+", "")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Map<Character, Long> output = input.replaceAll("\\s+", "").chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println("Output : "+output);

      //  Map<Character,Long> ma = input.replaceAll("\\s+","").chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

     //   Map<Character,Long> map = input.replaceAll("\\s+","").chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
       // System.out.println("char :" +map);

    }
}
