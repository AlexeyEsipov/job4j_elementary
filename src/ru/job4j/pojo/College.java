package ru.job4j.pojo;

import java.util.Date;
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setDateOfAdmission(new Date());
        student.setFirstName("Esipov");
        student.setSecondName("Alexey");
        student.setSurName("Mikhailovich");
        student.setGrope("intern");
        System.out.println(student.getFirstName() + " " + student.getSecondName() +
                " " + student.getSurName() + " " + student.getGrope() + " " +
                " " + student.getDateOfAdmission());
    }

}
