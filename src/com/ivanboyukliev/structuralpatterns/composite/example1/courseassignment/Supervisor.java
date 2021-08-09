package com.ivanboyukliev.structuralpatterns.composite.example1.courseassignment;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Supervisor implements IFaculty {
    private String name;
    private String departmentName;
    private List<IFaculty> subordinates;


    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        subordinates = new ArrayList<>();
    }

    @Override
    public String getDetails() {
        return name + " is the " + departmentName;
    }

    public void addSubordinate(IFaculty subordinate) {
        subordinates.add(subordinate);
    }

    public void removeSubordinate(IFaculty subordinate) {
        subordinates.remove(subordinate);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<IFaculty> getMyFaculty(){
        return subordinates;
    }
}
