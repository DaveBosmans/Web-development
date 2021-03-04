package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Teacher extends User {
    private ArrayList<String> curriculum;
    private ClassRoom mentor;

    public Teacher(String name, Date dateOfBirth, ArrayList<String> curriculum) {
        super(name, dateOfBirth);
        this.curriculum = curriculum;
    }

    public Teacher(String name, Date dateOfBirth, ArrayList<String> curriculum, ClassRoom mentor) {
        super(name, dateOfBirth);
        this.curriculum = curriculum;
        this.mentor = mentor;
    }

    public ArrayList<String> getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(ArrayList<String> curriculum) {
        this.curriculum = curriculum;
    }

    public ClassRoom getMentor() {
        return mentor;
    }

    public void setMentor(ClassRoom mentor) {
        this.mentor = mentor;
    }
}
