package org.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

       // set.add(new EmployeeSet(1,"Ram","Bengaluru"));
        //set.add(new EmployeeSet(1,"Ram","Bengaluru"));

       set.add("hi");
       set.add("hi");
        System.out.println(set.size());
    }
}
