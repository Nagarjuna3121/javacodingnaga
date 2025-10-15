package org.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmpByDateJoiningAndIfDOJiSameThenSortByName {
    public static void main(String[] args) {
        List<Emmployee> employees = Arrays.asList(
                new Emmployee("Bob", LocalDate.of(2024, 3, 15)),
                new Emmployee("Alice", LocalDate.of(2023, 5, 10)),
                new Emmployee("David", LocalDate.of(2024, 3, 15)),
        new Emmployee("Charlie", LocalDate.of(2023, 5, 10))
        );

        employees.sort(Comparator.comparing(Emmployee::getDateOfJoining).thenComparing(Emmployee::getName));
        employees.forEach(System.out::println);
    }
}
