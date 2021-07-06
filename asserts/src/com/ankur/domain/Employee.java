package com.ankur.domain;

public class Employee {

    private int id;
    private String name;
    private int salary;
    private String address;

    public Employee(int id, String name, int salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }
}
