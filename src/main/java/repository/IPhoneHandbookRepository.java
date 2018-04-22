package repository;

import model.Person;

import java.util.Collections;
import java.util.Set;

public interface IPhoneHandbookRepository {

    Person addUser(String name, String Surname, int year);

    Set<Person> searchByName(String firstName, String lastName);

    Set<Person> searchByYear(int year);

    //добавил в интерфейс
    Set<Person> sortPhoneHandbook(String firstName, String lastName,int year );



}
