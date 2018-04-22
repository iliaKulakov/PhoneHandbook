package service;

import model.Person;

import java.util.List;
import java.util.Set;

public interface IPhoneHandBookService {

    Person save(String firstName, String lastName, int year);

    Set<Person> searchByName(String firstName, String lastName);

    Set<Person> searchByYear(int year);

    //добавил в интерфейс
    Set<Person>  sortPhoneHandbook(String firstName, String lastName,int year );

}
