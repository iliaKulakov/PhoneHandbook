package service.impl;

import model.Person;
import repository.IPhoneHandbookRepository;
import service.IPhoneHandBookService;

import java.util.Set;

public class PhoneHandBookService implements IPhoneHandBookService {

    private IPhoneHandbookRepository repository;

    public PhoneHandBookService(IPhoneHandbookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person save(String firstName, String lastName, int year) {
        return repository.addUser(firstName, lastName, year);
    }

    @Override
    public Set<Person> searchByName(String firstName, String lastName) {
        return repository.searchByName(firstName, lastName);
    }

    @Override
    public Set<Person> searchByYear(int year) {
        return repository.searchByYear(year);
    }
}
