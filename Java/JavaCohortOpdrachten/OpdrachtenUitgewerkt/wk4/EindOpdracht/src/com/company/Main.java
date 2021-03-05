package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student dave = new Student("dave", "nederlands", new Date(17/4/1994), "HBO");
        Student urvin = new Student("urvin", "nederlands", new Date(17/4/1994), "HBO");
        School techgrounds = new School("VWO");
        techgrounds.addStudent(dave);
        techgrounds.addStudent(urvin);
        System.out.println(techgrounds.getListOfStudents().get(1).toString());
    }
}
