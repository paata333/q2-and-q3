package oop.q3;

import java.util.Objects;


public class Student {
    private String name;
    private String surname;
    private String country;
    private String info;


    public Student(String name, String surname, String country, String info) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.info = info;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getCountry() {
        return country;
    }


    public String getInfo() {
        return info;
    }


    @Override
    public String toString() {
        return name + " " + surname + " (" + country + ")";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(country, student.country);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, country);
    }
}