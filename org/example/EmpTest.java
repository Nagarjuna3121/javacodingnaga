package org.example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpTest {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 28, 123.01, "F", "HR", "Blore", 2020,"fv@gmail.com"));
        empList.add(new Employee(2, "xyz", 29, 120.56, "F", "HR", "Hyderabad", 2015,"xl@gmail.com"));
        empList.add(new Employee(3, "efg", 30, 115.45, "M", "HR", "Chennai", 2014,"ec@gmail.com"));
        empList.add(new Employee(4, "def", 32, 125.75, "F", "HR", "Chennai", 2013,"ec@gmail.com"));

        empList.add(new Employee(5, "ijk", 22, 150.21, "F", "IT1", "Noida", 2013,"ec@gmail.com"));
        empList.add(new Employee(6, "ijkl", 22, 150.43, "F", "IT2", "Noida", 2013,"io@gmail.com"));
        empList.add(new Employee(7, "ijkm", 22, 150.11, "F", "IT3", "Noida", 2013,"ec@gmail.com"));

        empList.add(new Employee(8, "mno", 27, 140.25, "M", "IT", "Gurugram", 2017,"df@gmail.com"));
        empList.add(new Employee(9, "uvw", 26, 130.65, "F", "IT", "Pune", 2016,"ec@gmail.com"));
        empList.add(new Employee(10, "pqr", 23, 145.76, "M", "IT", "Trivandam", 2015,"ec@gmail.com"));
        empList.add(new Employee(11, "stv", 25, 160.45, "M", "IT", "Blore", 2008,"ab@gmail.com"));


        empList.stream().map(Employee::getEmail).distinct().collect(Collectors.toList()).forEach(System.out::println);
        empList.stream().sorted(Comparator.comparing(Employee::getEmail)).distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("----------------------------");
        Map<Long, List<Employee>> empByCity;
        // empByCity = empList.stream().collect(Collectors.groupingBy(Employee::getSalary));
        //  System.out.println("Employees grouped by city :: \n" + empByCity);
//salary increasing order
        empList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList()).forEach(System.out::println);
        //salary decreasing order
        empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("third highest salary");
        Optional<Employee> emp = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst();

        System.out.println(emp.get());





        //find department names
        empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting())).
                entrySet().stream().filter(entry -> entry.getValue() > 3).forEach(System.out::println);


        empList.stream().filter(e ->e.getCity().equalsIgnoreCase("Blore"))
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .forEach(System.out::println);

        //print all employees who are from blore city and sort based on names
        System.out.println("print all employees who are from blore city and sort based on names");
        empList.stream().filter(e ->e.getCity().equalsIgnoreCase("Blore"))
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        //highest experienced employee in the organisation
        System.out.println("higest experienced employee");
        Optional<Employee> employee = empList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        System.out.println(employee);

        empList.parallelStream().sorted(Comparator.comparing(Employee::getCity)).forEachOrdered(System.out::println);
        System.out.println("------------------------------------------------------");
        empList.parallelStream().sorted(Comparator.comparing(Employee::getCity).reversed()).forEachOrdered(System.out::println);

        //System.out.println(emp3);
        //    System.out.println(employee.get());

        System.out.println("-------------second highest salary-----------------------------------------");

        Optional<Employee> secondSal = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(secondSal);

        System.out.println("--------------------3rd highest------------------");

        Optional<Employee> thirdrdsal = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst();
        System.out.println(thirdrdsal);


        Optional<Double> second = empList.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("-------------second highest salary-----------------------------------------");
        if(second.isPresent()){
            Double secondHighest = second.get();
            List<Employee> EmpwithSecondHighestSal = empList.stream().filter(Employee -> Employee.getSalary() ==  secondHighest).collect(Collectors.toList());
            EmpwithSecondHighestSal.forEach(System.out::println);
            System.out.println("------------sort Age increment order");

            // empList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList()).forEach(System.out::println);

            empList.stream().sorted(Comparator.comparing(Employee::getCity)).collect(Collectors.toList()).forEach(System.out::println);
            System.out.println("------------sort Age decrement order");


            empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList()).forEach(System.out::println);
            System.out.println("------------sort Age decrement order");
            empList.stream().sorted(Comparator.comparing(Employee::getDeptName).reversed()).collect(Collectors.toList()).forEach(System.out::println);


            System.out.println("..........sort salary increment order.........");
            empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList()).forEach(System.out::println);
            System.out.println("..........sort salary increment order.........");
            System.out.println("..........increase sal by 10%.........");

            List<Employee> updatedEmployees = empList.stream()
                    .map(e -> {
                        e.setSalary(e.getSalary() * 0.90); // Directly modify or create a new Employee object
                        return e;
                    })
                    .collect(Collectors.toList());

            System.out.println("Employees after increment: " + updatedEmployees);



            //      tln);
        }

        System.out.println("------------------------------------------------------");

        System.out.println(secondSal.get());

        List<Double> updatedEmployees1 = empList.stream().filter(r -> r.getSalary() < 2000).map(m->m.getSalary()*10).collect(Collectors.toList());

        System.out.println(updatedEmployees1);

//        List<Employee> distinctPeople = empList.stream()
//                .filter(distinctByKey(p -> p.getFname() + " " + p.getLname()) )
//                .collect( Collectors.toList() );
//
////********The distinctByKey() method need to be created**********
//
//        public static String Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
//        {
//            Map<Object, Boolean> map = new ConcurrentHashMap<>();
//            return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
//        }

        System.out.println("====================================");
        Set<String> nameSet = new HashSet<>();
        List<Employee> employeesDistinctByName = empList.stream()
                .filter(e -> nameSet.add(e.getEmail()))
                .collect(Collectors.toList());
        System.out.println(employeesDistinctByName);
    }




}
