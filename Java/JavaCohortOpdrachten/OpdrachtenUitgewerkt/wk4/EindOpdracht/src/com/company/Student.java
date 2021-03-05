package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Student extends User {
    private String nationality;
    private ClassRoom classroom;
    private ArrayList<String> grades;
    private String profile;
    private ArrayList<Date> dateAbsent;
    private User user;


    public Student(String name, String nationality, Date dateOfBirth) {
        super(name, dateOfBirth);
        this.nationality = nationality;
    }

    public Student(String name, String nationality, Date dateOfBirth, String profile) {
        super();
        this.nationality = nationality;
        this.user.setName(name);
        this.user.setDateOfBirth(dateOfBirth);
        this.profile = profile;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public ArrayList<Date> getDateAbsent() {
        return dateAbsent;
    }

    public void setDateAbsent(ArrayList<Date> dateAbsent) {
        this.dateAbsent = dateAbsent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nationality='" + nationality + '\'' +
                ", classroom=" + classroom +
                ", grades=" + grades +
                ", profile='" + profile + '\'' +
                ", dateAbsent=" + dateAbsent +
                ", user=" + user +
                '}';
    }
}
