package my.practice.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test5 {


    static int foo() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "A", 12000.00, "HR"));
        list.add(new Employee(2, "B", 65563.00, "HR"));
        list.add(new Employee(3, "C", 500.00, "HR"));

        list.add(new Employee(4, "X", 200000.00, "ADMIN"));
        list.add(new Employee(5, "Y", 500000.00, "ADMIN"));
        list.add(new Employee(6, "Z", 100.00, "ADMIN"));


       /*list.stream()
                .map(my.practice.interview.Employee::getSalary).distinct().sorted(Comparator.reverseOrder())
                .skip(1).limit(2).collect(Collectors.toList());*/

        Map<String, List<Employee>> map = list.stream()
                                            .collect(Collectors.groupingBy(
                                                    Employee::getDept,
                                                    Collectors.toList()
                                            ));

        map.entrySet().stream().forEach((m) -> {
            System.out.println(m.getKey() + "-" +m.getValue()
                    .stream()
                            .map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder())
                    .limit(2).collect(Collectors.toList())
            );
        });


        System.out.println(foo()); //3

        try {
            Object o = null;
            System.out.println(o.toString());
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        } /*catch (NullPointerException e) {
            System.out.println("NPE");
        }*/


        String str = "Titann";

        Map<Character, Long> map1 = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()
        ));

        // T-2, i-1, a-1, n-2

        Optional<Character> ch = map1.entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .reduce((a, b) -> b);

        System.out.println(ch.orElse(null));
    }
}


class Employee {

    int id;
    String name;
    Double salary;
    String dept;


    public Employee(int id, String name, Double salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}