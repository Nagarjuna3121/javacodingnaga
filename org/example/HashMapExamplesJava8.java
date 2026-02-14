package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Empployee{
    int id;
    String name;
    Double salary;
    String dept;

    public Empployee(int id, String name, Double salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Empployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
public class HashMapExamplesJava8 {
    public static void main(String[] args) {
        List<Empployee> list = Arrays.asList(new Empployee(101,"amit",3000.00,"IT"),
                new Empployee(102,"riya",5000.00,"Dev"),
                new Empployee(103,"suresh",4000.00,"HR"),
                new Empployee(104,"neha",1000.00,"finance"));

        Map<String,List<Empployee>> empByDept = list.stream().collect(Collectors.groupingBy(e -> e.dept));

        list.stream().filter(e -> e.dept.equals("IT")).forEach(e -> e.salary = e.salary * 1.20);

        list.forEach(System.out::println);
    }
}
