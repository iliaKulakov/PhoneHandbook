package service;

import model.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import repository.IPhoneHandbookRepository;
import repository.impl.PhoneHandbookRepository;
import service.impl.PhoneHandBookService;
import storage.PersonStorage;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Service")
class IPhoneHandBookServiceTest {
    private IPhoneHandBookService service;
    private IPhoneHandbookRepository repository;

    public IPhoneHandBookServiceTest() {
        this.repository = new PhoneHandbookRepository();
        this.service = new PhoneHandBookService(repository);
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        service.save("first", "last", 1900);
        assertEquals(PersonStorage.INSTANCE.getPersons().size(), 1, "Error on save person");
    }

    @Test
    void searchByName() {
    }

    @Test
    void searchByYear() {
    }
}
