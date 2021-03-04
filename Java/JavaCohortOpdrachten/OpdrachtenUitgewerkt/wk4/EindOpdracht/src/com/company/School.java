package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> listOfTeachers = new ArrayList<Teacher>();
    private ArrayList<Student> listOfStudents = new ArrayList<Student>();
    private String schoolType;
    private ArrayList<String> curriculum;

    public School(ArrayList<Teacher> listOfTeachers, ArrayList<Student> listOfStudents, String schoolType, ArrayList<String> curriculum) {
        this.listOfTeachers = listOfTeachers;
        this.listOfStudents = listOfStudents;
        this.schoolType = schoolType;
        this.curriculum = curriculum;
    }

    public School(String schoolType) {
       this.schoolType = schoolType;
    }

    public ArrayList<Teacher> getListOfTeachers() {
        return listOfTeachers;
    }

    public void setListOfTeachers(ArrayList<Teacher> listOfTeachers) {
        this.listOfTeachers = listOfTeachers;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public ArrayList<String> getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(ArrayList<String> curriculum) {
        this.curriculum = curriculum;
    }

    public void addStudent(Student student){
        getListOfStudents().add(student);
    }

    public void addTeacher(Teacher teacher){
        getListOfTeachers().add(teacher);
    }

}
