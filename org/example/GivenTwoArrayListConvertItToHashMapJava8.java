package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GivenTwoArrayListConvertItToHashMapJava8 {

       public static void main(String[] args) {

        List<String> keyList = List.of("a", "b", "c", "d");
        List<Integer> valueList = List.of(1, 2, 3, 4);

        Map<String,Integer> map = IntStream.range(0,keyList.size()).boxed().collect(Collectors.toMap(keyList::get,valueList::get));
        System.out.println(map);

    }
}

//o/p : {a=1, b=2, c=3, d=4} , combine keys from keylist and value from valuelist