package model;

public class Person {
    private int year;
    private String name;
    private String surname;

    public Person() {

    }

    // конструктор
    public Person(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}



