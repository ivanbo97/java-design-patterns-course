package com.ivanboyukliev.structuralpatterns.composite.example1.courseassignment;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Supervisor technologyDean = new Supervisor("Dr. Smith", "Dean of Technology");
        Supervisor chairOfMathDepartment = new Supervisor("Dr. Joe", "Chair of Math Department");
        Supervisor chairOfCsDepartment = new Supervisor("Dr. John", "Chair of Computer Science Department");

        Professor mathProfOne = new Professor("John Doe", "Adjunct", "+23216851");
        Professor mathProfTwo = new Professor("Jane Doe", "Associate", "+4365asd8");

        Professor csProfOne = new Professor("John Doe", "Adjunct", "+23216851");
        Professor csProfTwo = new Professor("Jane Doe", "Associate", "+4365asd8");
        Professor csProfThree = new Professor("Mark Weber", "Associate", "+43655558");

        technologyDean.addSubordinate(chairOfMathDepartment);
        technologyDean.addSubordinate(chairOfCsDepartment);

        chairOfMathDepartment.addSubordinate(mathProfOne);
        chairOfMathDepartment.addSubordinate(mathProfTwo);

        chairOfCsDepartment.addSubordinate(csProfOne);
        chairOfCsDepartment.addSubordinate(csProfTwo);
        chairOfCsDepartment.addSubordinate(csProfThree);

        System.out.println("\nThe college has the following structure\n");
        List<IFaculty> chairs = technologyDean.getMyFaculty();
        for (int i = 0; i < chairs.size(); i++) {
            System.out.println("\t" + chairs.get(i).getDetails());
        }
    }
}
