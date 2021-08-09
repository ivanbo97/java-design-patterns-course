package com.ivanboyukliev.structuralpatterns.composite.example1.courseassignment;

// Leaf
public class Professor implements IFaculty {
    private String name;
    private String position;
    private String officeNumber;

    public Professor(String name, String position, String officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    @Override
    public String getDetails() {
        return "Professor Details: " + name + ", " + position + ", " + officeNumber;
    }
}
