package menu;

import model.Person;
import repository.IPhoneHandbookRepository;
import repository.impl.PhoneHandbookRepository;
import service.impl.PhoneHandBookService;
import storage.PersonStorage;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu extends AbstractMenu {

    private IPhoneHandbookRepository repository;
    private PhoneHandBookService service;


    public MainMenu() {
        super();

        this.repository = new PhoneHandbookRepository();
        this.service = new PhoneHandBookService(repository);

        initMenuItems();
    }

    private void initMenuItems() {
        this.items.add("Create");
        this.items.add("Search");
        this.items.add("Sort");
    }

    @Override
    public void interactWithMenu() {
        Scanner sc1 = new Scanner(System.in);
        boolean exit = false;
        do {
            printMenu(); //вызываю печать меню от menu.AbstractMenu
            System.out.println("Ввод пункта меню с клавиатуры: ");
            int command = sc1.nextInt();//
            switch (command) {
                case 1:
                    //как-то тут наверно есть смысл с отступами поработать...
                    System.out.println("Вы ввели число 1 - Cоздание пользователя. Задайте имя с клавиатуры ");
//                    Person personVar = new Person();
//                    Scanner scName = new Scanner(System.in);
//                    String nameFromKeyBoard = scName.nextLine();
//                    personVar.setName(nameFromKeyBoard);
//                    System.out.println("Задайте фамилию с клавиатуры ");
//                    String SurnameFromKeyBoard = scName.nextLine();
//                    personVar.setSurname(SurnameFromKeyBoard);
//                    System.out.println("Задайте год рождения с клавиатуры ");
//                    int YearFromKeyBoard = scName.nextInt();
//                    personVar.setYear(YearFromKeyBoard);
//                    //Ниже три строки заглушки для самопроверки, что в класс попали нужный мне
//                    System.out.println("Геттер уже из класса model.Person: " + personVar.getName());
//                    System.out.println("Геттер уже из класса model.Person: " + personVar.getSurname());
//                    System.out.println("Геттер уже из класса model.Person: " + personVar.getYear());
//                    String name = personVar.getName();
//                    String surname = personVar.getSurname();
//                    int year = personVar.getYear();
//                    PhoneHandbookRepository phoneHandbookRepository = new PhoneHandbookRepository();
//                    phoneHandbookRepository.addUser(name, surname, year);
//                    phoneHandbookRepository.toSearchForItems();

                    service.save()

                    exit = true;
                    break;
                case 2:
                    System.out.println("Вы ввели число 2 Поиск абонентов");
//                    PhoneHandbookRepository phoneHandbookRepositoryRealVar = new PhoneHandbookRepository();
//                    //  phoneHandbookRepositoryRealVar.toSearchForItems();
//                    //  phoneHandbookRepository.toSearchForItems();
//                    ArrayList<Person> personList1 = new ArrayList<Person>();
//                    Person personvar11 = new Person("Vihhta", "fgsdgsfd", 1234);
//                    Person personvar22 = new Person("dsdsds", "чываыаввы", 4536);
//                    Person personvar33 = new Person("test", "авпвыапыв", 4132);
//                    personList1.add(personvar22);
//                    personList1.add(personvar11);
//                    personList1.add(personvar33);
//                    phoneHandbookRepositoryRealVar.toSearchItem2(personList1);

                    exit = true;
                    break;
                case 3:
//                    //Сделал вывод через синглтон, тут будет сортировка, сделал в этом пункте, 1 и 2
//                    //пока не переделывал
//                    System.out.println("Вы ввели число 3");
//                    Person personvar44 = new Person("test", "авпвыапыв", 4132);
//
//                    //Тут просто смотрю, что могу добавить элемент в коллекцию и потом смотрю размер
//                    //что она добавила
//
//                    PersonStorage.INSTANCE.getPersons().add(personvar44);
//                    System.out.println(PersonStorage.INSTANCE.getPersons().size());


                    exit = true;
                    break;
                default:
                    System.out.println("Ошибка! Повторите выбор меню: ");
                    exit = false;
                    break;
            }
        } while (exit != true);

    }
}
