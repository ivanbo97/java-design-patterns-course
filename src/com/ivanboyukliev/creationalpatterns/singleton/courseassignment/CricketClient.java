package com.ivanboyukliev.creationalpatterns.singleton.courseassignment;

public class CricketClient {

    public static void main(String[] args) {
        System.out.println("Trying to make new cricket captain....");
        CricketCaptain captain1 = CricketCaptain.getInstance();
        if (captain1 != null) {
            System.out.println("Cricket captain created with reference : " + captain1);
        }

        System.out.println("Trying to make new cricket captain....");
        CricketCaptain captain2 = CricketCaptain.getInstance();

        if (captain1 == captain2) {
            System.out.println("In cricket only one captain can exist in a team!!!\ncaptain2 ref = " + captain2);
        }
    }
}
