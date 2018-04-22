package repository.impl;

import model.Person;
import repository.IPhoneHandbookRepository;
import storage.PersonStorage;

import java.awt.*;
import java.awt.List;
import java.sql.SQLOutput;
import java.util.*;

public class PhoneHandbookRepository implements IPhoneHandbookRepository {

    @Override
    public Person addUser(String name, String surname, int year) {
        Person person = new Person(name, surname, year);
        PersonStorage.INSTANCE.getPersons().add(person);
        System.out.println(PersonStorage.INSTANCE.getPersons().size());
        return person;
    }

    @Override
    public Set<Person> searchByName(String firstName, String lastName) {
        int result = 0;
        int resultYear = 0;
        String resultName = "";
        String resultSurname = "";
        for (Person person : PersonStorage.INSTANCE.getPersons()) {
            if (person.getName().equals(firstName) || person.getSurname().equals(lastName)) {
                result = 1;
                resultYear = person.getYear();
                resultSurname = person.getSurname();
                resultName = person.getName();

            }//for
        }
        if (result == 1) {
            System.out.println("Запись в телефонном справочнике найдена");
            System.out.println(resultName + " " + resultSurname + " " + resultYear);
        } else
            System.out.println("Запись в телефонном справочнике не найдена");
        return null;
    }

    @Override
    public Set<Person> searchByYear(int year) {
        int result = 0;
        int resultYear = 0;
        String resultName = "";
        String resultSurname = "";
        for (Person person : PersonStorage.INSTANCE.getPersons()) {

            if (person.getYear() == year) {
                result = 1;
                resultYear = person.getYear();
                resultSurname = person.getSurname();
                resultName = person.getName();

            }//for
        }
        if (result == 1) {
            System.out.println("Запись в телефонном справочнике найдена");
            System.out.println(resultName + " " + resultSurname + " " + resultYear);
        } else
            System.out.println("Запись в телефонном справочнике не найдена");
        return null;

    }

    @Override
    public Set<Person> sortPhoneHandbook(String firstName, String lastName, int year) {
// Collections.sort(…)

    return null;
    }}












