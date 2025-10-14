package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PrintThirdHighestSalaryOfEmployeeJava8 {
    public static void main(String[] args) {
        List<Employee3> employees = Arrays.asList(
                new Employee3("Alice", 50000),
                new Employee3("Bob", 75000),
                new Employee3("Charlie", 60000),
                new Employee3("David", 90000),
                new Employee3("Eve", 80000)
        );

        Optional<Employee3> thirdHighestSalaryEmployee = employees.stream()
                .sorted(Comparator.comparing(Employee3::getSalary).reversed()) // Sort in descending order of salary
                .skip(2) // Skip the highest and second highest
                .findFirst(); // Get the third highest
        System.out.println(thirdHighestSalaryEmployee.get());
        thirdHighestSalaryEmployee.ifPresent(employee ->
                System.out.println("Third highest salary: " + employee.getSalary()));
    }
}

//o/p : Employee{name='Bob', salary=75000}
//Third highest salary: 75000