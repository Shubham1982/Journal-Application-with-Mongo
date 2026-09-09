package com.journalapplication.journal_application.newpackagetesting.comparableandcomparator;

import java.util.*;

class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }
    public String getName(){
        return name;
    }



    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}
public class ComparableSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 50000),
                new Employee(2, "Alice", 30000),
                new Employee(3, "Bob", 70000)
        );

        Collections.sort(employees);

        System.out.println(employees);
    }
}
