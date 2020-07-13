package ru.job4j.tracker;

import java.util.Date;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private Date birthday;

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }
}
