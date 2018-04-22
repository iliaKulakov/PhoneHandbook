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
        this.items.add("Search by name and lastName");
        this.items.add("Search by year");
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
                    System.out.println("Вы ввели число 1 - Cоздание пользователя. Задайте имя с клавиатуры ");
                    Scanner scName = new Scanner(System.in);
                    String nameFromKeyBoard = scName.nextLine();
                    System.out.println("Задайте фамилию с клавиатуры ");
                    String lastNameFromKeyBoard = scName.nextLine();
                    System.out.println("Задайте год рождения с клавиатуры ");
                    int yearFromKeyBoard = scName.nextInt();
                    service.save(nameFromKeyBoard,lastNameFromKeyBoard,yearFromKeyBoard);
                    //repository.

                    exit = false;
                    break;
                case 2:

                    System.out.println("Вы ввели число 2. Поиск абонентов в справочнике ");
                    System.out.println("Введите имя с клавиатуры для поиска в справочнике");
                    Scanner scName2 = new Scanner(System.in);
                    String firstName = scName2.nextLine();
                    System.out.println("Задайте фамилию с клавиатуры ");
                    Scanner scName3 = new Scanner(System.in);
                    String lastName = scName3.nextLine();
                    service.searchByName(firstName,lastName);
                    exit = false;
                    break;
                case 3:
                     System.out.println("Вы ввели число 2. Поиск абонентов в справочнике ");
                     System.out.println("Введите год рождения абонента для поиска ");
                     Scanner scName1 = new Scanner(System.in);
                     int year = scName1.nextInt();
                     service.searchByYear(year);
                     exit = false;
                     break;
                case 4:
                    service.sortPhoneHandbook();
                    exit = false;
                    break;
                default:
                    System.out.println("Ошибка! Повторите выбор меню: ");
                    exit = false;
                    break;
            }
        } while (exit != true);

    }
}
