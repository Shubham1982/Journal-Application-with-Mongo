package com.journalapplication.journal_application.newpackagetesting.comparableandcomparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorSorting {
    public static void main(String[] args) {

        Comparator<Employee> comparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 50000),
                new Employee(2, "Alice", 30000),
                new Employee(3, "Bob", 70000)
        );

        employees.sort(comparator);
        System.out.println(employees);
        employees.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(employees);

    }
}
