package storage;

import model.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public enum PersonStorage {
    INSTANCE;

    private Set<Person> persons = new HashSet<>();

    public Set<Person> getPersons() {
        return this.persons;
    }

}







