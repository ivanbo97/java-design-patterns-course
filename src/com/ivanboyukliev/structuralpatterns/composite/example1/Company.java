package com.ivanboyukliev.structuralpatterns.composite.example1;

import com.ivanboyukliev.creationalpatterns.builder.courseassignment.Director;

// Client
public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer("John Doe","asda123","Intern");
        Employee dev2 = new Developer("Jane Doe","asda1234","Senior Developer");

        Directory engineeringDirectory = new Directory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);

        Employee manager1 = new Manager("John Smith","5454SA","SEO Manager");
        Employee manager2 = new Manager("Mira Roberts","5454SAS","SEO Manager");

        Directory accountingDirectory = new Directory();
        accountingDirectory.addEmployee(manager1);
        accountingDirectory.addEmployee(manager2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engineeringDirectory);
        companyDirectory.addEmployee(accountingDirectory);

        companyDirectory.showEmployeeDetails();
    }
}
