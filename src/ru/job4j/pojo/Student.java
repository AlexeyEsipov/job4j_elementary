package ru.job4j.pojo;

import java.util.Date;

public class Student {

    private String firstName;
    private String secondName;
    private String surName;
    private String grope;
    private Date dateOfAdmission;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGrope() {
        return grope;
    }

    public void setGrope(String grope) {
        this.grope = grope;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}
