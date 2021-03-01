package com.company;

import java.util.ArrayList;
import java.util.Date;

public class User extends Student {
    private String name;
    private Date dateOfBirth;

    public User(String nationality, ClassRoom classroom, ArrayList<String> grades, String profile, ArrayList<Date> datesAbsent, String name, Date dateOfBirth) {
        super(nationality, classroom, grades, profile, datesAbsent);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void User(String name, Date dateOfBirth){

    }
}
