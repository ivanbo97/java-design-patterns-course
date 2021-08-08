package com.ivanboyukliev.structuralpatterns.composite.example1;

public class Manager implements Employee {
    private String name;
    private String employeeId;
    private String position;

    public Manager(String name, String employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(employeeId + " " + name + " " + position);
    }
}
