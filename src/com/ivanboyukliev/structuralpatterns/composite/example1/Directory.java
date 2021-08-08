package com.ivanboyukliev.structuralpatterns.composite.example1;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Directory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        for(Employee employee : employeeList){
            employee.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee newEmployee){
        employeeList.add(newEmployee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }
}
