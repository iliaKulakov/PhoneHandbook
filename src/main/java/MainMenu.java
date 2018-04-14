import java.util.*;
public class MainMenu extends AbstractMenu {

    public MainMenu() {
        super();
        initMenuItems();
    }

    private void initMenuItems() {
        this.items.add("Create");
        this.items.add("Search");
        this.items.add("Sort");
    }

    //    TODO: Почему не реализовал?
    //Накидал простое меню. Илья

    @Override
    public void interactWithMenu() {
        Scanner sc1 = new Scanner(System.in);
        boolean exit=false;
            do{
                printMenu(); //вызываю печать меню от AbstractMenu
                System.out.println("Ввод пункта меню с клавиатуры: ");
                int command = sc1.nextInt();//
                switch (command) {
                    case 1:
                        //как-то тут наверно есть смысл с отступами поработать...
                        System.out.println("Вы ввели число 1 - Cоздание пользователя. Задайте имя с клавиатуры ");
                        Person personVar = new Person();
                        Scanner scName = new Scanner(System.in);
                        String nameFromKeyBoard = scName.nextLine();
                        personVar.setName(nameFromKeyBoard);
                        System.out.println("Задайте фамилию с клавиатуры ");
                        String SurnameFromKeyBoard = scName.nextLine();
                        personVar.setSurname(SurnameFromKeyBoard);
                        System.out.println("Задайте год рождения с клавиатуры ");
                        int YearFromKeyBoard = scName.nextInt();
                        personVar.setYear(YearFromKeyBoard);
                        //Ниже три строки заглушки для самопроверки, что в класс попали нужный мне
                        System.out.println("Геттер уже из класса Person: " + personVar.getName());
                        System.out.println("Геттер уже из класса Person: " + personVar.getSurname());
                        System.out.println("Геттер уже из класса Person: " + personVar.getYear());
                        String name = personVar.getName();
                        String surname = personVar.getSurname();
                        int year = personVar.getYear();
                        PhoneHandbookRealisation RealisationVar = new PhoneHandbookRealisation();
                            RealisationVar.addUser(name,surname,year);
                        exit=true;
                        break;
                    case 2:
                        System.out.println("Вы ввели число 2");
                        exit=true;
                        break;
                    case 3:
                        System.out.println("Вы ввели число 3");
                        exit=true;
                        break;
                    default:
                        System.out.println("Ошибка! Повторите выбор меню: ");
                        exit=false;
                        break;
                }//switch
            }while (exit!=true);
            //do while
    }//interactWithMenu(
}//public class MainMenu extends AbstractMenu