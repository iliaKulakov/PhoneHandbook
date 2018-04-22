package model;

import java.util.Objects;

public class Person {
    private int year;
    private String name;
    private String surname;

    public Person(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public int getYear() {
        return year;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return year == person.year &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(year, name, surname);



    }
}



