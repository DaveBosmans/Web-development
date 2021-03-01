package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String nationality;
    private ClassRoom classroom;
    private ArrayList<String> grades;
    private String profile;
    private ArrayList<Date> datesAbsent;

    public Student(String nationality, ClassRoom classroom, ArrayList<String> grades, String profile, ArrayList<Date> datesAbsent) {
        this.nationality = nationality;
        this.classroom = classroom;
        this.grades = grades;
        this.profile = profile;
        this.datesAbsent = datesAbsent;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public ClassRoom getClassroom() {
        return classroom;
    }

    public void setClassroom(ClassRoom classroom) {
        this.classroom = classroom;
    }

    public ArrayList<String> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<String> grades) {
        this.grades = grades;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public ArrayList<Date> getDatesAbsent() {
        return datesAbsent;
    }

    public void setDatesAbsent(ArrayList<Date> datesAbsent) {
        this.datesAbsent = datesAbsent;
    }


    public void Student(String name, String nationality, Date dateOfBirth){

    }

    public void Student(String name, String nationality, Date dateOfBirth, String profile){

    }

}
