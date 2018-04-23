package storage;

import model.Person;
import model.PersonComparator;

import java.util.*;

//singleton
public enum PersonStorage {
    INSTANCE;

    private Set<Person> persons = new HashSet<>();

    public Set<Person> getPersons() {
        return this.persons;
    }


    }












