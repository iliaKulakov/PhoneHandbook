import java.util.ArrayList;
public class Person {
   private int year;
   private String name;
   private String surname;

    public Person() {

    }

    // конструктор
    public Person(String name, String surname, int year) {
        this.name = name;
        this.surname=surname;
        this.year = year;
       // ArrayList<Person> personList = new ArrayList<Person>(); тут будет хранение информации об абоненте в Array list
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

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}



