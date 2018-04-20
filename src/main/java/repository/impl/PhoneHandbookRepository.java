package repository.impl;

import model.Person;
import repository.IPhoneHandbookRepository;
import storage.PersonStorage;

import java.util.ArrayList;
import java.util.Set;

public class PhoneHandbookRepository implements IPhoneHandbookRepository {

    @Override
    public Person addUser(String name, String surname, int year) {
        Person person = new Person(name, surname, year);
        PersonStorage.INSTANCE.getPersons().add(person);
        return person;
    }

    @Override
    public Set<Person> searchByName(String firstName, String lastName) {
        return null;
    }

    @Override
    public Set<Person> searchByYear(int year) {
        return null;
    }
}





